
package com.roka.ticketing.rest.response.flight.helperpojo.bookflight;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class BalanceDue {

    @SerializedName("value")
    private String mvalue;

    public String getvalue() {
        return mvalue;
    }

    public static class Builder {

        private String mvalue;

        public BalanceDue.Builder withvalue(String value) {
            mvalue = value;
            return this;
        }

        public BalanceDue build() {
            BalanceDue BalanceDue = new BalanceDue();
            BalanceDue.mvalue = mvalue;
            return BalanceDue;
        }

    }

}
