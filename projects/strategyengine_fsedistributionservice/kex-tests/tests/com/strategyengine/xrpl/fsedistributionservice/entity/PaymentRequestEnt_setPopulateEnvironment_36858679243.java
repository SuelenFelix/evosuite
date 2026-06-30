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

public class PaymentRequestEnt_setPopulateEnvironment_36858679243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179231;

    public PaymentRequestEnt_setPopulateEnvironment_36858679243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179232 = new Long(4354242424632479389L);
        Class<? extends Object> term179564 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term179563 = ((Class) term179564).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term179563).setAccessible(true);
        Object enum319 = ((Field) term179563).get((Object) null);
        Class<? extends Object> term180088 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term180087 = ((Class) term180088).getDeclaredField((String) "FLAT");
        ((Field) term180087).setAccessible(true);
        Object enum320 = ((Field) term180087).get((Object) null);
        Boolean term179398 = new Boolean(true);
        Boolean term179400 = new Boolean(true);
        Integer term179402 = new Integer(1474524152);
        Class<? extends Object> term180462 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term180461 = ((Class) term180462).getDeclaredField((String) "TRUSTLINE");
        ((Field) term180461).setAccessible(true);
        Object enum321 = ((Field) term180461).get((Object) null);
        Long term179489 = new Long(-4146453776626172590L);
        Long term179503 = new Long(-5876259280451647338L);
        Boolean term179517 = new Boolean(false);
        term179231 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term179258 = newInstance(Class.forName("java.util.Date"));
        Object term179260 = newInstance(Class.forName("java.util.Date"));
        Object term179262 = newInstance(Class.forName("java.util.Date"));
        setField(term179231, term179231.getClass(), "id", term179232);
        setField(term179231, term179231.getClass(), "environment", "jUkXaNkoAg");
        setField(term179231, term179231.getClass(), "populateEnvironment", "mZsPsRzyhQ");
        setLongField(term179258, term179258.getClass(), "fastTime", 1612499514810L);
        setField(term179258, term179258.getClass(), "cdate", null);
        setField(term179231, term179231.getClass(), "createDate", term179258);
        setLongField(term179260, term179260.getClass(), "fastTime", 1518509835152L);
        setField(term179260, term179260.getClass(), "cdate", null);
        setField(term179231, term179231.getClass(), "updateDate", term179260);
        setLongField(term179262, term179262.getClass(), "fastTime", 1502165750304L);
        setField(term179262, term179262.getClass(), "cdate", null);
        setField(term179231, term179231.getClass(), "startTime", term179262);
        setField(term179231, term179231.getClass(), "status", enum319);
        setField(term179231, term179231.getClass(), "fromClassicAddress", "IExlbTemvJ");
        setField(term179231, term179231.getClass(), "fromSigningPublicKey", "zaljyXXCoy");
        setField(term179231, term179231.getClass(), "fromPrivateKey", "dKoYnXLGEI");
        setField(term179231, term179231.getClass(), "trustlineIssuerClassicAddress", "MQvSpklpkB");
        setField(term179231, term179231.getClass(), "currencyName", "SbTxRdDQQc");
        setField(term179231, term179231.getClass(), "snapshotTrustlineIssuerClassicAddress", "MrVdoUYAdO");
        setField(term179231, term179231.getClass(), "snapshotCurrencyName", "schPUnVfDW");
        setField(term179231, term179231.getClass(), "currencyNameForProcess", "CpdMEgjUka");
        setField(term179231, term179231.getClass(), "amount", "WRisHdgnmm");
        setField(term179231, term179231.getClass(), "paymentType", enum320);
        setField(term179231, term179231.getClass(), "newTrustlinesOnly", term179398);
        setField(term179231, term179231.getClass(), "useBlacklist", term179400);
        setField(term179231, term179231.getClass(), "maximumTrustlines", term179402);
        setField(term179231, term179231.getClass(), "dropType", enum321);
        setField(term179231, term179231.getClass(), "lockUuid", "XxZiwWPLOx");
        setField(term179231, term179231.getClass(), "failReason", "nyqsjMHTba");
        setField(term179231, term179231.getClass(), "feesPaid", "ylUHzURWyg");
        setField(term179231, term179231.getClass(), "minBalance", "VuAuFBlHxQ");
        setField(term179231, term179231.getClass(), "maxBalance", "nOLtCslMMH");
        setField(term179231, term179231.getClass(), "maxXrpFeePerTransaction", "dIQWOeKQVj");
        setField(term179231, term179231.getClass(), "retryOfId", term179489);
        setField(term179231, term179231.getClass(), "nftIssuerAddress", "tHiDGaNXAL");
        setField(term179231, term179231.getClass(), "nftTaxon", term179503);
        setField(term179231, term179231.getClass(), "contactEmail", "VsizBWhPWL");
        setField(term179231, term179231.getClass(), "autoApprove", term179517);
        setField(term179231, term179231.getClass(), "memo", "jAFSxnVMcD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BuNQAVaNCe";
        callMethod(klass, "setPopulateEnvironment", argTypes, term179231, args);
    }

};


