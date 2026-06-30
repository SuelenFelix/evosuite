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

public class FsePaymentTrustlinesRequest_setFromSigningPublicKey_9662365034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53085;

    public FsePaymentTrustlinesRequest_setFromSigningPublicKey_9662365034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53174 = new Integer(2055867847);
        Double term53176 = new Double(0.53094494792755);
        Double term53178 = new Double(0.146431486357265);
        Long term53192 = new Long(41775768178052008L);
        Class<? extends Object> term53356 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term53355 = ((Class) term53356).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term53355).setAccessible(true);
        Object enum95 = ((Field) term53355).get((Object) null);
        Class<? extends Object> term53774 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term53773 = ((Class) term53774).getDeclaredField((String) "ANNUALLY");
        ((Field) term53773).setAccessible(true);
        Object enum96 = ((Field) term53773).get((Object) null);
        term53085 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term53234 = newInstance(Class.forName("java.util.Date"));
        Object term53248 = newInstance(Class.forName("java.util.Date"));
        setField(term53085, term53085.getClass(), "memo", "UbZGBpQZQW");
        setField(term53085, term53085.getClass(), "fromClassicAddress", "SvGTualQPa");
        setField(term53085, term53085.getClass(), "fromSigningPublicKey", "mdxcgZwsaP");
        setField(term53085, term53085.getClass(), "fromPrivateKey", "XildIRoZHG");
        setField(term53085, term53085.getClass(), "trustlineIssuerClassicAddress", "lEcrFlxJXH");
        setField(term53085, term53085.getClass(), "currencyName", "VNdDwXMYxR");
        setField(term53085, term53085.getClass(), "amount", "bVbexZPmwW");
        setBooleanField(term53085, term53085.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term53085, term53085.getClass(), "globalIdVerified", false);
        setBooleanField(term53085, term53085.getClass(), "useBlacklist", false);
        setBooleanField(term53085, term53085.getClass(), "agreeFee", true);
        setField(term53085, term53085.getClass(), "maximumTrustlines", term53174);
        setField(term53085, term53085.getClass(), "minBalance", term53176);
        setField(term53085, term53085.getClass(), "maxBalance", term53178);
        setField(term53085, term53085.getClass(), "maxXrpFeePerTransaction", "tvxYdqiyGc");
        setField(term53085, term53085.getClass(), "retryOfId", term53192);
        setField(term53085, term53085.getClass(), "paymentType", enum95);
        setField(term53085, term53085.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZEXFoMSKeG");
        setField(term53085, term53085.getClass(), "snapshotCurrencyName", "HvxahUfZcJ");
        setLongField(term53234, term53234.getClass(), "fastTime", 1597421765774L);
        setField(term53234, term53234.getClass(), "cdate", null);
        setField(term53085, term53085.getClass(), "startTime", term53234);
        setField(term53085, term53085.getClass(), "frequency", enum96);
        setLongField(term53248, term53248.getClass(), "fastTime", 1354735325477L);
        setField(term53248, term53248.getClass(), "cdate", null);
        setField(term53085, term53085.getClass(), "repeatUntilDate", term53248);
        setField(term53085, term53085.getClass(), "email", "WkLpmqoQxy");
        setBooleanField(term53085, term53085.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XiNoscmYhd";
        callMethod(klass, "setFromSigningPublicKey", argTypes, term53085, args);
    }

};


