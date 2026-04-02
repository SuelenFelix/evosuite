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

public class PaymentRequestEnt_getMinBalance_79472873130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158908;

    public PaymentRequestEnt_getMinBalance_79472873130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158909 = new Long(1634166935474035772L);
        Class<? extends Object> term159225 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term159224 = ((Class) term159225).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term159224).setAccessible(true);
        Object enum283 = ((Field) term159224).get((Object) null);
        Class<? extends Object> term159740 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term159739 = ((Class) term159740).getDeclaredField((String) "FLAT");
        ((Field) term159739).setAccessible(true);
        Object enum284 = ((Field) term159739).get((Object) null);
        Boolean term159072 = new Boolean(true);
        Boolean term159074 = new Boolean(false);
        Integer term159076 = new Integer(1532716628);
        Class<? extends Object> term160114 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term160113 = ((Class) term160114).getDeclaredField((String) "GLOBALID");
        ((Field) term160113).setAccessible(true);
        Object enum285 = ((Field) term160113).get((Object) null);
        Long term159162 = new Long(-2614906266506360948L);
        Long term159176 = new Long(1133267598258375793L);
        Boolean term159190 = new Boolean(true);
        term158908 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term158935 = newInstance(Class.forName("java.util.Date"));
        Object term158937 = newInstance(Class.forName("java.util.Date"));
        Object term158939 = newInstance(Class.forName("java.util.Date"));
        setField(term158908, term158908.getClass(), "id", term158909);
        setField(term158908, term158908.getClass(), "environment", "sWJHIWZMuX");
        setField(term158908, term158908.getClass(), "populateEnvironment", "PwMdJRwzDW");
        setLongField(term158935, term158935.getClass(), "fastTime", 1340144055808L);
        setField(term158935, term158935.getClass(), "cdate", null);
        setField(term158908, term158908.getClass(), "createDate", term158935);
        setLongField(term158937, term158937.getClass(), "fastTime", 1308630841700L);
        setField(term158937, term158937.getClass(), "cdate", null);
        setField(term158908, term158908.getClass(), "updateDate", term158937);
        setLongField(term158939, term158939.getClass(), "fastTime", 1843314041460L);
        setField(term158939, term158939.getClass(), "cdate", null);
        setField(term158908, term158908.getClass(), "startTime", term158939);
        setField(term158908, term158908.getClass(), "status", enum283);
        setField(term158908, term158908.getClass(), "fromClassicAddress", "sMiHxgXUuN");
        setField(term158908, term158908.getClass(), "fromSigningPublicKey", "oVChCWWDag");
        setField(term158908, term158908.getClass(), "fromPrivateKey", "EteTxkDxin");
        setField(term158908, term158908.getClass(), "trustlineIssuerClassicAddress", "mKgLwPdYbY");
        setField(term158908, term158908.getClass(), "currencyName", "zqykonsLIo");
        setField(term158908, term158908.getClass(), "snapshotTrustlineIssuerClassicAddress", "KoPzTuvIeK");
        setField(term158908, term158908.getClass(), "snapshotCurrencyName", "SMoWUILIhn");
        setField(term158908, term158908.getClass(), "currencyNameForProcess", "SvSKSCjgTM");
        setField(term158908, term158908.getClass(), "amount", "UFxnRbWtog");
        setField(term158908, term158908.getClass(), "paymentType", enum284);
        setField(term158908, term158908.getClass(), "newTrustlinesOnly", term159072);
        setField(term158908, term158908.getClass(), "useBlacklist", term159074);
        setField(term158908, term158908.getClass(), "maximumTrustlines", term159076);
        setField(term158908, term158908.getClass(), "dropType", enum285);
        setField(term158908, term158908.getClass(), "lockUuid", "NSxzAUSujy");
        setField(term158908, term158908.getClass(), "failReason", "FEezgglqXC");
        setField(term158908, term158908.getClass(), "feesPaid", "rvYqMRgiPA");
        setField(term158908, term158908.getClass(), "minBalance", "qOZXeUUmdz");
        setField(term158908, term158908.getClass(), "maxBalance", "FCovVZHqPx");
        setField(term158908, term158908.getClass(), "maxXrpFeePerTransaction", "jSTBfkWjge");
        setField(term158908, term158908.getClass(), "retryOfId", term159162);
        setField(term158908, term158908.getClass(), "nftIssuerAddress", "uKYhZULSHp");
        setField(term158908, term158908.getClass(), "nftTaxon", term159176);
        setField(term158908, term158908.getClass(), "contactEmail", "xdYuLllgpn");
        setField(term158908, term158908.getClass(), "autoApprove", term159190);
        setField(term158908, term158908.getClass(), "memo", "ayonlqalLA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinBalance", argTypes, term158908, args);
    }

};


