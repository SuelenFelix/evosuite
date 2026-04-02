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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maximumTrustlines_11856189012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426628;
     Object term426805;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_maximumTrustlines_11856189012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term426717 = new Integer(-571169753);
        Double term426719 = new Double(0.07901636960861558);
        Double term426721 = new Double(0.18717846301066243);
        Long term426735 = new Long(5914687538634916345L);
        Class<? extends Object> term426888 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term426887 = ((Class) term426888).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term426887).setAccessible(true);
        Object enum795 = ((Field) term426887).get((Object) null);
        Class<? extends Object> term427306 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term427305 = ((Class) term427306).getDeclaredField((String) "MONTHLY");
        ((Field) term427305).setAccessible(true);
        Object enum796 = ((Field) term427305).get((Object) null);
        term426628 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term426777 = newInstance(Class.forName("java.util.Date"));
        Object term426790 = newInstance(Class.forName("java.util.Date"));
        setField(term426628, term426628.getClass(), "memo", "XHZWMGtcXo");
        setField(term426628, term426628.getClass(), "fromClassicAddress", "ofKwawJquL");
        setField(term426628, term426628.getClass(), "fromSigningPublicKey", "oXAHnAQLXO");
        setField(term426628, term426628.getClass(), "fromPrivateKey", "hRAbNXbihs");
        setField(term426628, term426628.getClass(), "trustlineIssuerClassicAddress", "pBhsNcDwjq");
        setField(term426628, term426628.getClass(), "currencyName", "KlCILqBuzi");
        setField(term426628, term426628.getClass(), "amount", "jrXwpZtXQd");
        setBooleanField(term426628, term426628.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term426628, term426628.getClass(), "globalIdVerified", true);
        setBooleanField(term426628, term426628.getClass(), "useBlacklist", true);
        setBooleanField(term426628, term426628.getClass(), "agreeFee", true);
        setField(term426628, term426628.getClass(), "maximumTrustlines", term426717);
        setField(term426628, term426628.getClass(), "minBalance", term426719);
        setField(term426628, term426628.getClass(), "maxBalance", term426721);
        setField(term426628, term426628.getClass(), "maxXrpFeePerTransaction", "YiUhIkzvfS");
        setField(term426628, term426628.getClass(), "retryOfId", term426735);
        setField(term426628, term426628.getClass(), "paymentType", enum795);
        setField(term426628, term426628.getClass(), "snapshotTrustlineIssuerClassicAddress", "bsUiwCzIyy");
        setField(term426628, term426628.getClass(), "snapshotCurrencyName", "lJgySfFWtA");
        setLongField(term426777, term426777.getClass(), "fastTime", 1372763054292L);
        setField(term426777, term426777.getClass(), "cdate", null);
        setField(term426628, term426628.getClass(), "startTime", term426777);
        setField(term426628, term426628.getClass(), "frequency", enum796);
        setLongField(term426790, term426790.getClass(), "fastTime", 1564976678183L);
        setField(term426790, term426790.getClass(), "cdate", null);
        setField(term426628, term426628.getClass(), "repeatUntilDate", term426790);
        setField(term426628, term426628.getClass(), "email", "ErZOzqPTwr");
        setBooleanField(term426628, term426628.getClass(), "autoApprove", false);
        term426805 = new Integer(318591690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term426805;
        callMethod(klass, "maximumTrustlines", argTypes, term426628, args);
    }

};


