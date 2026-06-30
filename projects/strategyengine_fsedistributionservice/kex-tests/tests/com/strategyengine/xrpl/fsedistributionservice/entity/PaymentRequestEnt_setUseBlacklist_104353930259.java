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

public class PaymentRequestEnt_setUseBlacklist_104353930259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207327;
     Object term207630;

    public PaymentRequestEnt_setUseBlacklist_104353930259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term207328 = new Long(2551047634163864862L);
        Class<? extends Object> term207653 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term207652 = ((Class) term207653).getDeclaredField((String) "SCHEDULED");
        ((Field) term207652).setAccessible(true);
        Object enum368 = ((Field) term207652).get((Object) null);
        Class<? extends Object> term208162 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term208161 = ((Class) term208162).getDeclaredField((String) "FLAT");
        ((Field) term208161).setAccessible(true);
        Object enum369 = ((Field) term208161).get((Object) null);
        Boolean term207489 = new Boolean(true);
        Boolean term207491 = new Boolean(true);
        Integer term207493 = new Integer(-2063457669);
        Class<? extends Object> term208536 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term208535 = ((Class) term208536).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term208535).setAccessible(true);
        Object enum370 = ((Field) term208535).get((Object) null);
        Long term207588 = new Long(-6656996002079682356L);
        Long term207602 = new Long(2166921473521388808L);
        Boolean term207616 = new Boolean(false);
        term207327 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term207354 = newInstance(Class.forName("java.util.Date"));
        Object term207356 = newInstance(Class.forName("java.util.Date"));
        Object term207358 = newInstance(Class.forName("java.util.Date"));
        setField(term207327, term207327.getClass(), "id", term207328);
        setField(term207327, term207327.getClass(), "environment", "gLgvePQRQT");
        setField(term207327, term207327.getClass(), "populateEnvironment", "SCmsfHIEPK");
        setLongField(term207354, term207354.getClass(), "fastTime", 1579767637789L);
        setField(term207354, term207354.getClass(), "cdate", null);
        setField(term207327, term207327.getClass(), "createDate", term207354);
        setLongField(term207356, term207356.getClass(), "fastTime", 1427529790204L);
        setField(term207356, term207356.getClass(), "cdate", null);
        setField(term207327, term207327.getClass(), "updateDate", term207356);
        setLongField(term207358, term207358.getClass(), "fastTime", 1295507290264L);
        setField(term207358, term207358.getClass(), "cdate", null);
        setField(term207327, term207327.getClass(), "startTime", term207358);
        setField(term207327, term207327.getClass(), "status", enum368);
        setField(term207327, term207327.getClass(), "fromClassicAddress", "dFOuezLNWb");
        setField(term207327, term207327.getClass(), "fromSigningPublicKey", "PUWJnLuyiR");
        setField(term207327, term207327.getClass(), "fromPrivateKey", "ADhJCRgHaS");
        setField(term207327, term207327.getClass(), "trustlineIssuerClassicAddress", "qociGUMzem");
        setField(term207327, term207327.getClass(), "currencyName", "HHAfSjIdNi");
        setField(term207327, term207327.getClass(), "snapshotTrustlineIssuerClassicAddress", "oTqQEKklHi");
        setField(term207327, term207327.getClass(), "snapshotCurrencyName", "riyKkxMvWm");
        setField(term207327, term207327.getClass(), "currencyNameForProcess", "WENnGcBSTd");
        setField(term207327, term207327.getClass(), "amount", "juEYcOCxLW");
        setField(term207327, term207327.getClass(), "paymentType", enum369);
        setField(term207327, term207327.getClass(), "newTrustlinesOnly", term207489);
        setField(term207327, term207327.getClass(), "useBlacklist", term207491);
        setField(term207327, term207327.getClass(), "maximumTrustlines", term207493);
        setField(term207327, term207327.getClass(), "dropType", enum370);
        setField(term207327, term207327.getClass(), "lockUuid", "YsWgGEhEmC");
        setField(term207327, term207327.getClass(), "failReason", "PBcepqkBBV");
        setField(term207327, term207327.getClass(), "feesPaid", "mukHRKZmND");
        setField(term207327, term207327.getClass(), "minBalance", "WVPSokrFPV");
        setField(term207327, term207327.getClass(), "maxBalance", "jELmrpQCNf");
        setField(term207327, term207327.getClass(), "maxXrpFeePerTransaction", "NkjAcBXmmT");
        setField(term207327, term207327.getClass(), "retryOfId", term207588);
        setField(term207327, term207327.getClass(), "nftIssuerAddress", "KgtGJGInhu");
        setField(term207327, term207327.getClass(), "nftTaxon", term207602);
        setField(term207327, term207327.getClass(), "contactEmail", "mVHDjrsMAV");
        setField(term207327, term207327.getClass(), "autoApprove", term207616);
        setField(term207327, term207327.getClass(), "memo", "rjWnqcjYuU");
        term207630 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term207630;
        callMethod(klass, "setUseBlacklist", argTypes, term207327, args);
    }

};


