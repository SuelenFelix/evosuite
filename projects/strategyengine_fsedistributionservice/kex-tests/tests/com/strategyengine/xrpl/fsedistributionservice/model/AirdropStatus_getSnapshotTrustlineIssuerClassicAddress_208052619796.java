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

public class AirdropStatus_getSnapshotTrustlineIssuerClassicAddress_208052619796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313441;

    public AirdropStatus_getSnapshotTrustlineIssuerClassicAddress_208052619796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313441 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313441, term313441.getClass(), "results", null);
        setField(term313441, term313441.getClass(), "id", null);
        setField(term313441, term313441.getClass(), "createDate", null);
        setField(term313441, term313441.getClass(), "updateDate", null);
        setField(term313441, term313441.getClass(), "startTime", null);
        setField(term313441, term313441.getClass(), "repeatUntilDate", null);
        setField(term313441, term313441.getClass(), "frequency", null);
        setField(term313441, term313441.getClass(), "status", null);
        setField(term313441, term313441.getClass(), "fromClassicAddress", null);
        setField(term313441, term313441.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313441, term313441.getClass(), "currencyName", null);
        setField(term313441, term313441.getClass(), "currencyNameForProcess", null);
        setField(term313441, term313441.getClass(), "amount", null);
        setBooleanField(term313441, term313441.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313441, term313441.getClass(), "useBlacklist", false);
        setField(term313441, term313441.getClass(), "maximumTrustlines", null);
        setField(term313441, term313441.getClass(), "dropType", null);
        setField(term313441, term313441.getClass(), "failReason", null);
        setField(term313441, term313441.getClass(), "minBalance", null);
        setField(term313441, term313441.getClass(), "maxBalance", null);
        setField(term313441, term313441.getClass(), "totalBlacklisted", null);
        setField(term313441, term313441.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313441, term313441.getClass(), "totalRecipients", null);
        setField(term313441, term313441.getClass(), "paymentType", null);
        setField(term313441, term313441.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313441, term313441.getClass(), "snapshotCurrencyName", null);
        setField(term313441, term313441.getClass(), "nftIssuingAddress", null);
        setField(term313441, term313441.getClass(), "nftTaxon", null);
        setField(term313441, term313441.getClass(), "scheduleStatus", null);
        setField(term313441, term313441.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term313441, args);
    }

};


