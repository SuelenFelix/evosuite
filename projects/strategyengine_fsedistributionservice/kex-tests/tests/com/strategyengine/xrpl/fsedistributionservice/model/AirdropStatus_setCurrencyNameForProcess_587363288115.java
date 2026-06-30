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

public class AirdropStatus_setCurrencyNameForProcess_587363288115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313496;

    public AirdropStatus_setCurrencyNameForProcess_587363288115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313496 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313496, term313496.getClass(), "results", null);
        setField(term313496, term313496.getClass(), "id", null);
        setField(term313496, term313496.getClass(), "createDate", null);
        setField(term313496, term313496.getClass(), "updateDate", null);
        setField(term313496, term313496.getClass(), "startTime", null);
        setField(term313496, term313496.getClass(), "repeatUntilDate", null);
        setField(term313496, term313496.getClass(), "frequency", null);
        setField(term313496, term313496.getClass(), "status", null);
        setField(term313496, term313496.getClass(), "fromClassicAddress", null);
        setField(term313496, term313496.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313496, term313496.getClass(), "currencyName", null);
        setField(term313496, term313496.getClass(), "currencyNameForProcess", null);
        setField(term313496, term313496.getClass(), "amount", null);
        setBooleanField(term313496, term313496.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313496, term313496.getClass(), "useBlacklist", false);
        setField(term313496, term313496.getClass(), "maximumTrustlines", null);
        setField(term313496, term313496.getClass(), "dropType", null);
        setField(term313496, term313496.getClass(), "failReason", null);
        setField(term313496, term313496.getClass(), "minBalance", null);
        setField(term313496, term313496.getClass(), "maxBalance", null);
        setField(term313496, term313496.getClass(), "totalBlacklisted", null);
        setField(term313496, term313496.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313496, term313496.getClass(), "totalRecipients", null);
        setField(term313496, term313496.getClass(), "paymentType", null);
        setField(term313496, term313496.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313496, term313496.getClass(), "snapshotCurrencyName", null);
        setField(term313496, term313496.getClass(), "nftIssuingAddress", null);
        setField(term313496, term313496.getClass(), "nftTaxon", null);
        setField(term313496, term313496.getClass(), "scheduleStatus", null);
        setField(term313496, term313496.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCurrencyNameForProcess", argTypes, term313496, args);
    }

};


