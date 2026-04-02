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

public class FsePaymentRequest_setNftTaxon_50176173151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399787;
     Object term400010;

    public FsePaymentRequest_setNftTaxon_50176173151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term399836 = new ArrayList();
        ((ArrayList) term399836).add("tzynzphtSt");
        ((ArrayList) term399836).add("JzThQHtYiI");
        Long term399929 = new Long(4496648256608157890L);
        Class<? extends Object> term400123 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term400122 = ((Class) term400123).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term400122).setAccessible(true);
        Object enum762 = ((Field) term400122).get((Object) null);
        Long term399983 = new Long(3615978191092655321L);
        Class<? extends Object> term400551 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term400550 = ((Class) term400551).getDeclaredField((String) "WEEKLY");
        ((Field) term400550).setAccessible(true);
        Object enum763 = ((Field) term400550).get((Object) null);
        term399787 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term399876 = newInstance(Class.forName("java.util.Date"));
        Object term399995 = newInstance(Class.forName("java.util.Date"));
        setField(term399787, term399787.getClass(), "memo", "aUlSeZzCEe");
        setField(term399787, term399787.getClass(), "fromClassicAddress", "UIrGulbKPp");
        setField(term399787, term399787.getClass(), "fromSigningPublicKey", "MeOYSudrpA");
        setField(term399787, term399787.getClass(), "fromPrivateKey", "jRuwCuDOvG");
        setField(term399787, term399787.getClass(), "toClassicAddresses", term399836);
        setField(term399787, term399787.getClass(), "amount", "iyvEVMiIDj");
        setLongField(term399876, term399876.getClass(), "fastTime", 1455506135746L);
        setField(term399876, term399876.getClass(), "cdate", null);
        setField(term399787, term399787.getClass(), "startTime", term399876);
        setField(term399787, term399787.getClass(), "destinationTag", "wsXKrnKnnU");
        setField(term399787, term399787.getClass(), "trustlineIssuerClassicAddress", "HzchQiGlwd");
        setField(term399787, term399787.getClass(), "currencyName", "BtCILwmAJL");
        setBooleanField(term399787, term399787.getClass(), "agreeFee", true);
        setField(term399787, term399787.getClass(), "maxXrpFeePerTransaction", "mJzcKehaKq");
        setBooleanField(term399787, term399787.getClass(), "globalIdVerified", true);
        setBooleanField(term399787, term399787.getClass(), "useBlacklist", false);
        setField(term399787, term399787.getClass(), "retryOfId", term399929);
        setField(term399787, term399787.getClass(), "paymentType", enum762);
        setField(term399787, term399787.getClass(), "snapshotTrustlineIssuerClassicAddress", "rafTbKaGSM");
        setField(term399787, term399787.getClass(), "snapshotCurrencyName", "NRdfPdMFOx");
        setField(term399787, term399787.getClass(), "nftIssuingAddress", "uwLMiyXjJc");
        setField(term399787, term399787.getClass(), "nftTaxon", term399983);
        setField(term399787, term399787.getClass(), "frequency", enum763);
        setLongField(term399995, term399995.getClass(), "fastTime", 1309189834882L);
        setField(term399995, term399995.getClass(), "cdate", null);
        setField(term399787, term399787.getClass(), "repeatUntilDate", term399995);
        setField(term399787, term399787.getClass(), "email", "iKFLWRLnlF");
        setBooleanField(term399787, term399787.getClass(), "autoApprove", true);
        term400010 = new Long(-8950106037310251203L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term400010;
        callMethod(klass, "setNftTaxon", argTypes, term399787, args);
    }

};


