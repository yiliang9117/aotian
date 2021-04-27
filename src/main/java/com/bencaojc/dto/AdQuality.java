package com.bencaojc.dto;

import com.bencaojc.dto.ad.AdLegend;
import com.bencaojc.dto.ad.Series;
import com.bencaojc.dto.ad.YAxis;

import javax.xml.ws.Service;

public class AdQuality {

    private AdLegend adLegend;
    private Series series;
    private YAxis yAxis;

    public AdLegend getAdLegend() {
        return adLegend;
    }

    public void setAdLegend(AdLegend adLegend) {
        this.adLegend = adLegend;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public YAxis getyAxis() {
        return yAxis;
    }

    public void setyAxis(YAxis yAxis) {
        this.yAxis = yAxis;
    }
}
