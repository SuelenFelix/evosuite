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

public class FsePaymentRequest_getEmail_98823975228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373010;

    public FsePaymentRequest_getEmail_98823975228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term373059 = new ArrayList();
        ((ArrayList) term373059).add("JETgVlJyGS");
        ((ArrayList) term373059).add("kAUpfVcBjb");
        ((ArrayList) term373059).add("NwUGjxHFcU");
        ((ArrayList) term373059).add("ugWxxSVYlr");
        ((ArrayList) term373059).add("yPAymLCsGS");
        ((ArrayList) term373059).add("rsfnVYdDMq");
        ((ArrayList) term373059).add("taIJBiYTRw");
        ((ArrayList) term373059).add("aPcjboMLdY");
        ((ArrayList) term373059).add("PJiTDBdAZc");
        Long term373236 = new Long(8819168165968601827L);
        Class<? extends Object> term373489 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term373488 = ((Class) term373489).getDeclaredField((String) "FLAT");
        ((Field) term373488).setAccessible(true);
        Object enum718 = ((Field) term373488).get((Object) null);
        Long term373282 = new Long(-5212780037221633520L);
        Class<? extends Object> term373893 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term373892 = ((Class) term373893).getDeclaredField((String) "DAILY");
        ((Field) term373892).setAccessible(true);
        Object enum719 = ((Field) term373892).get((Object) null);
        term373010 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term373183 = newInstance(Class.forName("java.util.Date"));
        Object term373293 = newInstance(Class.forName("java.util.Date"));
        setField(term373010, term373010.getClass(), "memo", "wDYLeXsgWz");
        setField(term373010, term373010.getClass(), "fromClassicAddress", "oCtzSjVaYw");
        setField(term373010, term373010.getClass(), "fromSigningPublicKey", "kVDgCXjfOs");
        setField(term373010, term373010.getClass(), "fromPrivateKey", "kjdirmlqfW");
        setField(term373010, term373010.getClass(), "toClassicAddresses", term373059);
        setField(term373010, term373010.getClass(), "amount", "FatVilGINh");
        setLongField(term373183, term373183.getClass(), "fastTime", 1499144843041L);
        setField(term373183, term373183.getClass(), "cdate", null);
        setField(term373010, term373010.getClass(), "startTime", term373183);
        setField(term373010, term373010.getClass(), "destinationTag", "alOcZfpjkh");
        setField(term373010, term373010.getClass(), "trustlineIssuerClassicAddress", "yJYfKodqsu");
        setField(term373010, term373010.getClass(), "currencyName", "lRUldvzxkD");
        setBooleanField(term373010, term373010.getClass(), "agreeFee", false);
        setField(term373010, term373010.getClass(), "maxXrpFeePerTransaction", "YuWfrVdqNy");
        setBooleanField(term373010, term373010.getClass(), "globalIdVerified", false);
        setBooleanField(term373010, term373010.getClass(), "useBlacklist", true);
        setField(term373010, term373010.getClass(), "retryOfId", term373236);
        setField(term373010, term373010.getClass(), "paymentType", enum718);
        setField(term373010, term373010.getClass(), "snapshotTrustlineIssuerClassicAddress", "oxIEBLRuFO");
        setField(term373010, term373010.getClass(), "snapshotCurrencyName", "gXNuDLMuYT");
        setField(term373010, term373010.getClass(), "nftIssuingAddress", "suxDfOZyfB");
        setField(term373010, term373010.getClass(), "nftTaxon", term373282);
        setField(term373010, term373010.getClass(), "frequency", enum719);
        setLongField(term373293, term373293.getClass(), "fastTime", 1517221458723L);
        setField(term373293, term373293.getClass(), "cdate", null);
        setField(term373010, term373010.getClass(), "repeatUntilDate", term373293);
        setField(term373010, term373010.getClass(), "email", "pzOTYsZONn");
        setBooleanField(term373010, term373010.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term373010, args);
    }

};


