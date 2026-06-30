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

public class FsePaymentTrustlinesRequest_getRepeatUntilDate_76682124527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46681;

    public FsePaymentTrustlinesRequest_getRepeatUntilDate_76682124527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term46770 = new Integer(-1968847291);
        Double term46772 = new Double(0.0022646783892913414);
        Double term46774 = new Double(0.36226058076369927);
        Long term46788 = new Long(414749984815662075L);
        Class<? extends Object> term46939 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term46938 = ((Class) term46939).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term46938).setAccessible(true);
        Object enum83 = ((Field) term46938).get((Object) null);
        Class<? extends Object> term47357 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term47356 = ((Class) term47357).getDeclaredField((String) "MONTHLY");
        ((Field) term47356).setAccessible(true);
        Object enum84 = ((Field) term47356).get((Object) null);
        term46681 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term46830 = newInstance(Class.forName("java.util.Date"));
        Object term46843 = newInstance(Class.forName("java.util.Date"));
        setField(term46681, term46681.getClass(), "memo", "PsMKIIEwdR");
        setField(term46681, term46681.getClass(), "fromClassicAddress", "RbQmXqfXAT");
        setField(term46681, term46681.getClass(), "fromSigningPublicKey", "fcCAsvfBbe");
        setField(term46681, term46681.getClass(), "fromPrivateKey", "mUNcKUxghj");
        setField(term46681, term46681.getClass(), "trustlineIssuerClassicAddress", "lnvLKbtveE");
        setField(term46681, term46681.getClass(), "currencyName", "FfrrEhTHzQ");
        setField(term46681, term46681.getClass(), "amount", "LXnDNrMsqT");
        setBooleanField(term46681, term46681.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term46681, term46681.getClass(), "globalIdVerified", true);
        setBooleanField(term46681, term46681.getClass(), "useBlacklist", false);
        setBooleanField(term46681, term46681.getClass(), "agreeFee", false);
        setField(term46681, term46681.getClass(), "maximumTrustlines", term46770);
        setField(term46681, term46681.getClass(), "minBalance", term46772);
        setField(term46681, term46681.getClass(), "maxBalance", term46774);
        setField(term46681, term46681.getClass(), "maxXrpFeePerTransaction", "ZLQamJFBmu");
        setField(term46681, term46681.getClass(), "retryOfId", term46788);
        setField(term46681, term46681.getClass(), "paymentType", enum83);
        setField(term46681, term46681.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZWcOCwKNvd");
        setField(term46681, term46681.getClass(), "snapshotCurrencyName", "GTmoNrziyc");
        setLongField(term46830, term46830.getClass(), "fastTime", 1263744156294L);
        setField(term46830, term46830.getClass(), "cdate", null);
        setField(term46681, term46681.getClass(), "startTime", term46830);
        setField(term46681, term46681.getClass(), "frequency", enum84);
        setLongField(term46843, term46843.getClass(), "fastTime", 1490956290070L);
        setField(term46843, term46843.getClass(), "cdate", null);
        setField(term46681, term46681.getClass(), "repeatUntilDate", term46843);
        setField(term46681, term46681.getClass(), "email", "LvztehSlhM");
        setBooleanField(term46681, term46681.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepeatUntilDate", argTypes, term46681, args);
    }

};


