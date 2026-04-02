package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_setCurrencyName_170765444952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195129;

    public PaymentRequestEnt_setCurrencyName_170765444952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term195130 = new Long(349726685019432833L);
        Class<? extends Object> term195484 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term195483 = ((Class) term195484).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term195483).setAccessible(true);
        Object enum347 = ((Field) term195483).get((Object) null);
        Class<? extends Object> term195999 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term195998 = ((Class) term195999).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term195998).setAccessible(true);
        Object enum348 = ((Field) term195998).get((Object) null);
        Boolean term195301 = new Boolean(true);
        Boolean term195303 = new Boolean(false);
        Integer term195305 = new Integer(96566506);
        Class<? extends Object> term196397 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term196396 = ((Class) term196397).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term196396).setAccessible(true);
        Object enum349 = ((Field) term196396).get((Object) null);
        Long term195409 = new Long(5047215164896153648L);
        Long term195423 = new Long(6695041041196724237L);
        Boolean term195437 = new Boolean(true);
        term195129 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term195156 = newInstance(Class.forName("java.util.Date"));
        Object term195158 = newInstance(Class.forName("java.util.Date"));
        Object term195160 = newInstance(Class.forName("java.util.Date"));
        setField(term195129, term195129.getClass(), "id", term195130);
        setField(term195129, term195129.getClass(), "environment", "siRXAywvyp");
        setField(term195129, term195129.getClass(), "populateEnvironment", "ZRLaReQeFg");
        setLongField(term195156, term195156.getClass(), "fastTime", 1499782291546L);
        setField(term195156, term195156.getClass(), "cdate", null);
        setField(term195129, term195129.getClass(), "createDate", term195156);
        setLongField(term195158, term195158.getClass(), "fastTime", 1641291124664L);
        setField(term195158, term195158.getClass(), "cdate", null);
        setField(term195129, term195129.getClass(), "updateDate", term195158);
        setLongField(term195160, term195160.getClass(), "fastTime", 1856368913597L);
        setField(term195160, term195160.getClass(), "cdate", null);
        setField(term195129, term195129.getClass(), "startTime", term195160);
        setField(term195129, term195129.getClass(), "status", enum347);
        setField(term195129, term195129.getClass(), "fromClassicAddress", "cOcXspUxKR");
        setField(term195129, term195129.getClass(), "fromSigningPublicKey", "JNzgWUmqtl");
        setField(term195129, term195129.getClass(), "fromPrivateKey", "UxVfWaXiSr");
        setField(term195129, term195129.getClass(), "trustlineIssuerClassicAddress", "yTrvklotrs");
        setField(term195129, term195129.getClass(), "currencyName", "kNkFIdfwqs");
        setField(term195129, term195129.getClass(), "snapshotTrustlineIssuerClassicAddress", "sHLdqoTjnP");
        setField(term195129, term195129.getClass(), "snapshotCurrencyName", "UakuVGzEav");
        setField(term195129, term195129.getClass(), "currencyNameForProcess", "DxiwTTouEo");
        setField(term195129, term195129.getClass(), "amount", "ghoklPMuMt");
        setField(term195129, term195129.getClass(), "paymentType", enum348);
        setField(term195129, term195129.getClass(), "newTrustlinesOnly", term195301);
        setField(term195129, term195129.getClass(), "useBlacklist", term195303);
        setField(term195129, term195129.getClass(), "maximumTrustlines", term195305);
        setField(term195129, term195129.getClass(), "dropType", enum349);
        setField(term195129, term195129.getClass(), "lockUuid", "uAgfQbLPeZ");
        setField(term195129, term195129.getClass(), "failReason", "aZiFZfzhQT");
        setField(term195129, term195129.getClass(), "feesPaid", "HbzAbCwWRh");
        setField(term195129, term195129.getClass(), "minBalance", "yBgWgFtVxP");
        setField(term195129, term195129.getClass(), "maxBalance", "NAwiEDVBcB");
        setField(term195129, term195129.getClass(), "maxXrpFeePerTransaction", "jxuVQHHLqy");
        setField(term195129, term195129.getClass(), "retryOfId", term195409);
        setField(term195129, term195129.getClass(), "nftIssuerAddress", "TnUXNtKOns");
        setField(term195129, term195129.getClass(), "nftTaxon", term195423);
        setField(term195129, term195129.getClass(), "contactEmail", "umsYdaPflb");
        setField(term195129, term195129.getClass(), "autoApprove", term195437);
        setField(term195129, term195129.getClass(), "memo", "CnNmpSyiBE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JvKKIGdUWh";
        callMethod(klass, "setCurrencyName", argTypes, term195129, args);
    }

};


