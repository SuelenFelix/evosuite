package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_setSnapshotCurrencyName_48196442350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70645;

    public FsePaymentTrustlinesRequest_setSnapshotCurrencyName_48196442350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70734 = new Integer(287287233);
        Double term70736 = new Double(0.7080134263823477);
        Double term70738 = new Double(0.6059734092898602);
        Long term70752 = new Long(846579494941632714L);
        Class<? extends Object> term70905 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term70904 = ((Class) term70905).getDeclaredField((String) "FLAT");
        ((Field) term70904).setAccessible(true);
        Object enum128 = ((Field) term70904).get((Object) null);
        Class<? extends Object> term71299 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term71298 = ((Class) term71299).getDeclaredField((String) "DAILY");
        ((Field) term71298).setAccessible(true);
        Object enum129 = ((Field) term71298).get((Object) null);
        term70645 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term70786 = newInstance(Class.forName("java.util.Date"));
        Object term70797 = newInstance(Class.forName("java.util.Date"));
        setField(term70645, term70645.getClass(), "memo", "dIWAnvmLiC");
        setField(term70645, term70645.getClass(), "fromClassicAddress", "CuWebzZQjZ");
        setField(term70645, term70645.getClass(), "fromSigningPublicKey", "wRVaaJxKYI");
        setField(term70645, term70645.getClass(), "fromPrivateKey", "yOQuJXRvOo");
        setField(term70645, term70645.getClass(), "trustlineIssuerClassicAddress", "XmLHcnVsch");
        setField(term70645, term70645.getClass(), "currencyName", "Yrvtdcltri");
        setField(term70645, term70645.getClass(), "amount", "RxrsjXRVcT");
        setBooleanField(term70645, term70645.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term70645, term70645.getClass(), "globalIdVerified", true);
        setBooleanField(term70645, term70645.getClass(), "useBlacklist", false);
        setBooleanField(term70645, term70645.getClass(), "agreeFee", false);
        setField(term70645, term70645.getClass(), "maximumTrustlines", term70734);
        setField(term70645, term70645.getClass(), "minBalance", term70736);
        setField(term70645, term70645.getClass(), "maxBalance", term70738);
        setField(term70645, term70645.getClass(), "maxXrpFeePerTransaction", "cfRimmJxqA");
        setField(term70645, term70645.getClass(), "retryOfId", term70752);
        setField(term70645, term70645.getClass(), "paymentType", enum128);
        setField(term70645, term70645.getClass(), "snapshotTrustlineIssuerClassicAddress", "oOnRVGqFmy");
        setField(term70645, term70645.getClass(), "snapshotCurrencyName", "LaXzFIlWMk");
        setLongField(term70786, term70786.getClass(), "fastTime", 1743136792108L);
        setField(term70786, term70786.getClass(), "cdate", null);
        setField(term70645, term70645.getClass(), "startTime", term70786);
        setField(term70645, term70645.getClass(), "frequency", enum129);
        setLongField(term70797, term70797.getClass(), "fastTime", 1728457746580L);
        setField(term70797, term70797.getClass(), "cdate", null);
        setField(term70645, term70645.getClass(), "repeatUntilDate", term70797);
        setField(term70645, term70645.getClass(), "email", "GuVQjhBxma");
        setBooleanField(term70645, term70645.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WAVMPPbIfL";
        callMethod(klass, "setSnapshotCurrencyName", argTypes, term70645, args);
    }

};


