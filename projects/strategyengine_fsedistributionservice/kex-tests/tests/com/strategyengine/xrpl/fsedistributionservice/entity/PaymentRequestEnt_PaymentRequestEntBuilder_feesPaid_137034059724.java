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

public class PaymentRequestEnt_PaymentRequestEntBuilder_feesPaid_137034059724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88517;

    public PaymentRequestEnt_PaymentRequestEntBuilder_feesPaid_137034059724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term88518 = new Long(468487103823886117L);
        Class<? extends Object> term88861 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term88860 = ((Class) term88861).getDeclaredField((String) "SCHEDULED");
        ((Field) term88860).setAccessible(true);
        Object enum160 = ((Field) term88860).get((Object) null);
        Class<? extends Object> term89370 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term89369 = ((Class) term89370).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term89369).setAccessible(true);
        Object enum161 = ((Field) term89369).get((Object) null);
        Boolean term88687 = new Boolean(false);
        Boolean term88689 = new Boolean(false);
        Integer term88691 = new Integer(287287233);
        Class<? extends Object> term89768 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term89767 = ((Class) term89768).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term89767).setAccessible(true);
        Object enum162 = ((Field) term89767).get((Object) null);
        Long term88786 = new Long(4139034517298316285L);
        Long term88800 = new Long(5797412846146719084L);
        Boolean term88814 = new Boolean(false);
        term88517 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term88544 = newInstance(Class.forName("java.util.Date"));
        Object term88546 = newInstance(Class.forName("java.util.Date"));
        Object term88548 = newInstance(Class.forName("java.util.Date"));
        setField(term88517, term88517.getClass(), "id", term88518);
        setField(term88517, term88517.getClass(), "environment", "DQrjPcLysX");
        setField(term88517, term88517.getClass(), "populateEnvironment", "VWPFyrpmmb");
        setLongField(term88544, term88544.getClass(), "fastTime", 1837509436971L);
        setField(term88544, term88544.getClass(), "cdate", null);
        setField(term88517, term88517.getClass(), "createDate", term88544);
        setLongField(term88546, term88546.getClass(), "fastTime", 1732178131235L);
        setField(term88546, term88546.getClass(), "cdate", null);
        setField(term88517, term88517.getClass(), "updateDate", term88546);
        setLongField(term88548, term88548.getClass(), "fastTime", 1498615326814L);
        setField(term88548, term88548.getClass(), "cdate", null);
        setField(term88517, term88517.getClass(), "startTime", term88548);
        setField(term88517, term88517.getClass(), "status", enum160);
        setField(term88517, term88517.getClass(), "fromClassicAddress", "gYYKrIeThw");
        setField(term88517, term88517.getClass(), "fromSigningPublicKey", "UsxeLMVkAK");
        setField(term88517, term88517.getClass(), "fromPrivateKey", "ITrhiKKzcb");
        setField(term88517, term88517.getClass(), "trustlineIssuerClassicAddress", "qMKmSzOQXg");
        setField(term88517, term88517.getClass(), "currencyName", "CURQCMkqbZ");
        setField(term88517, term88517.getClass(), "snapshotTrustlineIssuerClassicAddress", "VZwkkQktrm");
        setField(term88517, term88517.getClass(), "snapshotCurrencyName", "wIuJvIvEMb");
        setField(term88517, term88517.getClass(), "currencyNameForProcess", "EyojsbSjWT");
        setField(term88517, term88517.getClass(), "amount", "szGicGyWDL");
        setField(term88517, term88517.getClass(), "paymentType", enum161);
        setField(term88517, term88517.getClass(), "newTrustlinesOnly", term88687);
        setField(term88517, term88517.getClass(), "useBlacklist", term88689);
        setField(term88517, term88517.getClass(), "maximumTrustlines", term88691);
        setField(term88517, term88517.getClass(), "dropType", enum162);
        setField(term88517, term88517.getClass(), "lockUuid", "lkdvUiYwRq");
        setField(term88517, term88517.getClass(), "failReason", "XuxkPrpfND");
        setField(term88517, term88517.getClass(), "feesPaid", "OxNXeKMDje");
        setField(term88517, term88517.getClass(), "minBalance", "hGTqHomrbc");
        setField(term88517, term88517.getClass(), "maxBalance", "NNMBrIWEBw");
        setField(term88517, term88517.getClass(), "maxXrpFeePerTransaction", "GrTaccOQzl");
        setField(term88517, term88517.getClass(), "retryOfId", term88786);
        setField(term88517, term88517.getClass(), "nftIssuerAddress", "uuSYOUCVHU");
        setField(term88517, term88517.getClass(), "nftTaxon", term88800);
        setField(term88517, term88517.getClass(), "contactEmail", "DfWwbodtVw");
        setField(term88517, term88517.getClass(), "autoApprove", term88814);
        setField(term88517, term88517.getClass(), "memo", "kTbFMpVWqx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HegRNsidFg";
        callMethod(klass, "feesPaid", argTypes, term88517, args);
    }

};


