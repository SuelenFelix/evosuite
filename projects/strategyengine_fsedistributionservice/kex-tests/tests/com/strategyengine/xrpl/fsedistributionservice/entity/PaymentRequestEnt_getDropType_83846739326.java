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

public class PaymentRequestEnt_getDropType_83846739326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152080;

    public PaymentRequestEnt_getDropType_83846739326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152081 = new Long(7711054832353934171L);
        Class<? extends Object> term152396 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term152395 = ((Class) term152396).getDeclaredField((String) "SCHEDULED");
        ((Field) term152395).setAccessible(true);
        Object enum271 = ((Field) term152395).get((Object) null);
        Class<? extends Object> term152905 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term152904 = ((Class) term152905).getDeclaredField((String) "FLAT");
        ((Field) term152904).setAccessible(true);
        Object enum272 = ((Field) term152904).get((Object) null);
        Boolean term152242 = new Boolean(false);
        Boolean term152244 = new Boolean(true);
        Integer term152246 = new Integer(339854490);
        Class<? extends Object> term153279 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term153278 = ((Class) term153279).getDeclaredField((String) "TRUSTLINE");
        ((Field) term153278).setAccessible(true);
        Object enum273 = ((Field) term153278).get((Object) null);
        Long term152333 = new Long(185544001230120339L);
        Long term152347 = new Long(4096288569907305445L);
        Boolean term152361 = new Boolean(true);
        term152080 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term152107 = newInstance(Class.forName("java.util.Date"));
        Object term152109 = newInstance(Class.forName("java.util.Date"));
        Object term152111 = newInstance(Class.forName("java.util.Date"));
        setField(term152080, term152080.getClass(), "id", term152081);
        setField(term152080, term152080.getClass(), "environment", "eCxWMOpomA");
        setField(term152080, term152080.getClass(), "populateEnvironment", "pkQawlBtEF");
        setLongField(term152107, term152107.getClass(), "fastTime", 1390002174929L);
        setField(term152107, term152107.getClass(), "cdate", null);
        setField(term152080, term152080.getClass(), "createDate", term152107);
        setLongField(term152109, term152109.getClass(), "fastTime", 1577603441473L);
        setField(term152109, term152109.getClass(), "cdate", null);
        setField(term152080, term152080.getClass(), "updateDate", term152109);
        setLongField(term152111, term152111.getClass(), "fastTime", 1387636078975L);
        setField(term152111, term152111.getClass(), "cdate", null);
        setField(term152080, term152080.getClass(), "startTime", term152111);
        setField(term152080, term152080.getClass(), "status", enum271);
        setField(term152080, term152080.getClass(), "fromClassicAddress", "rdKTcvHHnV");
        setField(term152080, term152080.getClass(), "fromSigningPublicKey", "ELfUfLbXZf");
        setField(term152080, term152080.getClass(), "fromPrivateKey", "SAglaHkagn");
        setField(term152080, term152080.getClass(), "trustlineIssuerClassicAddress", "eZGxUfdoFn");
        setField(term152080, term152080.getClass(), "currencyName", "yCWSlaOrSv");
        setField(term152080, term152080.getClass(), "snapshotTrustlineIssuerClassicAddress", "PFpWKxDIRz");
        setField(term152080, term152080.getClass(), "snapshotCurrencyName", "qePuOCwoCf");
        setField(term152080, term152080.getClass(), "currencyNameForProcess", "vJPujDInGq");
        setField(term152080, term152080.getClass(), "amount", "cHZGcMhatT");
        setField(term152080, term152080.getClass(), "paymentType", enum272);
        setField(term152080, term152080.getClass(), "newTrustlinesOnly", term152242);
        setField(term152080, term152080.getClass(), "useBlacklist", term152244);
        setField(term152080, term152080.getClass(), "maximumTrustlines", term152246);
        setField(term152080, term152080.getClass(), "dropType", enum273);
        setField(term152080, term152080.getClass(), "lockUuid", "OZGyrUPedG");
        setField(term152080, term152080.getClass(), "failReason", "GAxMzRqmXU");
        setField(term152080, term152080.getClass(), "feesPaid", "XMhUDGKSWO");
        setField(term152080, term152080.getClass(), "minBalance", "jLgzxtuvVo");
        setField(term152080, term152080.getClass(), "maxBalance", "wmmxjOkPnH");
        setField(term152080, term152080.getClass(), "maxXrpFeePerTransaction", "jgRohUQWxJ");
        setField(term152080, term152080.getClass(), "retryOfId", term152333);
        setField(term152080, term152080.getClass(), "nftIssuerAddress", "CJlAiZDIQO");
        setField(term152080, term152080.getClass(), "nftTaxon", term152347);
        setField(term152080, term152080.getClass(), "contactEmail", "osgWaTBVoE");
        setField(term152080, term152080.getClass(), "autoApprove", term152361);
        setField(term152080, term152080.getClass(), "memo", "mvkMYcgAod");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropType", argTypes, term152080, args);
    }

};


