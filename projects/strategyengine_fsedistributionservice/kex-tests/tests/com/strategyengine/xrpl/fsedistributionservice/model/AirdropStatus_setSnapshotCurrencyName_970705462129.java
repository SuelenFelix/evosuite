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

public class AirdropStatus_setSnapshotCurrencyName_970705462129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313542;

    public AirdropStatus_setSnapshotCurrencyName_970705462129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313542 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313542, term313542.getClass(), "results", null);
        setField(term313542, term313542.getClass(), "id", null);
        setField(term313542, term313542.getClass(), "createDate", null);
        setField(term313542, term313542.getClass(), "updateDate", null);
        setField(term313542, term313542.getClass(), "startTime", null);
        setField(term313542, term313542.getClass(), "repeatUntilDate", null);
        setField(term313542, term313542.getClass(), "frequency", null);
        setField(term313542, term313542.getClass(), "status", null);
        setField(term313542, term313542.getClass(), "fromClassicAddress", null);
        setField(term313542, term313542.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313542, term313542.getClass(), "currencyName", null);
        setField(term313542, term313542.getClass(), "currencyNameForProcess", null);
        setField(term313542, term313542.getClass(), "amount", null);
        setBooleanField(term313542, term313542.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313542, term313542.getClass(), "useBlacklist", false);
        setField(term313542, term313542.getClass(), "maximumTrustlines", null);
        setField(term313542, term313542.getClass(), "dropType", null);
        setField(term313542, term313542.getClass(), "failReason", null);
        setField(term313542, term313542.getClass(), "minBalance", null);
        setField(term313542, term313542.getClass(), "maxBalance", null);
        setField(term313542, term313542.getClass(), "totalBlacklisted", null);
        setField(term313542, term313542.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313542, term313542.getClass(), "totalRecipients", null);
        setField(term313542, term313542.getClass(), "paymentType", null);
        setField(term313542, term313542.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313542, term313542.getClass(), "snapshotCurrencyName", null);
        setField(term313542, term313542.getClass(), "nftIssuingAddress", null);
        setField(term313542, term313542.getClass(), "nftTaxon", null);
        setField(term313542, term313542.getClass(), "scheduleStatus", null);
        setField(term313542, term313542.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSnapshotCurrencyName", argTypes, term313542, args);
    }

};


