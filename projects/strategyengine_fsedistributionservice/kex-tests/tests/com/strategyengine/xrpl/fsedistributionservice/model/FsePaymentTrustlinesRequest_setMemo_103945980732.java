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

public class FsePaymentTrustlinesRequest_setMemo_103945980732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50961;

    public FsePaymentTrustlinesRequest_setMemo_103945980732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term51050 = new Integer(454281060);
        Double term51052 = new Double(0.29874017652881824);
        Double term51054 = new Double(0.32554480512985284);
        Long term51068 = new Long(-5248475803419977214L);
        Class<? extends Object> term51222 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term51221 = ((Class) term51222).getDeclaredField((String) "FLAT");
        ((Field) term51221).setAccessible(true);
        Object enum91 = ((Field) term51221).get((Object) null);
        Class<? extends Object> term51616 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term51615 = ((Class) term51616).getDeclaredField((String) "WEEKLY");
        ((Field) term51615).setAccessible(true);
        Object enum92 = ((Field) term51615).get((Object) null);
        term50961 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term51102 = newInstance(Class.forName("java.util.Date"));
        Object term51114 = newInstance(Class.forName("java.util.Date"));
        setField(term50961, term50961.getClass(), "memo", "LuWMOXdAPA");
        setField(term50961, term50961.getClass(), "fromClassicAddress", "blSffTnsOv");
        setField(term50961, term50961.getClass(), "fromSigningPublicKey", "qbUMcIvEXH");
        setField(term50961, term50961.getClass(), "fromPrivateKey", "TVxGTjeDcu");
        setField(term50961, term50961.getClass(), "trustlineIssuerClassicAddress", "ABPtcyCzkR");
        setField(term50961, term50961.getClass(), "currencyName", "QgHhxMyKvr");
        setField(term50961, term50961.getClass(), "amount", "VGiXZZTWRO");
        setBooleanField(term50961, term50961.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term50961, term50961.getClass(), "globalIdVerified", false);
        setBooleanField(term50961, term50961.getClass(), "useBlacklist", true);
        setBooleanField(term50961, term50961.getClass(), "agreeFee", true);
        setField(term50961, term50961.getClass(), "maximumTrustlines", term51050);
        setField(term50961, term50961.getClass(), "minBalance", term51052);
        setField(term50961, term50961.getClass(), "maxBalance", term51054);
        setField(term50961, term50961.getClass(), "maxXrpFeePerTransaction", "MlPtwXnJOJ");
        setField(term50961, term50961.getClass(), "retryOfId", term51068);
        setField(term50961, term50961.getClass(), "paymentType", enum91);
        setField(term50961, term50961.getClass(), "snapshotTrustlineIssuerClassicAddress", "DbfiyFeaTe");
        setField(term50961, term50961.getClass(), "snapshotCurrencyName", "dQxXGBtDLZ");
        setLongField(term51102, term51102.getClass(), "fastTime", 1450865259896L);
        setField(term51102, term51102.getClass(), "cdate", null);
        setField(term50961, term50961.getClass(), "startTime", term51102);
        setField(term50961, term50961.getClass(), "frequency", enum92);
        setLongField(term51114, term51114.getClass(), "fastTime", 1467783054847L);
        setField(term51114, term51114.getClass(), "cdate", null);
        setField(term50961, term50961.getClass(), "repeatUntilDate", term51114);
        setField(term50961, term50961.getClass(), "email", "EgSgEFIyyN");
        setBooleanField(term50961, term50961.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iAOFcXaLSf";
        callMethod(klass, "setMemo", argTypes, term50961, args);
    }

};


