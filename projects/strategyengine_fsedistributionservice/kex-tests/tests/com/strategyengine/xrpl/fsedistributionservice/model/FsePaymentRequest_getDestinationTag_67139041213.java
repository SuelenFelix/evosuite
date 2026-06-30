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

public class FsePaymentRequest_getDestinationTag_67139041213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354525;

    public FsePaymentRequest_getDestinationTag_67139041213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term354574 = new ArrayList();
        ((ArrayList) term354574).add("FACxkPWyov");
        ((ArrayList) term354574).add("aOlWTliPWV");
        ((ArrayList) term354574).add("RJhoTTLFxq");
        ((ArrayList) term354574).add("acEefJcPBx");
        ((ArrayList) term354574).add("CyuPzrjeFW");
        ((ArrayList) term354574).add("qAoHjsyooW");
        ((ArrayList) term354574).add("FqefqveUEm");
        ((ArrayList) term354574).add("FbqShgWywz");
        Long term354739 = new Long(4187385369384657492L);
        Class<? extends Object> term354982 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term354981 = ((Class) term354982).getDeclaredField((String) "FLAT");
        ((Field) term354981).setAccessible(true);
        Object enum688 = ((Field) term354981).get((Object) null);
        Long term354785 = new Long(-8947510185810654315L);
        Class<? extends Object> term355386 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term355385 = ((Class) term355386).getDeclaredField((String) "DAILY");
        ((Field) term355385).setAccessible(true);
        Object enum689 = ((Field) term355385).get((Object) null);
        term354525 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term354686 = newInstance(Class.forName("java.util.Date"));
        Object term354796 = newInstance(Class.forName("java.util.Date"));
        setField(term354525, term354525.getClass(), "memo", "eXRTcHaQjF");
        setField(term354525, term354525.getClass(), "fromClassicAddress", "PmyObamDVD");
        setField(term354525, term354525.getClass(), "fromSigningPublicKey", "pppfExzWoO");
        setField(term354525, term354525.getClass(), "fromPrivateKey", "HZeIrhANSL");
        setField(term354525, term354525.getClass(), "toClassicAddresses", term354574);
        setField(term354525, term354525.getClass(), "amount", "PGCkOOXhFQ");
        setLongField(term354686, term354686.getClass(), "fastTime", 1383282251920L);
        setField(term354686, term354686.getClass(), "cdate", null);
        setField(term354525, term354525.getClass(), "startTime", term354686);
        setField(term354525, term354525.getClass(), "destinationTag", "CoBoCTiUwR");
        setField(term354525, term354525.getClass(), "trustlineIssuerClassicAddress", "pOuvSObkno");
        setField(term354525, term354525.getClass(), "currencyName", "XEisjHLmCq");
        setBooleanField(term354525, term354525.getClass(), "agreeFee", false);
        setField(term354525, term354525.getClass(), "maxXrpFeePerTransaction", "mFWTMYClgX");
        setBooleanField(term354525, term354525.getClass(), "globalIdVerified", true);
        setBooleanField(term354525, term354525.getClass(), "useBlacklist", false);
        setField(term354525, term354525.getClass(), "retryOfId", term354739);
        setField(term354525, term354525.getClass(), "paymentType", enum688);
        setField(term354525, term354525.getClass(), "snapshotTrustlineIssuerClassicAddress", "soLsoaYFpk");
        setField(term354525, term354525.getClass(), "snapshotCurrencyName", "mnlIQSXPGY");
        setField(term354525, term354525.getClass(), "nftIssuingAddress", "sEEAPMAXyN");
        setField(term354525, term354525.getClass(), "nftTaxon", term354785);
        setField(term354525, term354525.getClass(), "frequency", enum689);
        setLongField(term354796, term354796.getClass(), "fastTime", 1400433000881L);
        setField(term354796, term354796.getClass(), "cdate", null);
        setField(term354525, term354525.getClass(), "repeatUntilDate", term354796);
        setField(term354525, term354525.getClass(), "email", "IlnVxfvxud");
        setBooleanField(term354525, term354525.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDestinationTag", argTypes, term354525, args);
    }

};


