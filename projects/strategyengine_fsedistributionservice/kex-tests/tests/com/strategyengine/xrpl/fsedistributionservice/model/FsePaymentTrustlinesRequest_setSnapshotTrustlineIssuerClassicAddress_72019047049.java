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

public class FsePaymentTrustlinesRequest_setSnapshotTrustlineIssuerClassicAddress_72019047049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69573;

    public FsePaymentTrustlinesRequest_setSnapshotTrustlineIssuerClassicAddress_72019047049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term69662 = new Integer(933028652);
        Double term69664 = new Double(0.7618164754425794);
        Double term69666 = new Double(0.7385589312559342);
        Long term69680 = new Long(-8876856890348836498L);
        Class<? extends Object> term69836 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term69835 = ((Class) term69836).getDeclaredField((String) "FLAT");
        ((Field) term69835).setAccessible(true);
        Object enum126 = ((Field) term69835).get((Object) null);
        Class<? extends Object> term70230 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term70229 = ((Class) term70230).getDeclaredField((String) "ANNUALLY");
        ((Field) term70229).setAccessible(true);
        Object enum127 = ((Field) term70229).get((Object) null);
        term69573 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term69714 = newInstance(Class.forName("java.util.Date"));
        Object term69728 = newInstance(Class.forName("java.util.Date"));
        setField(term69573, term69573.getClass(), "memo", "lkdvUiYwRq");
        setField(term69573, term69573.getClass(), "fromClassicAddress", "XuxkPrpfND");
        setField(term69573, term69573.getClass(), "fromSigningPublicKey", "OxNXeKMDje");
        setField(term69573, term69573.getClass(), "fromPrivateKey", "hGTqHomrbc");
        setField(term69573, term69573.getClass(), "trustlineIssuerClassicAddress", "NNMBrIWEBw");
        setField(term69573, term69573.getClass(), "currencyName", "GrTaccOQzl");
        setField(term69573, term69573.getClass(), "amount", "uuSYOUCVHU");
        setBooleanField(term69573, term69573.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term69573, term69573.getClass(), "globalIdVerified", true);
        setBooleanField(term69573, term69573.getClass(), "useBlacklist", false);
        setBooleanField(term69573, term69573.getClass(), "agreeFee", false);
        setField(term69573, term69573.getClass(), "maximumTrustlines", term69662);
        setField(term69573, term69573.getClass(), "minBalance", term69664);
        setField(term69573, term69573.getClass(), "maxBalance", term69666);
        setField(term69573, term69573.getClass(), "maxXrpFeePerTransaction", "DfWwbodtVw");
        setField(term69573, term69573.getClass(), "retryOfId", term69680);
        setField(term69573, term69573.getClass(), "paymentType", enum126);
        setField(term69573, term69573.getClass(), "snapshotTrustlineIssuerClassicAddress", "kTbFMpVWqx");
        setField(term69573, term69573.getClass(), "snapshotCurrencyName", "HegRNsidFg");
        setLongField(term69714, term69714.getClass(), "fastTime", 1676471642491L);
        setField(term69714, term69714.getClass(), "cdate", null);
        setField(term69573, term69573.getClass(), "startTime", term69714);
        setField(term69573, term69573.getClass(), "frequency", enum127);
        setLongField(term69728, term69728.getClass(), "fastTime", 1724960506464L);
        setField(term69728, term69728.getClass(), "cdate", null);
        setField(term69573, term69573.getClass(), "repeatUntilDate", term69728);
        setField(term69573, term69573.getClass(), "email", "udRdJkgXmH");
        setBooleanField(term69573, term69573.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FBCXbjHVXO";
        callMethod(klass, "setSnapshotTrustlineIssuerClassicAddress", argTypes, term69573, args);
    }

};


