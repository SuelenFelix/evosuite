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

public class AirdropStatus_getCurrencyNameForProcess_159667283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313402;

    public AirdropStatus_getCurrencyNameForProcess_159667283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313402 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313402, term313402.getClass(), "results", null);
        setField(term313402, term313402.getClass(), "id", null);
        setField(term313402, term313402.getClass(), "createDate", null);
        setField(term313402, term313402.getClass(), "updateDate", null);
        setField(term313402, term313402.getClass(), "startTime", null);
        setField(term313402, term313402.getClass(), "repeatUntilDate", null);
        setField(term313402, term313402.getClass(), "frequency", null);
        setField(term313402, term313402.getClass(), "status", null);
        setField(term313402, term313402.getClass(), "fromClassicAddress", null);
        setField(term313402, term313402.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313402, term313402.getClass(), "currencyName", null);
        setField(term313402, term313402.getClass(), "currencyNameForProcess", null);
        setField(term313402, term313402.getClass(), "amount", null);
        setBooleanField(term313402, term313402.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313402, term313402.getClass(), "useBlacklist", false);
        setField(term313402, term313402.getClass(), "maximumTrustlines", null);
        setField(term313402, term313402.getClass(), "dropType", null);
        setField(term313402, term313402.getClass(), "failReason", null);
        setField(term313402, term313402.getClass(), "minBalance", null);
        setField(term313402, term313402.getClass(), "maxBalance", null);
        setField(term313402, term313402.getClass(), "totalBlacklisted", null);
        setField(term313402, term313402.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313402, term313402.getClass(), "totalRecipients", null);
        setField(term313402, term313402.getClass(), "paymentType", null);
        setField(term313402, term313402.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313402, term313402.getClass(), "snapshotCurrencyName", null);
        setField(term313402, term313402.getClass(), "nftIssuingAddress", null);
        setField(term313402, term313402.getClass(), "nftTaxon", null);
        setField(term313402, term313402.getClass(), "scheduleStatus", null);
        setField(term313402, term313402.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyNameForProcess", argTypes, term313402, args);
    }

};


