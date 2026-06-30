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

public class FsePaymentRequest_getFromPrivateKey_9040453589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349725;

    public FsePaymentRequest_getFromPrivateKey_9040453589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term349774 = new ArrayList();
        ((ArrayList) term349774).add("UxWtTYOrPR");
        ((ArrayList) term349774).add("UPSszOfKCC");
        ((ArrayList) term349774).add("RKArRZVCge");
        ((ArrayList) term349774).add("UnZFUlWwQv");
        Long term349891 = new Long(-5796564556566273156L);
        Class<? extends Object> term350104 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term350103 = ((Class) term350104).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term350103).setAccessible(true);
        Object enum680 = ((Field) term350103).get((Object) null);
        Long term349945 = new Long(4376251358600000238L);
        Class<? extends Object> term350532 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term350531 = ((Class) term350532).getDeclaredField((String) "MONTHLY");
        ((Field) term350531).setAccessible(true);
        Object enum681 = ((Field) term350531).get((Object) null);
        term349725 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term349838 = newInstance(Class.forName("java.util.Date"));
        Object term349958 = newInstance(Class.forName("java.util.Date"));
        setField(term349725, term349725.getClass(), "memo", "bFoZFUQjsC");
        setField(term349725, term349725.getClass(), "fromClassicAddress", "ldnLrmnSsp");
        setField(term349725, term349725.getClass(), "fromSigningPublicKey", "FRAcngFZcM");
        setField(term349725, term349725.getClass(), "fromPrivateKey", "WpSxLBPWKZ");
        setField(term349725, term349725.getClass(), "toClassicAddresses", term349774);
        setField(term349725, term349725.getClass(), "amount", "xwqrsGfuyt");
        setLongField(term349838, term349838.getClass(), "fastTime", 1567913763811L);
        setField(term349838, term349838.getClass(), "cdate", null);
        setField(term349725, term349725.getClass(), "startTime", term349838);
        setField(term349725, term349725.getClass(), "destinationTag", "CLwVHtQjBH");
        setField(term349725, term349725.getClass(), "trustlineIssuerClassicAddress", "rTAzrULvmm");
        setField(term349725, term349725.getClass(), "currencyName", "SgKKHyCXge");
        setBooleanField(term349725, term349725.getClass(), "agreeFee", true);
        setField(term349725, term349725.getClass(), "maxXrpFeePerTransaction", "QQiXRYFyfp");
        setBooleanField(term349725, term349725.getClass(), "globalIdVerified", false);
        setBooleanField(term349725, term349725.getClass(), "useBlacklist", false);
        setField(term349725, term349725.getClass(), "retryOfId", term349891);
        setField(term349725, term349725.getClass(), "paymentType", enum680);
        setField(term349725, term349725.getClass(), "snapshotTrustlineIssuerClassicAddress", "AZKGDfKUUm");
        setField(term349725, term349725.getClass(), "snapshotCurrencyName", "ZDEPwmbfhY");
        setField(term349725, term349725.getClass(), "nftIssuingAddress", "WYVrNaDrUc");
        setField(term349725, term349725.getClass(), "nftTaxon", term349945);
        setField(term349725, term349725.getClass(), "frequency", enum681);
        setLongField(term349958, term349958.getClass(), "fastTime", 1743926303358L);
        setField(term349958, term349958.getClass(), "cdate", null);
        setField(term349725, term349725.getClass(), "repeatUntilDate", term349958);
        setField(term349725, term349725.getClass(), "email", "mVomHqNgrb");
        setBooleanField(term349725, term349725.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromPrivateKey", argTypes, term349725, args);
    }

};


