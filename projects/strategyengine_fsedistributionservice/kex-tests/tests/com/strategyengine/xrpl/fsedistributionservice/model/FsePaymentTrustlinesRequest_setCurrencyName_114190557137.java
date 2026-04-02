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

public class FsePaymentTrustlinesRequest_setCurrencyName_114190557137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56357;

    public FsePaymentTrustlinesRequest_setCurrencyName_114190557137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term56446 = new Integer(458147407);
        Double term56448 = new Double(0.3626177854778667);
        Double term56450 = new Double(0.3163771663728089);
        Long term56464 = new Long(-7291743527973326814L);
        Class<? extends Object> term56628 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term56627 = ((Class) term56628).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term56627).setAccessible(true);
        Object enum101 = ((Field) term56627).get((Object) null);
        Class<? extends Object> term57046 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term57045 = ((Class) term57046).getDeclaredField((String) "ANNUALLY");
        ((Field) term57045).setAccessible(true);
        Object enum102 = ((Field) term57045).get((Object) null);
        term56357 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term56506 = newInstance(Class.forName("java.util.Date"));
        Object term56520 = newInstance(Class.forName("java.util.Date"));
        setField(term56357, term56357.getClass(), "memo", "iQiGTulJiH");
        setField(term56357, term56357.getClass(), "fromClassicAddress", "utCuuVCKqE");
        setField(term56357, term56357.getClass(), "fromSigningPublicKey", "zSfoqzJbPT");
        setField(term56357, term56357.getClass(), "fromPrivateKey", "QUymMnsCIj");
        setField(term56357, term56357.getClass(), "trustlineIssuerClassicAddress", "ikTtOgdVYS");
        setField(term56357, term56357.getClass(), "currencyName", "JptuwlirlS");
        setField(term56357, term56357.getClass(), "amount", "TKOMaGswbU");
        setBooleanField(term56357, term56357.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term56357, term56357.getClass(), "globalIdVerified", false);
        setBooleanField(term56357, term56357.getClass(), "useBlacklist", false);
        setBooleanField(term56357, term56357.getClass(), "agreeFee", true);
        setField(term56357, term56357.getClass(), "maximumTrustlines", term56446);
        setField(term56357, term56357.getClass(), "minBalance", term56448);
        setField(term56357, term56357.getClass(), "maxBalance", term56450);
        setField(term56357, term56357.getClass(), "maxXrpFeePerTransaction", "YcTbglHiUq");
        setField(term56357, term56357.getClass(), "retryOfId", term56464);
        setField(term56357, term56357.getClass(), "paymentType", enum101);
        setField(term56357, term56357.getClass(), "snapshotTrustlineIssuerClassicAddress", "TiUqHrjoEU");
        setField(term56357, term56357.getClass(), "snapshotCurrencyName", "eoEvZbdLjL");
        setLongField(term56506, term56506.getClass(), "fastTime", 1491181740539L);
        setField(term56506, term56506.getClass(), "cdate", null);
        setField(term56357, term56357.getClass(), "startTime", term56506);
        setField(term56357, term56357.getClass(), "frequency", enum102);
        setLongField(term56520, term56520.getClass(), "fastTime", 1461996881310L);
        setField(term56520, term56520.getClass(), "cdate", null);
        setField(term56357, term56357.getClass(), "repeatUntilDate", term56520);
        setField(term56357, term56357.getClass(), "email", "BkIxsyPkGy");
        setBooleanField(term56357, term56357.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mrMGwoRgVY";
        callMethod(klass, "setCurrencyName", argTypes, term56357, args);
    }

};


