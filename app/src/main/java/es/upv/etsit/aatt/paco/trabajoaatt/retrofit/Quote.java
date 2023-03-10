package es.upv.etsit.aatt.paco.trabajoaatt.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Quote implements Serializable {

    @SerializedName("USD")
    @Expose
    private USD uSD;
    private final static long serialVersionUID = -5780538494495942860L;

    public USD getUSD() {
        return uSD;
    }

    public void setUSD(USD uSD) {
        this.uSD = uSD;
    }

}