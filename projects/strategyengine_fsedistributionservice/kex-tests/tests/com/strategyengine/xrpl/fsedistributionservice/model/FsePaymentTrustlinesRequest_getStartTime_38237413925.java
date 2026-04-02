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

public class FsePaymentTrustlinesRequest_getStartTime_38237413925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44561;

    public FsePaymentTrustlinesRequest_getStartTime_38237413925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term44650 = new Integer(-817164822);
        Double term44652 = new Double(0.016575281023182953);
        Double term44654 = new Double(0.5308350402051779);
        Long term44668 = new Long(2062173786000223358L);
        Class<? extends Object> term44810 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term44809 = ((Class) term44810).getDeclaredField((String) "FLAT");
        ((Field) term44809).setAccessible(true);
        Object enum79 = ((Field) term44809).get((Object) null);
        Class<? extends Object> term45204 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term45203 = ((Class) term45204).getDeclaredField((String) "WEEKLY");
        ((Field) term45203).setAccessible(true);
        Object enum80 = ((Field) term45203).get((Object) null);
        term44561 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term44702 = newInstance(Class.forName("java.util.Date"));
        Object term44714 = newInstance(Class.forName("java.util.Date"));
        setField(term44561, term44561.getClass(), "memo", "xmzSoVgiED");
        setField(term44561, term44561.getClass(), "fromClassicAddress", "pdSvedKgPq");
        setField(term44561, term44561.getClass(), "fromSigningPublicKey", "epPTwvcoyb");
        setField(term44561, term44561.getClass(), "fromPrivateKey", "UBPHmOICBs");
        setField(term44561, term44561.getClass(), "trustlineIssuerClassicAddress", "IDJUVPgUJf");
        setField(term44561, term44561.getClass(), "currencyName", "JmnWRJUxGr");
        setField(term44561, term44561.getClass(), "amount", "wgRGBNrTGP");
        setBooleanField(term44561, term44561.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term44561, term44561.getClass(), "globalIdVerified", true);
        setBooleanField(term44561, term44561.getClass(), "useBlacklist", false);
        setBooleanField(term44561, term44561.getClass(), "agreeFee", true);
        setField(term44561, term44561.getClass(), "maximumTrustlines", term44650);
        setField(term44561, term44561.getClass(), "minBalance", term44652);
        setField(term44561, term44561.getClass(), "maxBalance", term44654);
        setField(term44561, term44561.getClass(), "maxXrpFeePerTransaction", "FIdNVptZpW");
        setField(term44561, term44561.getClass(), "retryOfId", term44668);
        setField(term44561, term44561.getClass(), "paymentType", enum79);
        setField(term44561, term44561.getClass(), "snapshotTrustlineIssuerClassicAddress", "rQjxAhisjm");
        setField(term44561, term44561.getClass(), "snapshotCurrencyName", "ZDhASPHjDG");
        setLongField(term44702, term44702.getClass(), "fastTime", 1272776321768L);
        setField(term44702, term44702.getClass(), "cdate", null);
        setField(term44561, term44561.getClass(), "startTime", term44702);
        setField(term44561, term44561.getClass(), "frequency", enum80);
        setLongField(term44714, term44714.getClass(), "fastTime", 1597352397295L);
        setField(term44714, term44714.getClass(), "cdate", null);
        setField(term44561, term44561.getClass(), "repeatUntilDate", term44714);
        setField(term44561, term44561.getClass(), "email", "HNVOAXYNEZ");
        setBooleanField(term44561, term44561.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term44561, args);
    }

};


