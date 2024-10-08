package spring.course.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties //ignore all the properties that were not added as fields
public class TimeApiResponse {
    private String utc_datetime;

    public TimeApiResponse(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUtc_datetime() {
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }
}