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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_email_140419000823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438864;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_email_140419000823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term438953 = new Integer(880977281);
        Double term438955 = new Double(0.6693176553622628);
        Double term438957 = new Double(0.2962868255626906);
        Long term438971 = new Long(1357834364621364655L);
        Class<? extends Object> term439135 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term439134 = ((Class) term439135).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term439134).setAccessible(true);
        Object enum818 = ((Field) term439134).get((Object) null);
        Class<? extends Object> term439553 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term439552 = ((Class) term439553).getDeclaredField((String) "ANNUALLY");
        ((Field) term439552).setAccessible(true);
        Object enum819 = ((Field) term439552).get((Object) null);
        term438864 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term439013 = newInstance(Class.forName("java.util.Date"));
        Object term439027 = newInstance(Class.forName("java.util.Date"));
        setField(term438864, term438864.getClass(), "memo", "VZrQRCXhOr");
        setField(term438864, term438864.getClass(), "fromClassicAddress", "wXuqNYoOrb");
        setField(term438864, term438864.getClass(), "fromSigningPublicKey", "EtrfOKqtZx");
        setField(term438864, term438864.getClass(), "fromPrivateKey", "nxQyJsNYLI");
        setField(term438864, term438864.getClass(), "trustlineIssuerClassicAddress", "KakFFgXFTt");
        setField(term438864, term438864.getClass(), "currencyName", "kxiSxKVnlu");
        setField(term438864, term438864.getClass(), "amount", "hyyalUiFyc");
        setBooleanField(term438864, term438864.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term438864, term438864.getClass(), "globalIdVerified", false);
        setBooleanField(term438864, term438864.getClass(), "useBlacklist", false);
        setBooleanField(term438864, term438864.getClass(), "agreeFee", true);
        setField(term438864, term438864.getClass(), "maximumTrustlines", term438953);
        setField(term438864, term438864.getClass(), "minBalance", term438955);
        setField(term438864, term438864.getClass(), "maxBalance", term438957);
        setField(term438864, term438864.getClass(), "maxXrpFeePerTransaction", "QoVvZmTKns");
        setField(term438864, term438864.getClass(), "retryOfId", term438971);
        setField(term438864, term438864.getClass(), "paymentType", enum818);
        setField(term438864, term438864.getClass(), "snapshotTrustlineIssuerClassicAddress", "gvmWnnucqV");
        setField(term438864, term438864.getClass(), "snapshotCurrencyName", "dntcVoGXVz");
        setLongField(term439013, term439013.getClass(), "fastTime", 1757016657217L);
        setField(term439013, term439013.getClass(), "cdate", null);
        setField(term438864, term438864.getClass(), "startTime", term439013);
        setField(term438864, term438864.getClass(), "frequency", enum819);
        setLongField(term439027, term439027.getClass(), "fastTime", 1321479296109L);
        setField(term439027, term439027.getClass(), "cdate", null);
        setField(term438864, term438864.getClass(), "repeatUntilDate", term439027);
        setField(term438864, term438864.getClass(), "email", "wKCqUyakHO");
        setBooleanField(term438864, term438864.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eWNhkJwQyq";
        callMethod(klass, "email", argTypes, term438864, args);
    }

};


