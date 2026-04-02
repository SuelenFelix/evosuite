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

public class PaymentRequestEnt_PaymentRequestEntBuilder_dropType_134451372021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83199;
     Object enum153;

    public PaymentRequestEnt_PaymentRequestEntBuilder_dropType_134451372021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term83200 = new Long(768144790810175653L);
        Class<? extends Object> term83536 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term83535 = ((Class) term83536).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term83535).setAccessible(true);
        Object enum151 = ((Field) term83535).get((Object) null);
        Class<? extends Object> term84060 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term84059 = ((Class) term84060).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term84059).setAccessible(true);
        Object enum152 = ((Field) term84059).get((Object) null);
        Boolean term83374 = new Boolean(true);
        Boolean term83376 = new Boolean(true);
        Integer term83378 = new Integer(-93135961);
        Class<? extends Object> term84458 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term84457 = ((Class) term84458).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term84457).setAccessible(true);
        enum153 = ((Field) term84457).get((Object) null);
        Long term83473 = new Long(-1497280900081695731L);
        Long term83487 = new Long(-3602825674339018793L);
        Boolean term83501 = new Boolean(false);
        term83199 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term83226 = newInstance(Class.forName("java.util.Date"));
        Object term83228 = newInstance(Class.forName("java.util.Date"));
        Object term83230 = newInstance(Class.forName("java.util.Date"));
        setField(term83199, term83199.getClass(), "id", term83200);
        setField(term83199, term83199.getClass(), "environment", "HqitWglYWX");
        setField(term83199, term83199.getClass(), "populateEnvironment", "pOuFRlHmbK");
        setLongField(term83226, term83226.getClass(), "fastTime", 1305204769767L);
        setField(term83226, term83226.getClass(), "cdate", null);
        setField(term83199, term83199.getClass(), "createDate", term83226);
        setLongField(term83228, term83228.getClass(), "fastTime", 1387754061454L);
        setField(term83228, term83228.getClass(), "cdate", null);
        setField(term83199, term83199.getClass(), "updateDate", term83228);
        setLongField(term83230, term83230.getClass(), "fastTime", 1368680124141L);
        setField(term83230, term83230.getClass(), "cdate", null);
        setField(term83199, term83199.getClass(), "startTime", term83230);
        setField(term83199, term83199.getClass(), "status", enum151);
        setField(term83199, term83199.getClass(), "fromClassicAddress", "WrzdBkinqV");
        setField(term83199, term83199.getClass(), "fromSigningPublicKey", "vydWXHfFTw");
        setField(term83199, term83199.getClass(), "fromPrivateKey", "DRhkpDneCC");
        setField(term83199, term83199.getClass(), "trustlineIssuerClassicAddress", "vuIJRrypuA");
        setField(term83199, term83199.getClass(), "currencyName", "AxfSZmaiyA");
        setField(term83199, term83199.getClass(), "snapshotTrustlineIssuerClassicAddress", "lBpveIKbea");
        setField(term83199, term83199.getClass(), "snapshotCurrencyName", "uyLBVQYcOV");
        setField(term83199, term83199.getClass(), "currencyNameForProcess", "PoTZjDuBHa");
        setField(term83199, term83199.getClass(), "amount", "MIwvgVrhzP");
        setField(term83199, term83199.getClass(), "paymentType", enum152);
        setField(term83199, term83199.getClass(), "newTrustlinesOnly", term83374);
        setField(term83199, term83199.getClass(), "useBlacklist", term83376);
        setField(term83199, term83199.getClass(), "maximumTrustlines", term83378);
        setField(term83199, term83199.getClass(), "dropType", enum153);
        setField(term83199, term83199.getClass(), "lockUuid", "HcUUieXdep");
        setField(term83199, term83199.getClass(), "failReason", "AbonCTtbef");
        setField(term83199, term83199.getClass(), "feesPaid", "maXrGOGoKA");
        setField(term83199, term83199.getClass(), "minBalance", "zAkgWQVCpM");
        setField(term83199, term83199.getClass(), "maxBalance", "yQUDyOroXU");
        setField(term83199, term83199.getClass(), "maxXrpFeePerTransaction", "xweqkPdyJH");
        setField(term83199, term83199.getClass(), "retryOfId", term83473);
        setField(term83199, term83199.getClass(), "nftIssuerAddress", "kwteHWzwcc");
        setField(term83199, term83199.getClass(), "nftTaxon", term83487);
        setField(term83199, term83199.getClass(), "contactEmail", "uMsWXqNhln");
        setField(term83199, term83199.getClass(), "autoApprove", term83501);
        setField(term83199, term83199.getClass(), "memo", "MAnhIPOtHL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = enum153;
        callMethod(klass, "dropType", argTypes, term83199, args);
    }

};


