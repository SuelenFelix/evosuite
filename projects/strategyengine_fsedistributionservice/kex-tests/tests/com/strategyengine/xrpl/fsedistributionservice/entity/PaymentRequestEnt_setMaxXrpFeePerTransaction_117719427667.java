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

public class PaymentRequestEnt_setMaxXrpFeePerTransaction_117719427667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221616;

    public PaymentRequestEnt_setMaxXrpFeePerTransaction_117719427667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term221617 = new Long(-7062466217011408314L);
        Class<? extends Object> term221944 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term221943 = ((Class) term221944).getDeclaredField((String) "SCHEDULED");
        ((Field) term221943).setAccessible(true);
        Object enum393 = ((Field) term221943).get((Object) null);
        Class<? extends Object> term222453 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term222452 = ((Class) term222453).getDeclaredField((String) "FLAT");
        ((Field) term222452).setAccessible(true);
        Object enum394 = ((Field) term222452).get((Object) null);
        Boolean term221778 = new Boolean(true);
        Boolean term221780 = new Boolean(false);
        Integer term221782 = new Integer(158873461);
        Class<? extends Object> term222827 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term222826 = ((Class) term222827).getDeclaredField((String) "TRUSTLINE");
        ((Field) term222826).setAccessible(true);
        Object enum395 = ((Field) term222826).get((Object) null);
        Long term221869 = new Long(-5455716707538294699L);
        Long term221883 = new Long(-1889784286465977825L);
        Boolean term221897 = new Boolean(false);
        term221616 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term221643 = newInstance(Class.forName("java.util.Date"));
        Object term221645 = newInstance(Class.forName("java.util.Date"));
        Object term221647 = newInstance(Class.forName("java.util.Date"));
        setField(term221616, term221616.getClass(), "id", term221617);
        setField(term221616, term221616.getClass(), "environment", "KIBOVYItqe");
        setField(term221616, term221616.getClass(), "populateEnvironment", "GUztJeVeCc");
        setLongField(term221643, term221643.getClass(), "fastTime", 1725624001523L);
        setField(term221643, term221643.getClass(), "cdate", null);
        setField(term221616, term221616.getClass(), "createDate", term221643);
        setLongField(term221645, term221645.getClass(), "fastTime", 1411294411258L);
        setField(term221645, term221645.getClass(), "cdate", null);
        setField(term221616, term221616.getClass(), "updateDate", term221645);
        setLongField(term221647, term221647.getClass(), "fastTime", 1751596639252L);
        setField(term221647, term221647.getClass(), "cdate", null);
        setField(term221616, term221616.getClass(), "startTime", term221647);
        setField(term221616, term221616.getClass(), "status", enum393);
        setField(term221616, term221616.getClass(), "fromClassicAddress", "YNXFGgstqj");
        setField(term221616, term221616.getClass(), "fromSigningPublicKey", "xZTWqxWsAc");
        setField(term221616, term221616.getClass(), "fromPrivateKey", "sWchglYniO");
        setField(term221616, term221616.getClass(), "trustlineIssuerClassicAddress", "lohegbXyjA");
        setField(term221616, term221616.getClass(), "currencyName", "HlddItIexw");
        setField(term221616, term221616.getClass(), "snapshotTrustlineIssuerClassicAddress", "HnpLvemmRI");
        setField(term221616, term221616.getClass(), "snapshotCurrencyName", "dHrIcaTbcS");
        setField(term221616, term221616.getClass(), "currencyNameForProcess", "tAqyToqusS");
        setField(term221616, term221616.getClass(), "amount", "MwiFLgdSDA");
        setField(term221616, term221616.getClass(), "paymentType", enum394);
        setField(term221616, term221616.getClass(), "newTrustlinesOnly", term221778);
        setField(term221616, term221616.getClass(), "useBlacklist", term221780);
        setField(term221616, term221616.getClass(), "maximumTrustlines", term221782);
        setField(term221616, term221616.getClass(), "dropType", enum395);
        setField(term221616, term221616.getClass(), "lockUuid", "VhnistEcCA");
        setField(term221616, term221616.getClass(), "failReason", "hlPKLObFBU");
        setField(term221616, term221616.getClass(), "feesPaid", "oNGVAyjCob");
        setField(term221616, term221616.getClass(), "minBalance", "lzqPLDonds");
        setField(term221616, term221616.getClass(), "maxBalance", "gCFzBxPZKw");
        setField(term221616, term221616.getClass(), "maxXrpFeePerTransaction", "YNVbzJpOdk");
        setField(term221616, term221616.getClass(), "retryOfId", term221869);
        setField(term221616, term221616.getClass(), "nftIssuerAddress", "CjPfMVeNPm");
        setField(term221616, term221616.getClass(), "nftTaxon", term221883);
        setField(term221616, term221616.getClass(), "contactEmail", "TeqSJDWXQD");
        setField(term221616, term221616.getClass(), "autoApprove", term221897);
        setField(term221616, term221616.getClass(), "memo", "XNgNLbjmim");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "InNyZMCrst";
        callMethod(klass, "setMaxXrpFeePerTransaction", argTypes, term221616, args);
    }

};


