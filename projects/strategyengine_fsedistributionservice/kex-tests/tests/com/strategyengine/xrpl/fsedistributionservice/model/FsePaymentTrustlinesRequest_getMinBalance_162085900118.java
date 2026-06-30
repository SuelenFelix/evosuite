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

public class FsePaymentTrustlinesRequest_getMinBalance_162085900118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37039;

    public FsePaymentTrustlinesRequest_getMinBalance_162085900118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term37128 = new Integer(-1145578966);
        Double term37130 = new Double(0.8566567697571895);
        Double term37132 = new Double(0.9203805380592256);
        Long term37146 = new Long(3825396310311739952L);
        Class<? extends Object> term37287 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term37286 = ((Class) term37287).getDeclaredField((String) "FLAT");
        ((Field) term37286).setAccessible(true);
        Object enum65 = ((Field) term37286).get((Object) null);
        Class<? extends Object> term37681 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term37680 = ((Class) term37681).getDeclaredField((String) "DAILY");
        ((Field) term37680).setAccessible(true);
        Object enum66 = ((Field) term37680).get((Object) null);
        term37039 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term37180 = newInstance(Class.forName("java.util.Date"));
        Object term37191 = newInstance(Class.forName("java.util.Date"));
        setField(term37039, term37039.getClass(), "memo", "dgbFDCdHtj");
        setField(term37039, term37039.getClass(), "fromClassicAddress", "EKpdCBubDE");
        setField(term37039, term37039.getClass(), "fromSigningPublicKey", "zMsSLTfGhl");
        setField(term37039, term37039.getClass(), "fromPrivateKey", "bEmHScVZaQ");
        setField(term37039, term37039.getClass(), "trustlineIssuerClassicAddress", "TcuXODkzBV");
        setField(term37039, term37039.getClass(), "currencyName", "coJPjrBZNe");
        setField(term37039, term37039.getClass(), "amount", "vMsWjuPTnO");
        setBooleanField(term37039, term37039.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term37039, term37039.getClass(), "globalIdVerified", false);
        setBooleanField(term37039, term37039.getClass(), "useBlacklist", false);
        setBooleanField(term37039, term37039.getClass(), "agreeFee", true);
        setField(term37039, term37039.getClass(), "maximumTrustlines", term37128);
        setField(term37039, term37039.getClass(), "minBalance", term37130);
        setField(term37039, term37039.getClass(), "maxBalance", term37132);
        setField(term37039, term37039.getClass(), "maxXrpFeePerTransaction", "zHvfKaOstO");
        setField(term37039, term37039.getClass(), "retryOfId", term37146);
        setField(term37039, term37039.getClass(), "paymentType", enum65);
        setField(term37039, term37039.getClass(), "snapshotTrustlineIssuerClassicAddress", "tOszriqETr");
        setField(term37039, term37039.getClass(), "snapshotCurrencyName", "ncSPTkhKjO");
        setLongField(term37180, term37180.getClass(), "fastTime", 1802995433545L);
        setField(term37180, term37180.getClass(), "cdate", null);
        setField(term37039, term37039.getClass(), "startTime", term37180);
        setField(term37039, term37039.getClass(), "frequency", enum66);
        setLongField(term37191, term37191.getClass(), "fastTime", 1843214817357L);
        setField(term37191, term37191.getClass(), "cdate", null);
        setField(term37039, term37039.getClass(), "repeatUntilDate", term37191);
        setField(term37039, term37039.getClass(), "email", "jcWKHRWhyj");
        setBooleanField(term37039, term37039.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinBalance", argTypes, term37039, args);
    }

};


