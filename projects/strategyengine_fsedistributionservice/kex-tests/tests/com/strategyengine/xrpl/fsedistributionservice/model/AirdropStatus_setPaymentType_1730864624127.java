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

public class AirdropStatus_setPaymentType_1730864624127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313536;

    public AirdropStatus_setPaymentType_1730864624127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313536 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313536, term313536.getClass(), "results", null);
        setField(term313536, term313536.getClass(), "id", null);
        setField(term313536, term313536.getClass(), "createDate", null);
        setField(term313536, term313536.getClass(), "updateDate", null);
        setField(term313536, term313536.getClass(), "startTime", null);
        setField(term313536, term313536.getClass(), "repeatUntilDate", null);
        setField(term313536, term313536.getClass(), "frequency", null);
        setField(term313536, term313536.getClass(), "status", null);
        setField(term313536, term313536.getClass(), "fromClassicAddress", null);
        setField(term313536, term313536.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313536, term313536.getClass(), "currencyName", null);
        setField(term313536, term313536.getClass(), "currencyNameForProcess", null);
        setField(term313536, term313536.getClass(), "amount", null);
        setBooleanField(term313536, term313536.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313536, term313536.getClass(), "useBlacklist", false);
        setField(term313536, term313536.getClass(), "maximumTrustlines", null);
        setField(term313536, term313536.getClass(), "dropType", null);
        setField(term313536, term313536.getClass(), "failReason", null);
        setField(term313536, term313536.getClass(), "minBalance", null);
        setField(term313536, term313536.getClass(), "maxBalance", null);
        setField(term313536, term313536.getClass(), "totalBlacklisted", null);
        setField(term313536, term313536.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313536, term313536.getClass(), "totalRecipients", null);
        setField(term313536, term313536.getClass(), "paymentType", null);
        setField(term313536, term313536.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313536, term313536.getClass(), "snapshotCurrencyName", null);
        setField(term313536, term313536.getClass(), "nftIssuingAddress", null);
        setField(term313536, term313536.getClass(), "nftTaxon", null);
        setField(term313536, term313536.getClass(), "scheduleStatus", null);
        setField(term313536, term313536.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPaymentType", argTypes, term313536, args);
    }

};


