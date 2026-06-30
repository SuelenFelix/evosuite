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

public class FsePaymentRequest_setFromPrivateKey_129481114235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380292;

    public FsePaymentRequest_setFromPrivateKey_129481114235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term380341 = new ArrayList();
        ((ArrayList) term380341).add("PHeLqVCgUF");
        ((ArrayList) term380341).add("pNwyRKGjjM");
        ((ArrayList) term380341).add("MSUEuvzuwP");
        ((ArrayList) term380341).add("kxHgqohAOx");
        ((ArrayList) term380341).add("FsCSDmxBwU");
        Long term380470 = new Long(-6651761389033452541L);
        Class<? extends Object> term380706 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term380705 = ((Class) term380706).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term380705).setAccessible(true);
        Object enum730 = ((Field) term380705).get((Object) null);
        Long term380524 = new Long(7492997886327124063L);
        Class<? extends Object> term381134 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term381133 = ((Class) term381134).getDeclaredField((String) "ANNUALLY");
        ((Field) term381133).setAccessible(true);
        Object enum731 = ((Field) term381133).get((Object) null);
        term380292 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term380417 = newInstance(Class.forName("java.util.Date"));
        Object term380538 = newInstance(Class.forName("java.util.Date"));
        setField(term380292, term380292.getClass(), "memo", "SsduBcDNWb");
        setField(term380292, term380292.getClass(), "fromClassicAddress", "cykMaZePdO");
        setField(term380292, term380292.getClass(), "fromSigningPublicKey", "TpnkYWqNUj");
        setField(term380292, term380292.getClass(), "fromPrivateKey", "eNNbxsHrdX");
        setField(term380292, term380292.getClass(), "toClassicAddresses", term380341);
        setField(term380292, term380292.getClass(), "amount", "YRfCNvIQfM");
        setLongField(term380417, term380417.getClass(), "fastTime", 1849537151339L);
        setField(term380417, term380417.getClass(), "cdate", null);
        setField(term380292, term380292.getClass(), "startTime", term380417);
        setField(term380292, term380292.getClass(), "destinationTag", "aUnLleyfFN");
        setField(term380292, term380292.getClass(), "trustlineIssuerClassicAddress", "JziPmKdWww");
        setField(term380292, term380292.getClass(), "currencyName", "LRKdNCNmMV");
        setBooleanField(term380292, term380292.getClass(), "agreeFee", true);
        setField(term380292, term380292.getClass(), "maxXrpFeePerTransaction", "thQPqqRGQK");
        setBooleanField(term380292, term380292.getClass(), "globalIdVerified", true);
        setBooleanField(term380292, term380292.getClass(), "useBlacklist", true);
        setField(term380292, term380292.getClass(), "retryOfId", term380470);
        setField(term380292, term380292.getClass(), "paymentType", enum730);
        setField(term380292, term380292.getClass(), "snapshotTrustlineIssuerClassicAddress", "KQIDeMauIM");
        setField(term380292, term380292.getClass(), "snapshotCurrencyName", "NgKByYqhhT");
        setField(term380292, term380292.getClass(), "nftIssuingAddress", "yLsafyiJlf");
        setField(term380292, term380292.getClass(), "nftTaxon", term380524);
        setField(term380292, term380292.getClass(), "frequency", enum731);
        setLongField(term380538, term380538.getClass(), "fastTime", 1588914209956L);
        setField(term380538, term380538.getClass(), "cdate", null);
        setField(term380292, term380292.getClass(), "repeatUntilDate", term380538);
        setField(term380292, term380292.getClass(), "email", "NawBhAzbKl");
        setBooleanField(term380292, term380292.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShkfzZambR";
        callMethod(klass, "setFromPrivateKey", argTypes, term380292, args);
    }

};


