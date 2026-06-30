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

public class PaymentRequestEnt_PaymentRequestEntBuilder_lockUuid_175745206622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84945;

    public PaymentRequestEnt_PaymentRequestEntBuilder_lockUuid_175745206622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84946 = new Long(3086974592680165932L);
        Class<? extends Object> term85297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term85296 = ((Class) term85297).getDeclaredField((String) "COMPLETE");
        ((Field) term85296).setAccessible(true);
        Object enum154 = ((Field) term85296).get((Object) null);
        Class<? extends Object> term85803 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term85802 = ((Class) term85803).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term85802).setAccessible(true);
        Object enum155 = ((Field) term85802).get((Object) null);
        Boolean term85114 = new Boolean(false);
        Boolean term85116 = new Boolean(true);
        Integer term85118 = new Integer(-112921587);
        Class<? extends Object> term86201 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term86200 = ((Class) term86201).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term86200).setAccessible(true);
        Object enum156 = ((Field) term86200).get((Object) null);
        Long term85222 = new Long(-532956263280568707L);
        Long term85236 = new Long(6073193746616629086L);
        Boolean term85250 = new Boolean(true);
        term84945 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term84972 = newInstance(Class.forName("java.util.Date"));
        Object term84974 = newInstance(Class.forName("java.util.Date"));
        Object term84976 = newInstance(Class.forName("java.util.Date"));
        setField(term84945, term84945.getClass(), "id", term84946);
        setField(term84945, term84945.getClass(), "environment", "dikKjYjmRO");
        setField(term84945, term84945.getClass(), "populateEnvironment", "GJnnMDVnEP");
        setLongField(term84972, term84972.getClass(), "fastTime", 1390700341454L);
        setField(term84972, term84972.getClass(), "cdate", null);
        setField(term84945, term84945.getClass(), "createDate", term84972);
        setLongField(term84974, term84974.getClass(), "fastTime", 1325981376062L);
        setField(term84974, term84974.getClass(), "cdate", null);
        setField(term84945, term84945.getClass(), "updateDate", term84974);
        setLongField(term84976, term84976.getClass(), "fastTime", 1638331931856L);
        setField(term84976, term84976.getClass(), "cdate", null);
        setField(term84945, term84945.getClass(), "startTime", term84976);
        setField(term84945, term84945.getClass(), "status", enum154);
        setField(term84945, term84945.getClass(), "fromClassicAddress", "zSMVllDpfk");
        setField(term84945, term84945.getClass(), "fromSigningPublicKey", "iptRXVDoYE");
        setField(term84945, term84945.getClass(), "fromPrivateKey", "kucsxnvbES");
        setField(term84945, term84945.getClass(), "trustlineIssuerClassicAddress", "IdGzDFfcZf");
        setField(term84945, term84945.getClass(), "currencyName", "KDdRNhZmnU");
        setField(term84945, term84945.getClass(), "snapshotTrustlineIssuerClassicAddress", "iMsqJaKlDC");
        setField(term84945, term84945.getClass(), "snapshotCurrencyName", "aPkGHbZyjj");
        setField(term84945, term84945.getClass(), "currencyNameForProcess", "nSWdsVyJRI");
        setField(term84945, term84945.getClass(), "amount", "JBOPGgGKnc");
        setField(term84945, term84945.getClass(), "paymentType", enum155);
        setField(term84945, term84945.getClass(), "newTrustlinesOnly", term85114);
        setField(term84945, term84945.getClass(), "useBlacklist", term85116);
        setField(term84945, term84945.getClass(), "maximumTrustlines", term85118);
        setField(term84945, term84945.getClass(), "dropType", enum156);
        setField(term84945, term84945.getClass(), "lockUuid", "GlPTiCMCGP");
        setField(term84945, term84945.getClass(), "failReason", "jlcBpLoWfd");
        setField(term84945, term84945.getClass(), "feesPaid", "oYymmLqbfJ");
        setField(term84945, term84945.getClass(), "minBalance", "YaDWphDOSz");
        setField(term84945, term84945.getClass(), "maxBalance", "nnnmCgFBLw");
        setField(term84945, term84945.getClass(), "maxXrpFeePerTransaction", "hSSCyNEhyH");
        setField(term84945, term84945.getClass(), "retryOfId", term85222);
        setField(term84945, term84945.getClass(), "nftIssuerAddress", "jDFNSuvZqm");
        setField(term84945, term84945.getClass(), "nftTaxon", term85236);
        setField(term84945, term84945.getClass(), "contactEmail", "pLvkKHqNYX");
        setField(term84945, term84945.getClass(), "autoApprove", term85250);
        setField(term84945, term84945.getClass(), "memo", "PwqnuJJwjR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NFkbBiPeiw";
        callMethod(klass, "lockUuid", argTypes, term84945, args);
    }

};


