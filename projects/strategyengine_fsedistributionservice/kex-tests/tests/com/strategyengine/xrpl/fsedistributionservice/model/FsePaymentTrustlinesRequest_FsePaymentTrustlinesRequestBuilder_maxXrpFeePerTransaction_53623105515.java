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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxXrpFeePerTransaction_53623105515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429832;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maxXrpFeePerTransaction_53623105515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term429921 = new Integer(806595993);
        Double term429923 = new Double(0.06480976831423468);
        Double term429925 = new Double(0.8490790645379176);
        Long term429939 = new Long(1676018795123486151L);
        Class<? extends Object> term430102 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term430101 = ((Class) term430102).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term430101).setAccessible(true);
        Object enum801 = ((Field) term430101).get((Object) null);
        Class<? extends Object> term430520 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term430519 = ((Class) term430520).getDeclaredField((String) "MONTHLY");
        ((Field) term430519).setAccessible(true);
        Object enum802 = ((Field) term430519).get((Object) null);
        term429832 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term429981 = newInstance(Class.forName("java.util.Date"));
        Object term429994 = newInstance(Class.forName("java.util.Date"));
        setField(term429832, term429832.getClass(), "memo", "jOmdJDMEKW");
        setField(term429832, term429832.getClass(), "fromClassicAddress", "yVUBrwMSLo");
        setField(term429832, term429832.getClass(), "fromSigningPublicKey", "CpZsTbPacH");
        setField(term429832, term429832.getClass(), "fromPrivateKey", "HyRjodIKrt");
        setField(term429832, term429832.getClass(), "trustlineIssuerClassicAddress", "dGqYTSkmlc");
        setField(term429832, term429832.getClass(), "currencyName", "XBismYeIOM");
        setField(term429832, term429832.getClass(), "amount", "TQZuVrOtiK");
        setBooleanField(term429832, term429832.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term429832, term429832.getClass(), "globalIdVerified", false);
        setBooleanField(term429832, term429832.getClass(), "useBlacklist", false);
        setBooleanField(term429832, term429832.getClass(), "agreeFee", false);
        setField(term429832, term429832.getClass(), "maximumTrustlines", term429921);
        setField(term429832, term429832.getClass(), "minBalance", term429923);
        setField(term429832, term429832.getClass(), "maxBalance", term429925);
        setField(term429832, term429832.getClass(), "maxXrpFeePerTransaction", "UUetRJugfR");
        setField(term429832, term429832.getClass(), "retryOfId", term429939);
        setField(term429832, term429832.getClass(), "paymentType", enum801);
        setField(term429832, term429832.getClass(), "snapshotTrustlineIssuerClassicAddress", "ozLkLYzWZD");
        setField(term429832, term429832.getClass(), "snapshotCurrencyName", "LEAEPBtmDE");
        setLongField(term429981, term429981.getClass(), "fastTime", 1675606736154L);
        setField(term429981, term429981.getClass(), "cdate", null);
        setField(term429832, term429832.getClass(), "startTime", term429981);
        setField(term429832, term429832.getClass(), "frequency", enum802);
        setLongField(term429994, term429994.getClass(), "fastTime", 1480317287347L);
        setField(term429994, term429994.getClass(), "cdate", null);
        setField(term429832, term429832.getClass(), "repeatUntilDate", term429994);
        setField(term429832, term429832.getClass(), "email", "oUCfMEViOl");
        setBooleanField(term429832, term429832.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NCKuJOimgb";
        callMethod(klass, "maxXrpFeePerTransaction", argTypes, term429832, args);
    }

};


