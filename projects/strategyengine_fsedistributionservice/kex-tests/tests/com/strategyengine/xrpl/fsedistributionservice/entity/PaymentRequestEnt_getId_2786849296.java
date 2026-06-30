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

public class PaymentRequestEnt_getId_2786849296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117976;

    public PaymentRequestEnt_getId_2786849296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117977 = new Long(-8306611953768020559L);
        Class<? extends Object> term118291 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term118290 = ((Class) term118291).getDeclaredField((String) "COMPLETE");
        ((Field) term118290).setAccessible(true);
        Object enum211 = ((Field) term118290).get((Object) null);
        Class<? extends Object> term118797 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term118796 = ((Class) term118797).getDeclaredField((String) "FLAT");
        ((Field) term118796).setAccessible(true);
        Object enum212 = ((Field) term118796).get((Object) null);
        Boolean term118137 = new Boolean(false);
        Boolean term118139 = new Boolean(false);
        Integer term118141 = new Integer(1442160736);
        Class<? extends Object> term119171 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term119170 = ((Class) term119171).getDeclaredField((String) "TRUSTLINE");
        ((Field) term119170).setAccessible(true);
        Object enum213 = ((Field) term119170).get((Object) null);
        Long term118228 = new Long(-8692119547314358088L);
        Long term118242 = new Long(-2083524977884307536L);
        Boolean term118256 = new Boolean(false);
        term117976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term118003 = newInstance(Class.forName("java.util.Date"));
        Object term118005 = newInstance(Class.forName("java.util.Date"));
        Object term118007 = newInstance(Class.forName("java.util.Date"));
        setField(term117976, term117976.getClass(), "id", term117977);
        setField(term117976, term117976.getClass(), "environment", "SNmHXwCiFY");
        setField(term117976, term117976.getClass(), "populateEnvironment", "HZfkWoqyUW");
        setLongField(term118003, term118003.getClass(), "fastTime", 1553552205448L);
        setField(term118003, term118003.getClass(), "cdate", null);
        setField(term117976, term117976.getClass(), "createDate", term118003);
        setLongField(term118005, term118005.getClass(), "fastTime", 1331513661676L);
        setField(term118005, term118005.getClass(), "cdate", null);
        setField(term117976, term117976.getClass(), "updateDate", term118005);
        setLongField(term118007, term118007.getClass(), "fastTime", 1478384856375L);
        setField(term118007, term118007.getClass(), "cdate", null);
        setField(term117976, term117976.getClass(), "startTime", term118007);
        setField(term117976, term117976.getClass(), "status", enum211);
        setField(term117976, term117976.getClass(), "fromClassicAddress", "QRwANPSyfT");
        setField(term117976, term117976.getClass(), "fromSigningPublicKey", "DbZKLwYBgy");
        setField(term117976, term117976.getClass(), "fromPrivateKey", "LnNRVsjmxw");
        setField(term117976, term117976.getClass(), "trustlineIssuerClassicAddress", "PlOnDkNrvX");
        setField(term117976, term117976.getClass(), "currencyName", "MltgFGldop");
        setField(term117976, term117976.getClass(), "snapshotTrustlineIssuerClassicAddress", "JCWSoxnBJs");
        setField(term117976, term117976.getClass(), "snapshotCurrencyName", "vAxcpvjEEa");
        setField(term117976, term117976.getClass(), "currencyNameForProcess", "FCkOgIBqXE");
        setField(term117976, term117976.getClass(), "amount", "kadRHthQRD");
        setField(term117976, term117976.getClass(), "paymentType", enum212);
        setField(term117976, term117976.getClass(), "newTrustlinesOnly", term118137);
        setField(term117976, term117976.getClass(), "useBlacklist", term118139);
        setField(term117976, term117976.getClass(), "maximumTrustlines", term118141);
        setField(term117976, term117976.getClass(), "dropType", enum213);
        setField(term117976, term117976.getClass(), "lockUuid", "cGbJSRSpNn");
        setField(term117976, term117976.getClass(), "failReason", "MzXzaqaiHW");
        setField(term117976, term117976.getClass(), "feesPaid", "jWOWtrhVkA");
        setField(term117976, term117976.getClass(), "minBalance", "IyOhWYyaDV");
        setField(term117976, term117976.getClass(), "maxBalance", "omWrkCSFzy");
        setField(term117976, term117976.getClass(), "maxXrpFeePerTransaction", "VFYvUTgYFB");
        setField(term117976, term117976.getClass(), "retryOfId", term118228);
        setField(term117976, term117976.getClass(), "nftIssuerAddress", "BrWqhEIUUj");
        setField(term117976, term117976.getClass(), "nftTaxon", term118242);
        setField(term117976, term117976.getClass(), "contactEmail", "WfUmxdiHcU");
        setField(term117976, term117976.getClass(), "autoApprove", term118256);
        setField(term117976, term117976.getClass(), "memo", "BRrftvRvmF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term117976, args);
    }

};


