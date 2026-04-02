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

public class FsePaymentTrustlinesRequest_setTrustlineIssuerClassicAddress_45658532236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55293;

    public FsePaymentTrustlinesRequest_setTrustlineIssuerClassicAddress_45658532236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term55382 = new Integer(292681826);
        Double term55384 = new Double(0.5187846213101265);
        Double term55386 = new Double(0.045893173090043815);
        Long term55400 = new Long(682356318767179819L);
        Class<? extends Object> term55554 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term55553 = ((Class) term55554).getDeclaredField((String) "FLAT");
        ((Field) term55553).setAccessible(true);
        Object enum99 = ((Field) term55553).get((Object) null);
        Class<? extends Object> term55948 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term55947 = ((Class) term55948).getDeclaredField((String) "WEEKLY");
        ((Field) term55947).setAccessible(true);
        Object enum100 = ((Field) term55947).get((Object) null);
        term55293 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term55434 = newInstance(Class.forName("java.util.Date"));
        Object term55446 = newInstance(Class.forName("java.util.Date"));
        setField(term55293, term55293.getClass(), "memo", "EnmiAvfpJv");
        setField(term55293, term55293.getClass(), "fromClassicAddress", "AdYzLPMcwe");
        setField(term55293, term55293.getClass(), "fromSigningPublicKey", "FrTZLybkKk");
        setField(term55293, term55293.getClass(), "fromPrivateKey", "FlxVmiMYKP");
        setField(term55293, term55293.getClass(), "trustlineIssuerClassicAddress", "fgOpAWlGYN");
        setField(term55293, term55293.getClass(), "currencyName", "PNzNzzjSXM");
        setField(term55293, term55293.getClass(), "amount", "ktKcSZiuGM");
        setBooleanField(term55293, term55293.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term55293, term55293.getClass(), "globalIdVerified", false);
        setBooleanField(term55293, term55293.getClass(), "useBlacklist", true);
        setBooleanField(term55293, term55293.getClass(), "agreeFee", true);
        setField(term55293, term55293.getClass(), "maximumTrustlines", term55382);
        setField(term55293, term55293.getClass(), "minBalance", term55384);
        setField(term55293, term55293.getClass(), "maxBalance", term55386);
        setField(term55293, term55293.getClass(), "maxXrpFeePerTransaction", "PSOttyUeqv");
        setField(term55293, term55293.getClass(), "retryOfId", term55400);
        setField(term55293, term55293.getClass(), "paymentType", enum99);
        setField(term55293, term55293.getClass(), "snapshotTrustlineIssuerClassicAddress", "HmEvTlmzXo");
        setField(term55293, term55293.getClass(), "snapshotCurrencyName", "BMMonTIZgJ");
        setLongField(term55434, term55434.getClass(), "fastTime", 1589746751309L);
        setField(term55434, term55434.getClass(), "cdate", null);
        setField(term55293, term55293.getClass(), "startTime", term55434);
        setField(term55293, term55293.getClass(), "frequency", enum100);
        setLongField(term55446, term55446.getClass(), "fastTime", 1291280367982L);
        setField(term55446, term55446.getClass(), "cdate", null);
        setField(term55293, term55293.getClass(), "repeatUntilDate", term55446);
        setField(term55293, term55293.getClass(), "email", "QXyFXBjFde");
        setBooleanField(term55293, term55293.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xVFgeyYxZS";
        callMethod(klass, "setTrustlineIssuerClassicAddress", argTypes, term55293, args);
    }

};


