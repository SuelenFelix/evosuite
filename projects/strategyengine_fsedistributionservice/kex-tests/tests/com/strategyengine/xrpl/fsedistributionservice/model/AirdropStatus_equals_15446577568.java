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

public class AirdropStatus_equals_15446577568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313357;

    public AirdropStatus_equals_15446577568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313357 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313357, term313357.getClass(), "results", null);
        setField(term313357, term313357.getClass(), "id", null);
        setField(term313357, term313357.getClass(), "createDate", null);
        setField(term313357, term313357.getClass(), "updateDate", null);
        setField(term313357, term313357.getClass(), "startTime", null);
        setField(term313357, term313357.getClass(), "repeatUntilDate", null);
        setField(term313357, term313357.getClass(), "frequency", null);
        setField(term313357, term313357.getClass(), "status", null);
        setField(term313357, term313357.getClass(), "fromClassicAddress", null);
        setField(term313357, term313357.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313357, term313357.getClass(), "currencyName", null);
        setField(term313357, term313357.getClass(), "currencyNameForProcess", null);
        setField(term313357, term313357.getClass(), "amount", null);
        setBooleanField(term313357, term313357.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313357, term313357.getClass(), "useBlacklist", false);
        setField(term313357, term313357.getClass(), "maximumTrustlines", null);
        setField(term313357, term313357.getClass(), "dropType", null);
        setField(term313357, term313357.getClass(), "failReason", null);
        setField(term313357, term313357.getClass(), "minBalance", null);
        setField(term313357, term313357.getClass(), "maxBalance", null);
        setField(term313357, term313357.getClass(), "totalBlacklisted", null);
        setField(term313357, term313357.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313357, term313357.getClass(), "totalRecipients", null);
        setField(term313357, term313357.getClass(), "paymentType", null);
        setField(term313357, term313357.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313357, term313357.getClass(), "snapshotCurrencyName", null);
        setField(term313357, term313357.getClass(), "nftIssuingAddress", null);
        setField(term313357, term313357.getClass(), "nftTaxon", null);
        setField(term313357, term313357.getClass(), "scheduleStatus", null);
        setField(term313357, term313357.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term313357, args);
    }

};


