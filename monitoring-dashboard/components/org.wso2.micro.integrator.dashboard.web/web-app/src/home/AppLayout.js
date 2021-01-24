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
            <h1>Router check</h1>
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
    );
};

export default AppLayout;
