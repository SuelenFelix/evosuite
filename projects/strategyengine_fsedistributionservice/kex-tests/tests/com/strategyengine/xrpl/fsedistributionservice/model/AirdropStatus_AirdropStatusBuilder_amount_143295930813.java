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

public class AirdropStatus_AirdropStatusBuilder_amount_143295930813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488607;

    public AirdropStatus_AirdropStatusBuilder_amount_143295930813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term488611 = new Long(-6779665610828821838L);
        Class<? extends Object> term488907 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term488906 = ((Class) term488907).getDeclaredField((String) "VERIFIED");
        ((Field) term488906).setAccessible(true);
        Object enum915 = ((Field) term488906).get((Object) null);
        Object term488610 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term488610, term488610.getClass(), "id", term488611);
        setField(term488610, term488610.getClass(), "responseCode", "");
        setField(term488610, term488610.getClass(), "reason", "");
        setField(term488610, term488610.getClass(), "classicAddress", "");
        setField(term488610, term488610.getClass(), "status", enum915);
        setField(term488610, term488610.getClass(), "paymentAmount", "");
        setField(term488610, term488610.getClass(), "snapshotBalance", "");
        setField(term488610, term488610.getClass(), "nftOwned", "");
        Long term488622 = new Long(7026184159827656720L);
        Class<? extends Object> term489333 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term489332 = ((Class) term489333).getDeclaredField((String) "QUEUED");
        ((Field) term489332).setAccessible(true);
        Object enum916 = ((Field) term489332).get((Object) null);
        Object term488621 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term488621, term488621.getClass(), "id", term488622);
        setField(term488621, term488621.getClass(), "responseCode", "");
        setField(term488621, term488621.getClass(), "reason", "");
        setField(term488621, term488621.getClass(), "classicAddress", "");
        setField(term488621, term488621.getClass(), "status", enum916);
        setField(term488621, term488621.getClass(), "paymentAmount", "");
        setField(term488621, term488621.getClass(), "snapshotBalance", "");
        setField(term488621, term488621.getClass(), "nftOwned", "");
        Long term488633 = new Long(432186805820232994L);
        Object term488632 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term488632, term488632.getClass(), "id", term488633);
        setField(term488632, term488632.getClass(), "responseCode", "");
        setField(term488632, term488632.getClass(), "reason", "");
        setField(term488632, term488632.getClass(), "classicAddress", "");
        setField(term488632, term488632.getClass(), "status", enum915);
        setField(term488632, term488632.getClass(), "paymentAmount", "");
        setField(term488632, term488632.getClass(), "snapshotBalance", "");
        setField(term488632, term488632.getClass(), "nftOwned", "");
        Long term488642 = new Long(-2991029806121048772L);
        Class<? extends Object> term489753 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term489752 = ((Class) term489753).getDeclaredField((String) "SENDING");
        ((Field) term489752).setAccessible(true);
        Object enum917 = ((Field) term489752).get((Object) null);
        Object term488641 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term488641, term488641.getClass(), "id", term488642);
        setField(term488641, term488641.getClass(), "responseCode", "");
        setField(term488641, term488641.getClass(), "reason", "");
        setField(term488641, term488641.getClass(), "classicAddress", "");
        setField(term488641, term488641.getClass(), "status", enum917);
        setField(term488641, term488641.getClass(), "paymentAmount", "");
        setField(term488641, term488641.getClass(), "snapshotBalance", "");
        setField(term488641, term488641.getClass(), "nftOwned", "");
        ArrayList term488608 = new ArrayList();
        ((ArrayList) term488608).add(term488610);
        ((ArrayList) term488608).add(term488621);
        ((ArrayList) term488608).add(term488632);
        ((ArrayList) term488608).add(term488641);
        Long term488654 = new Long(-1146200229133968810L);
        Class<? extends Object> term490176 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term490175 = ((Class) term490176).getDeclaredField((String) "DAILY");
        ((Field) term490175).setAccessible(true);
        Object enum918 = ((Field) term490175).get((Object) null);
        Class<? extends Object> term490563 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term490562 = ((Class) term490563).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term490562).setAccessible(true);
        Object enum919 = ((Field) term490562).get((Object) null);
        Integer term488750 = new Integer(-420030135);
        Class<? extends Object> term491038 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term491037 = ((Class) term491038).getDeclaredField((String) "GLOBALID");
        ((Field) term491037).setAccessible(true);
        Object enum920 = ((Field) term491037).get((Object) null);
        Long term488800 = new Long(-7968999170526273722L);
        Long term488814 = new Long(-391398551284253915L);
        Class<? extends Object> term491449 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term491448 = ((Class) term491449).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term491448).setAccessible(true);
        Object enum921 = ((Field) term491448).get((Object) null);
        Class<? extends Object> term491887 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term491886 = ((Class) term491887).getDeclaredField((String) "COMPLETE");
        ((Field) term491886).setAccessible(true);
        Object enum922 = ((Field) term491886).get((Object) null);
        Long term488892 = new Long(-2791473406557466846L);
        term488607 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term488656 = newInstance(Class.forName("java.util.Date"));
        Object term488658 = newInstance(Class.forName("java.util.Date"));
        Object term488660 = newInstance(Class.forName("java.util.Date"));
        Object term488662 = newInstance(Class.forName("java.util.Date"));
        setField(term488607, term488607.getClass(), "results", term488608);
        setField(term488607, term488607.getClass(), "id", term488654);
        setLongField(term488656, term488656.getClass(), "fastTime", 1572619293967L);
        setField(term488656, term488656.getClass(), "cdate", null);
        setField(term488607, term488607.getClass(), "createDate", term488656);
        setLongField(term488658, term488658.getClass(), "fastTime", 1299205380525L);
        setField(term488658, term488658.getClass(), "cdate", null);
        setField(term488607, term488607.getClass(), "updateDate", term488658);
        setLongField(term488660, term488660.getClass(), "fastTime", 1738578232316L);
        setField(term488660, term488660.getClass(), "cdate", null);
        setField(term488607, term488607.getClass(), "startTime", term488660);
        setLongField(term488662, term488662.getClass(), "fastTime", 1613059114093L);
        setField(term488662, term488662.getClass(), "cdate", null);
        setField(term488607, term488607.getClass(), "repeatUntilDate", term488662);
        setField(term488607, term488607.getClass(), "frequency", enum918);
        setField(term488607, term488607.getClass(), "status", enum919);
        setField(term488607, term488607.getClass(), "fromClassicAddress", "antCkERyql");
        setField(term488607, term488607.getClass(), "trustlineIssuerClassicAddress", "RLzWpKyOcm");
        setField(term488607, term488607.getClass(), "currencyName", "AiDeJiJcDC");
        setField(term488607, term488607.getClass(), "currencyNameForProcess", "ACFOBqKUKd");
        setField(term488607, term488607.getClass(), "amount", "BIrUkKfKmF");
        setBooleanField(term488607, term488607.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term488607, term488607.getClass(), "useBlacklist", true);
        setField(term488607, term488607.getClass(), "maximumTrustlines", term488750);
        setField(term488607, term488607.getClass(), "dropType", enum920);
        setField(term488607, term488607.getClass(), "failReason", "kKWwlRUdxO");
        setField(term488607, term488607.getClass(), "minBalance", "mPmWMlHjdS");
        setField(term488607, term488607.getClass(), "maxBalance", "vVMAKTsnWp");
        setField(term488607, term488607.getClass(), "totalBlacklisted", term488800);
        setField(term488607, term488607.getClass(), "maxXrpFeePerTransaction", "gHkufiBxQY");
        setField(term488607, term488607.getClass(), "totalRecipients", term488814);
        setField(term488607, term488607.getClass(), "paymentType", enum921);
        setField(term488607, term488607.getClass(), "snapshotTrustlineIssuerClassicAddress", "FpnOTthGSf");
        setField(term488607, term488607.getClass(), "snapshotCurrencyName", "ZlDJfKbWuT");
        setField(term488607, term488607.getClass(), "nftIssuingAddress", "KPKvkukffl");
        setField(term488607, term488607.getClass(), "nftTaxon", "DztkzYmExj");
        setField(term488607, term488607.getClass(), "scheduleStatus", enum922);
        setField(term488607, term488607.getClass(), "fromScheduleId", term488892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jgLlnOSDbQ";
        callMethod(klass, "amount", argTypes, term488607, args);
    }

};


