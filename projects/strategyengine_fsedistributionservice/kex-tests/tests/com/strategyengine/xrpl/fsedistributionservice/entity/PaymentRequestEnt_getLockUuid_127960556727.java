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

public class PaymentRequestEnt_getLockUuid_127960556727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153742;

    public PaymentRequestEnt_getLockUuid_127960556727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term153743 = new Long(6940486570215409900L);
        Class<? extends Object> term154080 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term154079 = ((Class) term154080).getDeclaredField((String) "QUEUED");
        ((Field) term154079).setAccessible(true);
        Object enum274 = ((Field) term154079).get((Object) null);
        Class<? extends Object> term154580 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term154579 = ((Class) term154580).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term154579).setAccessible(true);
        Object enum275 = ((Field) term154579).get((Object) null);
        Boolean term153909 = new Boolean(true);
        Boolean term153911 = new Boolean(true);
        Integer term153913 = new Integer(-615654495);
        Class<? extends Object> term154978 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term154977 = ((Class) term154978).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term154977).setAccessible(true);
        Object enum276 = ((Field) term154977).get((Object) null);
        Long term154017 = new Long(-7370364068296402536L);
        Long term154031 = new Long(-1084263688306617320L);
        Boolean term154045 = new Boolean(false);
        term153742 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term153769 = newInstance(Class.forName("java.util.Date"));
        Object term153771 = newInstance(Class.forName("java.util.Date"));
        Object term153773 = newInstance(Class.forName("java.util.Date"));
        setField(term153742, term153742.getClass(), "id", term153743);
        setField(term153742, term153742.getClass(), "environment", "esbhDGQDgF");
        setField(term153742, term153742.getClass(), "populateEnvironment", "tKlyiBloWu");
        setLongField(term153769, term153769.getClass(), "fastTime", 1653781715654L);
        setField(term153769, term153769.getClass(), "cdate", null);
        setField(term153742, term153742.getClass(), "createDate", term153769);
        setLongField(term153771, term153771.getClass(), "fastTime", 1883930571832L);
        setField(term153771, term153771.getClass(), "cdate", null);
        setField(term153742, term153742.getClass(), "updateDate", term153771);
        setLongField(term153773, term153773.getClass(), "fastTime", 1871928859931L);
        setField(term153773, term153773.getClass(), "cdate", null);
        setField(term153742, term153742.getClass(), "startTime", term153773);
        setField(term153742, term153742.getClass(), "status", enum274);
        setField(term153742, term153742.getClass(), "fromClassicAddress", "uIgRFcwqLd");
        setField(term153742, term153742.getClass(), "fromSigningPublicKey", "AvdsiEyCve");
        setField(term153742, term153742.getClass(), "fromPrivateKey", "XMArCaVAEc");
        setField(term153742, term153742.getClass(), "trustlineIssuerClassicAddress", "URWnZtbrQH");
        setField(term153742, term153742.getClass(), "currencyName", "hpTAdtnQku");
        setField(term153742, term153742.getClass(), "snapshotTrustlineIssuerClassicAddress", "GdMAXFBAtl");
        setField(term153742, term153742.getClass(), "snapshotCurrencyName", "KWVRAlcIqd");
        setField(term153742, term153742.getClass(), "currencyNameForProcess", "GeVOqtDiGv");
        setField(term153742, term153742.getClass(), "amount", "vbRAJCwftU");
        setField(term153742, term153742.getClass(), "paymentType", enum275);
        setField(term153742, term153742.getClass(), "newTrustlinesOnly", term153909);
        setField(term153742, term153742.getClass(), "useBlacklist", term153911);
        setField(term153742, term153742.getClass(), "maximumTrustlines", term153913);
        setField(term153742, term153742.getClass(), "dropType", enum276);
        setField(term153742, term153742.getClass(), "lockUuid", "baJbjUImxp");
        setField(term153742, term153742.getClass(), "failReason", "lPERFqPpGz");
        setField(term153742, term153742.getClass(), "feesPaid", "jleFBTYSNb");
        setField(term153742, term153742.getClass(), "minBalance", "WmSSWHEELj");
        setField(term153742, term153742.getClass(), "maxBalance", "ggFhMyQvdw");
        setField(term153742, term153742.getClass(), "maxXrpFeePerTransaction", "vZpMxQNHKu");
        setField(term153742, term153742.getClass(), "retryOfId", term154017);
        setField(term153742, term153742.getClass(), "nftIssuerAddress", "QLMSDWYwBC");
        setField(term153742, term153742.getClass(), "nftTaxon", term154031);
        setField(term153742, term153742.getClass(), "contactEmail", "feyxNWUenU");
        setField(term153742, term153742.getClass(), "autoApprove", term154045);
        setField(term153742, term153742.getClass(), "memo", "qvqwmSUIiP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLockUuid", argTypes, term153742, args);
    }

};


