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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_memo_19644475741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414844;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_memo_19644475741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term414933 = new Integer(389427431);
        Double term414935 = new Double(0.8777038609128434);
        Double term414937 = new Double(0.008025683154629148);
        Long term414951 = new Long(4087729695916598698L);
        Class<? extends Object> term415114 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term415113 = ((Class) term415114).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term415113).setAccessible(true);
        Object enum773 = ((Field) term415113).get((Object) null);
        Class<? extends Object> term415532 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term415531 = ((Class) term415532).getDeclaredField((String) "MONTHLY");
        ((Field) term415531).setAccessible(true);
        Object enum774 = ((Field) term415531).get((Object) null);
        term414844 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term414993 = newInstance(Class.forName("java.util.Date"));
        Object term415006 = newInstance(Class.forName("java.util.Date"));
        setField(term414844, term414844.getClass(), "memo", "lmjJUxaoYd");
        setField(term414844, term414844.getClass(), "fromClassicAddress", "yvsgNBCrWW");
        setField(term414844, term414844.getClass(), "fromSigningPublicKey", "dKBKbXYYRZ");
        setField(term414844, term414844.getClass(), "fromPrivateKey", "IkItfbpcap");
        setField(term414844, term414844.getClass(), "trustlineIssuerClassicAddress", "MJzpIWKpnW");
        setField(term414844, term414844.getClass(), "currencyName", "OAVOvFzQXP");
        setField(term414844, term414844.getClass(), "amount", "TJWLTODbwy");
        setBooleanField(term414844, term414844.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term414844, term414844.getClass(), "globalIdVerified", false);
        setBooleanField(term414844, term414844.getClass(), "useBlacklist", false);
        setBooleanField(term414844, term414844.getClass(), "agreeFee", true);
        setField(term414844, term414844.getClass(), "maximumTrustlines", term414933);
        setField(term414844, term414844.getClass(), "minBalance", term414935);
        setField(term414844, term414844.getClass(), "maxBalance", term414937);
        setField(term414844, term414844.getClass(), "maxXrpFeePerTransaction", "gwokBeghOs");
        setField(term414844, term414844.getClass(), "retryOfId", term414951);
        setField(term414844, term414844.getClass(), "paymentType", enum773);
        setField(term414844, term414844.getClass(), "snapshotTrustlineIssuerClassicAddress", "gSfPReupKO");
        setField(term414844, term414844.getClass(), "snapshotCurrencyName", "djavJMNWzM");
        setLongField(term414993, term414993.getClass(), "fastTime", 1383809180525L);
        setField(term414993, term414993.getClass(), "cdate", null);
        setField(term414844, term414844.getClass(), "startTime", term414993);
        setField(term414844, term414844.getClass(), "frequency", enum774);
        setLongField(term415006, term415006.getClass(), "fastTime", 1296112095716L);
        setField(term415006, term415006.getClass(), "cdate", null);
        setField(term414844, term414844.getClass(), "repeatUntilDate", term415006);
        setField(term414844, term414844.getClass(), "email", "KLhZKvcirH");
        setBooleanField(term414844, term414844.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ymoyLFhkiZ";
        callMethod(klass, "memo", argTypes, term414844, args);
    }

};


