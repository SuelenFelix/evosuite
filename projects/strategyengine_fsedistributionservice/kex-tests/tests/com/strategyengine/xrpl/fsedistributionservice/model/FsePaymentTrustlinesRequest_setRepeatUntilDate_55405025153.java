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

public class FsePaymentTrustlinesRequest_setRepeatUntilDate_55405025153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74187;
     Object term74364;

    public FsePaymentTrustlinesRequest_setRepeatUntilDate_55405025153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term74276 = new Integer(1265463001);
        Double term74278 = new Double(0.34010089048558567);
        Double term74280 = new Double(0.19625398866403143);
        Long term74294 = new Long(-2177368829816872572L);
        Class<? extends Object> term74447 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term74446 = ((Class) term74447).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term74446).setAccessible(true);
        Object enum135 = ((Field) term74446).get((Object) null);
        Class<? extends Object> term74865 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term74864 = ((Class) term74865).getDeclaredField((String) "MONTHLY");
        ((Field) term74864).setAccessible(true);
        Object enum136 = ((Field) term74864).get((Object) null);
        term74187 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term74336 = newInstance(Class.forName("java.util.Date"));
        Object term74349 = newInstance(Class.forName("java.util.Date"));
        setField(term74187, term74187.getClass(), "memo", "dirFuhqyNu");
        setField(term74187, term74187.getClass(), "fromClassicAddress", "YVLRenzuoR");
        setField(term74187, term74187.getClass(), "fromSigningPublicKey", "JukEMhPWql");
        setField(term74187, term74187.getClass(), "fromPrivateKey", "ZdNcodHERG");
        setField(term74187, term74187.getClass(), "trustlineIssuerClassicAddress", "CLHomjAqIM");
        setField(term74187, term74187.getClass(), "currencyName", "mzCFLzFuSj");
        setField(term74187, term74187.getClass(), "amount", "WQnMpDlSfA");
        setBooleanField(term74187, term74187.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term74187, term74187.getClass(), "globalIdVerified", true);
        setBooleanField(term74187, term74187.getClass(), "useBlacklist", true);
        setBooleanField(term74187, term74187.getClass(), "agreeFee", true);
        setField(term74187, term74187.getClass(), "maximumTrustlines", term74276);
        setField(term74187, term74187.getClass(), "minBalance", term74278);
        setField(term74187, term74187.getClass(), "maxBalance", term74280);
        setField(term74187, term74187.getClass(), "maxXrpFeePerTransaction", "aOIvTQtXiv");
        setField(term74187, term74187.getClass(), "retryOfId", term74294);
        setField(term74187, term74187.getClass(), "paymentType", enum135);
        setField(term74187, term74187.getClass(), "snapshotTrustlineIssuerClassicAddress", "IyjDiknqhA");
        setField(term74187, term74187.getClass(), "snapshotCurrencyName", "IHsXSAFYKi");
        setLongField(term74336, term74336.getClass(), "fastTime", 1299431078379L);
        setField(term74336, term74336.getClass(), "cdate", null);
        setField(term74187, term74187.getClass(), "startTime", term74336);
        setField(term74187, term74187.getClass(), "frequency", enum136);
        setLongField(term74349, term74349.getClass(), "fastTime", 1476970157231L);
        setField(term74349, term74349.getClass(), "cdate", null);
        setField(term74187, term74187.getClass(), "repeatUntilDate", term74349);
        setField(term74187, term74187.getClass(), "email", "KyGbLglqbW");
        setBooleanField(term74187, term74187.getClass(), "autoApprove", false);
        term74364 = newInstance(Class.forName("java.util.Date"));
        setLongField(term74364, term74364.getClass(), "fastTime", 1386180897453L);
        setField(term74364, term74364.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term74364;
        callMethod(klass, "setRepeatUntilDate", argTypes, term74187, args);
    }

};


