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

public class AirdropStatus_AirdropStatusBuilder_totalBlacklisted_8234519354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558337;

    public AirdropStatus_AirdropStatusBuilder_totalBlacklisted_8234519354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558337 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558337, term558337.getClass(), "results", null);
        setField(term558337, term558337.getClass(), "id", null);
        setField(term558337, term558337.getClass(), "createDate", null);
        setField(term558337, term558337.getClass(), "updateDate", null);
        setField(term558337, term558337.getClass(), "startTime", null);
        setField(term558337, term558337.getClass(), "repeatUntilDate", null);
        setField(term558337, term558337.getClass(), "frequency", null);
        setField(term558337, term558337.getClass(), "status", null);
        setField(term558337, term558337.getClass(), "fromClassicAddress", null);
        setField(term558337, term558337.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558337, term558337.getClass(), "currencyName", null);
        setField(term558337, term558337.getClass(), "currencyNameForProcess", null);
        setField(term558337, term558337.getClass(), "amount", null);
        setBooleanField(term558337, term558337.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558337, term558337.getClass(), "useBlacklist", false);
        setField(term558337, term558337.getClass(), "maximumTrustlines", null);
        setField(term558337, term558337.getClass(), "dropType", null);
        setField(term558337, term558337.getClass(), "failReason", null);
        setField(term558337, term558337.getClass(), "minBalance", null);
        setField(term558337, term558337.getClass(), "maxBalance", null);
        setField(term558337, term558337.getClass(), "totalBlacklisted", null);
        setField(term558337, term558337.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558337, term558337.getClass(), "totalRecipients", null);
        setField(term558337, term558337.getClass(), "paymentType", null);
        setField(term558337, term558337.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558337, term558337.getClass(), "snapshotCurrencyName", null);
        setField(term558337, term558337.getClass(), "nftIssuingAddress", null);
        setField(term558337, term558337.getClass(), "nftTaxon", null);
        setField(term558337, term558337.getClass(), "scheduleStatus", null);
        setField(term558337, term558337.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "totalBlacklisted", argTypes, term558337, args);
    }

};


