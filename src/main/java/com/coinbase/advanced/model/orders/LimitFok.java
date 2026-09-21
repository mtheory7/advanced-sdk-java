/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LimitFok {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("quote_size")
    private String quoteSize;

    public String getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(String baseSize) {
        this.baseSize = baseSize;
    }

    public String getQuoteSize() {
        return quoteSize;
    }

    public void setQuoteSize(String quoteSize) {
        this.quoteSize = quoteSize;
    }

    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public static class Builder {
        private String baseSize;
        private String quoteSize;
        private String limitPrice;

        public Builder baseSize(String baseSize) {
            this.baseSize = baseSize;
            return this;
        }

        public Builder quoteSize(String quoteSize) {
            this.quoteSize = quoteSize;
            return this;
        }

        public Builder limitPrice(String limitPrice) {
            this.limitPrice = limitPrice;
            return this;
        }

        public LimitFok build() {
            LimitFok limitFok = new LimitFok();
            limitFok.baseSize = this.baseSize;
            limitFok.quoteSize = this.quoteSize;
            limitFok.limitPrice = this.limitPrice;
            return limitFok;
        }
    }
}
