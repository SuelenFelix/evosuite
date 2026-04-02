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

public class FsePaymentRequest_setStartTime_199929926638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384060;
     Object term384357;

    public FsePaymentRequest_setStartTime_199929926638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term384109 = new ArrayList();
        ((ArrayList) term384109).add("AmYGzDcymG");
        ((ArrayList) term384109).add("OuPFXYLHnZ");
        ((ArrayList) term384109).add("LvqRPoVTcD");
        ((ArrayList) term384109).add("kMMtGnlzVA");
        ((ArrayList) term384109).add("BEoDKOnmGz");
        ((ArrayList) term384109).add("bWdbzxGXLQ");
        ((ArrayList) term384109).add("JMTsbSARpN");
        ((ArrayList) term384109).add("XAadPSqCed");
        Long term384274 = new Long(-7497758874949135776L);
        Class<? extends Object> term384530 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term384529 = ((Class) term384530).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term384529).setAccessible(true);
        Object enum736 = ((Field) term384529).get((Object) null);
        Long term384328 = new Long(504174293291540734L);
        Class<? extends Object> term384958 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term384957 = ((Class) term384958).getDeclaredField((String) "ANNUALLY");
        ((Field) term384957).setAccessible(true);
        Object enum737 = ((Field) term384957).get((Object) null);
        term384060 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term384221 = newInstance(Class.forName("java.util.Date"));
        Object term384342 = newInstance(Class.forName("java.util.Date"));
        setField(term384060, term384060.getClass(), "memo", "ITLIaODlGc");
        setField(term384060, term384060.getClass(), "fromClassicAddress", "kZiqgxcCTP");
        setField(term384060, term384060.getClass(), "fromSigningPublicKey", "LoJRQPNqoD");
        setField(term384060, term384060.getClass(), "fromPrivateKey", "gXdFddXyRw");
        setField(term384060, term384060.getClass(), "toClassicAddresses", term384109);
        setField(term384060, term384060.getClass(), "amount", "munBmcPVsD");
        setLongField(term384221, term384221.getClass(), "fastTime", 1551557662579L);
        setField(term384221, term384221.getClass(), "cdate", null);
        setField(term384060, term384060.getClass(), "startTime", term384221);
        setField(term384060, term384060.getClass(), "destinationTag", "rCWvaRZdUo");
        setField(term384060, term384060.getClass(), "trustlineIssuerClassicAddress", "BMnJwMRfdp");
        setField(term384060, term384060.getClass(), "currencyName", "PrHlVcXwbV");
        setBooleanField(term384060, term384060.getClass(), "agreeFee", true);
        setField(term384060, term384060.getClass(), "maxXrpFeePerTransaction", "THYqjTOZeh");
        setBooleanField(term384060, term384060.getClass(), "globalIdVerified", false);
        setBooleanField(term384060, term384060.getClass(), "useBlacklist", true);
        setField(term384060, term384060.getClass(), "retryOfId", term384274);
        setField(term384060, term384060.getClass(), "paymentType", enum736);
        setField(term384060, term384060.getClass(), "snapshotTrustlineIssuerClassicAddress", "PrSmUcNTjZ");
        setField(term384060, term384060.getClass(), "snapshotCurrencyName", "eTqMMvDhOk");
        setField(term384060, term384060.getClass(), "nftIssuingAddress", "GrzQcftIiy");
        setField(term384060, term384060.getClass(), "nftTaxon", term384328);
        setField(term384060, term384060.getClass(), "frequency", enum737);
        setLongField(term384342, term384342.getClass(), "fastTime", 1553318149160L);
        setField(term384342, term384342.getClass(), "cdate", null);
        setField(term384060, term384060.getClass(), "repeatUntilDate", term384342);
        setField(term384060, term384060.getClass(), "email", "NuebxSinWP");
        setBooleanField(term384060, term384060.getClass(), "autoApprove", false);
        term384357 = newInstance(Class.forName("java.util.Date"));
        setLongField(term384357, term384357.getClass(), "fastTime", 1838376511046L);
        setField(term384357, term384357.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term384357;
        callMethod(klass, "setStartTime", argTypes, term384060, args);
    }

};


