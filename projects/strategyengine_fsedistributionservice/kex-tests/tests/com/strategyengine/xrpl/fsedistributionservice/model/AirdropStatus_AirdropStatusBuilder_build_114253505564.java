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

public class AirdropStatus_AirdropStatusBuilder_build_114253505564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558367;

    public AirdropStatus_AirdropStatusBuilder_build_114253505564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558367 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558367, term558367.getClass(), "results", null);
        setField(term558367, term558367.getClass(), "id", null);
        setField(term558367, term558367.getClass(), "createDate", null);
        setField(term558367, term558367.getClass(), "updateDate", null);
        setField(term558367, term558367.getClass(), "startTime", null);
        setField(term558367, term558367.getClass(), "repeatUntilDate", null);
        setField(term558367, term558367.getClass(), "frequency", null);
        setField(term558367, term558367.getClass(), "status", null);
        setField(term558367, term558367.getClass(), "fromClassicAddress", null);
        setField(term558367, term558367.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558367, term558367.getClass(), "currencyName", null);
        setField(term558367, term558367.getClass(), "currencyNameForProcess", null);
        setField(term558367, term558367.getClass(), "amount", null);
        setBooleanField(term558367, term558367.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558367, term558367.getClass(), "useBlacklist", false);
        setField(term558367, term558367.getClass(), "maximumTrustlines", null);
        setField(term558367, term558367.getClass(), "dropType", null);
        setField(term558367, term558367.getClass(), "failReason", null);
        setField(term558367, term558367.getClass(), "minBalance", null);
        setField(term558367, term558367.getClass(), "maxBalance", null);
        setField(term558367, term558367.getClass(), "totalBlacklisted", null);
        setField(term558367, term558367.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558367, term558367.getClass(), "totalRecipients", null);
        setField(term558367, term558367.getClass(), "paymentType", null);
        setField(term558367, term558367.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558367, term558367.getClass(), "snapshotCurrencyName", null);
        setField(term558367, term558367.getClass(), "nftIssuingAddress", null);
        setField(term558367, term558367.getClass(), "nftTaxon", null);
        setField(term558367, term558367.getClass(), "scheduleStatus", null);
        setField(term558367, term558367.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term558367, args);
    }

};


