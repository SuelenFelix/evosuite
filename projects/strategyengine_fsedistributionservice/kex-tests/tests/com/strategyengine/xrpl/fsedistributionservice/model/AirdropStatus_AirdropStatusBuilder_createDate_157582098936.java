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

public class AirdropStatus_AirdropStatusBuilder_createDate_157582098936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558279;

    public AirdropStatus_AirdropStatusBuilder_createDate_157582098936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558279 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558279, term558279.getClass(), "results", null);
        setField(term558279, term558279.getClass(), "id", null);
        setField(term558279, term558279.getClass(), "createDate", null);
        setField(term558279, term558279.getClass(), "updateDate", null);
        setField(term558279, term558279.getClass(), "startTime", null);
        setField(term558279, term558279.getClass(), "repeatUntilDate", null);
        setField(term558279, term558279.getClass(), "frequency", null);
        setField(term558279, term558279.getClass(), "status", null);
        setField(term558279, term558279.getClass(), "fromClassicAddress", null);
        setField(term558279, term558279.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558279, term558279.getClass(), "currencyName", null);
        setField(term558279, term558279.getClass(), "currencyNameForProcess", null);
        setField(term558279, term558279.getClass(), "amount", null);
        setBooleanField(term558279, term558279.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558279, term558279.getClass(), "useBlacklist", false);
        setField(term558279, term558279.getClass(), "maximumTrustlines", null);
        setField(term558279, term558279.getClass(), "dropType", null);
        setField(term558279, term558279.getClass(), "failReason", null);
        setField(term558279, term558279.getClass(), "minBalance", null);
        setField(term558279, term558279.getClass(), "maxBalance", null);
        setField(term558279, term558279.getClass(), "totalBlacklisted", null);
        setField(term558279, term558279.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558279, term558279.getClass(), "totalRecipients", null);
        setField(term558279, term558279.getClass(), "paymentType", null);
        setField(term558279, term558279.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558279, term558279.getClass(), "snapshotCurrencyName", null);
        setField(term558279, term558279.getClass(), "nftIssuingAddress", null);
        setField(term558279, term558279.getClass(), "nftTaxon", null);
        setField(term558279, term558279.getClass(), "scheduleStatus", null);
        setField(term558279, term558279.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createDate", argTypes, term558279, args);
    }

};


