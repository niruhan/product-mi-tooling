import React, {useEffect, useState, useRef} from 'react';
import PropTypes from 'prop-types';
import {withRouter} from 'react-router-dom';
import {Switch, Route} from 'react-router-dom';
import styled from 'styled-components';

import Header from 'components/App/Header';
import NotFound from 'components/NotFound';
import SideBar from './SideBar';
import UserSuggestions from './UserSuggestions';
import ForumUsers from 'pages/LangForum/ForumUsers.js';

import Home from 'pages/Home';
import EditInfo from 'pages/EditInfo';

import {useWindowSize} from 'hooks/useWindowSize';
import {useClickOutside} from 'hooks/useClickOutside';

import theme from 'theme';

import {useStore} from 'store';
import {SET_AUTH_USER} from 'store/auth';

const Root = styled.div`
  display: flex;
  flex-direction: row;
  margin: 0 auto;
  width: 100%;
  position: relative;

  @media (min-width: ${p => p.theme.screen.md}) {
    width: ${p => p.theme.screen.md};
  }

  @media (min-width: ${p => parseInt(p.theme.screen.lg, 10) + 20 + 'px'}) {
    width: ${p => p.theme.screen.lg};
  }
`;

/**
 * Main layout of the app, when user is authenticated
 */
const AppLayout = ({location, authUser, refetch}) => {
    const [{auth}, dispatch] = useStore();

    const windowSize = useWindowSize();
    const isDesktop = windowSize.width >= parseInt(theme.screen.md, 10);
    const [isSideBarOpen, setIsSidebarOpen] = useState(isDesktop);

    const sideBarRef = useRef('');

    useEffect(() => {
        dispatch({type: SET_AUTH_USER, payload: authUser});
    }, [dispatch, authUser]);

    useClickOutside(sideBarRef, () => {
        if (!isDesktop && isSideBarOpen) {
            setIsSidebarOpen(false);
        }
    });

    useEffect(() => {
        setIsSidebarOpen(isDesktop);
    }, [isDesktop]);

    useEffect(() => {
        return () => {
            if (!isDesktop) {
                setIsSidebarOpen(false);
            }
        };
    }, [location.pathname, isDesktop]);

    if (!auth.user) return null;

    return (
        <>
            <Header toggleSideBar={() => setIsSidebarOpen(!isSideBarOpen)}/>
            <Root>
                <SideBar isOpen={isSideBarOpen} sideBarRef={sideBarRef}/>
                <Switch>
                    
                    <Route exact path={'/mi'} component={EditInfo}/>
                    <Route exact path={'/si'} component={Home}/>
                    <Route component={NotFound}/>
                </Switch>
                <UserSuggestions pathname={location.pathname}/>
                <ForumUsers pathname={location.pathname}/>
            </Root>
        </>
    );
};

AppLayout.propTypes = {
    location: PropTypes.object.isRequired,
    authUser: PropTypes.object.isRequired,
};

export default withRouter(AppLayout);
