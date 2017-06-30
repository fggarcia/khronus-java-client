package com.despegar.khronus.jclient;

public class KhronusConfig {
    private int maximumMeasures;
    private Long sendIntervalMillis;
    private String[] hosts;
    private int maxConnections;
    private String applicationName;
    private String endpoint;

    public KhronusConfig(String applicationName, Integer maximumMeasures, Long sendIntervalMillis, String[] hosts, String endpoint, Integer maxConnections) {
        this.maximumMeasures = maximumMeasures;
        this.sendIntervalMillis = sendIntervalMillis;
        this.hosts = hosts;
        this.endpoint = endpoint;
        this.maxConnections = maxConnections;
        this.applicationName = applicationName;
    }

    public int getMaximumMeasures() {
        return maximumMeasures;
    }

    public void setMaximumMeasures(int maximumMeasures) {
        this.maximumMeasures = maximumMeasures;
    }

    public Long getSendIntervalMillis() {
        return sendIntervalMillis;
    }

    public void setSendIntervalMillis(Long sendIntervalMillis) {
        this.sendIntervalMillis = sendIntervalMillis;
    }

    public String[] getHosts() {
        return hosts;
    }

    public void setHosts(String[] hosts) {
        this.hosts = hosts;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
