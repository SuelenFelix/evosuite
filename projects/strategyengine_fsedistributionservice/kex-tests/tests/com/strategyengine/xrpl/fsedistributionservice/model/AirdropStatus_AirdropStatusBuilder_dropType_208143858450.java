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

public class AirdropStatus_AirdropStatusBuilder_dropType_208143858450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558325;

    public AirdropStatus_AirdropStatusBuilder_dropType_208143858450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558325 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558325, term558325.getClass(), "results", null);
        setField(term558325, term558325.getClass(), "id", null);
        setField(term558325, term558325.getClass(), "createDate", null);
        setField(term558325, term558325.getClass(), "updateDate", null);
        setField(term558325, term558325.getClass(), "startTime", null);
        setField(term558325, term558325.getClass(), "repeatUntilDate", null);
        setField(term558325, term558325.getClass(), "frequency", null);
        setField(term558325, term558325.getClass(), "status", null);
        setField(term558325, term558325.getClass(), "fromClassicAddress", null);
        setField(term558325, term558325.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558325, term558325.getClass(), "currencyName", null);
        setField(term558325, term558325.getClass(), "currencyNameForProcess", null);
        setField(term558325, term558325.getClass(), "amount", null);
        setBooleanField(term558325, term558325.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558325, term558325.getClass(), "useBlacklist", false);
        setField(term558325, term558325.getClass(), "maximumTrustlines", null);
        setField(term558325, term558325.getClass(), "dropType", null);
        setField(term558325, term558325.getClass(), "failReason", null);
        setField(term558325, term558325.getClass(), "minBalance", null);
        setField(term558325, term558325.getClass(), "maxBalance", null);
        setField(term558325, term558325.getClass(), "totalBlacklisted", null);
        setField(term558325, term558325.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558325, term558325.getClass(), "totalRecipients", null);
        setField(term558325, term558325.getClass(), "paymentType", null);
        setField(term558325, term558325.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558325, term558325.getClass(), "snapshotCurrencyName", null);
        setField(term558325, term558325.getClass(), "nftIssuingAddress", null);
        setField(term558325, term558325.getClass(), "nftTaxon", null);
        setField(term558325, term558325.getClass(), "scheduleStatus", null);
        setField(term558325, term558325.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "dropType", argTypes, term558325, args);
    }

};


