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

public class FsePaymentTrustlinesRequest_getFromClassicAddress_13652184697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25317;

    public FsePaymentTrustlinesRequest_getFromClassicAddress_13652184697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25406 = new Integer(865208305);
        Double term25408 = new Double(0.2852810965221698);
        Double term25410 = new Double(0.6300849762307866);
        Long term25424 = new Long(-2170847986967241072L);
        Class<? extends Object> term25575 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term25574 = ((Class) term25575).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term25574).setAccessible(true);
        Object enum43 = ((Field) term25574).get((Object) null);
        Class<? extends Object> term25993 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term25992 = ((Class) term25993).getDeclaredField((String) "MONTHLY");
        ((Field) term25992).setAccessible(true);
        Object enum44 = ((Field) term25992).get((Object) null);
        term25317 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term25466 = newInstance(Class.forName("java.util.Date"));
        Object term25479 = newInstance(Class.forName("java.util.Date"));
        setField(term25317, term25317.getClass(), "memo", "huVIXUWLtI");
        setField(term25317, term25317.getClass(), "fromClassicAddress", "vhKzFyKPOT");
        setField(term25317, term25317.getClass(), "fromSigningPublicKey", "nQhIgWXdRc");
        setField(term25317, term25317.getClass(), "fromPrivateKey", "EusenEbIoF");
        setField(term25317, term25317.getClass(), "trustlineIssuerClassicAddress", "SScVQYSvWH");
        setField(term25317, term25317.getClass(), "currencyName", "MnovcqFhCl");
        setField(term25317, term25317.getClass(), "amount", "qYtAeLzOhW");
        setBooleanField(term25317, term25317.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term25317, term25317.getClass(), "globalIdVerified", false);
        setBooleanField(term25317, term25317.getClass(), "useBlacklist", true);
        setBooleanField(term25317, term25317.getClass(), "agreeFee", false);
        setField(term25317, term25317.getClass(), "maximumTrustlines", term25406);
        setField(term25317, term25317.getClass(), "minBalance", term25408);
        setField(term25317, term25317.getClass(), "maxBalance", term25410);
        setField(term25317, term25317.getClass(), "maxXrpFeePerTransaction", "tJzmOfcUnY");
        setField(term25317, term25317.getClass(), "retryOfId", term25424);
        setField(term25317, term25317.getClass(), "paymentType", enum43);
        setField(term25317, term25317.getClass(), "snapshotTrustlineIssuerClassicAddress", "TKlccZUpjz");
        setField(term25317, term25317.getClass(), "snapshotCurrencyName", "GGzwMoHZXC");
        setLongField(term25466, term25466.getClass(), "fastTime", 1442370534632L);
        setField(term25466, term25466.getClass(), "cdate", null);
        setField(term25317, term25317.getClass(), "startTime", term25466);
        setField(term25317, term25317.getClass(), "frequency", enum44);
        setLongField(term25479, term25479.getClass(), "fastTime", 1659994192918L);
        setField(term25479, term25479.getClass(), "cdate", null);
        setField(term25317, term25317.getClass(), "repeatUntilDate", term25479);
        setField(term25317, term25317.getClass(), "email", "IpmgwHTgnG");
        setBooleanField(term25317, term25317.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term25317, args);
    }

};


