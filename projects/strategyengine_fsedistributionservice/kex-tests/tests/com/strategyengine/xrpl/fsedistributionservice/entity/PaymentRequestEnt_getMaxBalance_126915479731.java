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

public class PaymentRequestEnt_getMaxBalance_126915479731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160574;

    public PaymentRequestEnt_getMaxBalance_126915479731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160575 = new Long(2990264647913003810L);
        Class<? extends Object> term160915 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term160914 = ((Class) term160915).getDeclaredField((String) "SCHEDULED");
        ((Field) term160914).setAccessible(true);
        Object enum286 = ((Field) term160914).get((Object) null);
        Class<? extends Object> term161424 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term161423 = ((Class) term161424).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term161423).setAccessible(true);
        Object enum287 = ((Field) term161423).get((Object) null);
        Boolean term160744 = new Boolean(false);
        Boolean term160746 = new Boolean(true);
        Integer term160748 = new Integer(-1801760683);
        Class<? extends Object> term161822 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term161821 = ((Class) term161822).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term161821).setAccessible(true);
        Object enum288 = ((Field) term161821).get((Object) null);
        Long term160852 = new Long(-2195794659127490022L);
        Long term160866 = new Long(6142089107139955834L);
        Boolean term160880 = new Boolean(true);
        term160574 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term160601 = newInstance(Class.forName("java.util.Date"));
        Object term160603 = newInstance(Class.forName("java.util.Date"));
        Object term160605 = newInstance(Class.forName("java.util.Date"));
        setField(term160574, term160574.getClass(), "id", term160575);
        setField(term160574, term160574.getClass(), "environment", "fzzIOVxKdF");
        setField(term160574, term160574.getClass(), "populateEnvironment", "cdvmxZaBEK");
        setLongField(term160601, term160601.getClass(), "fastTime", 1609257574825L);
        setField(term160601, term160601.getClass(), "cdate", null);
        setField(term160574, term160574.getClass(), "createDate", term160601);
        setLongField(term160603, term160603.getClass(), "fastTime", 1596067505466L);
        setField(term160603, term160603.getClass(), "cdate", null);
        setField(term160574, term160574.getClass(), "updateDate", term160603);
        setLongField(term160605, term160605.getClass(), "fastTime", 1822179371499L);
        setField(term160605, term160605.getClass(), "cdate", null);
        setField(term160574, term160574.getClass(), "startTime", term160605);
        setField(term160574, term160574.getClass(), "status", enum286);
        setField(term160574, term160574.getClass(), "fromClassicAddress", "QHYZiyDyPC");
        setField(term160574, term160574.getClass(), "fromSigningPublicKey", "kcHMyiheuH");
        setField(term160574, term160574.getClass(), "fromPrivateKey", "DGMBBNDEYs");
        setField(term160574, term160574.getClass(), "trustlineIssuerClassicAddress", "vpuKZSMmKQ");
        setField(term160574, term160574.getClass(), "currencyName", "IXQQwaXITf");
        setField(term160574, term160574.getClass(), "snapshotTrustlineIssuerClassicAddress", "fNzFTiRCjp");
        setField(term160574, term160574.getClass(), "snapshotCurrencyName", "yaCGGogKro");
        setField(term160574, term160574.getClass(), "currencyNameForProcess", "qxrRUnjshF");
        setField(term160574, term160574.getClass(), "amount", "WmVcapKAeJ");
        setField(term160574, term160574.getClass(), "paymentType", enum287);
        setField(term160574, term160574.getClass(), "newTrustlinesOnly", term160744);
        setField(term160574, term160574.getClass(), "useBlacklist", term160746);
        setField(term160574, term160574.getClass(), "maximumTrustlines", term160748);
        setField(term160574, term160574.getClass(), "dropType", enum288);
        setField(term160574, term160574.getClass(), "lockUuid", "jevOVdQdpc");
        setField(term160574, term160574.getClass(), "failReason", "TLLVSGTNsz");
        setField(term160574, term160574.getClass(), "feesPaid", "mbBWfaHCrP");
        setField(term160574, term160574.getClass(), "minBalance", "wFyiZloCxg");
        setField(term160574, term160574.getClass(), "maxBalance", "xYztJEIPWy");
        setField(term160574, term160574.getClass(), "maxXrpFeePerTransaction", "TDQIAXaJru");
        setField(term160574, term160574.getClass(), "retryOfId", term160852);
        setField(term160574, term160574.getClass(), "nftIssuerAddress", "frPMFqGmrE");
        setField(term160574, term160574.getClass(), "nftTaxon", term160866);
        setField(term160574, term160574.getClass(), "contactEmail", "DvfOYWcNBN");
        setField(term160574, term160574.getClass(), "autoApprove", term160880);
        setField(term160574, term160574.getClass(), "memo", "cvbvwpPlNk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBalance", argTypes, term160574, args);
    }

};


