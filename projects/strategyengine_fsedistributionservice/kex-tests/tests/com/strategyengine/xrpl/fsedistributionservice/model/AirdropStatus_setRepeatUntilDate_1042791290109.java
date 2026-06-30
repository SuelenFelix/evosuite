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

public class AirdropStatus_setRepeatUntilDate_1042791290109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313478;

    public AirdropStatus_setRepeatUntilDate_1042791290109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313478 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313478, term313478.getClass(), "results", null);
        setField(term313478, term313478.getClass(), "id", null);
        setField(term313478, term313478.getClass(), "createDate", null);
        setField(term313478, term313478.getClass(), "updateDate", null);
        setField(term313478, term313478.getClass(), "startTime", null);
        setField(term313478, term313478.getClass(), "repeatUntilDate", null);
        setField(term313478, term313478.getClass(), "frequency", null);
        setField(term313478, term313478.getClass(), "status", null);
        setField(term313478, term313478.getClass(), "fromClassicAddress", null);
        setField(term313478, term313478.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313478, term313478.getClass(), "currencyName", null);
        setField(term313478, term313478.getClass(), "currencyNameForProcess", null);
        setField(term313478, term313478.getClass(), "amount", null);
        setBooleanField(term313478, term313478.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313478, term313478.getClass(), "useBlacklist", false);
        setField(term313478, term313478.getClass(), "maximumTrustlines", null);
        setField(term313478, term313478.getClass(), "dropType", null);
        setField(term313478, term313478.getClass(), "failReason", null);
        setField(term313478, term313478.getClass(), "minBalance", null);
        setField(term313478, term313478.getClass(), "maxBalance", null);
        setField(term313478, term313478.getClass(), "totalBlacklisted", null);
        setField(term313478, term313478.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313478, term313478.getClass(), "totalRecipients", null);
        setField(term313478, term313478.getClass(), "paymentType", null);
        setField(term313478, term313478.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313478, term313478.getClass(), "snapshotCurrencyName", null);
        setField(term313478, term313478.getClass(), "nftIssuingAddress", null);
        setField(term313478, term313478.getClass(), "nftTaxon", null);
        setField(term313478, term313478.getClass(), "scheduleStatus", null);
        setField(term313478, term313478.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRepeatUntilDate", argTypes, term313478, args);
    }

};


