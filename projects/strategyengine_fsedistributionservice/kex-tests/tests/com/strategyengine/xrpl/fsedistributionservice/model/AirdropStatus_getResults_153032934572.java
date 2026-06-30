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

public class AirdropStatus_getResults_153032934572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313369;

    public AirdropStatus_getResults_153032934572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313369 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313369, term313369.getClass(), "results", null);
        setField(term313369, term313369.getClass(), "id", null);
        setField(term313369, term313369.getClass(), "createDate", null);
        setField(term313369, term313369.getClass(), "updateDate", null);
        setField(term313369, term313369.getClass(), "startTime", null);
        setField(term313369, term313369.getClass(), "repeatUntilDate", null);
        setField(term313369, term313369.getClass(), "frequency", null);
        setField(term313369, term313369.getClass(), "status", null);
        setField(term313369, term313369.getClass(), "fromClassicAddress", null);
        setField(term313369, term313369.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313369, term313369.getClass(), "currencyName", null);
        setField(term313369, term313369.getClass(), "currencyNameForProcess", null);
        setField(term313369, term313369.getClass(), "amount", null);
        setBooleanField(term313369, term313369.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313369, term313369.getClass(), "useBlacklist", false);
        setField(term313369, term313369.getClass(), "maximumTrustlines", null);
        setField(term313369, term313369.getClass(), "dropType", null);
        setField(term313369, term313369.getClass(), "failReason", null);
        setField(term313369, term313369.getClass(), "minBalance", null);
        setField(term313369, term313369.getClass(), "maxBalance", null);
        setField(term313369, term313369.getClass(), "totalBlacklisted", null);
        setField(term313369, term313369.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313369, term313369.getClass(), "totalRecipients", null);
        setField(term313369, term313369.getClass(), "paymentType", null);
        setField(term313369, term313369.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313369, term313369.getClass(), "snapshotCurrencyName", null);
        setField(term313369, term313369.getClass(), "nftIssuingAddress", null);
        setField(term313369, term313369.getClass(), "nftTaxon", null);
        setField(term313369, term313369.getClass(), "scheduleStatus", null);
        setField(term313369, term313369.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResults", argTypes, term313369, args);
    }

};


