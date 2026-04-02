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

public class FsePaymentRequest_setMemo_195104911432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376539;

    public FsePaymentRequest_setMemo_195104911432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term376588 = new ArrayList();
        Long term376657 = new Long(-4266854609277222301L);
        Class<? extends Object> term376843 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term376842 = ((Class) term376843).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term376842).setAccessible(true);
        Object enum724 = ((Field) term376842).get((Object) null);
        Long term376711 = new Long(-3517544832850746345L);
        Class<? extends Object> term377271 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term377270 = ((Class) term377271).getDeclaredField((String) "ANNUALLY");
        ((Field) term377270).setAccessible(true);
        Object enum725 = ((Field) term377270).get((Object) null);
        term376539 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term376604 = newInstance(Class.forName("java.util.Date"));
        Object term376725 = newInstance(Class.forName("java.util.Date"));
        setField(term376539, term376539.getClass(), "memo", "pwXMPDqzoA");
        setField(term376539, term376539.getClass(), "fromClassicAddress", "HQLQWUnXEf");
        setField(term376539, term376539.getClass(), "fromSigningPublicKey", "YyEhHzEtEI");
        setField(term376539, term376539.getClass(), "fromPrivateKey", "HGPHBeXqrv");
        setField(term376539, term376539.getClass(), "toClassicAddresses", term376588);
        setField(term376539, term376539.getClass(), "amount", "IZRGLXWScu");
        setLongField(term376604, term376604.getClass(), "fastTime", 1340665162291L);
        setField(term376604, term376604.getClass(), "cdate", null);
        setField(term376539, term376539.getClass(), "startTime", term376604);
        setField(term376539, term376539.getClass(), "destinationTag", "IBINtqJpGT");
        setField(term376539, term376539.getClass(), "trustlineIssuerClassicAddress", "LVOzoKuJQC");
        setField(term376539, term376539.getClass(), "currencyName", "lPMBTtVKIO");
        setBooleanField(term376539, term376539.getClass(), "agreeFee", true);
        setField(term376539, term376539.getClass(), "maxXrpFeePerTransaction", "KYsGHYFHYQ");
        setBooleanField(term376539, term376539.getClass(), "globalIdVerified", true);
        setBooleanField(term376539, term376539.getClass(), "useBlacklist", false);
        setField(term376539, term376539.getClass(), "retryOfId", term376657);
        setField(term376539, term376539.getClass(), "paymentType", enum724);
        setField(term376539, term376539.getClass(), "snapshotTrustlineIssuerClassicAddress", "dFFyFkwrnE");
        setField(term376539, term376539.getClass(), "snapshotCurrencyName", "ikItDbRHqP");
        setField(term376539, term376539.getClass(), "nftIssuingAddress", "tZkRhthzVL");
        setField(term376539, term376539.getClass(), "nftTaxon", term376711);
        setField(term376539, term376539.getClass(), "frequency", enum725);
        setLongField(term376725, term376725.getClass(), "fastTime", 1683480855730L);
        setField(term376725, term376725.getClass(), "cdate", null);
        setField(term376539, term376539.getClass(), "repeatUntilDate", term376725);
        setField(term376539, term376539.getClass(), "email", "gbvDNdYmGm");
        setBooleanField(term376539, term376539.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uNZFhgKAbW";
        callMethod(klass, "setMemo", argTypes, term376539, args);
    }

};


