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

public class FsePaymentTrustlinesRequest_getAmount_149211658312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30635;

    public FsePaymentTrustlinesRequest_getAmount_149211658312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30724 = new Integer(-73683645);
        Double term30726 = new Double(0.6588948704887806);
        Double term30728 = new Double(0.6397214730945112);
        Long term30742 = new Long(2936323121573284007L);
        Class<? extends Object> term30894 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term30893 = ((Class) term30894).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term30893).setAccessible(true);
        Object enum53 = ((Field) term30893).get((Object) null);
        Class<? extends Object> term31312 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term31311 = ((Class) term31312).getDeclaredField((String) "ANNUALLY");
        ((Field) term31311).setAccessible(true);
        Object enum54 = ((Field) term31311).get((Object) null);
        term30635 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term30784 = newInstance(Class.forName("java.util.Date"));
        Object term30798 = newInstance(Class.forName("java.util.Date"));
        setField(term30635, term30635.getClass(), "memo", "RTTvrwwhou");
        setField(term30635, term30635.getClass(), "fromClassicAddress", "lRORwXipuk");
        setField(term30635, term30635.getClass(), "fromSigningPublicKey", "fVdTcjgHdw");
        setField(term30635, term30635.getClass(), "fromPrivateKey", "wwAwLLcLPp");
        setField(term30635, term30635.getClass(), "trustlineIssuerClassicAddress", "nHpMKOmlpQ");
        setField(term30635, term30635.getClass(), "currencyName", "fKhrQsJToZ");
        setField(term30635, term30635.getClass(), "amount", "wsysQLGFnl");
        setBooleanField(term30635, term30635.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term30635, term30635.getClass(), "globalIdVerified", true);
        setBooleanField(term30635, term30635.getClass(), "useBlacklist", false);
        setBooleanField(term30635, term30635.getClass(), "agreeFee", true);
        setField(term30635, term30635.getClass(), "maximumTrustlines", term30724);
        setField(term30635, term30635.getClass(), "minBalance", term30726);
        setField(term30635, term30635.getClass(), "maxBalance", term30728);
        setField(term30635, term30635.getClass(), "maxXrpFeePerTransaction", "ckQLZGFjMX");
        setField(term30635, term30635.getClass(), "retryOfId", term30742);
        setField(term30635, term30635.getClass(), "paymentType", enum53);
        setField(term30635, term30635.getClass(), "snapshotTrustlineIssuerClassicAddress", "qphdrqUtNx");
        setField(term30635, term30635.getClass(), "snapshotCurrencyName", "bwlLFAfNWx");
        setLongField(term30784, term30784.getClass(), "fastTime", 1678177615298L);
        setField(term30784, term30784.getClass(), "cdate", null);
        setField(term30635, term30635.getClass(), "startTime", term30784);
        setField(term30635, term30635.getClass(), "frequency", enum54);
        setLongField(term30798, term30798.getClass(), "fastTime", 1666076287186L);
        setField(term30798, term30798.getClass(), "cdate", null);
        setField(term30635, term30635.getClass(), "repeatUntilDate", term30798);
        setField(term30635, term30635.getClass(), "email", "JWodNQzjjV");
        setBooleanField(term30635, term30635.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term30635, args);
    }

};


