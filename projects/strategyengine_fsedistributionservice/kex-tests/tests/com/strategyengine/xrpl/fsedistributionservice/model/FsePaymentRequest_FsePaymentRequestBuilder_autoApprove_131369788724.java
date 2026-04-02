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

public class FsePaymentRequest_FsePaymentRequestBuilder_autoApprove_131369788724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596112;
     Object term596303;

    public FsePaymentRequest_FsePaymentRequestBuilder_autoApprove_131369788724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term596161 = new ArrayList();
        Long term596230 = new Long(-8013089718329780345L);
        Class<? extends Object> term596396 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term596395 = ((Class) term596396).getDeclaredField((String) "FLAT");
        ((Field) term596395).setAccessible(true);
        Object enum1119 = ((Field) term596395).get((Object) null);
        Long term596276 = new Long(-3786581600529665600L);
        Class<? extends Object> term596800 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term596799 = ((Class) term596800).getDeclaredField((String) "WEEKLY");
        ((Field) term596799).setAccessible(true);
        Object enum1120 = ((Field) term596799).get((Object) null);
        term596112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term596177 = newInstance(Class.forName("java.util.Date"));
        Object term596288 = newInstance(Class.forName("java.util.Date"));
        setField(term596112, term596112.getClass(), "memo", "uOyOpAymZk");
        setField(term596112, term596112.getClass(), "fromClassicAddress", "xtPjvtnPnN");
        setField(term596112, term596112.getClass(), "fromSigningPublicKey", "lbTGbReUrp");
        setField(term596112, term596112.getClass(), "fromPrivateKey", "oaPePvATgc");
        setField(term596112, term596112.getClass(), "toClassicAddresses", term596161);
        setField(term596112, term596112.getClass(), "amount", "JIjGGcVKJH");
        setLongField(term596177, term596177.getClass(), "fastTime", 1851576009197L);
        setField(term596177, term596177.getClass(), "cdate", null);
        setField(term596112, term596112.getClass(), "startTime", term596177);
        setField(term596112, term596112.getClass(), "destinationTag", "iasdYjtSEx");
        setField(term596112, term596112.getClass(), "trustlineIssuerClassicAddress", "QFfeXcsDUe");
        setField(term596112, term596112.getClass(), "currencyName", "RuTPzciBfn");
        setBooleanField(term596112, term596112.getClass(), "agreeFee", false);
        setField(term596112, term596112.getClass(), "maxXrpFeePerTransaction", "osTjagfbhA");
        setBooleanField(term596112, term596112.getClass(), "globalIdVerified", true);
        setBooleanField(term596112, term596112.getClass(), "useBlacklist", false);
        setField(term596112, term596112.getClass(), "retryOfId", term596230);
        setField(term596112, term596112.getClass(), "paymentType", enum1119);
        setField(term596112, term596112.getClass(), "snapshotTrustlineIssuerClassicAddress", "KVJHdKBMKb");
        setField(term596112, term596112.getClass(), "snapshotCurrencyName", "hrhwpRIDFJ");
        setField(term596112, term596112.getClass(), "nftIssuingAddress", "eanYvfnxqY");
        setField(term596112, term596112.getClass(), "nftTaxon", term596276);
        setField(term596112, term596112.getClass(), "frequency", enum1120);
        setLongField(term596288, term596288.getClass(), "fastTime", 1847720740645L);
        setField(term596288, term596288.getClass(), "cdate", null);
        setField(term596112, term596112.getClass(), "repeatUntilDate", term596288);
        setField(term596112, term596112.getClass(), "email", "WHYzVTgpKa");
        setBooleanField(term596112, term596112.getClass(), "autoApprove", true);
        term596303 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term596303;
        callMethod(klass, "autoApprove", argTypes, term596112, args);
    }

};


