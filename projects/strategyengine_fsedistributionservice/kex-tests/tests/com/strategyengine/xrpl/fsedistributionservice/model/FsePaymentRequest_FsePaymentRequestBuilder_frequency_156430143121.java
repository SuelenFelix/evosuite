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

public class FsePaymentRequest_FsePaymentRequestBuilder_frequency_156430143121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592085;
     Object enum1114;

    public FsePaymentRequest_FsePaymentRequestBuilder_frequency_156430143121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term592134 = new ArrayList();
        ((ArrayList) term592134).add("aDywfjbiui");
        ((ArrayList) term592134).add("sjLStQGrFs");
        ((ArrayList) term592134).add("YTNLhcKYKW");
        ((ArrayList) term592134).add("pSSwBgnrrm");
        ((ArrayList) term592134).add("CIecTelJYL");
        ((ArrayList) term592134).add("CRdlcDvmNm");
        ((ArrayList) term592134).add("KNCIEMtVHz");
        ((ArrayList) term592134).add("aHiCCXkIIc");
        ((ArrayList) term592134).add("nMtsxQIOdu");
        Long term592311 = new Long(7397884986768994824L);
        Class<? extends Object> term592586 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term592585 = ((Class) term592586).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term592585).setAccessible(true);
        Object enum1112 = ((Field) term592585).get((Object) null);
        Long term592365 = new Long(-4644072102027655025L);
        Class<? extends Object> term593014 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term593013 = ((Class) term593014).getDeclaredField((String) "MONTHLY");
        ((Field) term593013).setAccessible(true);
        Object enum1113 = ((Field) term593013).get((Object) null);
        term592085 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term592258 = newInstance(Class.forName("java.util.Date"));
        Object term592378 = newInstance(Class.forName("java.util.Date"));
        setField(term592085, term592085.getClass(), "memo", "tULmgjENgn");
        setField(term592085, term592085.getClass(), "fromClassicAddress", "zBwUyAokiE");
        setField(term592085, term592085.getClass(), "fromSigningPublicKey", "pbdmztefxU");
        setField(term592085, term592085.getClass(), "fromPrivateKey", "PuJpvbpDKR");
        setField(term592085, term592085.getClass(), "toClassicAddresses", term592134);
        setField(term592085, term592085.getClass(), "amount", "LndvtyUwdc");
        setLongField(term592258, term592258.getClass(), "fastTime", 1725391050049L);
        setField(term592258, term592258.getClass(), "cdate", null);
        setField(term592085, term592085.getClass(), "startTime", term592258);
        setField(term592085, term592085.getClass(), "destinationTag", "LnwCYOTQzr");
        setField(term592085, term592085.getClass(), "trustlineIssuerClassicAddress", "EClPOOvOQZ");
        setField(term592085, term592085.getClass(), "currencyName", "pGQdokmFhs");
        setBooleanField(term592085, term592085.getClass(), "agreeFee", true);
        setField(term592085, term592085.getClass(), "maxXrpFeePerTransaction", "VzYfsmeeBD");
        setBooleanField(term592085, term592085.getClass(), "globalIdVerified", false);
        setBooleanField(term592085, term592085.getClass(), "useBlacklist", true);
        setField(term592085, term592085.getClass(), "retryOfId", term592311);
        setField(term592085, term592085.getClass(), "paymentType", enum1112);
        setField(term592085, term592085.getClass(), "snapshotTrustlineIssuerClassicAddress", "HjqSzxKjga");
        setField(term592085, term592085.getClass(), "snapshotCurrencyName", "ZgNgomDQwE");
        setField(term592085, term592085.getClass(), "nftIssuingAddress", "hjlLFUSUSr");
        setField(term592085, term592085.getClass(), "nftTaxon", term592365);
        setField(term592085, term592085.getClass(), "frequency", enum1113);
        setLongField(term592378, term592378.getClass(), "fastTime", 1443918825420L);
        setField(term592378, term592378.getClass(), "cdate", null);
        setField(term592085, term592085.getClass(), "repeatUntilDate", term592378);
        setField(term592085, term592085.getClass(), "email", "kcBYZtVjEn");
        setBooleanField(term592085, term592085.getClass(), "autoApprove", false);
        Class<? extends Object> term593417 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term593416 = ((Class) term593417).getDeclaredField((String) "ANNUALLY");
        ((Field) term593416).setAccessible(true);
        enum1114 = ((Field) term593416).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum1114;
        callMethod(klass, "frequency", argTypes, term592085, args);
    }

};


