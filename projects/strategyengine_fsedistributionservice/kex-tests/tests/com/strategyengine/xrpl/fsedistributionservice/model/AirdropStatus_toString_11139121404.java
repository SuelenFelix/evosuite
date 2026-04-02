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

public class AirdropStatus_toString_11139121404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99015;

    public AirdropStatus_toString_11139121404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99019 = new Long(5806367330808555223L);
        Class<? extends Object> term99290 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term99289 = ((Class) term99290).getDeclaredField((String) "VERIFIED");
        ((Field) term99289).setAccessible(true);
        Object enum176 = ((Field) term99289).get((Object) null);
        Object term99018 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term99018, term99018.getClass(), "id", term99019);
        setField(term99018, term99018.getClass(), "responseCode", "");
        setField(term99018, term99018.getClass(), "reason", "");
        setField(term99018, term99018.getClass(), "classicAddress", "");
        setField(term99018, term99018.getClass(), "status", enum176);
        setField(term99018, term99018.getClass(), "paymentAmount", "");
        setField(term99018, term99018.getClass(), "snapshotBalance", "");
        setField(term99018, term99018.getClass(), "nftOwned", "");
        Long term99030 = new Long(4576699120365923235L);
        Class<? extends Object> term99716 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term99715 = ((Class) term99716).getDeclaredField((String) "QUEUED");
        ((Field) term99715).setAccessible(true);
        Object enum177 = ((Field) term99715).get((Object) null);
        Object term99029 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term99029, term99029.getClass(), "id", term99030);
        setField(term99029, term99029.getClass(), "responseCode", "");
        setField(term99029, term99029.getClass(), "reason", "");
        setField(term99029, term99029.getClass(), "classicAddress", "");
        setField(term99029, term99029.getClass(), "status", enum177);
        setField(term99029, term99029.getClass(), "paymentAmount", "");
        setField(term99029, term99029.getClass(), "snapshotBalance", "");
        setField(term99029, term99029.getClass(), "nftOwned", "");
        ArrayList term99016 = new ArrayList();
        ((ArrayList) term99016).add(term99018);
        ((ArrayList) term99016).add(term99029);
        Long term99042 = new Long(-1635471392209071620L);
        Class<? extends Object> term100136 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term100135 = ((Class) term100136).getDeclaredField((String) "ANNUALLY");
        ((Field) term100135).setAccessible(true);
        Object enum178 = ((Field) term100135).get((Object) null);
        Class<? extends Object> term100532 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term100531 = ((Class) term100532).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term100531).setAccessible(true);
        Object enum179 = ((Field) term100531).get((Object) null);
        Integer term99144 = new Integer(-344842608);
        Class<? extends Object> term101016 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term101015 = ((Class) term101016).getDeclaredField((String) "TRUSTLINE");
        ((Field) term101015).setAccessible(true);
        Object enum180 = ((Field) term101015).get((Object) null);
        Long term99195 = new Long(-4714000263923324167L);
        Long term99209 = new Long(6906379511067694917L);
        Class<? extends Object> term101430 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term101429 = ((Class) term101430).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term101429).setAccessible(true);
        Object enum181 = ((Field) term101429).get((Object) null);
        Class<? extends Object> term101868 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term101867 = ((Class) term101868).getDeclaredField((String) "REJECTED");
        ((Field) term101867).setAccessible(true);
        Object enum182 = ((Field) term101867).get((Object) null);
        Long term99287 = new Long(-9204303423581447271L);
        term99015 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term99044 = newInstance(Class.forName("java.util.Date"));
        Object term99046 = newInstance(Class.forName("java.util.Date"));
        Object term99048 = newInstance(Class.forName("java.util.Date"));
        Object term99050 = newInstance(Class.forName("java.util.Date"));
        setField(term99015, term99015.getClass(), "results", term99016);
        setField(term99015, term99015.getClass(), "id", term99042);
        setLongField(term99044, term99044.getClass(), "fastTime", 1654999632684L);
        setField(term99044, term99044.getClass(), "cdate", null);
        setField(term99015, term99015.getClass(), "createDate", term99044);
        setLongField(term99046, term99046.getClass(), "fastTime", 1664732674090L);
        setField(term99046, term99046.getClass(), "cdate", null);
        setField(term99015, term99015.getClass(), "updateDate", term99046);
        setLongField(term99048, term99048.getClass(), "fastTime", 1699925062576L);
        setField(term99048, term99048.getClass(), "cdate", null);
        setField(term99015, term99015.getClass(), "startTime", term99048);
        setLongField(term99050, term99050.getClass(), "fastTime", 1706636196274L);
        setField(term99050, term99050.getClass(), "cdate", null);
        setField(term99015, term99015.getClass(), "repeatUntilDate", term99050);
        setField(term99015, term99015.getClass(), "frequency", enum178);
        setField(term99015, term99015.getClass(), "status", enum179);
        setField(term99015, term99015.getClass(), "fromClassicAddress", "FivesaUeHG");
        setField(term99015, term99015.getClass(), "trustlineIssuerClassicAddress", "TnpXhZmCRY");
        setField(term99015, term99015.getClass(), "currencyName", "ECVAXFhrTP");
        setField(term99015, term99015.getClass(), "currencyNameForProcess", "ypytdNbrBc");
        setField(term99015, term99015.getClass(), "amount", "XvrJCOSYei");
        setBooleanField(term99015, term99015.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term99015, term99015.getClass(), "useBlacklist", true);
        setField(term99015, term99015.getClass(), "maximumTrustlines", term99144);
        setField(term99015, term99015.getClass(), "dropType", enum180);
        setField(term99015, term99015.getClass(), "failReason", "QdRcxOxNSl");
        setField(term99015, term99015.getClass(), "minBalance", "lvdsucnNvR");
        setField(term99015, term99015.getClass(), "maxBalance", "mSjSKfeMUn");
        setField(term99015, term99015.getClass(), "totalBlacklisted", term99195);
        setField(term99015, term99015.getClass(), "maxXrpFeePerTransaction", "nVXCBYnEcg");
        setField(term99015, term99015.getClass(), "totalRecipients", term99209);
        setField(term99015, term99015.getClass(), "paymentType", enum181);
        setField(term99015, term99015.getClass(), "snapshotTrustlineIssuerClassicAddress", "fcLnKXxzfM");
        setField(term99015, term99015.getClass(), "snapshotCurrencyName", "FtyaWnfsgn");
        setField(term99015, term99015.getClass(), "nftIssuingAddress", "qphbpPdwrD");
        setField(term99015, term99015.getClass(), "nftTaxon", "xHdHafzFSM");
        setField(term99015, term99015.getClass(), "scheduleStatus", enum182);
        setField(term99015, term99015.getClass(), "fromScheduleId", term99287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term99015, args);
    }

};


