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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_setAutoApprove_134309699855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76367;
     Object term76535;

    public FsePaymentTrustlinesRequest_setAutoApprove_134309699855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term76456 = new Integer(1551099402);
        Double term76458 = new Double(0.9022041121474429);
        Double term76460 = new Double(0.6512870939318848);
        Long term76474 = new Long(3133860696238261492L);
        Class<? extends Object> term76618 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term76617 = ((Class) term76618).getDeclaredField((String) "FLAT");
        ((Field) term76617).setAccessible(true);
        Object enum139 = ((Field) term76617).get((Object) null);
        Class<? extends Object> term77012 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term77011 = ((Class) term77012).getDeclaredField((String) "WEEKLY");
        ((Field) term77011).setAccessible(true);
        Object enum140 = ((Field) term77011).get((Object) null);
        term76367 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term76508 = newInstance(Class.forName("java.util.Date"));
        Object term76520 = newInstance(Class.forName("java.util.Date"));
        setField(term76367, term76367.getClass(), "memo", "MXLsVQWrwc");
        setField(term76367, term76367.getClass(), "fromClassicAddress", "lRaSlqzqNY");
        setField(term76367, term76367.getClass(), "fromSigningPublicKey", "TiEyxWXsra");
        setField(term76367, term76367.getClass(), "fromPrivateKey", "TuLgwTZsPP");
        setField(term76367, term76367.getClass(), "trustlineIssuerClassicAddress", "KoasxTJGpx");
        setField(term76367, term76367.getClass(), "currencyName", "ceGeARYMoa");
        setField(term76367, term76367.getClass(), "amount", "fFWllaiFvh");
        setBooleanField(term76367, term76367.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term76367, term76367.getClass(), "globalIdVerified", false);
        setBooleanField(term76367, term76367.getClass(), "useBlacklist", true);
        setBooleanField(term76367, term76367.getClass(), "agreeFee", true);
        setField(term76367, term76367.getClass(), "maximumTrustlines", term76456);
        setField(term76367, term76367.getClass(), "minBalance", term76458);
        setField(term76367, term76367.getClass(), "maxBalance", term76460);
        setField(term76367, term76367.getClass(), "maxXrpFeePerTransaction", "PFTdEDSbvZ");
        setField(term76367, term76367.getClass(), "retryOfId", term76474);
        setField(term76367, term76367.getClass(), "paymentType", enum139);
        setField(term76367, term76367.getClass(), "snapshotTrustlineIssuerClassicAddress", "TbiwoiebNe");
        setField(term76367, term76367.getClass(), "snapshotCurrencyName", "laTITSWZuc");
        setLongField(term76508, term76508.getClass(), "fastTime", 1831742729790L);
        setField(term76508, term76508.getClass(), "cdate", null);
        setField(term76367, term76367.getClass(), "startTime", term76508);
        setField(term76367, term76367.getClass(), "frequency", enum140);
        setLongField(term76520, term76520.getClass(), "fastTime", 1673375951909L);
        setField(term76520, term76520.getClass(), "cdate", null);
        setField(term76367, term76367.getClass(), "repeatUntilDate", term76520);
        setField(term76367, term76367.getClass(), "email", "fkzRpxlAqS");
        setBooleanField(term76367, term76367.getClass(), "autoApprove", false);
        term76535 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76535;
        callMethod(klass, "setAutoApprove", argTypes, term76367, args);
    }

};


