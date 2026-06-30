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

public class PaymentRequestEnt_PaymentRequestEntBuilder_trustlineIssuerClassicAddress_183189040311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65985;

    public PaymentRequestEnt_PaymentRequestEntBuilder_trustlineIssuerClassicAddress_183189040311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65986 = new Long(24067105862153728L);
        Class<? extends Object> term66323 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term66322 = ((Class) term66323).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term66322).setAccessible(true);
        Object enum121 = ((Field) term66322).get((Object) null);
        Class<? extends Object> term66865 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term66864 = ((Class) term66865).getDeclaredField((String) "FLAT");
        ((Field) term66864).setAccessible(true);
        Object enum122 = ((Field) term66864).get((Object) null);
        Boolean term66158 = new Boolean(true);
        Boolean term66160 = new Boolean(true);
        Integer term66162 = new Integer(458147407);
        Class<? extends Object> term67239 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term67238 = ((Class) term67239).getDeclaredField((String) "GLOBALID");
        ((Field) term67238).setAccessible(true);
        Object enum123 = ((Field) term67238).get((Object) null);
        Long term66248 = new Long(-8477368071089201577L);
        Long term66262 = new Long(-1526729287349763895L);
        Boolean term66276 = new Boolean(true);
        term65985 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term66012 = newInstance(Class.forName("java.util.Date"));
        Object term66014 = newInstance(Class.forName("java.util.Date"));
        Object term66016 = newInstance(Class.forName("java.util.Date"));
        setField(term65985, term65985.getClass(), "id", term65986);
        setField(term65985, term65985.getClass(), "environment", "wWWidPCHzx");
        setField(term65985, term65985.getClass(), "populateEnvironment", "OwPIiBRuKK");
        setLongField(term66012, term66012.getClass(), "fastTime", 1268671677540L);
        setField(term66012, term66012.getClass(), "cdate", null);
        setField(term65985, term65985.getClass(), "createDate", term66012);
        setLongField(term66014, term66014.getClass(), "fastTime", 1630055567491L);
        setField(term66014, term66014.getClass(), "cdate", null);
        setField(term65985, term65985.getClass(), "updateDate", term66014);
        setLongField(term66016, term66016.getClass(), "fastTime", 1335719982731L);
        setField(term66016, term66016.getClass(), "cdate", null);
        setField(term65985, term65985.getClass(), "startTime", term66016);
        setField(term65985, term65985.getClass(), "status", enum121);
        setField(term65985, term65985.getClass(), "fromClassicAddress", "sgfGySMODT");
        setField(term65985, term65985.getClass(), "fromSigningPublicKey", "ndAITnOsny");
        setField(term65985, term65985.getClass(), "fromPrivateKey", "CVZnTiJucs");
        setField(term65985, term65985.getClass(), "trustlineIssuerClassicAddress", "ecHEQufXoq");
        setField(term65985, term65985.getClass(), "currencyName", "btBLMvHzJg");
        setField(term65985, term65985.getClass(), "snapshotTrustlineIssuerClassicAddress", "JdOMfNWgLP");
        setField(term65985, term65985.getClass(), "snapshotCurrencyName", "uWqXrwAsDU");
        setField(term65985, term65985.getClass(), "currencyNameForProcess", "hgFbWAUtsu");
        setField(term65985, term65985.getClass(), "amount", "HqoTWlkbwF");
        setField(term65985, term65985.getClass(), "paymentType", enum122);
        setField(term65985, term65985.getClass(), "newTrustlinesOnly", term66158);
        setField(term65985, term65985.getClass(), "useBlacklist", term66160);
        setField(term65985, term65985.getClass(), "maximumTrustlines", term66162);
        setField(term65985, term65985.getClass(), "dropType", enum123);
        setField(term65985, term65985.getClass(), "lockUuid", "CwNELDTAPP");
        setField(term65985, term65985.getClass(), "failReason", "GSzQdbHLHw");
        setField(term65985, term65985.getClass(), "feesPaid", "IkfarsYNJO");
        setField(term65985, term65985.getClass(), "minBalance", "aZKOWhHMEh");
        setField(term65985, term65985.getClass(), "maxBalance", "YfkhviKZwl");
        setField(term65985, term65985.getClass(), "maxXrpFeePerTransaction", "DcOhhAfJTI");
        setField(term65985, term65985.getClass(), "retryOfId", term66248);
        setField(term65985, term65985.getClass(), "nftIssuerAddress", "gYTIkBFOoS");
        setField(term65985, term65985.getClass(), "nftTaxon", term66262);
        setField(term65985, term65985.getClass(), "contactEmail", "xmzSoVgiED");
        setField(term65985, term65985.getClass(), "autoApprove", term66276);
        setField(term65985, term65985.getClass(), "memo", "pdSvedKgPq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "epPTwvcoyb";
        callMethod(klass, "trustlineIssuerClassicAddress", argTypes, term65985, args);
    }

};


