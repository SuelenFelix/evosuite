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

public class AirdropStatus_setUpdateDate_612497156107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313472;

    public AirdropStatus_setUpdateDate_612497156107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313472 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313472, term313472.getClass(), "results", null);
        setField(term313472, term313472.getClass(), "id", null);
        setField(term313472, term313472.getClass(), "createDate", null);
        setField(term313472, term313472.getClass(), "updateDate", null);
        setField(term313472, term313472.getClass(), "startTime", null);
        setField(term313472, term313472.getClass(), "repeatUntilDate", null);
        setField(term313472, term313472.getClass(), "frequency", null);
        setField(term313472, term313472.getClass(), "status", null);
        setField(term313472, term313472.getClass(), "fromClassicAddress", null);
        setField(term313472, term313472.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313472, term313472.getClass(), "currencyName", null);
        setField(term313472, term313472.getClass(), "currencyNameForProcess", null);
        setField(term313472, term313472.getClass(), "amount", null);
        setBooleanField(term313472, term313472.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313472, term313472.getClass(), "useBlacklist", false);
        setField(term313472, term313472.getClass(), "maximumTrustlines", null);
        setField(term313472, term313472.getClass(), "dropType", null);
        setField(term313472, term313472.getClass(), "failReason", null);
        setField(term313472, term313472.getClass(), "minBalance", null);
        setField(term313472, term313472.getClass(), "maxBalance", null);
        setField(term313472, term313472.getClass(), "totalBlacklisted", null);
        setField(term313472, term313472.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313472, term313472.getClass(), "totalRecipients", null);
        setField(term313472, term313472.getClass(), "paymentType", null);
        setField(term313472, term313472.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313472, term313472.getClass(), "snapshotCurrencyName", null);
        setField(term313472, term313472.getClass(), "nftIssuingAddress", null);
        setField(term313472, term313472.getClass(), "nftTaxon", null);
        setField(term313472, term313472.getClass(), "scheduleStatus", null);
        setField(term313472, term313472.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdateDate", argTypes, term313472, args);
    }

};


