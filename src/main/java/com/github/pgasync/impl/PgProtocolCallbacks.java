/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pgasync.impl;

import com.github.pgasync.impl.message.Authentication;
import com.github.pgasync.impl.message.CommandComplete;
import com.github.pgasync.impl.message.DataRow;
import com.github.pgasync.impl.message.ErrorResponse;
import com.github.pgasync.impl.message.ReadyForQuery;
import com.github.pgasync.impl.message.RowDescription;

/**
 * Callback interface for handling messages sent by backend.
 * 
 * @author Antti Laisi
 */
public interface PgProtocolCallbacks {

    void onThrowable(Throwable t);

    void onErrorResponse(ErrorResponse msg);

    void onAuthentication(Authentication msg);

    void onRowDescription(RowDescription msg);

    void onDataRow(DataRow msg);

    void onCommandComplete(CommandComplete msg);

    void onReadyForQuery(ReadyForQuery msg);

}