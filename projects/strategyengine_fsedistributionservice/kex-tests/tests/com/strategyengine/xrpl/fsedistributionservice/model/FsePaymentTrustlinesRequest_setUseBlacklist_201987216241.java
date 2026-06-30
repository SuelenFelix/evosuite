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

public class FsePaymentTrustlinesRequest_setUseBlacklist_201987216241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60685;
     Object term60863;

    public FsePaymentTrustlinesRequest_setUseBlacklist_201987216241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term60774 = new Integer(1596070772);
        Double term60776 = new Double(0.09067063848644474);
        Double term60778 = new Double(0.268304014379393);
        Long term60792 = new Long(50358265865610362L);
        Class<? extends Object> term60946 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term60945 = ((Class) term60946).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term60945).setAccessible(true);
        Object enum109 = ((Field) term60945).get((Object) null);
        Class<? extends Object> term61364 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term61363 = ((Class) term61364).getDeclaredField((String) "ANNUALLY");
        ((Field) term61363).setAccessible(true);
        Object enum110 = ((Field) term61363).get((Object) null);
        term60685 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term60834 = newInstance(Class.forName("java.util.Date"));
        Object term60848 = newInstance(Class.forName("java.util.Date"));
        setField(term60685, term60685.getClass(), "memo", "nJnRIRiLZK");
        setField(term60685, term60685.getClass(), "fromClassicAddress", "eWnrMSbYbT");
        setField(term60685, term60685.getClass(), "fromSigningPublicKey", "AjoFvDFyCY");
        setField(term60685, term60685.getClass(), "fromPrivateKey", "OFTJwdPiTG");
        setField(term60685, term60685.getClass(), "trustlineIssuerClassicAddress", "QiUprSEluR");
        setField(term60685, term60685.getClass(), "currencyName", "cDOXXottZh");
        setField(term60685, term60685.getClass(), "amount", "rfqJDkDppz");
        setBooleanField(term60685, term60685.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term60685, term60685.getClass(), "globalIdVerified", false);
        setBooleanField(term60685, term60685.getClass(), "useBlacklist", false);
        setBooleanField(term60685, term60685.getClass(), "agreeFee", false);
        setField(term60685, term60685.getClass(), "maximumTrustlines", term60774);
        setField(term60685, term60685.getClass(), "minBalance", term60776);
        setField(term60685, term60685.getClass(), "maxBalance", term60778);
        setField(term60685, term60685.getClass(), "maxXrpFeePerTransaction", "MGorMVGauT");
        setField(term60685, term60685.getClass(), "retryOfId", term60792);
        setField(term60685, term60685.getClass(), "paymentType", enum109);
        setField(term60685, term60685.getClass(), "snapshotTrustlineIssuerClassicAddress", "jXKxUGTuEF");
        setField(term60685, term60685.getClass(), "snapshotCurrencyName", "nDCcyhiTnS");
        setLongField(term60834, term60834.getClass(), "fastTime", 1319541754821L);
        setField(term60834, term60834.getClass(), "cdate", null);
        setField(term60685, term60685.getClass(), "startTime", term60834);
        setField(term60685, term60685.getClass(), "frequency", enum110);
        setLongField(term60848, term60848.getClass(), "fastTime", 1431655415283L);
        setField(term60848, term60848.getClass(), "cdate", null);
        setField(term60685, term60685.getClass(), "repeatUntilDate", term60848);
        setField(term60685, term60685.getClass(), "email", "Bcivwcjece");
        setBooleanField(term60685, term60685.getClass(), "autoApprove", false);
        term60863 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term60863;
        callMethod(klass, "setUseBlacklist", argTypes, term60685, args);
    }

};


