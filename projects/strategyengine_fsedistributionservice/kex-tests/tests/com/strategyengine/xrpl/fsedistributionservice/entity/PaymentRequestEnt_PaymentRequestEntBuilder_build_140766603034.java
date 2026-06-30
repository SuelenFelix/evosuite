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

public class PaymentRequestEnt_PaymentRequestEntBuilder_build_140766603034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105961;

    public PaymentRequestEnt_PaymentRequestEntBuilder_build_140766603034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105962 = new Long(-5207216109884759743L);
        Class<? extends Object> term106273 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term106272 = ((Class) term106273).getDeclaredField((String) "QUEUED");
        ((Field) term106272).setAccessible(true);
        Object enum190 = ((Field) term106272).get((Object) null);
        Class<? extends Object> term106773 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term106772 = ((Class) term106773).getDeclaredField((String) "FLAT");
        ((Field) term106772).setAccessible(true);
        Object enum191 = ((Field) term106772).get((Object) null);
        Boolean term106120 = new Boolean(false);
        Boolean term106122 = new Boolean(false);
        Integer term106124 = new Integer(972867650);
        Class<? extends Object> term107147 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term107146 = ((Class) term107147).getDeclaredField((String) "GLOBALID");
        ((Field) term107146).setAccessible(true);
        Object enum192 = ((Field) term107146).get((Object) null);
        Long term106210 = new Long(8765880103547975810L);
        Long term106224 = new Long(4552367707739103094L);
        Boolean term106238 = new Boolean(true);
        term105961 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term105988 = newInstance(Class.forName("java.util.Date"));
        Object term105990 = newInstance(Class.forName("java.util.Date"));
        Object term105992 = newInstance(Class.forName("java.util.Date"));
        setField(term105961, term105961.getClass(), "id", term105962);
        setField(term105961, term105961.getClass(), "environment", "zhcWVVrrjs");
        setField(term105961, term105961.getClass(), "populateEnvironment", "EAMaFLdmaG");
        setLongField(term105988, term105988.getClass(), "fastTime", 1873152234138L);
        setField(term105988, term105988.getClass(), "cdate", null);
        setField(term105961, term105961.getClass(), "createDate", term105988);
        setLongField(term105990, term105990.getClass(), "fastTime", 1469019341287L);
        setField(term105990, term105990.getClass(), "cdate", null);
        setField(term105961, term105961.getClass(), "updateDate", term105990);
        setLongField(term105992, term105992.getClass(), "fastTime", 1349082575966L);
        setField(term105992, term105992.getClass(), "cdate", null);
        setField(term105961, term105961.getClass(), "startTime", term105992);
        setField(term105961, term105961.getClass(), "status", enum190);
        setField(term105961, term105961.getClass(), "fromClassicAddress", "DYZSJMwbhX");
        setField(term105961, term105961.getClass(), "fromSigningPublicKey", "QGcshsIIWo");
        setField(term105961, term105961.getClass(), "fromPrivateKey", "dPHtrzKWgf");
        setField(term105961, term105961.getClass(), "trustlineIssuerClassicAddress", "olmFxfIVeh");
        setField(term105961, term105961.getClass(), "currencyName", "iSPirUEhXs");
        setField(term105961, term105961.getClass(), "snapshotTrustlineIssuerClassicAddress", "WWyLFmYpAy");
        setField(term105961, term105961.getClass(), "snapshotCurrencyName", "vbSWeJWOQh");
        setField(term105961, term105961.getClass(), "currencyNameForProcess", "hyvFdAvkOr");
        setField(term105961, term105961.getClass(), "amount", "ewbQRtustW");
        setField(term105961, term105961.getClass(), "paymentType", enum191);
        setField(term105961, term105961.getClass(), "newTrustlinesOnly", term106120);
        setField(term105961, term105961.getClass(), "useBlacklist", term106122);
        setField(term105961, term105961.getClass(), "maximumTrustlines", term106124);
        setField(term105961, term105961.getClass(), "dropType", enum192);
        setField(term105961, term105961.getClass(), "lockUuid", "cABEHYBnys");
        setField(term105961, term105961.getClass(), "failReason", "EhlWSobaco");
        setField(term105961, term105961.getClass(), "feesPaid", "hEuycunsSe");
        setField(term105961, term105961.getClass(), "minBalance", "IMFzXhpNCx");
        setField(term105961, term105961.getClass(), "maxBalance", "xAtFmANjwD");
        setField(term105961, term105961.getClass(), "maxXrpFeePerTransaction", "ICysuFllEZ");
        setField(term105961, term105961.getClass(), "retryOfId", term106210);
        setField(term105961, term105961.getClass(), "nftIssuerAddress", "cGQJTTxcXr");
        setField(term105961, term105961.getClass(), "nftTaxon", term106224);
        setField(term105961, term105961.getClass(), "contactEmail", "aKaqvssiby");
        setField(term105961, term105961.getClass(), "autoApprove", term106238);
        setField(term105961, term105961.getClass(), "memo", "tTVbtBVAfo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term105961, args);
    }

};


