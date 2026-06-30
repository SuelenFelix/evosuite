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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Boolean;

public class FsePaymentRequest_setAutoApprove_3863862355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404779;
     Object term405040;

    public FsePaymentRequest_setAutoApprove_3863862355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term404828 = new ArrayList();
        ((ArrayList) term404828).add("JxwsJCJdxD");
        ((ArrayList) term404828).add("pEVByJwwno");
        ((ArrayList) term404828).add("KReakLEucX");
        ((ArrayList) term404828).add("mhhLPCEKce");
        ((ArrayList) term404828).add("mGYVzQAKbZ");
        Long term404957 = new Long(-8815714356297321412L);
        Class<? extends Object> term405183 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term405182 = ((Class) term405183).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term405182).setAccessible(true);
        Object enum771 = ((Field) term405182).get((Object) null);
        Long term405011 = new Long(-4738455258060622217L);
        Class<? extends Object> term405611 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term405610 = ((Class) term405611).getDeclaredField((String) "ANNUALLY");
        ((Field) term405610).setAccessible(true);
        Object enum772 = ((Field) term405610).get((Object) null);
        term404779 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term404904 = newInstance(Class.forName("java.util.Date"));
        Object term405025 = newInstance(Class.forName("java.util.Date"));
        setField(term404779, term404779.getClass(), "memo", "UiUlPwkluo");
        setField(term404779, term404779.getClass(), "fromClassicAddress", "hidWzTClRC");
        setField(term404779, term404779.getClass(), "fromSigningPublicKey", "jopYvhYeRh");
        setField(term404779, term404779.getClass(), "fromPrivateKey", "nXQDrjTiry");
        setField(term404779, term404779.getClass(), "toClassicAddresses", term404828);
        setField(term404779, term404779.getClass(), "amount", "WRYXrZXyWW");
        setLongField(term404904, term404904.getClass(), "fastTime", 1628101328049L);
        setField(term404904, term404904.getClass(), "cdate", null);
        setField(term404779, term404779.getClass(), "startTime", term404904);
        setField(term404779, term404779.getClass(), "destinationTag", "oxutRgjLWf");
        setField(term404779, term404779.getClass(), "trustlineIssuerClassicAddress", "gwIPWwFNRB");
        setField(term404779, term404779.getClass(), "currencyName", "hFuBnwDQFp");
        setBooleanField(term404779, term404779.getClass(), "agreeFee", true);
        setField(term404779, term404779.getClass(), "maxXrpFeePerTransaction", "CmxKtZlOTF");
        setBooleanField(term404779, term404779.getClass(), "globalIdVerified", true);
        setBooleanField(term404779, term404779.getClass(), "useBlacklist", false);
        setField(term404779, term404779.getClass(), "retryOfId", term404957);
        setField(term404779, term404779.getClass(), "paymentType", enum771);
        setField(term404779, term404779.getClass(), "snapshotTrustlineIssuerClassicAddress", "vtuxUUlufI");
        setField(term404779, term404779.getClass(), "snapshotCurrencyName", "IElqCRKTzX");
        setField(term404779, term404779.getClass(), "nftIssuingAddress", "jakWEzNHql");
        setField(term404779, term404779.getClass(), "nftTaxon", term405011);
        setField(term404779, term404779.getClass(), "frequency", enum772);
        setLongField(term405025, term405025.getClass(), "fastTime", 1493689018381L);
        setField(term405025, term405025.getClass(), "cdate", null);
        setField(term404779, term404779.getClass(), "repeatUntilDate", term405025);
        setField(term404779, term404779.getClass(), "email", "FkXktXVTrX");
        setBooleanField(term404779, term404779.getClass(), "autoApprove", true);
        term405040 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term405040;
        callMethod(klass, "setAutoApprove", argTypes, term404779, args);
    }

};


