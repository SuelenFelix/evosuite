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

public class PaymentRequestEnt_setLockUuid_142901928962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212804;

    public PaymentRequestEnt_setLockUuid_142901928962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212805 = new Long(-8928717808154338062L);
        Class<? extends Object> term213156 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term213155 = ((Class) term213156).getDeclaredField((String) "COMPLETE");
        ((Field) term213155).setAccessible(true);
        Object enum378 = ((Field) term213155).get((Object) null);
        Class<? extends Object> term213662 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term213661 = ((Class) term213662).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term213661).setAccessible(true);
        Object enum379 = ((Field) term213661).get((Object) null);
        Boolean term212973 = new Boolean(true);
        Boolean term212975 = new Boolean(false);
        Integer term212977 = new Integer(344323424);
        Class<? extends Object> term214060 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term214059 = ((Class) term214060).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term214059).setAccessible(true);
        Object enum380 = ((Field) term214059).get((Object) null);
        Long term213081 = new Long(4628458998884457238L);
        Long term213095 = new Long(-6806576523000182981L);
        Boolean term213109 = new Boolean(false);
        term212804 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term212831 = newInstance(Class.forName("java.util.Date"));
        Object term212833 = newInstance(Class.forName("java.util.Date"));
        Object term212835 = newInstance(Class.forName("java.util.Date"));
        setField(term212804, term212804.getClass(), "id", term212805);
        setField(term212804, term212804.getClass(), "environment", "mntnLPfhte");
        setField(term212804, term212804.getClass(), "populateEnvironment", "rIKLUjcdnZ");
        setLongField(term212831, term212831.getClass(), "fastTime", 1275003265423L);
        setField(term212831, term212831.getClass(), "cdate", null);
        setField(term212804, term212804.getClass(), "createDate", term212831);
        setLongField(term212833, term212833.getClass(), "fastTime", 1674510348370L);
        setField(term212833, term212833.getClass(), "cdate", null);
        setField(term212804, term212804.getClass(), "updateDate", term212833);
        setLongField(term212835, term212835.getClass(), "fastTime", 1727352558737L);
        setField(term212835, term212835.getClass(), "cdate", null);
        setField(term212804, term212804.getClass(), "startTime", term212835);
        setField(term212804, term212804.getClass(), "status", enum378);
        setField(term212804, term212804.getClass(), "fromClassicAddress", "MQaKKukkYD");
        setField(term212804, term212804.getClass(), "fromSigningPublicKey", "ThGyaiqnHq");
        setField(term212804, term212804.getClass(), "fromPrivateKey", "AtEuOtHJrK");
        setField(term212804, term212804.getClass(), "trustlineIssuerClassicAddress", "gzqokHWvLu");
        setField(term212804, term212804.getClass(), "currencyName", "ANCcRsABGP");
        setField(term212804, term212804.getClass(), "snapshotTrustlineIssuerClassicAddress", "MBadwVIvwu");
        setField(term212804, term212804.getClass(), "snapshotCurrencyName", "zTMIjtwMQL");
        setField(term212804, term212804.getClass(), "currencyNameForProcess", "cjJhlsbSLZ");
        setField(term212804, term212804.getClass(), "amount", "BvcBilSFZf");
        setField(term212804, term212804.getClass(), "paymentType", enum379);
        setField(term212804, term212804.getClass(), "newTrustlinesOnly", term212973);
        setField(term212804, term212804.getClass(), "useBlacklist", term212975);
        setField(term212804, term212804.getClass(), "maximumTrustlines", term212977);
        setField(term212804, term212804.getClass(), "dropType", enum380);
        setField(term212804, term212804.getClass(), "lockUuid", "ppUmoMssug");
        setField(term212804, term212804.getClass(), "failReason", "FcponInvBb");
        setField(term212804, term212804.getClass(), "feesPaid", "IFOOxmFxbX");
        setField(term212804, term212804.getClass(), "minBalance", "aDEuPKrSZt");
        setField(term212804, term212804.getClass(), "maxBalance", "aDhkmoCCUK");
        setField(term212804, term212804.getClass(), "maxXrpFeePerTransaction", "ibnuoVVkVm");
        setField(term212804, term212804.getClass(), "retryOfId", term213081);
        setField(term212804, term212804.getClass(), "nftIssuerAddress", "mXVgkxjTjD");
        setField(term212804, term212804.getClass(), "nftTaxon", term213095);
        setField(term212804, term212804.getClass(), "contactEmail", "qodBmKUkev");
        setField(term212804, term212804.getClass(), "autoApprove", term213109);
        setField(term212804, term212804.getClass(), "memo", "QJuqwUQEyr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qqUAzxxpNB";
        callMethod(klass, "setLockUuid", argTypes, term212804, args);
    }

};


