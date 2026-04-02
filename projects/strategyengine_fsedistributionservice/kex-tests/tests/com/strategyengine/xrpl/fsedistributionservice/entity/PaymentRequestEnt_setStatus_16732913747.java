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

public class PaymentRequestEnt_setStatus_16732913747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186083;
     Object enum334;

    public PaymentRequestEnt_setStatus_16732913747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term186084 = new Long(-7589547201844161961L);
        Class<? extends Object> term186415 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term186414 = ((Class) term186415).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term186414).setAccessible(true);
        Object enum331 = ((Field) term186414).get((Object) null);
        Class<? extends Object> term186939 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term186938 = ((Class) term186939).getDeclaredField((String) "FLAT");
        ((Field) term186938).setAccessible(true);
        Object enum332 = ((Field) term186938).get((Object) null);
        Boolean term186250 = new Boolean(false);
        Boolean term186252 = new Boolean(true);
        Integer term186254 = new Integer(1107176718);
        Class<? extends Object> term187313 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term187312 = ((Class) term187313).getDeclaredField((String) "GLOBALID");
        ((Field) term187312).setAccessible(true);
        Object enum333 = ((Field) term187312).get((Object) null);
        Long term186340 = new Long(8847748922379375307L);
        Long term186354 = new Long(1350676497718116574L);
        Boolean term186368 = new Boolean(false);
        term186083 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term186110 = newInstance(Class.forName("java.util.Date"));
        Object term186112 = newInstance(Class.forName("java.util.Date"));
        Object term186114 = newInstance(Class.forName("java.util.Date"));
        setField(term186083, term186083.getClass(), "id", term186084);
        setField(term186083, term186083.getClass(), "environment", "tGgCtmAQPu");
        setField(term186083, term186083.getClass(), "populateEnvironment", "HokisXXNMR");
        setLongField(term186110, term186110.getClass(), "fastTime", 1841185970410L);
        setField(term186110, term186110.getClass(), "cdate", null);
        setField(term186083, term186083.getClass(), "createDate", term186110);
        setLongField(term186112, term186112.getClass(), "fastTime", 1841243746236L);
        setField(term186112, term186112.getClass(), "cdate", null);
        setField(term186083, term186083.getClass(), "updateDate", term186112);
        setLongField(term186114, term186114.getClass(), "fastTime", 1879363930046L);
        setField(term186114, term186114.getClass(), "cdate", null);
        setField(term186083, term186083.getClass(), "startTime", term186114);
        setField(term186083, term186083.getClass(), "status", enum331);
        setField(term186083, term186083.getClass(), "fromClassicAddress", "JbtvoXZZHr");
        setField(term186083, term186083.getClass(), "fromSigningPublicKey", "eMlkqCfrnK");
        setField(term186083, term186083.getClass(), "fromPrivateKey", "HCiwohQDUV");
        setField(term186083, term186083.getClass(), "trustlineIssuerClassicAddress", "RRWTUIdKkl");
        setField(term186083, term186083.getClass(), "currencyName", "pBnfJsGPNO");
        setField(term186083, term186083.getClass(), "snapshotTrustlineIssuerClassicAddress", "hzaRTeUQpV");
        setField(term186083, term186083.getClass(), "snapshotCurrencyName", "RlIgxHiNOB");
        setField(term186083, term186083.getClass(), "currencyNameForProcess", "kSpBCSqyfl");
        setField(term186083, term186083.getClass(), "amount", "OUrtbTvuiW");
        setField(term186083, term186083.getClass(), "paymentType", enum332);
        setField(term186083, term186083.getClass(), "newTrustlinesOnly", term186250);
        setField(term186083, term186083.getClass(), "useBlacklist", term186252);
        setField(term186083, term186083.getClass(), "maximumTrustlines", term186254);
        setField(term186083, term186083.getClass(), "dropType", enum333);
        setField(term186083, term186083.getClass(), "lockUuid", "UnkpYLSsCR");
        setField(term186083, term186083.getClass(), "failReason", "AaxnITALtd");
        setField(term186083, term186083.getClass(), "feesPaid", "RdnRRpWglh");
        setField(term186083, term186083.getClass(), "minBalance", "YcXTXuOFYV");
        setField(term186083, term186083.getClass(), "maxBalance", "HGhIlMCaKM");
        setField(term186083, term186083.getClass(), "maxXrpFeePerTransaction", "pPxivEPfHY");
        setField(term186083, term186083.getClass(), "retryOfId", term186340);
        setField(term186083, term186083.getClass(), "nftIssuerAddress", "BiitfiJmRW");
        setField(term186083, term186083.getClass(), "nftTaxon", term186354);
        setField(term186083, term186083.getClass(), "contactEmail", "ILHarzuGbn");
        setField(term186083, term186083.getClass(), "autoApprove", term186368);
        setField(term186083, term186083.getClass(), "memo", "uNGHHAwCFL");
        Class<? extends Object> term187774 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term187773 = ((Class) term187774).getDeclaredField((String) "REJECTED");
        ((Field) term187773).setAccessible(true);
        enum334 = ((Field) term187773).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Object[] args = new Object[1];
        args[0] = enum334;
        callMethod(klass, "setStatus", argTypes, term186083, args);
    }

};


