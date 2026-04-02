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

public class PaymentRequestEnt_PaymentRequestEntBuilder_fromPrivateKey_71772447810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64205;

    public PaymentRequestEnt_PaymentRequestEntBuilder_fromPrivateKey_71772447810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64206 = new Long(6041374912351843923L);
        Class<? extends Object> term64557 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term64556 = ((Class) term64557).getDeclaredField((String) "COMPLETE");
        ((Field) term64556).setAccessible(true);
        Object enum118 = ((Field) term64556).get((Object) null);
        Class<? extends Object> term65063 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term65062 = ((Class) term65063).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term65062).setAccessible(true);
        Object enum119 = ((Field) term65062).get((Object) null);
        Boolean term64374 = new Boolean(false);
        Boolean term64376 = new Boolean(true);
        Integer term64378 = new Integer(292681826);
        Class<? extends Object> term65461 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term65460 = ((Class) term65461).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term65460).setAccessible(true);
        Object enum120 = ((Field) term65460).get((Object) null);
        Long term64482 = new Long(2535970782317488741L);
        Long term64496 = new Long(-5258945362776941718L);
        Boolean term64510 = new Boolean(true);
        term64205 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term64232 = newInstance(Class.forName("java.util.Date"));
        Object term64234 = newInstance(Class.forName("java.util.Date"));
        Object term64236 = newInstance(Class.forName("java.util.Date"));
        setField(term64205, term64205.getClass(), "id", term64206);
        setField(term64205, term64205.getClass(), "environment", "PGfCDJTBek");
        setField(term64205, term64205.getClass(), "populateEnvironment", "ZwjARhAtHC");
        setLongField(term64232, term64232.getClass(), "fastTime", 1374845329130L);
        setField(term64232, term64232.getClass(), "cdate", null);
        setField(term64205, term64205.getClass(), "createDate", term64232);
        setLongField(term64234, term64234.getClass(), "fastTime", 1608183479074L);
        setField(term64234, term64234.getClass(), "cdate", null);
        setField(term64205, term64205.getClass(), "updateDate", term64234);
        setLongField(term64236, term64236.getClass(), "fastTime", 1482204276107L);
        setField(term64236, term64236.getClass(), "cdate", null);
        setField(term64205, term64205.getClass(), "startTime", term64236);
        setField(term64205, term64205.getClass(), "status", enum118);
        setField(term64205, term64205.getClass(), "fromClassicAddress", "XXvscsYBWv");
        setField(term64205, term64205.getClass(), "fromSigningPublicKey", "uePedtiAfL");
        setField(term64205, term64205.getClass(), "fromPrivateKey", "AdSHvysxQB");
        setField(term64205, term64205.getClass(), "trustlineIssuerClassicAddress", "jlraKkBWFA");
        setField(term64205, term64205.getClass(), "currencyName", "mRBtFTxVdE");
        setField(term64205, term64205.getClass(), "snapshotTrustlineIssuerClassicAddress", "IVacFDAZcj");
        setField(term64205, term64205.getClass(), "snapshotCurrencyName", "EEYmuwyVDP");
        setField(term64205, term64205.getClass(), "currencyNameForProcess", "EWFbEDAVrE");
        setField(term64205, term64205.getClass(), "amount", "EMiMtYgfvr");
        setField(term64205, term64205.getClass(), "paymentType", enum119);
        setField(term64205, term64205.getClass(), "newTrustlinesOnly", term64374);
        setField(term64205, term64205.getClass(), "useBlacklist", term64376);
        setField(term64205, term64205.getClass(), "maximumTrustlines", term64378);
        setField(term64205, term64205.getClass(), "dropType", enum120);
        setField(term64205, term64205.getClass(), "lockUuid", "OyYyYYnJuF");
        setField(term64205, term64205.getClass(), "failReason", "aYLvcxZohT");
        setField(term64205, term64205.getClass(), "feesPaid", "mnHyQbMyld");
        setField(term64205, term64205.getClass(), "minBalance", "KHtaDOIcJZ");
        setField(term64205, term64205.getClass(), "maxBalance", "vgdwrCZczl");
        setField(term64205, term64205.getClass(), "maxXrpFeePerTransaction", "gKMNrpKBpu");
        setField(term64205, term64205.getClass(), "retryOfId", term64482);
        setField(term64205, term64205.getClass(), "nftIssuerAddress", "ZbHJVEqcoa");
        setField(term64205, term64205.getClass(), "nftTaxon", term64496);
        setField(term64205, term64205.getClass(), "contactEmail", "awDQVEVIKi");
        setField(term64205, term64205.getClass(), "autoApprove", term64510);
        setField(term64205, term64205.getClass(), "memo", "HJwNgUzZZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FvUCZgTXhq";
        callMethod(klass, "fromPrivateKey", argTypes, term64205, args);
    }

};


