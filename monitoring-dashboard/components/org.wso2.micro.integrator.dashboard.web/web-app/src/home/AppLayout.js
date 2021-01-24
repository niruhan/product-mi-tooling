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
import {withRouter} from 'react-router-dom';
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
  } from "react-router-dom";
import Dashboard from './Dashboard';
import SiDashboard from '../si/SiDashboard';

/**
 * Main layout of the app
 */
const AppLayout = () => {

    return (
        <Router>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/mi">Micro Integrator Dashboard</Link>
            </li>
            <li>
              <Link to="/si">Streaming Integrator Dashboard</Link>
            </li>
          </ul>
        </nav>

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Switch>
          <Route path="/mi">
            <Dashboard />
          </Route>
          <Route path="/si">
            <SiDashboard />
          </Route>
        </Switch>
      </div>
    </Router>
        // <>
        //     <div>
        //         <Switch>
        //             <Route exact path={'/mi'} component={Dashboard}/>
        //             <Route exact path={'/si'} component={SiDashboard}/>
        //         </Switch>
        //     </div>
        // </>
    );
};

export default withRouter(AppLayout);
