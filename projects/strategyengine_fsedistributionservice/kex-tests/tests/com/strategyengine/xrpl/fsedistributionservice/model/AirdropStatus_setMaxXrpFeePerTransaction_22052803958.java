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
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_setMaxXrpFeePerTransaction_22052803958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280848;

    public AirdropStatus_setMaxXrpFeePerTransaction_22052803958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term280852 = new Long(-685001356309682920L);
        Class<? extends Object> term281123 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term281122 = ((Class) term281123).getDeclaredField((String) "VERIFIED");
        ((Field) term281122).setAccessible(true);
        Object enum565 = ((Field) term281122).get((Object) null);
        Object term280851 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term280851, term280851.getClass(), "id", term280852);
        setField(term280851, term280851.getClass(), "responseCode", "");
        setField(term280851, term280851.getClass(), "reason", "");
        setField(term280851, term280851.getClass(), "classicAddress", "");
        setField(term280851, term280851.getClass(), "status", enum565);
        setField(term280851, term280851.getClass(), "paymentAmount", "");
        setField(term280851, term280851.getClass(), "snapshotBalance", "");
        setField(term280851, term280851.getClass(), "nftOwned", "");
        Long term280863 = new Long(-3189918180129674609L);
        Class<? extends Object> term281549 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term281548 = ((Class) term281549).getDeclaredField((String) "SENDING");
        ((Field) term281548).setAccessible(true);
        Object enum566 = ((Field) term281548).get((Object) null);
        Object term280862 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term280862, term280862.getClass(), "id", term280863);
        setField(term280862, term280862.getClass(), "responseCode", "");
        setField(term280862, term280862.getClass(), "reason", "");
        setField(term280862, term280862.getClass(), "classicAddress", "");
        setField(term280862, term280862.getClass(), "status", enum566);
        setField(term280862, term280862.getClass(), "paymentAmount", "");
        setField(term280862, term280862.getClass(), "snapshotBalance", "");
        setField(term280862, term280862.getClass(), "nftOwned", "");
        ArrayList term280849 = new ArrayList();
        ((ArrayList) term280849).add(term280851);
        ((ArrayList) term280849).add(term280862);
        Long term280875 = new Long(5271284328066798769L);
        Class<? extends Object> term281972 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term281971 = ((Class) term281972).getDeclaredField((String) "WEEKLY");
        ((Field) term281971).setAccessible(true);
        Object enum567 = ((Field) term281971).get((Object) null);
        Class<? extends Object> term282362 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term282361 = ((Class) term282362).getDeclaredField((String) "QUEUED");
        ((Field) term282361).setAccessible(true);
        Object enum568 = ((Field) term282361).get((Object) null);
        Integer term280967 = new Integer(202001407);
        Class<? extends Object> term282822 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term282821 = ((Class) term282822).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term282821).setAccessible(true);
        Object enum569 = ((Field) term282821).get((Object) null);
        Long term281026 = new Long(1924411240174876881L);
        Long term281040 = new Long(-8287954071414913487L);
        Class<? extends Object> term283260 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term283259 = ((Class) term283260).getDeclaredField((String) "FLAT");
        ((Field) term283259).setAccessible(true);
        Object enum570 = ((Field) term283259).get((Object) null);
        Class<? extends Object> term283674 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term283673 = ((Class) term283674).getDeclaredField((String) "ACTIVE");
        ((Field) term283673).setAccessible(true);
        Object enum571 = ((Field) term283673).get((Object) null);
        Long term281108 = new Long(-1379663556617181551L);
        term280848 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term280877 = newInstance(Class.forName("java.util.Date"));
        Object term280879 = newInstance(Class.forName("java.util.Date"));
        Object term280881 = newInstance(Class.forName("java.util.Date"));
        Object term280883 = newInstance(Class.forName("java.util.Date"));
        setField(term280848, term280848.getClass(), "results", term280849);
        setField(term280848, term280848.getClass(), "id", term280875);
        setLongField(term280877, term280877.getClass(), "fastTime", 1751596639252L);
        setField(term280877, term280877.getClass(), "cdate", null);
        setField(term280848, term280848.getClass(), "createDate", term280877);
        setLongField(term280879, term280879.getClass(), "fastTime", 1692411657105L);
        setField(term280879, term280879.getClass(), "cdate", null);
        setField(term280848, term280848.getClass(), "updateDate", term280879);
        setLongField(term280881, term280881.getClass(), "fastTime", 1737359480414L);
        setField(term280881, term280881.getClass(), "cdate", null);
        setField(term280848, term280848.getClass(), "startTime", term280881);
        setLongField(term280883, term280883.getClass(), "fastTime", 1679478229315L);
        setField(term280883, term280883.getClass(), "cdate", null);
        setField(term280848, term280848.getClass(), "repeatUntilDate", term280883);
        setField(term280848, term280848.getClass(), "frequency", enum567);
        setField(term280848, term280848.getClass(), "status", enum568);
        setField(term280848, term280848.getClass(), "fromClassicAddress", "jhXmnsQIUw");
        setField(term280848, term280848.getClass(), "trustlineIssuerClassicAddress", "qTRnuuLERk");
        setField(term280848, term280848.getClass(), "currencyName", "ieCQQDUgWu");
        setField(term280848, term280848.getClass(), "currencyNameForProcess", "tIHHXpuCOh");
        setField(term280848, term280848.getClass(), "amount", "oCLpbAHyax");
        setBooleanField(term280848, term280848.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term280848, term280848.getClass(), "useBlacklist", false);
        setField(term280848, term280848.getClass(), "maximumTrustlines", term280967);
        setField(term280848, term280848.getClass(), "dropType", enum569);
        setField(term280848, term280848.getClass(), "failReason", "nKWQlKSRtt");
        setField(term280848, term280848.getClass(), "minBalance", "PiyYqhsqYA");
        setField(term280848, term280848.getClass(), "maxBalance", "awpFkVwkVc");
        setField(term280848, term280848.getClass(), "totalBlacklisted", term281026);
        setField(term280848, term280848.getClass(), "maxXrpFeePerTransaction", "mfjXySIEmZ");
        setField(term280848, term280848.getClass(), "totalRecipients", term281040);
        setField(term280848, term280848.getClass(), "paymentType", enum570);
        setField(term280848, term280848.getClass(), "snapshotTrustlineIssuerClassicAddress", "IGtYdNRgoQ");
        setField(term280848, term280848.getClass(), "snapshotCurrencyName", "bQNBqTrhUF");
        setField(term280848, term280848.getClass(), "nftIssuingAddress", "pNNhlLiKcO");
        setField(term280848, term280848.getClass(), "nftTaxon", "hyXBBcBogW");
        setField(term280848, term280848.getClass(), "scheduleStatus", enum571);
        setField(term280848, term280848.getClass(), "fromScheduleId", term281108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZkdrWdXgOr";
        callMethod(klass, "setMaxXrpFeePerTransaction", argTypes, term280848, args);
    }

};


