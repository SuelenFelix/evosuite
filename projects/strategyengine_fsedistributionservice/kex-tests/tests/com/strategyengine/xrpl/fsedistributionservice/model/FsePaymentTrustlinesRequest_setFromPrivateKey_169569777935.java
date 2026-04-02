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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_setFromPrivateKey_169569777935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54189;

    public FsePaymentTrustlinesRequest_setFromPrivateKey_169569777935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term54278 = new Integer(-1048298087);
        Double term54280 = new Double(0.24259014218848696);
        Double term54282 = new Double(0.1544348383112728);
        Long term54296 = new Long(6682528376118987775L);
        Class<? extends Object> term54460 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term54459 = ((Class) term54460).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term54459).setAccessible(true);
        Object enum97 = ((Field) term54459).get((Object) null);
        Class<? extends Object> term54878 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term54877 = ((Class) term54878).getDeclaredField((String) "ANNUALLY");
        ((Field) term54877).setAccessible(true);
        Object enum98 = ((Field) term54877).get((Object) null);
        term54189 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term54338 = newInstance(Class.forName("java.util.Date"));
        Object term54352 = newInstance(Class.forName("java.util.Date"));
        setField(term54189, term54189.getClass(), "memo", "asMqnMNrZp");
        setField(term54189, term54189.getClass(), "fromClassicAddress", "pqFUMTCKJd");
        setField(term54189, term54189.getClass(), "fromSigningPublicKey", "PTEndmPMzk");
        setField(term54189, term54189.getClass(), "fromPrivateKey", "aJQuCOCvZs");
        setField(term54189, term54189.getClass(), "trustlineIssuerClassicAddress", "lHYNCJRiOv");
        setField(term54189, term54189.getClass(), "currencyName", "QVLresHoaP");
        setField(term54189, term54189.getClass(), "amount", "IbxeAMwLVt");
        setBooleanField(term54189, term54189.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term54189, term54189.getClass(), "globalIdVerified", true);
        setBooleanField(term54189, term54189.getClass(), "useBlacklist", true);
        setBooleanField(term54189, term54189.getClass(), "agreeFee", false);
        setField(term54189, term54189.getClass(), "maximumTrustlines", term54278);
        setField(term54189, term54189.getClass(), "minBalance", term54280);
        setField(term54189, term54189.getClass(), "maxBalance", term54282);
        setField(term54189, term54189.getClass(), "maxXrpFeePerTransaction", "bShlAqoTmZ");
        setField(term54189, term54189.getClass(), "retryOfId", term54296);
        setField(term54189, term54189.getClass(), "paymentType", enum97);
        setField(term54189, term54189.getClass(), "snapshotTrustlineIssuerClassicAddress", "nOKlKlNhtU");
        setField(term54189, term54189.getClass(), "snapshotCurrencyName", "gXFNBHJSey");
        setLongField(term54338, term54338.getClass(), "fastTime", 1415426053422L);
        setField(term54338, term54338.getClass(), "cdate", null);
        setField(term54189, term54189.getClass(), "startTime", term54338);
        setField(term54189, term54189.getClass(), "frequency", enum98);
        setLongField(term54352, term54352.getClass(), "fastTime", 1359786657069L);
        setField(term54352, term54352.getClass(), "cdate", null);
        setField(term54189, term54189.getClass(), "repeatUntilDate", term54352);
        setField(term54189, term54189.getClass(), "email", "wUcSfItZgv");
        setBooleanField(term54189, term54189.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rOfPCPHmtJ";
        callMethod(klass, "setFromPrivateKey", argTypes, term54189, args);
    }

};


