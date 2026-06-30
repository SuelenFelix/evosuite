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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_setNewTrustlinesOnly_139473203739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58565;
     Object term58742;

    public FsePaymentTrustlinesRequest_setNewTrustlinesOnly_139473203739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term58654 = new Integer(493620644);
        Double term58656 = new Double(0.16988691727397487);
        Double term58658 = new Double(0.39286935532362843);
        Long term58672 = new Long(9013624480170062917L);
        Class<? extends Object> term58825 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term58824 = ((Class) term58825).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term58824).setAccessible(true);
        Object enum105 = ((Field) term58824).get((Object) null);
        Class<? extends Object> term59243 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term59242 = ((Class) term59243).getDeclaredField((String) "MONTHLY");
        ((Field) term59242).setAccessible(true);
        Object enum106 = ((Field) term59242).get((Object) null);
        term58565 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term58714 = newInstance(Class.forName("java.util.Date"));
        Object term58727 = newInstance(Class.forName("java.util.Date"));
        setField(term58565, term58565.getClass(), "memo", "ubaBUfLolu");
        setField(term58565, term58565.getClass(), "fromClassicAddress", "itAUCFhZhq");
        setField(term58565, term58565.getClass(), "fromSigningPublicKey", "bIqaKgXgPm");
        setField(term58565, term58565.getClass(), "fromPrivateKey", "uOJFOUcNvv");
        setField(term58565, term58565.getClass(), "trustlineIssuerClassicAddress", "tkmmGweDwJ");
        setField(term58565, term58565.getClass(), "currencyName", "pMfTuAFXxg");
        setField(term58565, term58565.getClass(), "amount", "XCZmhkblRc");
        setBooleanField(term58565, term58565.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term58565, term58565.getClass(), "globalIdVerified", true);
        setBooleanField(term58565, term58565.getClass(), "useBlacklist", true);
        setBooleanField(term58565, term58565.getClass(), "agreeFee", true);
        setField(term58565, term58565.getClass(), "maximumTrustlines", term58654);
        setField(term58565, term58565.getClass(), "minBalance", term58656);
        setField(term58565, term58565.getClass(), "maxBalance", term58658);
        setField(term58565, term58565.getClass(), "maxXrpFeePerTransaction", "gFUWMydGCU");
        setField(term58565, term58565.getClass(), "retryOfId", term58672);
        setField(term58565, term58565.getClass(), "paymentType", enum105);
        setField(term58565, term58565.getClass(), "snapshotTrustlineIssuerClassicAddress", "LLegSTfqJt");
        setField(term58565, term58565.getClass(), "snapshotCurrencyName", "XQfmqLbqHS");
        setLongField(term58714, term58714.getClass(), "fastTime", 1369539267611L);
        setField(term58714, term58714.getClass(), "cdate", null);
        setField(term58565, term58565.getClass(), "startTime", term58714);
        setField(term58565, term58565.getClass(), "frequency", enum106);
        setLongField(term58727, term58727.getClass(), "fastTime", 1510275079351L);
        setField(term58727, term58727.getClass(), "cdate", null);
        setField(term58565, term58565.getClass(), "repeatUntilDate", term58727);
        setField(term58565, term58565.getClass(), "email", "jLVLqQSjqg");
        setBooleanField(term58565, term58565.getClass(), "autoApprove", false);
        term58742 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term58742;
        callMethod(klass, "setNewTrustlinesOnly", argTypes, term58565, args);
    }

};


