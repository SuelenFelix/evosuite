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

public class FsePaymentRequest_getFromSigningPublicKey_3093472678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348428;

    public FsePaymentRequest_getFromSigningPublicKey_3093472678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term348477 = new ArrayList();
        ((ArrayList) term348477).add("XQuvfxSccv");
        ((ArrayList) term348477).add("RfquVEAVPR");
        ((ArrayList) term348477).add("fIhffQCyHs");
        ((ArrayList) term348477).add("pixJfRMTyW");
        ((ArrayList) term348477).add("XDSlztmbAH");
        ((ArrayList) term348477).add("lVJlzPWBAK");
        ((ArrayList) term348477).add("bejLIJbwQs");
        ((ArrayList) term348477).add("rSnKEBMtyz");
        Long term348642 = new Long(2001497540145118L);
        Class<? extends Object> term348895 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term348894 = ((Class) term348895).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term348894).setAccessible(true);
        Object enum678 = ((Field) term348894).get((Object) null);
        Long term348696 = new Long(-9048797705753068816L);
        Class<? extends Object> term349323 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term349322 = ((Class) term349323).getDeclaredField((String) "MONTHLY");
        ((Field) term349322).setAccessible(true);
        Object enum679 = ((Field) term349322).get((Object) null);
        term348428 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term348589 = newInstance(Class.forName("java.util.Date"));
        Object term348709 = newInstance(Class.forName("java.util.Date"));
        setField(term348428, term348428.getClass(), "memo", "dXmGaJLPKJ");
        setField(term348428, term348428.getClass(), "fromClassicAddress", "MgGetJAEjK");
        setField(term348428, term348428.getClass(), "fromSigningPublicKey", "GrvvLwSjbJ");
        setField(term348428, term348428.getClass(), "fromPrivateKey", "DNIdzoOzMV");
        setField(term348428, term348428.getClass(), "toClassicAddresses", term348477);
        setField(term348428, term348428.getClass(), "amount", "ryQHIDoyML");
        setLongField(term348589, term348589.getClass(), "fastTime", 1572172579362L);
        setField(term348589, term348589.getClass(), "cdate", null);
        setField(term348428, term348428.getClass(), "startTime", term348589);
        setField(term348428, term348428.getClass(), "destinationTag", "vmiwpXnDWD");
        setField(term348428, term348428.getClass(), "trustlineIssuerClassicAddress", "boaaRNDJpY");
        setField(term348428, term348428.getClass(), "currencyName", "EAAhEIkHFA");
        setBooleanField(term348428, term348428.getClass(), "agreeFee", true);
        setField(term348428, term348428.getClass(), "maxXrpFeePerTransaction", "nYZgnTFrAJ");
        setBooleanField(term348428, term348428.getClass(), "globalIdVerified", true);
        setBooleanField(term348428, term348428.getClass(), "useBlacklist", false);
        setField(term348428, term348428.getClass(), "retryOfId", term348642);
        setField(term348428, term348428.getClass(), "paymentType", enum678);
        setField(term348428, term348428.getClass(), "snapshotTrustlineIssuerClassicAddress", "xOlkaGVEJP");
        setField(term348428, term348428.getClass(), "snapshotCurrencyName", "KYBPliuemX");
        setField(term348428, term348428.getClass(), "nftIssuingAddress", "uANahVyxgu");
        setField(term348428, term348428.getClass(), "nftTaxon", term348696);
        setField(term348428, term348428.getClass(), "frequency", enum679);
        setLongField(term348709, term348709.getClass(), "fastTime", 1530832843986L);
        setField(term348709, term348709.getClass(), "cdate", null);
        setField(term348428, term348428.getClass(), "repeatUntilDate", term348709);
        setField(term348428, term348428.getClass(), "email", "RtylTeQjzK");
        setBooleanField(term348428, term348428.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromSigningPublicKey", argTypes, term348428, args);
    }

};


