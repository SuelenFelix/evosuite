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

public class PaymentRequestEnt_setFeesPaid_104190782064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216328;

    public PaymentRequestEnt_setFeesPaid_104190782064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term216329 = new Long(-8842842172497711872L);
        Class<? extends Object> term216667 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term216666 = ((Class) term216667).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term216666).setAccessible(true);
        Object enum384 = ((Field) term216666).get((Object) null);
        Class<? extends Object> term217209 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term217208 = ((Class) term217209).getDeclaredField((String) "FLAT");
        ((Field) term217208).setAccessible(true);
        Object enum385 = ((Field) term217208).get((Object) null);
        Boolean term216501 = new Boolean(false);
        Boolean term216503 = new Boolean(false);
        Integer term216505 = new Integer(-25637976);
        Class<? extends Object> term217583 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term217582 = ((Class) term217583).getDeclaredField((String) "TRUSTLINE");
        ((Field) term217582).setAccessible(true);
        Object enum386 = ((Field) term217582).get((Object) null);
        Long term216592 = new Long(-5367775625638780650L);
        Long term216606 = new Long(-7830820957252387854L);
        Boolean term216620 = new Boolean(false);
        term216328 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term216355 = newInstance(Class.forName("java.util.Date"));
        Object term216357 = newInstance(Class.forName("java.util.Date"));
        Object term216359 = newInstance(Class.forName("java.util.Date"));
        setField(term216328, term216328.getClass(), "id", term216329);
        setField(term216328, term216328.getClass(), "environment", "sgVVVUpnau");
        setField(term216328, term216328.getClass(), "populateEnvironment", "xwVTgDhNdW");
        setLongField(term216355, term216355.getClass(), "fastTime", 1673672345200L);
        setField(term216355, term216355.getClass(), "cdate", null);
        setField(term216328, term216328.getClass(), "createDate", term216355);
        setLongField(term216357, term216357.getClass(), "fastTime", 1733892148391L);
        setField(term216357, term216357.getClass(), "cdate", null);
        setField(term216328, term216328.getClass(), "updateDate", term216357);
        setLongField(term216359, term216359.getClass(), "fastTime", 1393175924047L);
        setField(term216359, term216359.getClass(), "cdate", null);
        setField(term216328, term216328.getClass(), "startTime", term216359);
        setField(term216328, term216328.getClass(), "status", enum384);
        setField(term216328, term216328.getClass(), "fromClassicAddress", "ruqGjVRVlD");
        setField(term216328, term216328.getClass(), "fromSigningPublicKey", "oeoFYkQLVk");
        setField(term216328, term216328.getClass(), "fromPrivateKey", "fibZqjUmdU");
        setField(term216328, term216328.getClass(), "trustlineIssuerClassicAddress", "DvLIPKnbCV");
        setField(term216328, term216328.getClass(), "currencyName", "QwAMZyCIhS");
        setField(term216328, term216328.getClass(), "snapshotTrustlineIssuerClassicAddress", "TnLDXZoBoo");
        setField(term216328, term216328.getClass(), "snapshotCurrencyName", "RQTElJrtwb");
        setField(term216328, term216328.getClass(), "currencyNameForProcess", "hFvoVHxToy");
        setField(term216328, term216328.getClass(), "amount", "ZybsWgYCUR");
        setField(term216328, term216328.getClass(), "paymentType", enum385);
        setField(term216328, term216328.getClass(), "newTrustlinesOnly", term216501);
        setField(term216328, term216328.getClass(), "useBlacklist", term216503);
        setField(term216328, term216328.getClass(), "maximumTrustlines", term216505);
        setField(term216328, term216328.getClass(), "dropType", enum386);
        setField(term216328, term216328.getClass(), "lockUuid", "YZNLZnNFNI");
        setField(term216328, term216328.getClass(), "failReason", "uHcUlIseio");
        setField(term216328, term216328.getClass(), "feesPaid", "bsmWXOcLZJ");
        setField(term216328, term216328.getClass(), "minBalance", "ltTwdndtbe");
        setField(term216328, term216328.getClass(), "maxBalance", "XaldiIeyMi");
        setField(term216328, term216328.getClass(), "maxXrpFeePerTransaction", "lkujDCFpdm");
        setField(term216328, term216328.getClass(), "retryOfId", term216592);
        setField(term216328, term216328.getClass(), "nftIssuerAddress", "sGfzmhpQEH");
        setField(term216328, term216328.getClass(), "nftTaxon", term216606);
        setField(term216328, term216328.getClass(), "contactEmail", "FqGkFGXAbg");
        setField(term216328, term216328.getClass(), "autoApprove", term216620);
        setField(term216328, term216328.getClass(), "memo", "SSWEZgFiFO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "spphrCslQA";
        callMethod(klass, "setFeesPaid", argTypes, term216328, args);
    }

};


