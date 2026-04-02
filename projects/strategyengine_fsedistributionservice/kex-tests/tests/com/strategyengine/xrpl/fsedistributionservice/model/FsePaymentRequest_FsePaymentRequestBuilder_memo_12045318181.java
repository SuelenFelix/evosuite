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

public class FsePaymentRequest_FsePaymentRequestBuilder_memo_12045318181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567700;

    public FsePaymentRequest_FsePaymentRequestBuilder_memo_12045318181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term567749 = new ArrayList();
        ((ArrayList) term567749).add("gRfwDGnUeI");
        ((ArrayList) term567749).add("AzIgoJKPKf");
        ((ArrayList) term567749).add("DoekyfIrat");
        ((ArrayList) term567749).add("hLGgJdPgBD");
        ((ArrayList) term567749).add("PEgWPuGHaR");
        ((ArrayList) term567749).add("eIRVRaUyle");
        ((ArrayList) term567749).add("biqUFWRvGE");
        ((ArrayList) term567749).add("iYCqUzLrAo");
        Long term567914 = new Long(7597058252879142457L);
        Class<? extends Object> term568169 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term568168 = ((Class) term568169).getDeclaredField((String) "FLAT");
        ((Field) term568168).setAccessible(true);
        Object enum1072 = ((Field) term568168).get((Object) null);
        Long term567960 = new Long(-2916052431291931409L);
        Class<? extends Object> term568573 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term568572 = ((Class) term568573).getDeclaredField((String) "DAILY");
        ((Field) term568572).setAccessible(true);
        Object enum1073 = ((Field) term568572).get((Object) null);
        term567700 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term567861 = newInstance(Class.forName("java.util.Date"));
        Object term567971 = newInstance(Class.forName("java.util.Date"));
        setField(term567700, term567700.getClass(), "memo", "LVSwXfrvcg");
        setField(term567700, term567700.getClass(), "fromClassicAddress", "ewjLmrzsVO");
        setField(term567700, term567700.getClass(), "fromSigningPublicKey", "ViYeKNhFKg");
        setField(term567700, term567700.getClass(), "fromPrivateKey", "SXFyTzXeaj");
        setField(term567700, term567700.getClass(), "toClassicAddresses", term567749);
        setField(term567700, term567700.getClass(), "amount", "ZvqsamWXxh");
        setLongField(term567861, term567861.getClass(), "fastTime", 1695432264739L);
        setField(term567861, term567861.getClass(), "cdate", null);
        setField(term567700, term567700.getClass(), "startTime", term567861);
        setField(term567700, term567700.getClass(), "destinationTag", "byjpWhwFin");
        setField(term567700, term567700.getClass(), "trustlineIssuerClassicAddress", "gGzrIgBnsE");
        setField(term567700, term567700.getClass(), "currencyName", "rATFFkwzYs");
        setBooleanField(term567700, term567700.getClass(), "agreeFee", false);
        setField(term567700, term567700.getClass(), "maxXrpFeePerTransaction", "jGxWetlEmL");
        setBooleanField(term567700, term567700.getClass(), "globalIdVerified", false);
        setBooleanField(term567700, term567700.getClass(), "useBlacklist", false);
        setField(term567700, term567700.getClass(), "retryOfId", term567914);
        setField(term567700, term567700.getClass(), "paymentType", enum1072);
        setField(term567700, term567700.getClass(), "snapshotTrustlineIssuerClassicAddress", "cYTQwXvMdt");
        setField(term567700, term567700.getClass(), "snapshotCurrencyName", "eVHqQrwHDN");
        setField(term567700, term567700.getClass(), "nftIssuingAddress", "ZMpwUjTPUn");
        setField(term567700, term567700.getClass(), "nftTaxon", term567960);
        setField(term567700, term567700.getClass(), "frequency", enum1073);
        setLongField(term567971, term567971.getClass(), "fastTime", 1817693922139L);
        setField(term567971, term567971.getClass(), "cdate", null);
        setField(term567700, term567700.getClass(), "repeatUntilDate", term567971);
        setField(term567700, term567700.getClass(), "email", "kaMCFAtRdw");
        setBooleanField(term567700, term567700.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TNgREfoJmh";
        callMethod(klass, "memo", argTypes, term567700, args);
    }

};


