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

public class AirdropStatus_setDropType_1665354562120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313515;

    public AirdropStatus_setDropType_1665354562120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313515 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313515, term313515.getClass(), "results", null);
        setField(term313515, term313515.getClass(), "id", null);
        setField(term313515, term313515.getClass(), "createDate", null);
        setField(term313515, term313515.getClass(), "updateDate", null);
        setField(term313515, term313515.getClass(), "startTime", null);
        setField(term313515, term313515.getClass(), "repeatUntilDate", null);
        setField(term313515, term313515.getClass(), "frequency", null);
        setField(term313515, term313515.getClass(), "status", null);
        setField(term313515, term313515.getClass(), "fromClassicAddress", null);
        setField(term313515, term313515.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313515, term313515.getClass(), "currencyName", null);
        setField(term313515, term313515.getClass(), "currencyNameForProcess", null);
        setField(term313515, term313515.getClass(), "amount", null);
        setBooleanField(term313515, term313515.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313515, term313515.getClass(), "useBlacklist", false);
        setField(term313515, term313515.getClass(), "maximumTrustlines", null);
        setField(term313515, term313515.getClass(), "dropType", null);
        setField(term313515, term313515.getClass(), "failReason", null);
        setField(term313515, term313515.getClass(), "minBalance", null);
        setField(term313515, term313515.getClass(), "maxBalance", null);
        setField(term313515, term313515.getClass(), "totalBlacklisted", null);
        setField(term313515, term313515.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313515, term313515.getClass(), "totalRecipients", null);
        setField(term313515, term313515.getClass(), "paymentType", null);
        setField(term313515, term313515.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313515, term313515.getClass(), "snapshotCurrencyName", null);
        setField(term313515, term313515.getClass(), "nftIssuingAddress", null);
        setField(term313515, term313515.getClass(), "nftTaxon", null);
        setField(term313515, term313515.getClass(), "scheduleStatus", null);
        setField(term313515, term313515.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDropType", argTypes, term313515, args);
    }

};


