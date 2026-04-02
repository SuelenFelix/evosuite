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

public class FsePaymentRequest_getNftIssuingAddress_108465997824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368102;

    public FsePaymentRequest_getNftIssuingAddress_108465997824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term368151 = new ArrayList();
        ((ArrayList) term368151).add("EZAdJVjXks");
        ((ArrayList) term368151).add("KkgsnVFOTA");
        ((ArrayList) term368151).add("SrYCuNBdSA");
        ((ArrayList) term368151).add("kqsqqnPWbj");
        Long term368268 = new Long(-1337024735423070709L);
        Class<? extends Object> term368472 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term368471 = ((Class) term368472).getDeclaredField((String) "FLAT");
        ((Field) term368471).setAccessible(true);
        Object enum710 = ((Field) term368471).get((Object) null);
        Long term368314 = new Long(5406702435763021326L);
        Class<? extends Object> term368876 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term368875 = ((Class) term368876).getDeclaredField((String) "WEEKLY");
        ((Field) term368875).setAccessible(true);
        Object enum711 = ((Field) term368875).get((Object) null);
        term368102 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term368215 = newInstance(Class.forName("java.util.Date"));
        Object term368326 = newInstance(Class.forName("java.util.Date"));
        setField(term368102, term368102.getClass(), "memo", "JBMXhNQkrm");
        setField(term368102, term368102.getClass(), "fromClassicAddress", "hXpOAUqHsH");
        setField(term368102, term368102.getClass(), "fromSigningPublicKey", "ERSAPkBZAi");
        setField(term368102, term368102.getClass(), "fromPrivateKey", "nvdNdGuqeJ");
        setField(term368102, term368102.getClass(), "toClassicAddresses", term368151);
        setField(term368102, term368102.getClass(), "amount", "KAcGeaXccL");
        setLongField(term368215, term368215.getClass(), "fastTime", 1569059009448L);
        setField(term368215, term368215.getClass(), "cdate", null);
        setField(term368102, term368102.getClass(), "startTime", term368215);
        setField(term368102, term368102.getClass(), "destinationTag", "ijslNghuqA");
        setField(term368102, term368102.getClass(), "trustlineIssuerClassicAddress", "aHfYHkXvpt");
        setField(term368102, term368102.getClass(), "currencyName", "tovbqDKkFd");
        setBooleanField(term368102, term368102.getClass(), "agreeFee", true);
        setField(term368102, term368102.getClass(), "maxXrpFeePerTransaction", "MrywNflOyn");
        setBooleanField(term368102, term368102.getClass(), "globalIdVerified", true);
        setBooleanField(term368102, term368102.getClass(), "useBlacklist", true);
        setField(term368102, term368102.getClass(), "retryOfId", term368268);
        setField(term368102, term368102.getClass(), "paymentType", enum710);
        setField(term368102, term368102.getClass(), "snapshotTrustlineIssuerClassicAddress", "aXHYGWlgTv");
        setField(term368102, term368102.getClass(), "snapshotCurrencyName", "BqUjQAIFoc");
        setField(term368102, term368102.getClass(), "nftIssuingAddress", "edwgLgtJYD");
        setField(term368102, term368102.getClass(), "nftTaxon", term368314);
        setField(term368102, term368102.getClass(), "frequency", enum711);
        setLongField(term368326, term368326.getClass(), "fastTime", 1728362873153L);
        setField(term368326, term368326.getClass(), "cdate", null);
        setField(term368102, term368102.getClass(), "repeatUntilDate", term368326);
        setField(term368102, term368102.getClass(), "email", "EpbpcphIAy");
        setBooleanField(term368102, term368102.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftIssuingAddress", argTypes, term368102, args);
    }

};


