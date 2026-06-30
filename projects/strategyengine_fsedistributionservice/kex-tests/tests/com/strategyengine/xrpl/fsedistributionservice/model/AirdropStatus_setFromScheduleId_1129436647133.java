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

public class AirdropStatus_setFromScheduleId_1129436647133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313554;

    public AirdropStatus_setFromScheduleId_1129436647133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313554 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313554, term313554.getClass(), "results", null);
        setField(term313554, term313554.getClass(), "id", null);
        setField(term313554, term313554.getClass(), "createDate", null);
        setField(term313554, term313554.getClass(), "updateDate", null);
        setField(term313554, term313554.getClass(), "startTime", null);
        setField(term313554, term313554.getClass(), "repeatUntilDate", null);
        setField(term313554, term313554.getClass(), "frequency", null);
        setField(term313554, term313554.getClass(), "status", null);
        setField(term313554, term313554.getClass(), "fromClassicAddress", null);
        setField(term313554, term313554.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313554, term313554.getClass(), "currencyName", null);
        setField(term313554, term313554.getClass(), "currencyNameForProcess", null);
        setField(term313554, term313554.getClass(), "amount", null);
        setBooleanField(term313554, term313554.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313554, term313554.getClass(), "useBlacklist", false);
        setField(term313554, term313554.getClass(), "maximumTrustlines", null);
        setField(term313554, term313554.getClass(), "dropType", null);
        setField(term313554, term313554.getClass(), "failReason", null);
        setField(term313554, term313554.getClass(), "minBalance", null);
        setField(term313554, term313554.getClass(), "maxBalance", null);
        setField(term313554, term313554.getClass(), "totalBlacklisted", null);
        setField(term313554, term313554.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313554, term313554.getClass(), "totalRecipients", null);
        setField(term313554, term313554.getClass(), "paymentType", null);
        setField(term313554, term313554.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313554, term313554.getClass(), "snapshotCurrencyName", null);
        setField(term313554, term313554.getClass(), "nftIssuingAddress", null);
        setField(term313554, term313554.getClass(), "nftTaxon", null);
        setField(term313554, term313554.getClass(), "scheduleStatus", null);
        setField(term313554, term313554.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFromScheduleId", argTypes, term313554, args);
    }

};


