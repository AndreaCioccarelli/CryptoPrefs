/**
 * Designed and developed by Andrea Cioccarelli (@cioccarellia)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cioccarellia.kspref.exception

import android.util.Log
import com.cioccarellia.kspref.defaults.Defaults

internal class EngineException(
    message: String = "",
    throwable: Throwable? = null
) : RuntimeException(message.trim(), throwable) {

    init {
        Log.e(Defaults.TAG, "KsPrefs Engine Exception")
    }

    companion object {
        fun convertFrom(
            throwable: Throwable?,
            operation: String
        ) = EngineException(
            operation,
            throwable
        )
    }
}