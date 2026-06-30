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

public class AirdropStatus_getMaximumTrustlines_159679078687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313414;

    public AirdropStatus_getMaximumTrustlines_159679078687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313414 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313414, term313414.getClass(), "results", null);
        setField(term313414, term313414.getClass(), "id", null);
        setField(term313414, term313414.getClass(), "createDate", null);
        setField(term313414, term313414.getClass(), "updateDate", null);
        setField(term313414, term313414.getClass(), "startTime", null);
        setField(term313414, term313414.getClass(), "repeatUntilDate", null);
        setField(term313414, term313414.getClass(), "frequency", null);
        setField(term313414, term313414.getClass(), "status", null);
        setField(term313414, term313414.getClass(), "fromClassicAddress", null);
        setField(term313414, term313414.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313414, term313414.getClass(), "currencyName", null);
        setField(term313414, term313414.getClass(), "currencyNameForProcess", null);
        setField(term313414, term313414.getClass(), "amount", null);
        setBooleanField(term313414, term313414.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313414, term313414.getClass(), "useBlacklist", false);
        setField(term313414, term313414.getClass(), "maximumTrustlines", null);
        setField(term313414, term313414.getClass(), "dropType", null);
        setField(term313414, term313414.getClass(), "failReason", null);
        setField(term313414, term313414.getClass(), "minBalance", null);
        setField(term313414, term313414.getClass(), "maxBalance", null);
        setField(term313414, term313414.getClass(), "totalBlacklisted", null);
        setField(term313414, term313414.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313414, term313414.getClass(), "totalRecipients", null);
        setField(term313414, term313414.getClass(), "paymentType", null);
        setField(term313414, term313414.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313414, term313414.getClass(), "snapshotCurrencyName", null);
        setField(term313414, term313414.getClass(), "nftIssuingAddress", null);
        setField(term313414, term313414.getClass(), "nftTaxon", null);
        setField(term313414, term313414.getClass(), "scheduleStatus", null);
        setField(term313414, term313414.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term313414, args);
    }

};


