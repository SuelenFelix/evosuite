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

public class PaymentRequestEnt_getAmount_135744343721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143658;

    public PaymentRequestEnt_getAmount_135744343721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143659 = new Long(-3231440836116263235L);
        Class<? extends Object> term143979 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term143978 = ((Class) term143979).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term143978).setAccessible(true);
        Object enum256 = ((Field) term143978).get((Object) null);
        Class<? extends Object> term144503 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term144502 = ((Class) term144503).getDeclaredField((String) "FLAT");
        ((Field) term144502).setAccessible(true);
        Object enum257 = ((Field) term144502).get((Object) null);
        Boolean term143825 = new Boolean(true);
        Boolean term143827 = new Boolean(false);
        Integer term143829 = new Integer(683666002);
        Class<? extends Object> term144877 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term144876 = ((Class) term144877).getDeclaredField((String) "TRUSTLINE");
        ((Field) term144876).setAccessible(true);
        Object enum258 = ((Field) term144876).get((Object) null);
        Long term143916 = new Long(8010417010297313651L);
        Long term143930 = new Long(5845993504299821981L);
        Boolean term143944 = new Boolean(false);
        term143658 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term143685 = newInstance(Class.forName("java.util.Date"));
        Object term143687 = newInstance(Class.forName("java.util.Date"));
        Object term143689 = newInstance(Class.forName("java.util.Date"));
        setField(term143658, term143658.getClass(), "id", term143659);
        setField(term143658, term143658.getClass(), "environment", "RqnYUpQBbG");
        setField(term143658, term143658.getClass(), "populateEnvironment", "sKnuhmcjCC");
        setLongField(term143685, term143685.getClass(), "fastTime", 1653505339445L);
        setField(term143685, term143685.getClass(), "cdate", null);
        setField(term143658, term143658.getClass(), "createDate", term143685);
        setLongField(term143687, term143687.getClass(), "fastTime", 1781258116495L);
        setField(term143687, term143687.getClass(), "cdate", null);
        setField(term143658, term143658.getClass(), "updateDate", term143687);
        setLongField(term143689, term143689.getClass(), "fastTime", 1671403905627L);
        setField(term143689, term143689.getClass(), "cdate", null);
        setField(term143658, term143658.getClass(), "startTime", term143689);
        setField(term143658, term143658.getClass(), "status", enum256);
        setField(term143658, term143658.getClass(), "fromClassicAddress", "oCBbVNwMnb");
        setField(term143658, term143658.getClass(), "fromSigningPublicKey", "miJxAzOVJy");
        setField(term143658, term143658.getClass(), "fromPrivateKey", "kjqlBVaviD");
        setField(term143658, term143658.getClass(), "trustlineIssuerClassicAddress", "iVRXRDCrcM");
        setField(term143658, term143658.getClass(), "currencyName", "WAZFhrxcSM");
        setField(term143658, term143658.getClass(), "snapshotTrustlineIssuerClassicAddress", "gCRUlTuVMX");
        setField(term143658, term143658.getClass(), "snapshotCurrencyName", "tYBgGQtkhi");
        setField(term143658, term143658.getClass(), "currencyNameForProcess", "PhGPFLIMKH");
        setField(term143658, term143658.getClass(), "amount", "pWCYcLhoms");
        setField(term143658, term143658.getClass(), "paymentType", enum257);
        setField(term143658, term143658.getClass(), "newTrustlinesOnly", term143825);
        setField(term143658, term143658.getClass(), "useBlacklist", term143827);
        setField(term143658, term143658.getClass(), "maximumTrustlines", term143829);
        setField(term143658, term143658.getClass(), "dropType", enum258);
        setField(term143658, term143658.getClass(), "lockUuid", "IWNJVfvTuw");
        setField(term143658, term143658.getClass(), "failReason", "DLpKfwPpvr");
        setField(term143658, term143658.getClass(), "feesPaid", "DLFXidLbuT");
        setField(term143658, term143658.getClass(), "minBalance", "FjkxfTXGIH");
        setField(term143658, term143658.getClass(), "maxBalance", "KJkWSFFnmR");
        setField(term143658, term143658.getClass(), "maxXrpFeePerTransaction", "FBYRIDZvmW");
        setField(term143658, term143658.getClass(), "retryOfId", term143916);
        setField(term143658, term143658.getClass(), "nftIssuerAddress", "IyjLfrDZrV");
        setField(term143658, term143658.getClass(), "nftTaxon", term143930);
        setField(term143658, term143658.getClass(), "contactEmail", "BRMTHqqoRg");
        setField(term143658, term143658.getClass(), "autoApprove", term143944);
        setField(term143658, term143658.getClass(), "memo", "nOElYZBeyU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term143658, args);
    }

};


