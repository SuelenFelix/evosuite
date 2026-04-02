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

public class PaymentRequestEnt_getMemo_131392909938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172432;

    public PaymentRequestEnt_getMemo_131392909938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term172433 = new Long(-5903549884298836343L);
        Class<? extends Object> term172746 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term172745 = ((Class) term172746).getDeclaredField((String) "COMPLETE");
        ((Field) term172745).setAccessible(true);
        Object enum307 = ((Field) term172745).get((Object) null);
        Class<? extends Object> term173252 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term173251 = ((Class) term173252).getDeclaredField((String) "FLAT");
        ((Field) term173251).setAccessible(true);
        Object enum308 = ((Field) term173251).get((Object) null);
        Boolean term172593 = new Boolean(false);
        Boolean term172595 = new Boolean(false);
        Integer term172597 = new Integer(1045657203);
        Class<? extends Object> term173626 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term173625 = ((Class) term173626).getDeclaredField((String) "GLOBALID");
        ((Field) term173625).setAccessible(true);
        Object enum309 = ((Field) term173625).get((Object) null);
        Long term172683 = new Long(-3058119213533262883L);
        Long term172697 = new Long(1950957495500453461L);
        Boolean term172711 = new Boolean(false);
        term172432 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term172459 = newInstance(Class.forName("java.util.Date"));
        Object term172461 = newInstance(Class.forName("java.util.Date"));
        Object term172463 = newInstance(Class.forName("java.util.Date"));
        setField(term172432, term172432.getClass(), "id", term172433);
        setField(term172432, term172432.getClass(), "environment", "CUagRkEuzN");
        setField(term172432, term172432.getClass(), "populateEnvironment", "eWIWfWobXm");
        setLongField(term172459, term172459.getClass(), "fastTime", 1426940357842L);
        setField(term172459, term172459.getClass(), "cdate", null);
        setField(term172432, term172432.getClass(), "createDate", term172459);
        setLongField(term172461, term172461.getClass(), "fastTime", 1576226551563L);
        setField(term172461, term172461.getClass(), "cdate", null);
        setField(term172432, term172432.getClass(), "updateDate", term172461);
        setLongField(term172463, term172463.getClass(), "fastTime", 1536870844334L);
        setField(term172463, term172463.getClass(), "cdate", null);
        setField(term172432, term172432.getClass(), "startTime", term172463);
        setField(term172432, term172432.getClass(), "status", enum307);
        setField(term172432, term172432.getClass(), "fromClassicAddress", "lkPJVVXhDd");
        setField(term172432, term172432.getClass(), "fromSigningPublicKey", "OpMnUyJTrb");
        setField(term172432, term172432.getClass(), "fromPrivateKey", "ACBGZgugev");
        setField(term172432, term172432.getClass(), "trustlineIssuerClassicAddress", "rcbQDpUkab");
        setField(term172432, term172432.getClass(), "currencyName", "oZAbUeXmhW");
        setField(term172432, term172432.getClass(), "snapshotTrustlineIssuerClassicAddress", "NDSDpOeQda");
        setField(term172432, term172432.getClass(), "snapshotCurrencyName", "HlKwxzAqTg");
        setField(term172432, term172432.getClass(), "currencyNameForProcess", "xKjkdjTYfe");
        setField(term172432, term172432.getClass(), "amount", "HcfabJkuEQ");
        setField(term172432, term172432.getClass(), "paymentType", enum308);
        setField(term172432, term172432.getClass(), "newTrustlinesOnly", term172593);
        setField(term172432, term172432.getClass(), "useBlacklist", term172595);
        setField(term172432, term172432.getClass(), "maximumTrustlines", term172597);
        setField(term172432, term172432.getClass(), "dropType", enum309);
        setField(term172432, term172432.getClass(), "lockUuid", "JlnoFYxLfk");
        setField(term172432, term172432.getClass(), "failReason", "tMMLkDkFYW");
        setField(term172432, term172432.getClass(), "feesPaid", "EYJXMlkLoO");
        setField(term172432, term172432.getClass(), "minBalance", "qJtkJJhOSV");
        setField(term172432, term172432.getClass(), "maxBalance", "vQbiGKncal");
        setField(term172432, term172432.getClass(), "maxXrpFeePerTransaction", "NTSNSiYeUu");
        setField(term172432, term172432.getClass(), "retryOfId", term172683);
        setField(term172432, term172432.getClass(), "nftIssuerAddress", "SBTEFDmQVY");
        setField(term172432, term172432.getClass(), "nftTaxon", term172697);
        setField(term172432, term172432.getClass(), "contactEmail", "ohZpRiNDZM");
        setField(term172432, term172432.getClass(), "autoApprove", term172711);
        setField(term172432, term172432.getClass(), "memo", "qEXIxhmUwz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemo", argTypes, term172432, args);
    }

};


