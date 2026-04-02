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

public class PaymentRequestEnt_setFromClassicAddress_22801296148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188189;

    public PaymentRequestEnt_setFromClassicAddress_22801296148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188190 = new Long(-4477377284889705897L);
        Class<? extends Object> term188535 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term188534 = ((Class) term188535).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term188534).setAccessible(true);
        Object enum335 = ((Field) term188534).get((Object) null);
        Class<? extends Object> term189050 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term189049 = ((Class) term189050).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term189049).setAccessible(true);
        Object enum336 = ((Field) term189049).get((Object) null);
        Boolean term188361 = new Boolean(false);
        Boolean term188363 = new Boolean(false);
        Integer term188365 = new Integer(480137250);
        Class<? extends Object> term189448 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term189447 = ((Class) term189448).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term189447).setAccessible(true);
        Object enum337 = ((Field) term189447).get((Object) null);
        Long term188460 = new Long(6323132402520425961L);
        Long term188474 = new Long(-354905832180781372L);
        Boolean term188488 = new Boolean(false);
        term188189 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term188216 = newInstance(Class.forName("java.util.Date"));
        Object term188218 = newInstance(Class.forName("java.util.Date"));
        Object term188220 = newInstance(Class.forName("java.util.Date"));
        setField(term188189, term188189.getClass(), "id", term188190);
        setField(term188189, term188189.getClass(), "environment", "fbshyuUfqy");
        setField(term188189, term188189.getClass(), "populateEnvironment", "eupNcihLEw");
        setLongField(term188216, term188216.getClass(), "fastTime", 1843870057764L);
        setField(term188216, term188216.getClass(), "cdate", null);
        setField(term188189, term188189.getClass(), "createDate", term188216);
        setLongField(term188218, term188218.getClass(), "fastTime", 1340579459048L);
        setField(term188218, term188218.getClass(), "cdate", null);
        setField(term188189, term188189.getClass(), "updateDate", term188218);
        setLongField(term188220, term188220.getClass(), "fastTime", 1851602444260L);
        setField(term188220, term188220.getClass(), "cdate", null);
        setField(term188189, term188189.getClass(), "startTime", term188220);
        setField(term188189, term188189.getClass(), "status", enum335);
        setField(term188189, term188189.getClass(), "fromClassicAddress", "iFFcolxwcm");
        setField(term188189, term188189.getClass(), "fromSigningPublicKey", "bAsZBSqnyM");
        setField(term188189, term188189.getClass(), "fromPrivateKey", "urrmpQzmTU");
        setField(term188189, term188189.getClass(), "trustlineIssuerClassicAddress", "GWoZyTTlNx");
        setField(term188189, term188189.getClass(), "currencyName", "ntUYcalSmz");
        setField(term188189, term188189.getClass(), "snapshotTrustlineIssuerClassicAddress", "lnZXLpyQoO");
        setField(term188189, term188189.getClass(), "snapshotCurrencyName", "lOIEIGbwPj");
        setField(term188189, term188189.getClass(), "currencyNameForProcess", "TvmWaJWmLY");
        setField(term188189, term188189.getClass(), "amount", "TSUdwgvHgU");
        setField(term188189, term188189.getClass(), "paymentType", enum336);
        setField(term188189, term188189.getClass(), "newTrustlinesOnly", term188361);
        setField(term188189, term188189.getClass(), "useBlacklist", term188363);
        setField(term188189, term188189.getClass(), "maximumTrustlines", term188365);
        setField(term188189, term188189.getClass(), "dropType", enum337);
        setField(term188189, term188189.getClass(), "lockUuid", "YBQxTjzIrN");
        setField(term188189, term188189.getClass(), "failReason", "xfqaJVcHGx");
        setField(term188189, term188189.getClass(), "feesPaid", "bANxpqKESI");
        setField(term188189, term188189.getClass(), "minBalance", "sgpUSVSuVZ");
        setField(term188189, term188189.getClass(), "maxBalance", "ZOYhOzwINI");
        setField(term188189, term188189.getClass(), "maxXrpFeePerTransaction", "sPqjQQfymN");
        setField(term188189, term188189.getClass(), "retryOfId", term188460);
        setField(term188189, term188189.getClass(), "nftIssuerAddress", "tNKFzflLBd");
        setField(term188189, term188189.getClass(), "nftTaxon", term188474);
        setField(term188189, term188189.getClass(), "contactEmail", "xHLlctEoGh");
        setField(term188189, term188189.getClass(), "autoApprove", term188488);
        setField(term188189, term188189.getClass(), "memo", "aqgUzcnqpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yZDlWLIKEp";
        callMethod(klass, "setFromClassicAddress", argTypes, term188189, args);
    }

};


