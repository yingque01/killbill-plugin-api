/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
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

package org.killbill.billing.control.plugin.api;

import java.math.BigDecimal;
import java.util.UUID;

import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PluginProperty;

public interface PriorPaymentControlResult extends ControlResult {

    /**
     * @return true if call should not proceed
     */
    public boolean isAborted();

    /**
     * @return the new amount that should be used for that attempt
     */
    public BigDecimal getAdjustedAmount();

    /**
     * @return the new currency that should be used for that attempt
     */
    public Currency getAdjustedCurrency();

    /**
     * @return the new payment method id that should be used for that attempt
     */
    public UUID getAdjustedPaymentMethodId();

    /**
     * @return the new payment method plugin name (Only for ADD_PAYMENT_METHOD)
     */
    public String getAdjustedPluginName();
}
