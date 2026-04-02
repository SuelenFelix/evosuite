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

public class FsePaymentRequest_setFromSigningPublicKey_120783472534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378991;

    public FsePaymentRequest_setFromSigningPublicKey_120783472534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term379040 = new ArrayList();
        ((ArrayList) term379040).add("GkbTLDGskC");
        ((ArrayList) term379040).add("GNwWutEmZm");
        ((ArrayList) term379040).add("XjZjmwoHED");
        ((ArrayList) term379040).add("jGyzcAPDDu");
        ((ArrayList) term379040).add("wypGnKmTVO");
        ((ArrayList) term379040).add("ZJyeOTJatG");
        ((ArrayList) term379040).add("hTdnBXpOrg");
        ((ArrayList) term379040).add("eirvJIHvNv");
        ((ArrayList) term379040).add("KlEXYJRndC");
        Long term379217 = new Long(1434994695522862422L);
        Class<? extends Object> term379482 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term379481 = ((Class) term379482).getDeclaredField((String) "FLAT");
        ((Field) term379481).setAccessible(true);
        Object enum728 = ((Field) term379481).get((Object) null);
        Long term379263 = new Long(7917622690009120321L);
        Class<? extends Object> term379886 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term379885 = ((Class) term379886).getDeclaredField((String) "DAILY");
        ((Field) term379885).setAccessible(true);
        Object enum729 = ((Field) term379885).get((Object) null);
        term378991 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term379164 = newInstance(Class.forName("java.util.Date"));
        Object term379274 = newInstance(Class.forName("java.util.Date"));
        setField(term378991, term378991.getClass(), "memo", "LgLQoNmiDg");
        setField(term378991, term378991.getClass(), "fromClassicAddress", "bbYPwbDjdW");
        setField(term378991, term378991.getClass(), "fromSigningPublicKey", "uvmFryfiWZ");
        setField(term378991, term378991.getClass(), "fromPrivateKey", "UektSjnypK");
        setField(term378991, term378991.getClass(), "toClassicAddresses", term379040);
        setField(term378991, term378991.getClass(), "amount", "hdCuWcZCRF");
        setLongField(term379164, term379164.getClass(), "fastTime", 1782487642199L);
        setField(term379164, term379164.getClass(), "cdate", null);
        setField(term378991, term378991.getClass(), "startTime", term379164);
        setField(term378991, term378991.getClass(), "destinationTag", "XtoPxpKddi");
        setField(term378991, term378991.getClass(), "trustlineIssuerClassicAddress", "ojbuocgBLe");
        setField(term378991, term378991.getClass(), "currencyName", "uywNOdgSnt");
        setBooleanField(term378991, term378991.getClass(), "agreeFee", false);
        setField(term378991, term378991.getClass(), "maxXrpFeePerTransaction", "rRMWZeqfsk");
        setBooleanField(term378991, term378991.getClass(), "globalIdVerified", true);
        setBooleanField(term378991, term378991.getClass(), "useBlacklist", true);
        setField(term378991, term378991.getClass(), "retryOfId", term379217);
        setField(term378991, term378991.getClass(), "paymentType", enum728);
        setField(term378991, term378991.getClass(), "snapshotTrustlineIssuerClassicAddress", "IdOQAszUjk");
        setField(term378991, term378991.getClass(), "snapshotCurrencyName", "XpMUuQdrUZ");
        setField(term378991, term378991.getClass(), "nftIssuingAddress", "TPYmifEWia");
        setField(term378991, term378991.getClass(), "nftTaxon", term379263);
        setField(term378991, term378991.getClass(), "frequency", enum729);
        setLongField(term379274, term379274.getClass(), "fastTime", 1372540799326L);
        setField(term379274, term379274.getClass(), "cdate", null);
        setField(term378991, term378991.getClass(), "repeatUntilDate", term379274);
        setField(term378991, term378991.getClass(), "email", "IRIegRQckL");
        setBooleanField(term378991, term378991.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oFHoOVYcEY";
        callMethod(klass, "setFromSigningPublicKey", argTypes, term378991, args);
    }

};


