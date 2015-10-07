/*
 * Copyright (C) 2015 Stefano Cappa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.stefanocappa.databindingexample;

import android.util.Log;
import android.view.View;

/**
 * Created by Stefano Cappa on 24/09/15.
 */
public class Handlers {

    public void onClickFirstName(View view) {
        Log.d("TAG", "FirstName Clicked");
    }

    public void onClickLastName(View view) {
        Log.d("TAG", "LastName Clicked");
    }
}
