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

public class AirdropStatus_getNftTaxon_172465463699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313450;

    public AirdropStatus_getNftTaxon_172465463699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313450 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313450, term313450.getClass(), "results", null);
        setField(term313450, term313450.getClass(), "id", null);
        setField(term313450, term313450.getClass(), "createDate", null);
        setField(term313450, term313450.getClass(), "updateDate", null);
        setField(term313450, term313450.getClass(), "startTime", null);
        setField(term313450, term313450.getClass(), "repeatUntilDate", null);
        setField(term313450, term313450.getClass(), "frequency", null);
        setField(term313450, term313450.getClass(), "status", null);
        setField(term313450, term313450.getClass(), "fromClassicAddress", null);
        setField(term313450, term313450.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313450, term313450.getClass(), "currencyName", null);
        setField(term313450, term313450.getClass(), "currencyNameForProcess", null);
        setField(term313450, term313450.getClass(), "amount", null);
        setBooleanField(term313450, term313450.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313450, term313450.getClass(), "useBlacklist", false);
        setField(term313450, term313450.getClass(), "maximumTrustlines", null);
        setField(term313450, term313450.getClass(), "dropType", null);
        setField(term313450, term313450.getClass(), "failReason", null);
        setField(term313450, term313450.getClass(), "minBalance", null);
        setField(term313450, term313450.getClass(), "maxBalance", null);
        setField(term313450, term313450.getClass(), "totalBlacklisted", null);
        setField(term313450, term313450.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313450, term313450.getClass(), "totalRecipients", null);
        setField(term313450, term313450.getClass(), "paymentType", null);
        setField(term313450, term313450.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313450, term313450.getClass(), "snapshotCurrencyName", null);
        setField(term313450, term313450.getClass(), "nftIssuingAddress", null);
        setField(term313450, term313450.getClass(), "nftTaxon", null);
        setField(term313450, term313450.getClass(), "scheduleStatus", null);
        setField(term313450, term313450.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftTaxon", argTypes, term313450, args);
    }

};


