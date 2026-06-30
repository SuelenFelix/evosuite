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
import java.lang.Boolean;

public class AirdropStatus_setUseBlacklist_1786354095118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313507;
     Object term313510;

    public AirdropStatus_setUseBlacklist_1786354095118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313507 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313507, term313507.getClass(), "results", null);
        setField(term313507, term313507.getClass(), "id", null);
        setField(term313507, term313507.getClass(), "createDate", null);
        setField(term313507, term313507.getClass(), "updateDate", null);
        setField(term313507, term313507.getClass(), "startTime", null);
        setField(term313507, term313507.getClass(), "repeatUntilDate", null);
        setField(term313507, term313507.getClass(), "frequency", null);
        setField(term313507, term313507.getClass(), "status", null);
        setField(term313507, term313507.getClass(), "fromClassicAddress", null);
        setField(term313507, term313507.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313507, term313507.getClass(), "currencyName", null);
        setField(term313507, term313507.getClass(), "currencyNameForProcess", null);
        setField(term313507, term313507.getClass(), "amount", null);
        setBooleanField(term313507, term313507.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313507, term313507.getClass(), "useBlacklist", false);
        setField(term313507, term313507.getClass(), "maximumTrustlines", null);
        setField(term313507, term313507.getClass(), "dropType", null);
        setField(term313507, term313507.getClass(), "failReason", null);
        setField(term313507, term313507.getClass(), "minBalance", null);
        setField(term313507, term313507.getClass(), "maxBalance", null);
        setField(term313507, term313507.getClass(), "totalBlacklisted", null);
        setField(term313507, term313507.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313507, term313507.getClass(), "totalRecipients", null);
        setField(term313507, term313507.getClass(), "paymentType", null);
        setField(term313507, term313507.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313507, term313507.getClass(), "snapshotCurrencyName", null);
        setField(term313507, term313507.getClass(), "nftIssuingAddress", null);
        setField(term313507, term313507.getClass(), "nftTaxon", null);
        setField(term313507, term313507.getClass(), "scheduleStatus", null);
        setField(term313507, term313507.getClass(), "fromScheduleId", null);
        term313510 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term313510;
        callMethod(klass, "setUseBlacklist", argTypes, term313507, args);
    }

};


