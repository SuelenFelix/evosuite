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

public class PaymentRequestEnt_PaymentRequestEntBuilder_memo_27063505033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104193;

    public PaymentRequestEnt_PaymentRequestEntBuilder_memo_27063505033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104194 = new Long(-432424084523104253L);
        Class<? extends Object> term104542 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term104541 = ((Class) term104542).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term104541).setAccessible(true);
        Object enum187 = ((Field) term104541).get((Object) null);
        Class<? extends Object> term105066 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term105065 = ((Class) term105066).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term105065).setAccessible(true);
        Object enum188 = ((Field) term105065).get((Object) null);
        Boolean term104368 = new Boolean(false);
        Boolean term104370 = new Boolean(true);
        Integer term104372 = new Integer(-478195677);
        Class<? extends Object> term105464 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term105463 = ((Class) term105464).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term105463).setAccessible(true);
        Object enum189 = ((Field) term105463).get((Object) null);
        Long term104467 = new Long(6150186973473930616L);
        Long term104481 = new Long(-3850323135468805420L);
        Boolean term104495 = new Boolean(true);
        term104193 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term104220 = newInstance(Class.forName("java.util.Date"));
        Object term104222 = newInstance(Class.forName("java.util.Date"));
        Object term104224 = newInstance(Class.forName("java.util.Date"));
        setField(term104193, term104193.getClass(), "id", term104194);
        setField(term104193, term104193.getClass(), "environment", "nBaMiSdFmS");
        setField(term104193, term104193.getClass(), "populateEnvironment", "ezwGsjqTai");
        setLongField(term104220, term104220.getClass(), "fastTime", 1389375796032L);
        setField(term104220, term104220.getClass(), "cdate", null);
        setField(term104193, term104193.getClass(), "createDate", term104220);
        setLongField(term104222, term104222.getClass(), "fastTime", 1472059591281L);
        setField(term104222, term104222.getClass(), "cdate", null);
        setField(term104193, term104193.getClass(), "updateDate", term104222);
        setLongField(term104224, term104224.getClass(), "fastTime", 1379465144272L);
        setField(term104224, term104224.getClass(), "cdate", null);
        setField(term104193, term104193.getClass(), "startTime", term104224);
        setField(term104193, term104193.getClass(), "status", enum187);
        setField(term104193, term104193.getClass(), "fromClassicAddress", "ngeHWMRjnn");
        setField(term104193, term104193.getClass(), "fromSigningPublicKey", "FOKfDXQxMM");
        setField(term104193, term104193.getClass(), "fromPrivateKey", "gbxMvhrWpA");
        setField(term104193, term104193.getClass(), "trustlineIssuerClassicAddress", "huNTIobUHx");
        setField(term104193, term104193.getClass(), "currencyName", "MrVeCmRVzF");
        setField(term104193, term104193.getClass(), "snapshotTrustlineIssuerClassicAddress", "CPVnQYACKw");
        setField(term104193, term104193.getClass(), "snapshotCurrencyName", "sbdLhVCRsw");
        setField(term104193, term104193.getClass(), "currencyNameForProcess", "soJHvZwbtF");
        setField(term104193, term104193.getClass(), "amount", "dTGwgkfDVj");
        setField(term104193, term104193.getClass(), "paymentType", enum188);
        setField(term104193, term104193.getClass(), "newTrustlinesOnly", term104368);
        setField(term104193, term104193.getClass(), "useBlacklist", term104370);
        setField(term104193, term104193.getClass(), "maximumTrustlines", term104372);
        setField(term104193, term104193.getClass(), "dropType", enum189);
        setField(term104193, term104193.getClass(), "lockUuid", "zHiuLPzYQM");
        setField(term104193, term104193.getClass(), "failReason", "ioYxUYJBrh");
        setField(term104193, term104193.getClass(), "feesPaid", "GXoLEdKEIe");
        setField(term104193, term104193.getClass(), "minBalance", "EugWXkztim");
        setField(term104193, term104193.getClass(), "maxBalance", "DvRdOzzihn");
        setField(term104193, term104193.getClass(), "maxXrpFeePerTransaction", "wIygCdQAKO");
        setField(term104193, term104193.getClass(), "retryOfId", term104467);
        setField(term104193, term104193.getClass(), "nftIssuerAddress", "JsXroBYqwr");
        setField(term104193, term104193.getClass(), "nftTaxon", term104481);
        setField(term104193, term104193.getClass(), "contactEmail", "YciMAObLwl");
        setField(term104193, term104193.getClass(), "autoApprove", term104495);
        setField(term104193, term104193.getClass(), "memo", "qAmVqwwdyf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IXPaHQnEUy";
        callMethod(klass, "memo", argTypes, term104193, args);
    }

};


