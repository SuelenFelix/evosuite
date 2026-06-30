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

public class FsePaymentTrustlinesRequest_isUseBlacklist_174973214815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33877;

    public FsePaymentTrustlinesRequest_isUseBlacklist_174973214815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33966 = new Integer(-1087774327);
        Double term33968 = new Double(0.7591353014991907);
        Double term33970 = new Double(0.791695029600875);
        Long term33984 = new Long(-2644215923136513282L);
        Class<? extends Object> term34136 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term34135 = ((Class) term34136).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term34135).setAccessible(true);
        Object enum59 = ((Field) term34135).get((Object) null);
        Class<? extends Object> term34554 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term34553 = ((Class) term34554).getDeclaredField((String) "ANNUALLY");
        ((Field) term34553).setAccessible(true);
        Object enum60 = ((Field) term34553).get((Object) null);
        term33877 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term34026 = newInstance(Class.forName("java.util.Date"));
        Object term34040 = newInstance(Class.forName("java.util.Date"));
        setField(term33877, term33877.getClass(), "memo", "GLbyDfbNZI");
        setField(term33877, term33877.getClass(), "fromClassicAddress", "oNLcCYDAsO");
        setField(term33877, term33877.getClass(), "fromSigningPublicKey", "CNqMxLvtcJ");
        setField(term33877, term33877.getClass(), "fromPrivateKey", "ktbqerIaKW");
        setField(term33877, term33877.getClass(), "trustlineIssuerClassicAddress", "VoghngXfsK");
        setField(term33877, term33877.getClass(), "currencyName", "GbahCBMvct");
        setField(term33877, term33877.getClass(), "amount", "iiHBhsNFgk");
        setBooleanField(term33877, term33877.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term33877, term33877.getClass(), "globalIdVerified", false);
        setBooleanField(term33877, term33877.getClass(), "useBlacklist", false);
        setBooleanField(term33877, term33877.getClass(), "agreeFee", false);
        setField(term33877, term33877.getClass(), "maximumTrustlines", term33966);
        setField(term33877, term33877.getClass(), "minBalance", term33968);
        setField(term33877, term33877.getClass(), "maxBalance", term33970);
        setField(term33877, term33877.getClass(), "maxXrpFeePerTransaction", "HknsTajwxJ");
        setField(term33877, term33877.getClass(), "retryOfId", term33984);
        setField(term33877, term33877.getClass(), "paymentType", enum59);
        setField(term33877, term33877.getClass(), "snapshotTrustlineIssuerClassicAddress", "XtiurrVYKw");
        setField(term33877, term33877.getClass(), "snapshotCurrencyName", "rsumfoDNHa");
        setLongField(term34026, term34026.getClass(), "fastTime", 1741444563811L);
        setField(term34026, term34026.getClass(), "cdate", null);
        setField(term33877, term33877.getClass(), "startTime", term34026);
        setField(term33877, term33877.getClass(), "frequency", enum60);
        setLongField(term34040, term34040.getClass(), "fastTime", 1761994701322L);
        setField(term34040, term34040.getClass(), "cdate", null);
        setField(term33877, term33877.getClass(), "repeatUntilDate", term34040);
        setField(term33877, term33877.getClass(), "email", "ceCWHUTQUM");
        setBooleanField(term33877, term33877.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUseBlacklist", argTypes, term33877, args);
    }

};


