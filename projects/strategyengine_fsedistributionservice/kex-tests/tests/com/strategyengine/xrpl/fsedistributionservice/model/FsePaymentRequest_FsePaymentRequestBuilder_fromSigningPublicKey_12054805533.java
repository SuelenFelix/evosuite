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

public class FsePaymentRequest_FsePaymentRequestBuilder_fromSigningPublicKey_12054805533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570240;

    public FsePaymentRequest_FsePaymentRequestBuilder_fromSigningPublicKey_12054805533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term570289 = new ArrayList();
        ((ArrayList) term570289).add("tEciBFrLbF");
        Long term570370 = new Long(-6164517614137158832L);
        Class<? extends Object> term570556 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term570555 = ((Class) term570556).getDeclaredField((String) "FLAT");
        ((Field) term570555).setAccessible(true);
        Object enum1076 = ((Field) term570555).get((Object) null);
        Long term570416 = new Long(1093252632013547881L);
        Class<? extends Object> term570960 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term570959 = ((Class) term570960).getDeclaredField((String) "WEEKLY");
        ((Field) term570959).setAccessible(true);
        Object enum1077 = ((Field) term570959).get((Object) null);
        term570240 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term570317 = newInstance(Class.forName("java.util.Date"));
        Object term570428 = newInstance(Class.forName("java.util.Date"));
        setField(term570240, term570240.getClass(), "memo", "tRRSLRxoVF");
        setField(term570240, term570240.getClass(), "fromClassicAddress", "rogVlsxmoq");
        setField(term570240, term570240.getClass(), "fromSigningPublicKey", "PcMQxtTThd");
        setField(term570240, term570240.getClass(), "fromPrivateKey", "tlNezuIPME");
        setField(term570240, term570240.getClass(), "toClassicAddresses", term570289);
        setField(term570240, term570240.getClass(), "amount", "HABvqoZbct");
        setLongField(term570317, term570317.getClass(), "fastTime", 1322116125188L);
        setField(term570317, term570317.getClass(), "cdate", null);
        setField(term570240, term570240.getClass(), "startTime", term570317);
        setField(term570240, term570240.getClass(), "destinationTag", "CzDfpcxVwI");
        setField(term570240, term570240.getClass(), "trustlineIssuerClassicAddress", "sUKfpEKBAS");
        setField(term570240, term570240.getClass(), "currencyName", "anfAMeVVsC");
        setBooleanField(term570240, term570240.getClass(), "agreeFee", false);
        setField(term570240, term570240.getClass(), "maxXrpFeePerTransaction", "GlIWuwNnwL");
        setBooleanField(term570240, term570240.getClass(), "globalIdVerified", true);
        setBooleanField(term570240, term570240.getClass(), "useBlacklist", true);
        setField(term570240, term570240.getClass(), "retryOfId", term570370);
        setField(term570240, term570240.getClass(), "paymentType", enum1076);
        setField(term570240, term570240.getClass(), "snapshotTrustlineIssuerClassicAddress", "HDsXonVTyY");
        setField(term570240, term570240.getClass(), "snapshotCurrencyName", "BusZaRriAA");
        setField(term570240, term570240.getClass(), "nftIssuingAddress", "imlbrmsABR");
        setField(term570240, term570240.getClass(), "nftTaxon", term570416);
        setField(term570240, term570240.getClass(), "frequency", enum1077);
        setLongField(term570428, term570428.getClass(), "fastTime", 1538973956962L);
        setField(term570428, term570428.getClass(), "cdate", null);
        setField(term570240, term570240.getClass(), "repeatUntilDate", term570428);
        setField(term570240, term570240.getClass(), "email", "VozwaeTzwB");
        setBooleanField(term570240, term570240.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NzhnvXaHzq";
        callMethod(klass, "fromSigningPublicKey", argTypes, term570240, args);
    }

};


