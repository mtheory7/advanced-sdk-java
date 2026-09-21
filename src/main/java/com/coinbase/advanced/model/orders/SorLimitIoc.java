package com.coinbase.advanced.model.orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SorLimitIoc {
    @JsonProperty("base_size")
    private String baseSize;

    @JsonProperty("quote_size")
    private String quoteSize;

    @JsonProperty("limit_price")
    private String limitPrice;

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

        public SorLimitIoc build() {
            SorLimitIoc sorLimitIoc = new SorLimitIoc();
            sorLimitIoc.baseSize = this.baseSize;
            sorLimitIoc.quoteSize = this.quoteSize;
            sorLimitIoc.limitPrice = this.limitPrice;
            return sorLimitIoc;
        }
    }
}
