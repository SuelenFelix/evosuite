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

public class PaymentRequestEnt_PaymentRequestEntBuilder_populateEnvironment_10444998773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52035;

    public PaymentRequestEnt_PaymentRequestEntBuilder_populateEnvironment_10444998773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52036 = new Long(8708846223293804408L);
        Class<? extends Object> term52362 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term52361 = ((Class) term52362).getDeclaredField((String) "SCHEDULED");
        ((Field) term52361).setAccessible(true);
        Object enum97 = ((Field) term52361).get((Object) null);
        Class<? extends Object> term52871 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term52870 = ((Class) term52871).getDeclaredField((String) "FLAT");
        ((Field) term52870).setAccessible(true);
        Object enum98 = ((Field) term52870).get((Object) null);
        Boolean term52197 = new Boolean(true);
        Boolean term52199 = new Boolean(true);
        Integer term52201 = new Integer(579005622);
        Class<? extends Object> term53245 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term53244 = ((Class) term53245).getDeclaredField((String) "GLOBALID");
        ((Field) term53244).setAccessible(true);
        Object enum99 = ((Field) term53244).get((Object) null);
        Long term52287 = new Long(-2986201902216133814L);
        Long term52301 = new Long(4255811647459029682L);
        Boolean term52315 = new Boolean(false);
        term52035 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term52062 = newInstance(Class.forName("java.util.Date"));
        Object term52064 = newInstance(Class.forName("java.util.Date"));
        Object term52066 = newInstance(Class.forName("java.util.Date"));
        setField(term52035, term52035.getClass(), "id", term52036);
        setField(term52035, term52035.getClass(), "environment", "OGQsfjmReM");
        setField(term52035, term52035.getClass(), "populateEnvironment", "YsUtbngnRO");
        setLongField(term52062, term52062.getClass(), "fastTime", 1619398774189L);
        setField(term52062, term52062.getClass(), "cdate", null);
        setField(term52035, term52035.getClass(), "createDate", term52062);
        setLongField(term52064, term52064.getClass(), "fastTime", 1665119808787L);
        setField(term52064, term52064.getClass(), "cdate", null);
        setField(term52035, term52035.getClass(), "updateDate", term52064);
        setLongField(term52066, term52066.getClass(), "fastTime", 1379077835909L);
        setField(term52066, term52066.getClass(), "cdate", null);
        setField(term52035, term52035.getClass(), "startTime", term52066);
        setField(term52035, term52035.getClass(), "status", enum97);
        setField(term52035, term52035.getClass(), "fromClassicAddress", "JisaWUxcNb");
        setField(term52035, term52035.getClass(), "fromSigningPublicKey", "NxgmYPzWCI");
        setField(term52035, term52035.getClass(), "fromPrivateKey", "SqjyKmayBx");
        setField(term52035, term52035.getClass(), "trustlineIssuerClassicAddress", "XjDhvToxJy");
        setField(term52035, term52035.getClass(), "currencyName", "nxSTJflLQy");
        setField(term52035, term52035.getClass(), "snapshotTrustlineIssuerClassicAddress", "FlHzxEfFzI");
        setField(term52035, term52035.getClass(), "snapshotCurrencyName", "aSATgQUpoe");
        setField(term52035, term52035.getClass(), "currencyNameForProcess", "VkPSXewZfB");
        setField(term52035, term52035.getClass(), "amount", "ubodzJoMGW");
        setField(term52035, term52035.getClass(), "paymentType", enum98);
        setField(term52035, term52035.getClass(), "newTrustlinesOnly", term52197);
        setField(term52035, term52035.getClass(), "useBlacklist", term52199);
        setField(term52035, term52035.getClass(), "maximumTrustlines", term52201);
        setField(term52035, term52035.getClass(), "dropType", enum99);
        setField(term52035, term52035.getClass(), "lockUuid", "weddIktxOA");
        setField(term52035, term52035.getClass(), "failReason", "uSlMeISsDD");
        setField(term52035, term52035.getClass(), "feesPaid", "WdCiTDUKqn");
        setField(term52035, term52035.getClass(), "minBalance", "PSizQDoxxe");
        setField(term52035, term52035.getClass(), "maxBalance", "mKaHyMybrK");
        setField(term52035, term52035.getClass(), "maxXrpFeePerTransaction", "AyrEXuGrEj");
        setField(term52035, term52035.getClass(), "retryOfId", term52287);
        setField(term52035, term52035.getClass(), "nftIssuerAddress", "yevIIoVYHq");
        setField(term52035, term52035.getClass(), "nftTaxon", term52301);
        setField(term52035, term52035.getClass(), "contactEmail", "UuYWMTqWTV");
        setField(term52035, term52035.getClass(), "autoApprove", term52315);
        setField(term52035, term52035.getClass(), "memo", "DSFGlcaXUb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sHMXNUzNeM";
        callMethod(klass, "populateEnvironment", argTypes, term52035, args);
    }

};


