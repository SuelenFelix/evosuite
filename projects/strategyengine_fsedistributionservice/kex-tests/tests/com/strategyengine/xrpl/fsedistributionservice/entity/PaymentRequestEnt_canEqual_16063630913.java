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

public class PaymentRequestEnt_canEqual_16063630913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112889;
     Object term113208;

    public PaymentRequestEnt_canEqual_16063630913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112890 = new Long(-5552123402871285352L);
        Class<? extends Object> term113230 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term113229 = ((Class) term113230).getDeclaredField((String) "COMPLETE");
        ((Field) term113229).setAccessible(true);
        Object enum202 = ((Field) term113229).get((Object) null);
        Class<? extends Object> term113736 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term113735 = ((Class) term113736).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term113735).setAccessible(true);
        Object enum203 = ((Field) term113735).get((Object) null);
        Boolean term113058 = new Boolean(false);
        Boolean term113060 = new Boolean(false);
        Integer term113062 = new Integer(-1465035361);
        Class<? extends Object> term114134 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term114133 = ((Class) term114134).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term114133).setAccessible(true);
        Object enum204 = ((Field) term114133).get((Object) null);
        Long term113166 = new Long(-5587528177305224828L);
        Long term113180 = new Long(7950532649535587877L);
        Boolean term113194 = new Boolean(true);
        term112889 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term112916 = newInstance(Class.forName("java.util.Date"));
        Object term112918 = newInstance(Class.forName("java.util.Date"));
        Object term112920 = newInstance(Class.forName("java.util.Date"));
        setField(term112889, term112889.getClass(), "id", term112890);
        setField(term112889, term112889.getClass(), "environment", "CQYmAsjvPU");
        setField(term112889, term112889.getClass(), "populateEnvironment", "NNkIIFpxiB");
        setLongField(term112916, term112916.getClass(), "fastTime", 1526982178232L);
        setField(term112916, term112916.getClass(), "cdate", null);
        setField(term112889, term112889.getClass(), "createDate", term112916);
        setLongField(term112918, term112918.getClass(), "fastTime", 1308378194197L);
        setField(term112918, term112918.getClass(), "cdate", null);
        setField(term112889, term112889.getClass(), "updateDate", term112918);
        setLongField(term112920, term112920.getClass(), "fastTime", 1647406623363L);
        setField(term112920, term112920.getClass(), "cdate", null);
        setField(term112889, term112889.getClass(), "startTime", term112920);
        setField(term112889, term112889.getClass(), "status", enum202);
        setField(term112889, term112889.getClass(), "fromClassicAddress", "sBmtvFPDso");
        setField(term112889, term112889.getClass(), "fromSigningPublicKey", "qsUIxrLolr");
        setField(term112889, term112889.getClass(), "fromPrivateKey", "IlQxArYcgB");
        setField(term112889, term112889.getClass(), "trustlineIssuerClassicAddress", "lIgKCvCuoH");
        setField(term112889, term112889.getClass(), "currencyName", "dHuWgRwLOm");
        setField(term112889, term112889.getClass(), "snapshotTrustlineIssuerClassicAddress", "PsTQDxNIld");
        setField(term112889, term112889.getClass(), "snapshotCurrencyName", "uoBijJjvaj");
        setField(term112889, term112889.getClass(), "currencyNameForProcess", "BdsLFSRWda");
        setField(term112889, term112889.getClass(), "amount", "tMhhBYonAI");
        setField(term112889, term112889.getClass(), "paymentType", enum203);
        setField(term112889, term112889.getClass(), "newTrustlinesOnly", term113058);
        setField(term112889, term112889.getClass(), "useBlacklist", term113060);
        setField(term112889, term112889.getClass(), "maximumTrustlines", term113062);
        setField(term112889, term112889.getClass(), "dropType", enum204);
        setField(term112889, term112889.getClass(), "lockUuid", "AaQRshwIQC");
        setField(term112889, term112889.getClass(), "failReason", "rHgKCfgCsg");
        setField(term112889, term112889.getClass(), "feesPaid", "AWtIUOuutt");
        setField(term112889, term112889.getClass(), "minBalance", "jBgJZpHifl");
        setField(term112889, term112889.getClass(), "maxBalance", "azMTTmEXnh");
        setField(term112889, term112889.getClass(), "maxXrpFeePerTransaction", "BjJtxwsIpt");
        setField(term112889, term112889.getClass(), "retryOfId", term113166);
        setField(term112889, term112889.getClass(), "nftIssuerAddress", "gUQhOyGfzF");
        setField(term112889, term112889.getClass(), "nftTaxon", term113180);
        setField(term112889, term112889.getClass(), "contactEmail", "IqDObvPBZX");
        setField(term112889, term112889.getClass(), "autoApprove", term113194);
        setField(term112889, term112889.getClass(), "memo", "NITCrIISoC");
        term113208 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term113208;
        callMethod(klass, "canEqual", argTypes, term112889, args);
    }

};


