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

public class FsePaymentTrustlinesRequest_setEmail_10744979354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75267;

    public FsePaymentTrustlinesRequest_setEmail_10744979354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term75356 = new Integer(335112684);
        Double term75358 = new Double(0.45069204793711093);
        Double term75360 = new Double(0.9341364461850963);
        Long term75374 = new Long(-8463029266761149071L);
        Class<? extends Object> term75537 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term75536 = ((Class) term75537).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term75536).setAccessible(true);
        Object enum137 = ((Field) term75536).get((Object) null);
        Class<? extends Object> term75955 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term75954 = ((Class) term75955).getDeclaredField((String) "MONTHLY");
        ((Field) term75954).setAccessible(true);
        Object enum138 = ((Field) term75954).get((Object) null);
        term75267 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term75416 = newInstance(Class.forName("java.util.Date"));
        Object term75429 = newInstance(Class.forName("java.util.Date"));
        setField(term75267, term75267.getClass(), "memo", "ZKVeStsSNT");
        setField(term75267, term75267.getClass(), "fromClassicAddress", "cqCXYaAnFB");
        setField(term75267, term75267.getClass(), "fromSigningPublicKey", "UPLNFZHXjw");
        setField(term75267, term75267.getClass(), "fromPrivateKey", "CwrrJlrGmg");
        setField(term75267, term75267.getClass(), "trustlineIssuerClassicAddress", "HejzvyejjG");
        setField(term75267, term75267.getClass(), "currencyName", "pbqJjeooBM");
        setField(term75267, term75267.getClass(), "amount", "ccnotFfPXt");
        setBooleanField(term75267, term75267.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term75267, term75267.getClass(), "globalIdVerified", false);
        setBooleanField(term75267, term75267.getClass(), "useBlacklist", true);
        setBooleanField(term75267, term75267.getClass(), "agreeFee", false);
        setField(term75267, term75267.getClass(), "maximumTrustlines", term75356);
        setField(term75267, term75267.getClass(), "minBalance", term75358);
        setField(term75267, term75267.getClass(), "maxBalance", term75360);
        setField(term75267, term75267.getClass(), "maxXrpFeePerTransaction", "plWlgdgIhn");
        setField(term75267, term75267.getClass(), "retryOfId", term75374);
        setField(term75267, term75267.getClass(), "paymentType", enum137);
        setField(term75267, term75267.getClass(), "snapshotTrustlineIssuerClassicAddress", "RZaKVKWtND");
        setField(term75267, term75267.getClass(), "snapshotCurrencyName", "vXiaNiquft");
        setLongField(term75416, term75416.getClass(), "fastTime", 1546769987439L);
        setField(term75416, term75416.getClass(), "cdate", null);
        setField(term75267, term75267.getClass(), "startTime", term75416);
        setField(term75267, term75267.getClass(), "frequency", enum138);
        setLongField(term75429, term75429.getClass(), "fastTime", 1851896886282L);
        setField(term75429, term75429.getClass(), "cdate", null);
        setField(term75267, term75267.getClass(), "repeatUntilDate", term75429);
        setField(term75267, term75267.getClass(), "email", "lucCeiVnYe");
        setBooleanField(term75267, term75267.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iYwkCLMsbJ";
        callMethod(klass, "setEmail", argTypes, term75267, args);
    }

};


