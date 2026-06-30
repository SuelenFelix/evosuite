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

public class PaymentRequestEnt_equals_8022004622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111142;
     Object term111458;

    public PaymentRequestEnt_equals_8022004622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111143 = new Long(-7005300544167632229L);
        Class<? extends Object> term111480 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term111479 = ((Class) term111480).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term111479).setAccessible(true);
        Object enum199 = ((Field) term111479).get((Object) null);
        Class<? extends Object> term112004 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term112003 = ((Class) term112004).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term112003).setAccessible(true);
        Object enum200 = ((Field) term112003).get((Object) null);
        Boolean term111317 = new Boolean(false);
        Boolean term111319 = new Boolean(true);
        Integer term111321 = new Integer(1240914516);
        Class<? extends Object> term112402 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term112401 = ((Class) term112402).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term112401).setAccessible(true);
        Object enum201 = ((Field) term112401).get((Object) null);
        Long term111416 = new Long(-278716491237139968L);
        Long term111430 = new Long(-629491722907628764L);
        Boolean term111444 = new Boolean(false);
        term111142 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term111169 = newInstance(Class.forName("java.util.Date"));
        Object term111171 = newInstance(Class.forName("java.util.Date"));
        Object term111173 = newInstance(Class.forName("java.util.Date"));
        setField(term111142, term111142.getClass(), "id", term111143);
        setField(term111142, term111142.getClass(), "environment", "pLbTzSMbsN");
        setField(term111142, term111142.getClass(), "populateEnvironment", "lFSbxerCPP");
        setLongField(term111169, term111169.getClass(), "fastTime", 1654457238681L);
        setField(term111169, term111169.getClass(), "cdate", null);
        setField(term111142, term111142.getClass(), "createDate", term111169);
        setLongField(term111171, term111171.getClass(), "fastTime", 1603673487779L);
        setField(term111171, term111171.getClass(), "cdate", null);
        setField(term111142, term111142.getClass(), "updateDate", term111171);
        setLongField(term111173, term111173.getClass(), "fastTime", 1262701967235L);
        setField(term111173, term111173.getClass(), "cdate", null);
        setField(term111142, term111142.getClass(), "startTime", term111173);
        setField(term111142, term111142.getClass(), "status", enum199);
        setField(term111142, term111142.getClass(), "fromClassicAddress", "vjaZIyixCm");
        setField(term111142, term111142.getClass(), "fromSigningPublicKey", "gAAPyftlIR");
        setField(term111142, term111142.getClass(), "fromPrivateKey", "kevWstoxwq");
        setField(term111142, term111142.getClass(), "trustlineIssuerClassicAddress", "aSYOhFwzSm");
        setField(term111142, term111142.getClass(), "currencyName", "pVZlzrBeDB");
        setField(term111142, term111142.getClass(), "snapshotTrustlineIssuerClassicAddress", "EfSUvjuZAA");
        setField(term111142, term111142.getClass(), "snapshotCurrencyName", "PrHWfHydsG");
        setField(term111142, term111142.getClass(), "currencyNameForProcess", "igruEzTbBE");
        setField(term111142, term111142.getClass(), "amount", "LFjgROsRUV");
        setField(term111142, term111142.getClass(), "paymentType", enum200);
        setField(term111142, term111142.getClass(), "newTrustlinesOnly", term111317);
        setField(term111142, term111142.getClass(), "useBlacklist", term111319);
        setField(term111142, term111142.getClass(), "maximumTrustlines", term111321);
        setField(term111142, term111142.getClass(), "dropType", enum201);
        setField(term111142, term111142.getClass(), "lockUuid", "kHxujKiCsr");
        setField(term111142, term111142.getClass(), "failReason", "cseZveWowm");
        setField(term111142, term111142.getClass(), "feesPaid", "idfslIPhgx");
        setField(term111142, term111142.getClass(), "minBalance", "HyFLOXeoDX");
        setField(term111142, term111142.getClass(), "maxBalance", "crkNabVaWs");
        setField(term111142, term111142.getClass(), "maxXrpFeePerTransaction", "qBcAJgrABE");
        setField(term111142, term111142.getClass(), "retryOfId", term111416);
        setField(term111142, term111142.getClass(), "nftIssuerAddress", "JKdZuLFRwC");
        setField(term111142, term111142.getClass(), "nftTaxon", term111430);
        setField(term111142, term111142.getClass(), "contactEmail", "hfhLLoWnRU");
        setField(term111142, term111142.getClass(), "autoApprove", term111444);
        setField(term111142, term111142.getClass(), "memo", "RpofnOPYha");
        term111458 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term111458;
        callMethod(klass, "equals", argTypes, term111142, args);
    }

};


