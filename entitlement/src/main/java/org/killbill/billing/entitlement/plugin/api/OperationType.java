/*
 * Copyright 2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.entitlement.plugin.api;

public enum OperationType {
    CREATE_SUBSCRIPTION,
    CHANGE_PLAN,
    CANCEL_SUBSCRIPTION,
    UNDO_PENDING_SUBSCRIPTION_OPERATION,
    ADD_BLOCKING_STATE,
    PAUSE_BUNDLE,
    RESUME_BUNDLE,
    TRANSFER_BUNDLE,
    CREATE_SUBSCRIPTIONS_WITH_AO,
    UPDATE_BUNDLE_EXTERNAL_KEY,
    CREATE_SHOPPING_CART_SUBSCRIPTIONS
}
