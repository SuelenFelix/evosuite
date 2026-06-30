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

public class FsePaymentRequest_FsePaymentRequestBuilder_retryOfId_64538890715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584701;
     Object term584938;

    public FsePaymentRequest_FsePaymentRequestBuilder_retryOfId_64538890715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term584750 = new ArrayList();
        ((ArrayList) term584750).add("eVLVFZDIBz");
        ((ArrayList) term584750).add("XMRXETuILP");
        ((ArrayList) term584750).add("DMmgjHjqVC");
        Long term584855 = new Long(79870604313788787L);
        Class<? extends Object> term585061 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term585060 = ((Class) term585061).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term585060).setAccessible(true);
        Object enum1100 = ((Field) term585060).get((Object) null);
        Long term584909 = new Long(-5116722010996804482L);
        Class<? extends Object> term585489 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term585488 = ((Class) term585489).getDeclaredField((String) "ANNUALLY");
        ((Field) term585488).setAccessible(true);
        Object enum1101 = ((Field) term585488).get((Object) null);
        term584701 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term584802 = newInstance(Class.forName("java.util.Date"));
        Object term584923 = newInstance(Class.forName("java.util.Date"));
        setField(term584701, term584701.getClass(), "memo", "wAITmXtDRl");
        setField(term584701, term584701.getClass(), "fromClassicAddress", "CftrpNyoIA");
        setField(term584701, term584701.getClass(), "fromSigningPublicKey", "uPzBpshCha");
        setField(term584701, term584701.getClass(), "fromPrivateKey", "hEJfxgmgVV");
        setField(term584701, term584701.getClass(), "toClassicAddresses", term584750);
        setField(term584701, term584701.getClass(), "amount", "wYIvugRJpW");
        setLongField(term584802, term584802.getClass(), "fastTime", 1812823225909L);
        setField(term584802, term584802.getClass(), "cdate", null);
        setField(term584701, term584701.getClass(), "startTime", term584802);
        setField(term584701, term584701.getClass(), "destinationTag", "DRgRlMubyd");
        setField(term584701, term584701.getClass(), "trustlineIssuerClassicAddress", "IuKHVDtAZk");
        setField(term584701, term584701.getClass(), "currencyName", "HmynvbqVMU");
        setBooleanField(term584701, term584701.getClass(), "agreeFee", false);
        setField(term584701, term584701.getClass(), "maxXrpFeePerTransaction", "WdCGTBlIAP");
        setBooleanField(term584701, term584701.getClass(), "globalIdVerified", false);
        setBooleanField(term584701, term584701.getClass(), "useBlacklist", false);
        setField(term584701, term584701.getClass(), "retryOfId", term584855);
        setField(term584701, term584701.getClass(), "paymentType", enum1100);
        setField(term584701, term584701.getClass(), "snapshotTrustlineIssuerClassicAddress", "iVUpDfebIC");
        setField(term584701, term584701.getClass(), "snapshotCurrencyName", "zPvXjjgNMX");
        setField(term584701, term584701.getClass(), "nftIssuingAddress", "sdwmwidvzL");
        setField(term584701, term584701.getClass(), "nftTaxon", term584909);
        setField(term584701, term584701.getClass(), "frequency", enum1101);
        setLongField(term584923, term584923.getClass(), "fastTime", 1379008810656L);
        setField(term584923, term584923.getClass(), "cdate", null);
        setField(term584701, term584701.getClass(), "repeatUntilDate", term584923);
        setField(term584701, term584701.getClass(), "email", "chMmILhjdD");
        setBooleanField(term584701, term584701.getClass(), "autoApprove", false);
        term584938 = new Long(1713582982697786878L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term584938;
        callMethod(klass, "retryOfId", argTypes, term584701, args);
    }

};


