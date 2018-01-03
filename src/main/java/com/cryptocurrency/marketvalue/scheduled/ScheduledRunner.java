package com.cryptocurrency.marketvalue.scheduled;

import com.cryptocurrency.marketvalue.MarketvalueApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledRunner {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledRunner.class);

    @Scheduled(fixedDelayString = "${marketvalue.scheduled.msdelay}", initialDelay = 0)
    public void getMarketValues() {
        logger.trace("[getMarketValues] Start");

        //responseEntity = restTemplate.exchange(RequestUrl, HttpMethod.GET, entity, MedableRequestsStatistics.class);
        //log.trace("[getMedableRequestStats] request done, getting response body");
        //medableRequestsStatistics = responseEntity.getBody();

        logger.trace("[getMarketValues] End");
    }

}
