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
import java.lang.Boolean;

public class FsePaymentRequest_FsePaymentRequestBuilder_agreeFee_17406361111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579901;
     Object term580115;

    public FsePaymentRequest_FsePaymentRequestBuilder_agreeFee_17406361111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term579950 = new ArrayList();
        ((ArrayList) term579950).add("YLhafUDZSf");
        ((ArrayList) term579950).add("NkqVectDCd");
        Long term580043 = new Long(-3955029913626345204L);
        Class<? extends Object> term580228 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term580227 = ((Class) term580228).getDeclaredField((String) "FLAT");
        ((Field) term580227).setAccessible(true);
        Object enum1092 = ((Field) term580227).get((Object) null);
        Long term580089 = new Long(-3095078124589583434L);
        Class<? extends Object> term580632 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term580631 = ((Class) term580632).getDeclaredField((String) "DAILY");
        ((Field) term580631).setAccessible(true);
        Object enum1093 = ((Field) term580631).get((Object) null);
        term579901 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term579990 = newInstance(Class.forName("java.util.Date"));
        Object term580100 = newInstance(Class.forName("java.util.Date"));
        setField(term579901, term579901.getClass(), "memo", "PwmioJcxYU");
        setField(term579901, term579901.getClass(), "fromClassicAddress", "wkgBbdahBJ");
        setField(term579901, term579901.getClass(), "fromSigningPublicKey", "TIOKoSkgvB");
        setField(term579901, term579901.getClass(), "fromPrivateKey", "klYAJTFSIk");
        setField(term579901, term579901.getClass(), "toClassicAddresses", term579950);
        setField(term579901, term579901.getClass(), "amount", "PAiEsxsOUA");
        setLongField(term579990, term579990.getClass(), "fastTime", 1766576603154L);
        setField(term579990, term579990.getClass(), "cdate", null);
        setField(term579901, term579901.getClass(), "startTime", term579990);
        setField(term579901, term579901.getClass(), "destinationTag", "YKgbVyVpIQ");
        setField(term579901, term579901.getClass(), "trustlineIssuerClassicAddress", "nrxEBlDDtw");
        setField(term579901, term579901.getClass(), "currencyName", "ZKcDOgjedL");
        setBooleanField(term579901, term579901.getClass(), "agreeFee", false);
        setField(term579901, term579901.getClass(), "maxXrpFeePerTransaction", "fbIyjOnFlU");
        setBooleanField(term579901, term579901.getClass(), "globalIdVerified", false);
        setBooleanField(term579901, term579901.getClass(), "useBlacklist", false);
        setField(term579901, term579901.getClass(), "retryOfId", term580043);
        setField(term579901, term579901.getClass(), "paymentType", enum1092);
        setField(term579901, term579901.getClass(), "snapshotTrustlineIssuerClassicAddress", "mHJnsoOUVm");
        setField(term579901, term579901.getClass(), "snapshotCurrencyName", "SZTwFHuOlF");
        setField(term579901, term579901.getClass(), "nftIssuingAddress", "HuNcrtnuIr");
        setField(term579901, term579901.getClass(), "nftTaxon", term580089);
        setField(term579901, term579901.getClass(), "frequency", enum1093);
        setLongField(term580100, term580100.getClass(), "fastTime", 1343032180681L);
        setField(term580100, term580100.getClass(), "cdate", null);
        setField(term579901, term579901.getClass(), "repeatUntilDate", term580100);
        setField(term579901, term579901.getClass(), "email", "UOgVwpVTwb");
        setBooleanField(term579901, term579901.getClass(), "autoApprove", false);
        term580115 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term580115;
        callMethod(klass, "agreeFee", argTypes, term579901, args);
    }

};


