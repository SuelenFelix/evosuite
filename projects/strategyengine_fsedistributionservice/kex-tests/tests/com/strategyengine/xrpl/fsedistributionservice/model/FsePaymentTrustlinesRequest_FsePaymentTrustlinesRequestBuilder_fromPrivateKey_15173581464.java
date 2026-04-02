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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromPrivateKey_15173581464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418104;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromPrivateKey_15173581464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term418193 = new Integer(-1667990367);
        Double term418195 = new Double(0.9123572866833729);
        Double term418197 = new Double(0.40635376375558196);
        Long term418211 = new Long(-5583016716246948935L);
        Class<? extends Object> term418364 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term418363 = ((Class) term418364).getDeclaredField((String) "FLAT");
        ((Field) term418363).setAccessible(true);
        Object enum779 = ((Field) term418363).get((Object) null);
        Class<? extends Object> term418758 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term418757 = ((Class) term418758).getDeclaredField((String) "DAILY");
        ((Field) term418757).setAccessible(true);
        Object enum780 = ((Field) term418757).get((Object) null);
        term418104 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term418245 = newInstance(Class.forName("java.util.Date"));
        Object term418256 = newInstance(Class.forName("java.util.Date"));
        setField(term418104, term418104.getClass(), "memo", "gtBUZHUXYc");
        setField(term418104, term418104.getClass(), "fromClassicAddress", "iFapMdPnGw");
        setField(term418104, term418104.getClass(), "fromSigningPublicKey", "RfWXuIRYLA");
        setField(term418104, term418104.getClass(), "fromPrivateKey", "UmDEkQQiuz");
        setField(term418104, term418104.getClass(), "trustlineIssuerClassicAddress", "TCXBrRDTcJ");
        setField(term418104, term418104.getClass(), "currencyName", "RkPxDEtRcH");
        setField(term418104, term418104.getClass(), "amount", "OLhmDSgInU");
        setBooleanField(term418104, term418104.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term418104, term418104.getClass(), "globalIdVerified", false);
        setBooleanField(term418104, term418104.getClass(), "useBlacklist", true);
        setBooleanField(term418104, term418104.getClass(), "agreeFee", true);
        setField(term418104, term418104.getClass(), "maximumTrustlines", term418193);
        setField(term418104, term418104.getClass(), "minBalance", term418195);
        setField(term418104, term418104.getClass(), "maxBalance", term418197);
        setField(term418104, term418104.getClass(), "maxXrpFeePerTransaction", "IfnjJhNdXG");
        setField(term418104, term418104.getClass(), "retryOfId", term418211);
        setField(term418104, term418104.getClass(), "paymentType", enum779);
        setField(term418104, term418104.getClass(), "snapshotTrustlineIssuerClassicAddress", "sYHwXJenPx");
        setField(term418104, term418104.getClass(), "snapshotCurrencyName", "vknqoIHcVy");
        setLongField(term418245, term418245.getClass(), "fastTime", 1772049615997L);
        setField(term418245, term418245.getClass(), "cdate", null);
        setField(term418104, term418104.getClass(), "startTime", term418245);
        setField(term418104, term418104.getClass(), "frequency", enum780);
        setLongField(term418256, term418256.getClass(), "fastTime", 1316785497055L);
        setField(term418256, term418256.getClass(), "cdate", null);
        setField(term418104, term418104.getClass(), "repeatUntilDate", term418256);
        setField(term418104, term418104.getClass(), "email", "RnlJVSdVqG");
        setBooleanField(term418104, term418104.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PhGBkiAfqm";
        callMethod(klass, "fromPrivateKey", argTypes, term418104, args);
    }

};


