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

public class FsePaymentRequest_FsePaymentRequestBuilder_fromClassicAddress_10302092402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568979;

    public FsePaymentRequest_FsePaymentRequestBuilder_fromClassicAddress_10302092402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term569028 = new ArrayList();
        ((ArrayList) term569028).add("NrEYUPcqwP");
        ((ArrayList) term569028).add("TGeszwaHRe");
        ((ArrayList) term569028).add("udgIsSKFRr");
        ((ArrayList) term569028).add("aOLivtFpQk");
        ((ArrayList) term569028).add("ZOLKnxBnCK");
        ((ArrayList) term569028).add("NfgTNwHaCV");
        ((ArrayList) term569028).add("XAejapRogI");
        Long term569181 = new Long(3771508378771734822L);
        Class<? extends Object> term569427 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term569426 = ((Class) term569427).getDeclaredField((String) "FLAT");
        ((Field) term569426).setAccessible(true);
        Object enum1074 = ((Field) term569426).get((Object) null);
        Long term569227 = new Long(2727169839819823552L);
        Class<? extends Object> term569831 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term569830 = ((Class) term569831).getDeclaredField((String) "WEEKLY");
        ((Field) term569830).setAccessible(true);
        Object enum1075 = ((Field) term569830).get((Object) null);
        term568979 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term569128 = newInstance(Class.forName("java.util.Date"));
        Object term569239 = newInstance(Class.forName("java.util.Date"));
        setField(term568979, term568979.getClass(), "memo", "dwrZEejrHC");
        setField(term568979, term568979.getClass(), "fromClassicAddress", "lzTUhpiGql");
        setField(term568979, term568979.getClass(), "fromSigningPublicKey", "BfYbWESTcb");
        setField(term568979, term568979.getClass(), "fromPrivateKey", "zLcrvdaGyU");
        setField(term568979, term568979.getClass(), "toClassicAddresses", term569028);
        setField(term568979, term568979.getClass(), "amount", "tjtosnRhZg");
        setLongField(term569128, term569128.getClass(), "fastTime", 1877018244707L);
        setField(term569128, term569128.getClass(), "cdate", null);
        setField(term568979, term568979.getClass(), "startTime", term569128);
        setField(term568979, term568979.getClass(), "destinationTag", "fAebRNsXjr");
        setField(term568979, term568979.getClass(), "trustlineIssuerClassicAddress", "EQODXZdfZL");
        setField(term568979, term568979.getClass(), "currencyName", "QScgqkQatE");
        setBooleanField(term568979, term568979.getClass(), "agreeFee", true);
        setField(term568979, term568979.getClass(), "maxXrpFeePerTransaction", "vLgGnXxXre");
        setBooleanField(term568979, term568979.getClass(), "globalIdVerified", true);
        setBooleanField(term568979, term568979.getClass(), "useBlacklist", false);
        setField(term568979, term568979.getClass(), "retryOfId", term569181);
        setField(term568979, term568979.getClass(), "paymentType", enum1074);
        setField(term568979, term568979.getClass(), "snapshotTrustlineIssuerClassicAddress", "AccEBvkfGm");
        setField(term568979, term568979.getClass(), "snapshotCurrencyName", "RXhiAWuHdv");
        setField(term568979, term568979.getClass(), "nftIssuingAddress", "ERohGnSYkC");
        setField(term568979, term568979.getClass(), "nftTaxon", term569227);
        setField(term568979, term568979.getClass(), "frequency", enum1075);
        setLongField(term569239, term569239.getClass(), "fastTime", 1420334918500L);
        setField(term569239, term569239.getClass(), "cdate", null);
        setField(term568979, term568979.getClass(), "repeatUntilDate", term569239);
        setField(term568979, term568979.getClass(), "email", "yMgWhzgQld");
        setBooleanField(term568979, term568979.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eeXAgrClVJ";
        callMethod(klass, "fromClassicAddress", argTypes, term568979, args);
    }

};


