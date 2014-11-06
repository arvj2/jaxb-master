package com.sample.service;

import javax.jws.WebService;

/**
 * Created by Jansel R. Abreu (Vanwolf) on 11/6/2014.
 */

@WebService( endpointInterface = "com.sample.service.ReporterInterface",serviceName = "ReportService")
public class SIBReporter implements ReporterInterface{
    @Override
    public String getReport(ClientType client) {
        return client.getName()+" - reported";
    }
}
