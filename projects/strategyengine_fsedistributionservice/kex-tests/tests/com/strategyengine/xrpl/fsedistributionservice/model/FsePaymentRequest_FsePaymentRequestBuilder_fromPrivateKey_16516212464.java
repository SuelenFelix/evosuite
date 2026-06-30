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

public class FsePaymentRequest_FsePaymentRequestBuilder_fromPrivateKey_16516212464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571369;

    public FsePaymentRequest_FsePaymentRequestBuilder_fromPrivateKey_16516212464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term571418 = new ArrayList();
        ((ArrayList) term571418).add("cjASmDMJyf");
        ((ArrayList) term571418).add("ALbKTRphvX");
        ((ArrayList) term571418).add("vWbSXhWaUM");
        Long term571523 = new Long(8773809312823881228L);
        Class<? extends Object> term571739 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term571738 = ((Class) term571739).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term571738).setAccessible(true);
        Object enum1078 = ((Field) term571738).get((Object) null);
        Long term571577 = new Long(316148538598902256L);
        Class<? extends Object> term572167 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term572166 = ((Class) term572167).getDeclaredField((String) "ANNUALLY");
        ((Field) term572166).setAccessible(true);
        Object enum1079 = ((Field) term572166).get((Object) null);
        term571369 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term571470 = newInstance(Class.forName("java.util.Date"));
        Object term571591 = newInstance(Class.forName("java.util.Date"));
        setField(term571369, term571369.getClass(), "memo", "JkfLtSQjWq");
        setField(term571369, term571369.getClass(), "fromClassicAddress", "JpZUfTkpjW");
        setField(term571369, term571369.getClass(), "fromSigningPublicKey", "SbMMeUExqe");
        setField(term571369, term571369.getClass(), "fromPrivateKey", "CKFhbAWYOu");
        setField(term571369, term571369.getClass(), "toClassicAddresses", term571418);
        setField(term571369, term571369.getClass(), "amount", "xGZegFGFwp");
        setLongField(term571470, term571470.getClass(), "fastTime", 1463300936491L);
        setField(term571470, term571470.getClass(), "cdate", null);
        setField(term571369, term571369.getClass(), "startTime", term571470);
        setField(term571369, term571369.getClass(), "destinationTag", "mcyLkkYdqH");
        setField(term571369, term571369.getClass(), "trustlineIssuerClassicAddress", "NgPHLrUVTl");
        setField(term571369, term571369.getClass(), "currencyName", "cGSjeMMyEG");
        setBooleanField(term571369, term571369.getClass(), "agreeFee", false);
        setField(term571369, term571369.getClass(), "maxXrpFeePerTransaction", "zDxtwCfvRN");
        setBooleanField(term571369, term571369.getClass(), "globalIdVerified", true);
        setBooleanField(term571369, term571369.getClass(), "useBlacklist", false);
        setField(term571369, term571369.getClass(), "retryOfId", term571523);
        setField(term571369, term571369.getClass(), "paymentType", enum1078);
        setField(term571369, term571369.getClass(), "snapshotTrustlineIssuerClassicAddress", "cBntwyxQws");
        setField(term571369, term571369.getClass(), "snapshotCurrencyName", "ctJmoieYHE");
        setField(term571369, term571369.getClass(), "nftIssuingAddress", "MGvYGOoYyh");
        setField(term571369, term571369.getClass(), "nftTaxon", term571577);
        setField(term571369, term571369.getClass(), "frequency", enum1079);
        setLongField(term571591, term571591.getClass(), "fastTime", 1285650863294L);
        setField(term571591, term571591.getClass(), "cdate", null);
        setField(term571369, term571369.getClass(), "repeatUntilDate", term571591);
        setField(term571369, term571369.getClass(), "email", "akolIywpGZ");
        setBooleanField(term571369, term571369.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GnPGHkkqXj";
        callMethod(klass, "fromPrivateKey", argTypes, term571369, args);
    }

};


