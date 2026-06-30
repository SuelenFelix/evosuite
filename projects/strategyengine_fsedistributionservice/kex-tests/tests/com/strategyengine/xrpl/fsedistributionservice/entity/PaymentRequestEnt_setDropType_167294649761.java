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

public class PaymentRequestEnt_setDropType_167294649761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210695;
     Object enum377;

    public PaymentRequestEnt_setDropType_167294649761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210696 = new Long(797798302378380033L);
        Class<? extends Object> term211039 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term211038 = ((Class) term211039).getDeclaredField((String) "REJECTED");
        ((Field) term211038).setAccessible(true);
        Object enum374 = ((Field) term211038).get((Object) null);
        Class<? extends Object> term211545 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term211544 = ((Class) term211545).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term211544).setAccessible(true);
        Object enum375 = ((Field) term211544).get((Object) null);
        Boolean term210864 = new Boolean(true);
        Boolean term210866 = new Boolean(true);
        Integer term210868 = new Integer(-1565502840);
        Class<? extends Object> term211943 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term211942 = ((Class) term211943).getDeclaredField((String) "TRUSTLINE");
        ((Field) term211942).setAccessible(true);
        Object enum376 = ((Field) term211942).get((Object) null);
        Long term210955 = new Long(4892304277320345810L);
        Long term210969 = new Long(-3271370917942710167L);
        Boolean term210983 = new Boolean(true);
        term210695 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term210722 = newInstance(Class.forName("java.util.Date"));
        Object term210724 = newInstance(Class.forName("java.util.Date"));
        Object term210726 = newInstance(Class.forName("java.util.Date"));
        setField(term210695, term210695.getClass(), "id", term210696);
        setField(term210695, term210695.getClass(), "environment", "sXMXSCUbRu");
        setField(term210695, term210695.getClass(), "populateEnvironment", "iualVLfDmL");
        setLongField(term210722, term210722.getClass(), "fastTime", 1554077124928L);
        setField(term210722, term210722.getClass(), "cdate", null);
        setField(term210695, term210695.getClass(), "createDate", term210722);
        setLongField(term210724, term210724.getClass(), "fastTime", 1671432970086L);
        setField(term210724, term210724.getClass(), "cdate", null);
        setField(term210695, term210695.getClass(), "updateDate", term210724);
        setLongField(term210726, term210726.getClass(), "fastTime", 1461402009094L);
        setField(term210726, term210726.getClass(), "cdate", null);
        setField(term210695, term210695.getClass(), "startTime", term210726);
        setField(term210695, term210695.getClass(), "status", enum374);
        setField(term210695, term210695.getClass(), "fromClassicAddress", "bhEFtkUvDw");
        setField(term210695, term210695.getClass(), "fromSigningPublicKey", "ZmbknwMIBa");
        setField(term210695, term210695.getClass(), "fromPrivateKey", "UiRmBTpDTp");
        setField(term210695, term210695.getClass(), "trustlineIssuerClassicAddress", "zQtuUgUIjK");
        setField(term210695, term210695.getClass(), "currencyName", "VBeGRjPsPN");
        setField(term210695, term210695.getClass(), "snapshotTrustlineIssuerClassicAddress", "pZrAdSHQIs");
        setField(term210695, term210695.getClass(), "snapshotCurrencyName", "XTOiucaEva");
        setField(term210695, term210695.getClass(), "currencyNameForProcess", "JMekRNxFMU");
        setField(term210695, term210695.getClass(), "amount", "LBNEEquiet");
        setField(term210695, term210695.getClass(), "paymentType", enum375);
        setField(term210695, term210695.getClass(), "newTrustlinesOnly", term210864);
        setField(term210695, term210695.getClass(), "useBlacklist", term210866);
        setField(term210695, term210695.getClass(), "maximumTrustlines", term210868);
        setField(term210695, term210695.getClass(), "dropType", enum376);
        setField(term210695, term210695.getClass(), "lockUuid", "cBMdxJirJj");
        setField(term210695, term210695.getClass(), "failReason", "kVnxgkemHF");
        setField(term210695, term210695.getClass(), "feesPaid", "JUQnEoujef");
        setField(term210695, term210695.getClass(), "minBalance", "riXARUiigm");
        setField(term210695, term210695.getClass(), "maxBalance", "RbXhBDZbRT");
        setField(term210695, term210695.getClass(), "maxXrpFeePerTransaction", "QDaTqkWnGj");
        setField(term210695, term210695.getClass(), "retryOfId", term210955);
        setField(term210695, term210695.getClass(), "nftIssuerAddress", "vNObzQvzxo");
        setField(term210695, term210695.getClass(), "nftTaxon", term210969);
        setField(term210695, term210695.getClass(), "contactEmail", "uyuWzXeJvn");
        setField(term210695, term210695.getClass(), "autoApprove", term210983);
        setField(term210695, term210695.getClass(), "memo", "jvQHxWAYDO");
        Class<? extends Object> term212407 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term212406 = ((Class) term212407).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term212406).setAccessible(true);
        enum377 = ((Field) term212406).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = enum377;
        callMethod(klass, "setDropType", argTypes, term210695, args);
    }

};


