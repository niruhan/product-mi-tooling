/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 *
 */

import React from 'react';
import PropTypes from 'prop-types';
import {withRouter} from 'react-router-dom';
import {Switch, Route} from 'react-router-dom';
// import styled from 'styled-components';
import Dashboard from './Dashboard';
import SiDashboard from '../si/SiDashboard';

// const Root = styled.div`
//   display: flex;
//   flex-direction: row;
//   margin: 0 auto;
//   width: 100%;
//   position: relative;

//   @media (min-width: ${p => p.theme.screen.md}) {
//     width: ${p => p.theme.screen.md};
//   }

//   @media (min-width: ${p => parseInt(p.theme.screen.lg, 10) + 20 + 'px'}) {
//     width: ${p => p.theme.screen.lg};
//   }
// `;

/**
 * Main layout of the app
 */
const AppLayout = () => {
    // const [{auth}, dispatch] = useStore();

    // const windowSize = useWindowSize();
    // const isDesktop = windowSize.width >= parseInt(theme.screen.md, 10);
    // const [isSideBarOpen, setIsSidebarOpen] = useState(isDesktop);

    // const sideBarRef = useRef('');

    // useEffect(() => {
    //     dispatch({type: SET_AUTH_USER, payload: authUser});
    // }, [dispatch, authUser]);

    // useClickOutside(sideBarRef, () => {
    //     if (!isDesktop && isSideBarOpen) {
    //         setIsSidebarOpen(false);
    //     }
    // });

    // useEffect(() => {
    //     setIsSidebarOpen(isDesktop);
    // }, [isDesktop]);

    // useEffect(() => {
    //     return () => {
    //         if (!isDesktop) {
    //             setIsSidebarOpen(false);
    //         }
    //     };
    // }, [location.pathname, isDesktop]);

    // if (!auth.user) return null;

    return (
        <>
            <div>
                <Switch>
                    <Route exact path={'/mi'} component={Dashboard}/>
                    <Route exact path={'/si'} component={SiDashboard}/>
                </Switch>
            </div>
        </>
    );
};

AppLayout.propTypes = {
    location: PropTypes.object.isRequired,
    authUser: PropTypes.object.isRequired,
};

export default withRouter(AppLayout);
