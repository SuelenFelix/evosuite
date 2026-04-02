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

public class AirdropStatus_AirdropStatusBuilder_snapshotTrustlineIssuerClassicAddress_157746860758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558349;

    public AirdropStatus_AirdropStatusBuilder_snapshotTrustlineIssuerClassicAddress_157746860758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558349 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558349, term558349.getClass(), "results", null);
        setField(term558349, term558349.getClass(), "id", null);
        setField(term558349, term558349.getClass(), "createDate", null);
        setField(term558349, term558349.getClass(), "updateDate", null);
        setField(term558349, term558349.getClass(), "startTime", null);
        setField(term558349, term558349.getClass(), "repeatUntilDate", null);
        setField(term558349, term558349.getClass(), "frequency", null);
        setField(term558349, term558349.getClass(), "status", null);
        setField(term558349, term558349.getClass(), "fromClassicAddress", null);
        setField(term558349, term558349.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558349, term558349.getClass(), "currencyName", null);
        setField(term558349, term558349.getClass(), "currencyNameForProcess", null);
        setField(term558349, term558349.getClass(), "amount", null);
        setBooleanField(term558349, term558349.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558349, term558349.getClass(), "useBlacklist", false);
        setField(term558349, term558349.getClass(), "maximumTrustlines", null);
        setField(term558349, term558349.getClass(), "dropType", null);
        setField(term558349, term558349.getClass(), "failReason", null);
        setField(term558349, term558349.getClass(), "minBalance", null);
        setField(term558349, term558349.getClass(), "maxBalance", null);
        setField(term558349, term558349.getClass(), "totalBlacklisted", null);
        setField(term558349, term558349.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558349, term558349.getClass(), "totalRecipients", null);
        setField(term558349, term558349.getClass(), "paymentType", null);
        setField(term558349, term558349.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558349, term558349.getClass(), "snapshotCurrencyName", null);
        setField(term558349, term558349.getClass(), "nftIssuingAddress", null);
        setField(term558349, term558349.getClass(), "nftTaxon", null);
        setField(term558349, term558349.getClass(), "scheduleStatus", null);
        setField(term558349, term558349.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "snapshotTrustlineIssuerClassicAddress", argTypes, term558349, args);
    }

};


