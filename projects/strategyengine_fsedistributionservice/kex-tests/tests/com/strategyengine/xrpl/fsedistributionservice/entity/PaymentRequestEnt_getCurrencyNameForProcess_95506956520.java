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

public class PaymentRequestEnt_getCurrencyNameForProcess_95506956520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141976;

    public PaymentRequestEnt_getCurrencyNameForProcess_95506956520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term141977 = new Long(753095050088595263L);
        Class<? extends Object> term142297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term142296 = ((Class) term142297).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term142296).setAccessible(true);
        Object enum253 = ((Field) term142296).get((Object) null);
        Class<? extends Object> term142821 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term142820 = ((Class) term142821).getDeclaredField((String) "FLAT");
        ((Field) term142820).setAccessible(true);
        Object enum254 = ((Field) term142820).get((Object) null);
        Boolean term142143 = new Boolean(true);
        Boolean term142145 = new Boolean(false);
        Integer term142147 = new Integer(-1888585309);
        Class<? extends Object> term143195 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term143194 = ((Class) term143195).getDeclaredField((String) "TRUSTLINE");
        ((Field) term143194).setAccessible(true);
        Object enum255 = ((Field) term143194).get((Object) null);
        Long term142234 = new Long(3643973882575578879L);
        Long term142248 = new Long(-1750555031444556464L);
        Boolean term142262 = new Boolean(true);
        term141976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term142003 = newInstance(Class.forName("java.util.Date"));
        Object term142005 = newInstance(Class.forName("java.util.Date"));
        Object term142007 = newInstance(Class.forName("java.util.Date"));
        setField(term141976, term141976.getClass(), "id", term141977);
        setField(term141976, term141976.getClass(), "environment", "mhRVADhaKm");
        setField(term141976, term141976.getClass(), "populateEnvironment", "rLldJrTAay");
        setLongField(term142003, term142003.getClass(), "fastTime", 1417168464539L);
        setField(term142003, term142003.getClass(), "cdate", null);
        setField(term141976, term141976.getClass(), "createDate", term142003);
        setLongField(term142005, term142005.getClass(), "fastTime", 1783094578974L);
        setField(term142005, term142005.getClass(), "cdate", null);
        setField(term141976, term141976.getClass(), "updateDate", term142005);
        setLongField(term142007, term142007.getClass(), "fastTime", 1853629046308L);
        setField(term142007, term142007.getClass(), "cdate", null);
        setField(term141976, term141976.getClass(), "startTime", term142007);
        setField(term141976, term141976.getClass(), "status", enum253);
        setField(term141976, term141976.getClass(), "fromClassicAddress", "HvSKssbEES");
        setField(term141976, term141976.getClass(), "fromSigningPublicKey", "UjIAQAHhul");
        setField(term141976, term141976.getClass(), "fromPrivateKey", "oWBXOvjPUT");
        setField(term141976, term141976.getClass(), "trustlineIssuerClassicAddress", "DcKqrrTdId");
        setField(term141976, term141976.getClass(), "currencyName", "fwtOJhjXbW");
        setField(term141976, term141976.getClass(), "snapshotTrustlineIssuerClassicAddress", "ltWBKZaXwJ");
        setField(term141976, term141976.getClass(), "snapshotCurrencyName", "FSQpgxQnsH");
        setField(term141976, term141976.getClass(), "currencyNameForProcess", "LBPwnVMEpP");
        setField(term141976, term141976.getClass(), "amount", "cwALzyQVjH");
        setField(term141976, term141976.getClass(), "paymentType", enum254);
        setField(term141976, term141976.getClass(), "newTrustlinesOnly", term142143);
        setField(term141976, term141976.getClass(), "useBlacklist", term142145);
        setField(term141976, term141976.getClass(), "maximumTrustlines", term142147);
        setField(term141976, term141976.getClass(), "dropType", enum255);
        setField(term141976, term141976.getClass(), "lockUuid", "jlYNjpdkoz");
        setField(term141976, term141976.getClass(), "failReason", "DZAGnhJkeU");
        setField(term141976, term141976.getClass(), "feesPaid", "xQuVexkiVz");
        setField(term141976, term141976.getClass(), "minBalance", "LqNgPziYtv");
        setField(term141976, term141976.getClass(), "maxBalance", "wiDfuaXnrP");
        setField(term141976, term141976.getClass(), "maxXrpFeePerTransaction", "btdGZUcaZl");
        setField(term141976, term141976.getClass(), "retryOfId", term142234);
        setField(term141976, term141976.getClass(), "nftIssuerAddress", "WnEAVdCxna");
        setField(term141976, term141976.getClass(), "nftTaxon", term142248);
        setField(term141976, term141976.getClass(), "contactEmail", "lnPIxHHyEK");
        setField(term141976, term141976.getClass(), "autoApprove", term142262);
        setField(term141976, term141976.getClass(), "memo", "unvQfYuBUz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyNameForProcess", argTypes, term141976, args);
    }

};


