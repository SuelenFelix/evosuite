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

public class FsePaymentRequest_FsePaymentRequestBuilder_build_97555473325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597199;

    public FsePaymentRequest_FsePaymentRequestBuilder_build_97555473325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term597248 = new ArrayList();
        ((ArrayList) term597248).add("wyDaOmiffy");
        ((ArrayList) term597248).add("mzQSpyiDzE");
        Long term597341 = new Long(-8600923187723020360L);
        Class<? extends Object> term597525 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term597524 = ((Class) term597525).getDeclaredField((String) "FLAT");
        ((Field) term597524).setAccessible(true);
        Object enum1121 = ((Field) term597524).get((Object) null);
        Long term597387 = new Long(5010786103545221543L);
        Class<? extends Object> term597929 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term597928 = ((Class) term597929).getDeclaredField((String) "WEEKLY");
        ((Field) term597928).setAccessible(true);
        Object enum1122 = ((Field) term597928).get((Object) null);
        term597199 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term597288 = newInstance(Class.forName("java.util.Date"));
        Object term597399 = newInstance(Class.forName("java.util.Date"));
        setField(term597199, term597199.getClass(), "memo", "RjzDomTTbS");
        setField(term597199, term597199.getClass(), "fromClassicAddress", "pGIWKlGIzp");
        setField(term597199, term597199.getClass(), "fromSigningPublicKey", "PUZgBUGBmS");
        setField(term597199, term597199.getClass(), "fromPrivateKey", "xLEiWtPonE");
        setField(term597199, term597199.getClass(), "toClassicAddresses", term597248);
        setField(term597199, term597199.getClass(), "amount", "CTXGUQuXhq");
        setLongField(term597288, term597288.getClass(), "fastTime", 1447304135692L);
        setField(term597288, term597288.getClass(), "cdate", null);
        setField(term597199, term597199.getClass(), "startTime", term597288);
        setField(term597199, term597199.getClass(), "destinationTag", "MIyWzhVoWw");
        setField(term597199, term597199.getClass(), "trustlineIssuerClassicAddress", "rWAlzFyhnR");
        setField(term597199, term597199.getClass(), "currencyName", "LphHrPlrqn");
        setBooleanField(term597199, term597199.getClass(), "agreeFee", false);
        setField(term597199, term597199.getClass(), "maxXrpFeePerTransaction", "qQfbGGlBUn");
        setBooleanField(term597199, term597199.getClass(), "globalIdVerified", false);
        setBooleanField(term597199, term597199.getClass(), "useBlacklist", false);
        setField(term597199, term597199.getClass(), "retryOfId", term597341);
        setField(term597199, term597199.getClass(), "paymentType", enum1121);
        setField(term597199, term597199.getClass(), "snapshotTrustlineIssuerClassicAddress", "nulHgoDPRO");
        setField(term597199, term597199.getClass(), "snapshotCurrencyName", "jiQYJRpWWs");
        setField(term597199, term597199.getClass(), "nftIssuingAddress", "UaGWyukANs");
        setField(term597199, term597199.getClass(), "nftTaxon", term597387);
        setField(term597199, term597199.getClass(), "frequency", enum1122);
        setLongField(term597399, term597399.getClass(), "fastTime", 1353826116337L);
        setField(term597399, term597399.getClass(), "cdate", null);
        setField(term597199, term597199.getClass(), "repeatUntilDate", term597399);
        setField(term597199, term597199.getClass(), "email", "XHgoSKsgYP");
        setBooleanField(term597199, term597199.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term597199, args);
    }

};


