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

public class AirdropStatus_setFrequency_508923905110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313481;

    public AirdropStatus_setFrequency_508923905110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313481 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313481, term313481.getClass(), "results", null);
        setField(term313481, term313481.getClass(), "id", null);
        setField(term313481, term313481.getClass(), "createDate", null);
        setField(term313481, term313481.getClass(), "updateDate", null);
        setField(term313481, term313481.getClass(), "startTime", null);
        setField(term313481, term313481.getClass(), "repeatUntilDate", null);
        setField(term313481, term313481.getClass(), "frequency", null);
        setField(term313481, term313481.getClass(), "status", null);
        setField(term313481, term313481.getClass(), "fromClassicAddress", null);
        setField(term313481, term313481.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313481, term313481.getClass(), "currencyName", null);
        setField(term313481, term313481.getClass(), "currencyNameForProcess", null);
        setField(term313481, term313481.getClass(), "amount", null);
        setBooleanField(term313481, term313481.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313481, term313481.getClass(), "useBlacklist", false);
        setField(term313481, term313481.getClass(), "maximumTrustlines", null);
        setField(term313481, term313481.getClass(), "dropType", null);
        setField(term313481, term313481.getClass(), "failReason", null);
        setField(term313481, term313481.getClass(), "minBalance", null);
        setField(term313481, term313481.getClass(), "maxBalance", null);
        setField(term313481, term313481.getClass(), "totalBlacklisted", null);
        setField(term313481, term313481.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313481, term313481.getClass(), "totalRecipients", null);
        setField(term313481, term313481.getClass(), "paymentType", null);
        setField(term313481, term313481.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313481, term313481.getClass(), "snapshotCurrencyName", null);
        setField(term313481, term313481.getClass(), "nftIssuingAddress", null);
        setField(term313481, term313481.getClass(), "nftTaxon", null);
        setField(term313481, term313481.getClass(), "scheduleStatus", null);
        setField(term313481, term313481.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFrequency", argTypes, term313481, args);
    }

};


