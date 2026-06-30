package com.strategyengine.xrpl.fsedistributionservice.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AirdropStatus_getStatus_181040441279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313390;

    public AirdropStatus_getStatus_181040441279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313390 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313390, term313390.getClass(), "results", null);
        setField(term313390, term313390.getClass(), "id", null);
        setField(term313390, term313390.getClass(), "createDate", null);
        setField(term313390, term313390.getClass(), "updateDate", null);
        setField(term313390, term313390.getClass(), "startTime", null);
        setField(term313390, term313390.getClass(), "repeatUntilDate", null);
        setField(term313390, term313390.getClass(), "frequency", null);
        setField(term313390, term313390.getClass(), "status", null);
        setField(term313390, term313390.getClass(), "fromClassicAddress", null);
        setField(term313390, term313390.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313390, term313390.getClass(), "currencyName", null);
        setField(term313390, term313390.getClass(), "currencyNameForProcess", null);
        setField(term313390, term313390.getClass(), "amount", null);
        setBooleanField(term313390, term313390.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313390, term313390.getClass(), "useBlacklist", false);
        setField(term313390, term313390.getClass(), "maximumTrustlines", null);
        setField(term313390, term313390.getClass(), "dropType", null);
        setField(term313390, term313390.getClass(), "failReason", null);
        setField(term313390, term313390.getClass(), "minBalance", null);
        setField(term313390, term313390.getClass(), "maxBalance", null);
        setField(term313390, term313390.getClass(), "totalBlacklisted", null);
        setField(term313390, term313390.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313390, term313390.getClass(), "totalRecipients", null);
        setField(term313390, term313390.getClass(), "paymentType", null);
        setField(term313390, term313390.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313390, term313390.getClass(), "snapshotCurrencyName", null);
        setField(term313390, term313390.getClass(), "nftIssuingAddress", null);
        setField(term313390, term313390.getClass(), "nftTaxon", null);
        setField(term313390, term313390.getClass(), "scheduleStatus", null);
        setField(term313390, term313390.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term313390, args);
    }

};


