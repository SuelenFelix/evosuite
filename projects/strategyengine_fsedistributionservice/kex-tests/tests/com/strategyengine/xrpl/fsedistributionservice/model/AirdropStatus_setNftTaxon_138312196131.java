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

public class AirdropStatus_setNftTaxon_138312196131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313548;

    public AirdropStatus_setNftTaxon_138312196131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313548 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313548, term313548.getClass(), "results", null);
        setField(term313548, term313548.getClass(), "id", null);
        setField(term313548, term313548.getClass(), "createDate", null);
        setField(term313548, term313548.getClass(), "updateDate", null);
        setField(term313548, term313548.getClass(), "startTime", null);
        setField(term313548, term313548.getClass(), "repeatUntilDate", null);
        setField(term313548, term313548.getClass(), "frequency", null);
        setField(term313548, term313548.getClass(), "status", null);
        setField(term313548, term313548.getClass(), "fromClassicAddress", null);
        setField(term313548, term313548.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313548, term313548.getClass(), "currencyName", null);
        setField(term313548, term313548.getClass(), "currencyNameForProcess", null);
        setField(term313548, term313548.getClass(), "amount", null);
        setBooleanField(term313548, term313548.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313548, term313548.getClass(), "useBlacklist", false);
        setField(term313548, term313548.getClass(), "maximumTrustlines", null);
        setField(term313548, term313548.getClass(), "dropType", null);
        setField(term313548, term313548.getClass(), "failReason", null);
        setField(term313548, term313548.getClass(), "minBalance", null);
        setField(term313548, term313548.getClass(), "maxBalance", null);
        setField(term313548, term313548.getClass(), "totalBlacklisted", null);
        setField(term313548, term313548.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313548, term313548.getClass(), "totalRecipients", null);
        setField(term313548, term313548.getClass(), "paymentType", null);
        setField(term313548, term313548.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313548, term313548.getClass(), "snapshotCurrencyName", null);
        setField(term313548, term313548.getClass(), "nftIssuingAddress", null);
        setField(term313548, term313548.getClass(), "nftTaxon", null);
        setField(term313548, term313548.getClass(), "scheduleStatus", null);
        setField(term313548, term313548.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNftTaxon", argTypes, term313548, args);
    }

};


