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

public class PaymentRequestEnt_PaymentRequestEntBuilder_fromSigningPublicKey_2715837859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62529;

    public PaymentRequestEnt_PaymentRequestEntBuilder_fromSigningPublicKey_2715837859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62530 = new Long(6130232388739280211L);
        Class<? extends Object> term62855 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term62854 = ((Class) term62855).getDeclaredField((String) "COMPLETE");
        ((Field) term62854).setAccessible(true);
        Object enum115 = ((Field) term62854).get((Object) null);
        Class<? extends Object> term63361 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term63360 = ((Class) term63361).getDeclaredField((String) "FLAT");
        ((Field) term63360).setAccessible(true);
        Object enum116 = ((Field) term63360).get((Object) null);
        Boolean term62690 = new Boolean(true);
        Boolean term62692 = new Boolean(false);
        Integer term62694 = new Integer(-1048298087);
        Class<? extends Object> term63735 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term63734 = ((Class) term63735).getDeclaredField((String) "GLOBALID");
        ((Field) term63734).setAccessible(true);
        Object enum117 = ((Field) term63734).get((Object) null);
        Long term62780 = new Long(3423965054378869855L);
        Long term62794 = new Long(-593735869267672817L);
        Boolean term62808 = new Boolean(false);
        term62529 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term62556 = newInstance(Class.forName("java.util.Date"));
        Object term62558 = newInstance(Class.forName("java.util.Date"));
        Object term62560 = newInstance(Class.forName("java.util.Date"));
        setField(term62529, term62529.getClass(), "id", term62530);
        setField(term62529, term62529.getClass(), "environment", "QpYltHAdyY");
        setField(term62529, term62529.getClass(), "populateEnvironment", "lbmSGBwIiV");
        setLongField(term62556, term62556.getClass(), "fastTime", 1444705856246L);
        setField(term62556, term62556.getClass(), "cdate", null);
        setField(term62529, term62529.getClass(), "createDate", term62556);
        setLongField(term62558, term62558.getClass(), "fastTime", 1758154207110L);
        setField(term62558, term62558.getClass(), "cdate", null);
        setField(term62529, term62529.getClass(), "updateDate", term62558);
        setLongField(term62560, term62560.getClass(), "fastTime", 1374840193140L);
        setField(term62560, term62560.getClass(), "cdate", null);
        setField(term62529, term62529.getClass(), "startTime", term62560);
        setField(term62529, term62529.getClass(), "status", enum115);
        setField(term62529, term62529.getClass(), "fromClassicAddress", "DAxyHoTLzZ");
        setField(term62529, term62529.getClass(), "fromSigningPublicKey", "fhZgTouhCC");
        setField(term62529, term62529.getClass(), "fromPrivateKey", "wrikqJwXvL");
        setField(term62529, term62529.getClass(), "trustlineIssuerClassicAddress", "UiWhvbypdr");
        setField(term62529, term62529.getClass(), "currencyName", "CgleElJNje");
        setField(term62529, term62529.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZrchvNGMtd");
        setField(term62529, term62529.getClass(), "snapshotCurrencyName", "WaEcyVlcIx");
        setField(term62529, term62529.getClass(), "currencyNameForProcess", "ONcbPCQnHd");
        setField(term62529, term62529.getClass(), "amount", "AobDaplFLl");
        setField(term62529, term62529.getClass(), "paymentType", enum116);
        setField(term62529, term62529.getClass(), "newTrustlinesOnly", term62690);
        setField(term62529, term62529.getClass(), "useBlacklist", term62692);
        setField(term62529, term62529.getClass(), "maximumTrustlines", term62694);
        setField(term62529, term62529.getClass(), "dropType", enum117);
        setField(term62529, term62529.getClass(), "lockUuid", "pDkMNnAGgv");
        setField(term62529, term62529.getClass(), "failReason", "PaCpFXGzdX");
        setField(term62529, term62529.getClass(), "feesPaid", "FftYCNbnks");
        setField(term62529, term62529.getClass(), "minBalance", "lJoltmsadS");
        setField(term62529, term62529.getClass(), "maxBalance", "mvfDtZNEHr");
        setField(term62529, term62529.getClass(), "maxXrpFeePerTransaction", "bvSgmFUDOU");
        setField(term62529, term62529.getClass(), "retryOfId", term62780);
        setField(term62529, term62529.getClass(), "nftIssuerAddress", "XMHwbfiHRl");
        setField(term62529, term62529.getClass(), "nftTaxon", term62794);
        setField(term62529, term62529.getClass(), "contactEmail", "bucTnYicnp");
        setField(term62529, term62529.getClass(), "autoApprove", term62808);
        setField(term62529, term62529.getClass(), "memo", "EkgprvqZlM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fbnKvthhOz";
        callMethod(klass, "fromSigningPublicKey", argTypes, term62529, args);
    }

};


