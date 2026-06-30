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

public class FsePaymentRequest_setSnapshotTrustlineIssuerClassicAddress_58426790548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396056;

    public FsePaymentRequest_setSnapshotTrustlineIssuerClassicAddress_58426790548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term396105 = new ArrayList();
        ((ArrayList) term396105).add("yZZmcbVGZy");
        ((ArrayList) term396105).add("LKmbPgjjcM");
        ((ArrayList) term396105).add("UFtMnIwpQB");
        ((ArrayList) term396105).add("mBttQwNLGV");
        ((ArrayList) term396105).add("NQOlrMMoLe");
        ((ArrayList) term396105).add("CBbinlqqUA");
        ((ArrayList) term396105).add("dHbuyJcJjB");
        ((ArrayList) term396105).add("TIbgFtoEex");
        Long term396270 = new Long(2142335215837283347L);
        Class<? extends Object> term396527 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term396526 = ((Class) term396527).getDeclaredField((String) "FLAT");
        ((Field) term396526).setAccessible(true);
        Object enum756 = ((Field) term396526).get((Object) null);
        Long term396316 = new Long(-3861643867197678062L);
        Class<? extends Object> term396931 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term396930 = ((Class) term396931).getDeclaredField((String) "MONTHLY");
        ((Field) term396930).setAccessible(true);
        Object enum757 = ((Field) term396930).get((Object) null);
        term396056 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term396217 = newInstance(Class.forName("java.util.Date"));
        Object term396329 = newInstance(Class.forName("java.util.Date"));
        setField(term396056, term396056.getClass(), "memo", "vWOXFteDkq");
        setField(term396056, term396056.getClass(), "fromClassicAddress", "IsffVLAFSj");
        setField(term396056, term396056.getClass(), "fromSigningPublicKey", "bwwObTfhHs");
        setField(term396056, term396056.getClass(), "fromPrivateKey", "JOxxUMDzMi");
        setField(term396056, term396056.getClass(), "toClassicAddresses", term396105);
        setField(term396056, term396056.getClass(), "amount", "agvoIJPMlI");
        setLongField(term396217, term396217.getClass(), "fastTime", 1846261860597L);
        setField(term396217, term396217.getClass(), "cdate", null);
        setField(term396056, term396056.getClass(), "startTime", term396217);
        setField(term396056, term396056.getClass(), "destinationTag", "SKgoTYVFbm");
        setField(term396056, term396056.getClass(), "trustlineIssuerClassicAddress", "YjsottiyXZ");
        setField(term396056, term396056.getClass(), "currencyName", "anZowJfgfR");
        setBooleanField(term396056, term396056.getClass(), "agreeFee", true);
        setField(term396056, term396056.getClass(), "maxXrpFeePerTransaction", "ZmIbrizkha");
        setBooleanField(term396056, term396056.getClass(), "globalIdVerified", false);
        setBooleanField(term396056, term396056.getClass(), "useBlacklist", false);
        setField(term396056, term396056.getClass(), "retryOfId", term396270);
        setField(term396056, term396056.getClass(), "paymentType", enum756);
        setField(term396056, term396056.getClass(), "snapshotTrustlineIssuerClassicAddress", "YMqvSYdDqY");
        setField(term396056, term396056.getClass(), "snapshotCurrencyName", "PlPbUzhDYB");
        setField(term396056, term396056.getClass(), "nftIssuingAddress", "ctWXrepEGs");
        setField(term396056, term396056.getClass(), "nftTaxon", term396316);
        setField(term396056, term396056.getClass(), "frequency", enum757);
        setLongField(term396329, term396329.getClass(), "fastTime", 1861728317440L);
        setField(term396329, term396329.getClass(), "cdate", null);
        setField(term396056, term396056.getClass(), "repeatUntilDate", term396329);
        setField(term396056, term396056.getClass(), "email", "fbKUErcwbU");
        setBooleanField(term396056, term396056.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CPweBQmYOE";
        callMethod(klass, "setSnapshotTrustlineIssuerClassicAddress", argTypes, term396056, args);
    }

};


