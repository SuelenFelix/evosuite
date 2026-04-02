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

public class AirdropStatus_AirdropStatusBuilder_currencyName_40756951244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558303;

    public AirdropStatus_AirdropStatusBuilder_currencyName_40756951244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558303 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558303, term558303.getClass(), "results", null);
        setField(term558303, term558303.getClass(), "id", null);
        setField(term558303, term558303.getClass(), "createDate", null);
        setField(term558303, term558303.getClass(), "updateDate", null);
        setField(term558303, term558303.getClass(), "startTime", null);
        setField(term558303, term558303.getClass(), "repeatUntilDate", null);
        setField(term558303, term558303.getClass(), "frequency", null);
        setField(term558303, term558303.getClass(), "status", null);
        setField(term558303, term558303.getClass(), "fromClassicAddress", null);
        setField(term558303, term558303.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558303, term558303.getClass(), "currencyName", null);
        setField(term558303, term558303.getClass(), "currencyNameForProcess", null);
        setField(term558303, term558303.getClass(), "amount", null);
        setBooleanField(term558303, term558303.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558303, term558303.getClass(), "useBlacklist", false);
        setField(term558303, term558303.getClass(), "maximumTrustlines", null);
        setField(term558303, term558303.getClass(), "dropType", null);
        setField(term558303, term558303.getClass(), "failReason", null);
        setField(term558303, term558303.getClass(), "minBalance", null);
        setField(term558303, term558303.getClass(), "maxBalance", null);
        setField(term558303, term558303.getClass(), "totalBlacklisted", null);
        setField(term558303, term558303.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558303, term558303.getClass(), "totalRecipients", null);
        setField(term558303, term558303.getClass(), "paymentType", null);
        setField(term558303, term558303.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558303, term558303.getClass(), "snapshotCurrencyName", null);
        setField(term558303, term558303.getClass(), "nftIssuingAddress", null);
        setField(term558303, term558303.getClass(), "nftTaxon", null);
        setField(term558303, term558303.getClass(), "scheduleStatus", null);
        setField(term558303, term558303.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "currencyName", argTypes, term558303, args);
    }

};


