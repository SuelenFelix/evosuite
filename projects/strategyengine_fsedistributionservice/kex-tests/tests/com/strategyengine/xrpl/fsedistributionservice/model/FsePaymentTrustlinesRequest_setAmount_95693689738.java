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

public class FsePaymentTrustlinesRequest_setAmount_95693689738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57461;

    public FsePaymentTrustlinesRequest_setAmount_95693689738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term57550 = new Integer(-184153539);
        Double term57552 = new Double(0.8819646072665548);
        Double term57554 = new Double(0.5412182593116958);
        Long term57568 = new Long(-5963439350418910964L);
        Class<? extends Object> term57732 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term57731 = ((Class) term57732).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term57731).setAccessible(true);
        Object enum103 = ((Field) term57731).get((Object) null);
        Class<? extends Object> term58150 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term58149 = ((Class) term58150).getDeclaredField((String) "ANNUALLY");
        ((Field) term58149).setAccessible(true);
        Object enum104 = ((Field) term58149).get((Object) null);
        term57461 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term57610 = newInstance(Class.forName("java.util.Date"));
        Object term57624 = newInstance(Class.forName("java.util.Date"));
        setField(term57461, term57461.getClass(), "memo", "mxVLTgCwki");
        setField(term57461, term57461.getClass(), "fromClassicAddress", "wCurppnDSA");
        setField(term57461, term57461.getClass(), "fromSigningPublicKey", "JydxSNTMYt");
        setField(term57461, term57461.getClass(), "fromPrivateKey", "KpurAcrHYT");
        setField(term57461, term57461.getClass(), "trustlineIssuerClassicAddress", "QjvDwgKJGz");
        setField(term57461, term57461.getClass(), "currencyName", "ngYxiXTZrk");
        setField(term57461, term57461.getClass(), "amount", "YTxBqWRAlo");
        setBooleanField(term57461, term57461.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term57461, term57461.getClass(), "globalIdVerified", true);
        setBooleanField(term57461, term57461.getClass(), "useBlacklist", true);
        setBooleanField(term57461, term57461.getClass(), "agreeFee", false);
        setField(term57461, term57461.getClass(), "maximumTrustlines", term57550);
        setField(term57461, term57461.getClass(), "minBalance", term57552);
        setField(term57461, term57461.getClass(), "maxBalance", term57554);
        setField(term57461, term57461.getClass(), "maxXrpFeePerTransaction", "ReruUQRXwl");
        setField(term57461, term57461.getClass(), "retryOfId", term57568);
        setField(term57461, term57461.getClass(), "paymentType", enum103);
        setField(term57461, term57461.getClass(), "snapshotTrustlineIssuerClassicAddress", "DWEsVQwuaE");
        setField(term57461, term57461.getClass(), "snapshotCurrencyName", "qGkNzZAeDN");
        setLongField(term57610, term57610.getClass(), "fastTime", 1818968525805L);
        setField(term57610, term57610.getClass(), "cdate", null);
        setField(term57461, term57461.getClass(), "startTime", term57610);
        setField(term57461, term57461.getClass(), "frequency", enum104);
        setLongField(term57624, term57624.getClass(), "fastTime", 1603905786801L);
        setField(term57624, term57624.getClass(), "cdate", null);
        setField(term57461, term57461.getClass(), "repeatUntilDate", term57624);
        setField(term57461, term57461.getClass(), "email", "wdtiuPgTVJ");
        setBooleanField(term57461, term57461.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HUgzMgrpsK";
        callMethod(klass, "setAmount", argTypes, term57461, args);
    }

};


