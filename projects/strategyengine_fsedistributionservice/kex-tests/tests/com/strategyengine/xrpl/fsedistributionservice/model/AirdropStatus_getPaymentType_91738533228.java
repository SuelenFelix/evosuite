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
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_getPaymentType_91738533228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182049;

    public AirdropStatus_getPaymentType_91738533228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term182050 = new ArrayList();
        Long term182054 = new Long(-6837989212848250735L);
        Class<? extends Object> term182297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term182296 = ((Class) term182297).getDeclaredField((String) "ANNUALLY");
        ((Field) term182296).setAccessible(true);
        Object enum354 = ((Field) term182296).get((Object) null);
        Class<? extends Object> term182693 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term182692 = ((Class) term182693).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term182692).setAccessible(true);
        Object enum355 = ((Field) term182692).get((Object) null);
        Integer term182153 = new Integer(-1963434938);
        Class<? extends Object> term183168 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term183167 = ((Class) term183168).getDeclaredField((String) "TRUSTLINE");
        ((Field) term183167).setAccessible(true);
        Object enum356 = ((Field) term183167).get((Object) null);
        Long term182204 = new Long(-4231979631084175364L);
        Long term182218 = new Long(1634166935474035772L);
        Class<? extends Object> term183582 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term183581 = ((Class) term183582).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term183581).setAccessible(true);
        Object enum357 = ((Field) term183581).get((Object) null);
        Class<? extends Object> term184020 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term184019 = ((Class) term184020).getDeclaredField((String) "ACTIVE");
        ((Field) term184019).setAccessible(true);
        Object enum358 = ((Field) term184019).get((Object) null);
        Long term182294 = new Long(-2614906266506360948L);
        term182049 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term182056 = newInstance(Class.forName("java.util.Date"));
        Object term182058 = newInstance(Class.forName("java.util.Date"));
        Object term182060 = newInstance(Class.forName("java.util.Date"));
        Object term182062 = newInstance(Class.forName("java.util.Date"));
        setField(term182049, term182049.getClass(), "results", term182050);
        setField(term182049, term182049.getClass(), "id", term182054);
        setLongField(term182056, term182056.getClass(), "fastTime", 1871928859931L);
        setField(term182056, term182056.getClass(), "cdate", null);
        setField(term182049, term182049.getClass(), "createDate", term182056);
        setLongField(term182058, term182058.getClass(), "fastTime", 1703501903134L);
        setField(term182058, term182058.getClass(), "cdate", null);
        setField(term182049, term182049.getClass(), "updateDate", term182058);
        setLongField(term182060, term182060.getClass(), "fastTime", 1702290529553L);
        setField(term182060, term182060.getClass(), "cdate", null);
        setField(term182049, term182049.getClass(), "startTime", term182060);
        setLongField(term182062, term182062.getClass(), "fastTime", 1534340830454L);
        setField(term182062, term182062.getClass(), "cdate", null);
        setField(term182049, term182049.getClass(), "repeatUntilDate", term182062);
        setField(term182049, term182049.getClass(), "frequency", enum354);
        setField(term182049, term182049.getClass(), "status", enum355);
        setField(term182049, term182049.getClass(), "fromClassicAddress", "RUmloTNkOF");
        setField(term182049, term182049.getClass(), "trustlineIssuerClassicAddress", "xlEdrgoOEf");
        setField(term182049, term182049.getClass(), "currencyName", "DfKLAuTNTf");
        setField(term182049, term182049.getClass(), "currencyNameForProcess", "lWuRJaTZQB");
        setField(term182049, term182049.getClass(), "amount", "jiQYzmbdOz");
        setBooleanField(term182049, term182049.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term182049, term182049.getClass(), "useBlacklist", false);
        setField(term182049, term182049.getClass(), "maximumTrustlines", term182153);
        setField(term182049, term182049.getClass(), "dropType", enum356);
        setField(term182049, term182049.getClass(), "failReason", "HBnovMFfRR");
        setField(term182049, term182049.getClass(), "minBalance", "kvBRGWtVMY");
        setField(term182049, term182049.getClass(), "maxBalance", "nnkddhphsi");
        setField(term182049, term182049.getClass(), "totalBlacklisted", term182204);
        setField(term182049, term182049.getClass(), "maxXrpFeePerTransaction", "VPJfuXpuzc");
        setField(term182049, term182049.getClass(), "totalRecipients", term182218);
        setField(term182049, term182049.getClass(), "paymentType", enum357);
        setField(term182049, term182049.getClass(), "snapshotTrustlineIssuerClassicAddress", "zdrDwRmBqL");
        setField(term182049, term182049.getClass(), "snapshotCurrencyName", "DhSRNlYOFL");
        setField(term182049, term182049.getClass(), "nftIssuingAddress", "mrmNORhOYE");
        setField(term182049, term182049.getClass(), "nftTaxon", "IAlXRzFnsw");
        setField(term182049, term182049.getClass(), "scheduleStatus", enum358);
        setField(term182049, term182049.getClass(), "fromScheduleId", term182294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentType", argTypes, term182049, args);
    }

};


