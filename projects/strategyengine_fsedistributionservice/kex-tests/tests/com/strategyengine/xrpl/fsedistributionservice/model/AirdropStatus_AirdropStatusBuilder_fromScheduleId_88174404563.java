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

public class AirdropStatus_AirdropStatusBuilder_fromScheduleId_88174404563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558364;

    public AirdropStatus_AirdropStatusBuilder_fromScheduleId_88174404563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558364 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558364, term558364.getClass(), "results", null);
        setField(term558364, term558364.getClass(), "id", null);
        setField(term558364, term558364.getClass(), "createDate", null);
        setField(term558364, term558364.getClass(), "updateDate", null);
        setField(term558364, term558364.getClass(), "startTime", null);
        setField(term558364, term558364.getClass(), "repeatUntilDate", null);
        setField(term558364, term558364.getClass(), "frequency", null);
        setField(term558364, term558364.getClass(), "status", null);
        setField(term558364, term558364.getClass(), "fromClassicAddress", null);
        setField(term558364, term558364.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558364, term558364.getClass(), "currencyName", null);
        setField(term558364, term558364.getClass(), "currencyNameForProcess", null);
        setField(term558364, term558364.getClass(), "amount", null);
        setBooleanField(term558364, term558364.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558364, term558364.getClass(), "useBlacklist", false);
        setField(term558364, term558364.getClass(), "maximumTrustlines", null);
        setField(term558364, term558364.getClass(), "dropType", null);
        setField(term558364, term558364.getClass(), "failReason", null);
        setField(term558364, term558364.getClass(), "minBalance", null);
        setField(term558364, term558364.getClass(), "maxBalance", null);
        setField(term558364, term558364.getClass(), "totalBlacklisted", null);
        setField(term558364, term558364.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558364, term558364.getClass(), "totalRecipients", null);
        setField(term558364, term558364.getClass(), "paymentType", null);
        setField(term558364, term558364.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558364, term558364.getClass(), "snapshotCurrencyName", null);
        setField(term558364, term558364.getClass(), "nftIssuingAddress", null);
        setField(term558364, term558364.getClass(), "nftTaxon", null);
        setField(term558364, term558364.getClass(), "scheduleStatus", null);
        setField(term558364, term558364.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromScheduleId", argTypes, term558364, args);
    }

};


