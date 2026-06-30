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

public class AirdropStatus_setNewTrustlinesOnly_905990998117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313502;
     Object term313505;

    public AirdropStatus_setNewTrustlinesOnly_905990998117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313502 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313502, term313502.getClass(), "results", null);
        setField(term313502, term313502.getClass(), "id", null);
        setField(term313502, term313502.getClass(), "createDate", null);
        setField(term313502, term313502.getClass(), "updateDate", null);
        setField(term313502, term313502.getClass(), "startTime", null);
        setField(term313502, term313502.getClass(), "repeatUntilDate", null);
        setField(term313502, term313502.getClass(), "frequency", null);
        setField(term313502, term313502.getClass(), "status", null);
        setField(term313502, term313502.getClass(), "fromClassicAddress", null);
        setField(term313502, term313502.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313502, term313502.getClass(), "currencyName", null);
        setField(term313502, term313502.getClass(), "currencyNameForProcess", null);
        setField(term313502, term313502.getClass(), "amount", null);
        setBooleanField(term313502, term313502.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313502, term313502.getClass(), "useBlacklist", false);
        setField(term313502, term313502.getClass(), "maximumTrustlines", null);
        setField(term313502, term313502.getClass(), "dropType", null);
        setField(term313502, term313502.getClass(), "failReason", null);
        setField(term313502, term313502.getClass(), "minBalance", null);
        setField(term313502, term313502.getClass(), "maxBalance", null);
        setField(term313502, term313502.getClass(), "totalBlacklisted", null);
        setField(term313502, term313502.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313502, term313502.getClass(), "totalRecipients", null);
        setField(term313502, term313502.getClass(), "paymentType", null);
        setField(term313502, term313502.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313502, term313502.getClass(), "snapshotCurrencyName", null);
        setField(term313502, term313502.getClass(), "nftIssuingAddress", null);
        setField(term313502, term313502.getClass(), "nftTaxon", null);
        setField(term313502, term313502.getClass(), "scheduleStatus", null);
        setField(term313502, term313502.getClass(), "fromScheduleId", null);
        term313505 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term313505;
        callMethod(klass, "setNewTrustlinesOnly", argTypes, term313502, args);
    }

};


