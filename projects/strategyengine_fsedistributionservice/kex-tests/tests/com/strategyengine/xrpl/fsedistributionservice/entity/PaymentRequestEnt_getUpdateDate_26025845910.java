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

public class PaymentRequestEnt_getUpdateDate_26025845910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124764;

    public PaymentRequestEnt_getUpdateDate_26025845910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124765 = new Long(-7400951017937830861L);
        Class<? extends Object> term125107 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term125106 = ((Class) term125107).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term125106).setAccessible(true);
        Object enum223 = ((Field) term125106).get((Object) null);
        Class<? extends Object> term125649 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term125648 = ((Class) term125649).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term125648).setAccessible(true);
        Object enum224 = ((Field) term125648).get((Object) null);
        Boolean term124945 = new Boolean(true);
        Boolean term124947 = new Boolean(false);
        Integer term124949 = new Integer(-1845499264);
        Class<? extends Object> term126047 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term126046 = ((Class) term126047).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term126046).setAccessible(true);
        Object enum225 = ((Field) term126046).get((Object) null);
        Long term125044 = new Long(-8993073054427011802L);
        Long term125058 = new Long(2287785643837657068L);
        Boolean term125072 = new Boolean(false);
        term124764 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term124791 = newInstance(Class.forName("java.util.Date"));
        Object term124793 = newInstance(Class.forName("java.util.Date"));
        Object term124795 = newInstance(Class.forName("java.util.Date"));
        setField(term124764, term124764.getClass(), "id", term124765);
        setField(term124764, term124764.getClass(), "environment", "FiqETbKjpv");
        setField(term124764, term124764.getClass(), "populateEnvironment", "FxXtdhhXyS");
        setLongField(term124791, term124791.getClass(), "fastTime", 1689828992084L);
        setField(term124791, term124791.getClass(), "cdate", null);
        setField(term124764, term124764.getClass(), "createDate", term124791);
        setLongField(term124793, term124793.getClass(), "fastTime", 1288596730763L);
        setField(term124793, term124793.getClass(), "cdate", null);
        setField(term124764, term124764.getClass(), "updateDate", term124793);
        setLongField(term124795, term124795.getClass(), "fastTime", 1842237600959L);
        setField(term124795, term124795.getClass(), "cdate", null);
        setField(term124764, term124764.getClass(), "startTime", term124795);
        setField(term124764, term124764.getClass(), "status", enum223);
        setField(term124764, term124764.getClass(), "fromClassicAddress", "HxCEzaCcgj");
        setField(term124764, term124764.getClass(), "fromSigningPublicKey", "PDYPOQncAB");
        setField(term124764, term124764.getClass(), "fromPrivateKey", "cHqLMqZSmc");
        setField(term124764, term124764.getClass(), "trustlineIssuerClassicAddress", "hkWmAkXSOW");
        setField(term124764, term124764.getClass(), "currencyName", "DwQmZEKeOp");
        setField(term124764, term124764.getClass(), "snapshotTrustlineIssuerClassicAddress", "DbxrFiyttv");
        setField(term124764, term124764.getClass(), "snapshotCurrencyName", "iVIrSxTsaM");
        setField(term124764, term124764.getClass(), "currencyNameForProcess", "FmJNEfmYgq");
        setField(term124764, term124764.getClass(), "amount", "NqQofgWsJd");
        setField(term124764, term124764.getClass(), "paymentType", enum224);
        setField(term124764, term124764.getClass(), "newTrustlinesOnly", term124945);
        setField(term124764, term124764.getClass(), "useBlacklist", term124947);
        setField(term124764, term124764.getClass(), "maximumTrustlines", term124949);
        setField(term124764, term124764.getClass(), "dropType", enum225);
        setField(term124764, term124764.getClass(), "lockUuid", "ZlVRdHsBMO");
        setField(term124764, term124764.getClass(), "failReason", "UMMXkhuqzw");
        setField(term124764, term124764.getClass(), "feesPaid", "KyGXZcXJwq");
        setField(term124764, term124764.getClass(), "minBalance", "TqiCjeuoWE");
        setField(term124764, term124764.getClass(), "maxBalance", "GWWfkXOYLP");
        setField(term124764, term124764.getClass(), "maxXrpFeePerTransaction", "qvykDllgpT");
        setField(term124764, term124764.getClass(), "retryOfId", term125044);
        setField(term124764, term124764.getClass(), "nftIssuerAddress", "hzdUbcLZhZ");
        setField(term124764, term124764.getClass(), "nftTaxon", term125058);
        setField(term124764, term124764.getClass(), "contactEmail", "GlxnEJvYeC");
        setField(term124764, term124764.getClass(), "autoApprove", term125072);
        setField(term124764, term124764.getClass(), "memo", "SLdOGaqmNv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term124764, args);
    }

};


