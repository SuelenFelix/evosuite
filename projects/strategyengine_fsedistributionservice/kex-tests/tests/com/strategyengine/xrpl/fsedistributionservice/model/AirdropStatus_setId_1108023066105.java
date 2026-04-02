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

public class AirdropStatus_setId_1108023066105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313466;

    public AirdropStatus_setId_1108023066105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313466 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313466, term313466.getClass(), "results", null);
        setField(term313466, term313466.getClass(), "id", null);
        setField(term313466, term313466.getClass(), "createDate", null);
        setField(term313466, term313466.getClass(), "updateDate", null);
        setField(term313466, term313466.getClass(), "startTime", null);
        setField(term313466, term313466.getClass(), "repeatUntilDate", null);
        setField(term313466, term313466.getClass(), "frequency", null);
        setField(term313466, term313466.getClass(), "status", null);
        setField(term313466, term313466.getClass(), "fromClassicAddress", null);
        setField(term313466, term313466.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313466, term313466.getClass(), "currencyName", null);
        setField(term313466, term313466.getClass(), "currencyNameForProcess", null);
        setField(term313466, term313466.getClass(), "amount", null);
        setBooleanField(term313466, term313466.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313466, term313466.getClass(), "useBlacklist", false);
        setField(term313466, term313466.getClass(), "maximumTrustlines", null);
        setField(term313466, term313466.getClass(), "dropType", null);
        setField(term313466, term313466.getClass(), "failReason", null);
        setField(term313466, term313466.getClass(), "minBalance", null);
        setField(term313466, term313466.getClass(), "maxBalance", null);
        setField(term313466, term313466.getClass(), "totalBlacklisted", null);
        setField(term313466, term313466.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313466, term313466.getClass(), "totalRecipients", null);
        setField(term313466, term313466.getClass(), "paymentType", null);
        setField(term313466, term313466.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313466, term313466.getClass(), "snapshotCurrencyName", null);
        setField(term313466, term313466.getClass(), "nftIssuingAddress", null);
        setField(term313466, term313466.getClass(), "nftTaxon", null);
        setField(term313466, term313466.getClass(), "scheduleStatus", null);
        setField(term313466, term313466.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term313466, args);
    }

};


