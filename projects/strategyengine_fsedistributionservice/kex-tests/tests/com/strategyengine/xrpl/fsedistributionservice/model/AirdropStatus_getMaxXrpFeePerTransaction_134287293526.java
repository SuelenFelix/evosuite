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

public class AirdropStatus_getMaxXrpFeePerTransaction_134287293526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176830;

    public AirdropStatus_getMaxXrpFeePerTransaction_134287293526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term176831 = new ArrayList();
        Long term176835 = new Long(185544001230120339L);
        Class<? extends Object> term177073 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term177072 = ((Class) term177073).getDeclaredField((String) "MONTHLY");
        ((Field) term177072).setAccessible(true);
        Object enum343 = ((Field) term177072).get((Object) null);
        Class<? extends Object> term177466 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term177465 = ((Class) term177466).getDeclaredField((String) "COMPLETE");
        ((Field) term177465).setAccessible(true);
        Object enum344 = ((Field) term177465).get((Object) null);
        Integer term176930 = new Integer(691577392);
        Class<? extends Object> term177932 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term177931 = ((Class) term177932).getDeclaredField((String) "GLOBALID");
        ((Field) term177931).setAccessible(true);
        Object enum345 = ((Field) term177931).get((Object) null);
        Long term176980 = new Long(4096288569907305445L);
        Long term176994 = new Long(6940486570215409900L);
        Class<? extends Object> term178343 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term178342 = ((Class) term178343).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term178342).setAccessible(true);
        Object enum346 = ((Field) term178342).get((Object) null);
        Class<? extends Object> term178781 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term178780 = ((Class) term178781).getDeclaredField((String) "ACTIVE");
        ((Field) term178780).setAccessible(true);
        Object enum347 = ((Field) term178780).get((Object) null);
        Long term177070 = new Long(-7370364068296402536L);
        term176830 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term176837 = newInstance(Class.forName("java.util.Date"));
        Object term176839 = newInstance(Class.forName("java.util.Date"));
        Object term176841 = newInstance(Class.forName("java.util.Date"));
        Object term176843 = newInstance(Class.forName("java.util.Date"));
        setField(term176830, term176830.getClass(), "results", term176831);
        setField(term176830, term176830.getClass(), "id", term176835);
        setLongField(term176837, term176837.getClass(), "fastTime", 1688138498192L);
        setField(term176837, term176837.getClass(), "cdate", null);
        setField(term176830, term176830.getClass(), "createDate", term176837);
        setLongField(term176839, term176839.getClass(), "fastTime", 1321873654655L);
        setField(term176839, term176839.getClass(), "cdate", null);
        setField(term176830, term176830.getClass(), "updateDate", term176839);
        setLongField(term176841, term176841.getClass(), "fastTime", 1381141895666L);
        setField(term176841, term176841.getClass(), "cdate", null);
        setField(term176830, term176830.getClass(), "startTime", term176841);
        setLongField(term176843, term176843.getClass(), "fastTime", 1390002174929L);
        setField(term176843, term176843.getClass(), "cdate", null);
        setField(term176830, term176830.getClass(), "repeatUntilDate", term176843);
        setField(term176830, term176830.getClass(), "frequency", enum343);
        setField(term176830, term176830.getClass(), "status", enum344);
        setField(term176830, term176830.getClass(), "fromClassicAddress", "nSSytCAuBk");
        setField(term176830, term176830.getClass(), "trustlineIssuerClassicAddress", "XiZyOHXnNC");
        setField(term176830, term176830.getClass(), "currencyName", "gQlDPvSqrX");
        setField(term176830, term176830.getClass(), "currencyNameForProcess", "EnYnZHmIml");
        setField(term176830, term176830.getClass(), "amount", "jvhvoAISsw");
        setBooleanField(term176830, term176830.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term176830, term176830.getClass(), "useBlacklist", true);
        setField(term176830, term176830.getClass(), "maximumTrustlines", term176930);
        setField(term176830, term176830.getClass(), "dropType", enum345);
        setField(term176830, term176830.getClass(), "failReason", "NkOntrweCo");
        setField(term176830, term176830.getClass(), "minBalance", "hVtvnBKztu");
        setField(term176830, term176830.getClass(), "maxBalance", "VOpwlWudOv");
        setField(term176830, term176830.getClass(), "totalBlacklisted", term176980);
        setField(term176830, term176830.getClass(), "maxXrpFeePerTransaction", "eEXpzGjDgl");
        setField(term176830, term176830.getClass(), "totalRecipients", term176994);
        setField(term176830, term176830.getClass(), "paymentType", enum346);
        setField(term176830, term176830.getClass(), "snapshotTrustlineIssuerClassicAddress", "vGLuBgtHzA");
        setField(term176830, term176830.getClass(), "snapshotCurrencyName", "iOiyjODkqg");
        setField(term176830, term176830.getClass(), "nftIssuingAddress", "pgpXJLwACM");
        setField(term176830, term176830.getClass(), "nftTaxon", "JgrZdrciib");
        setField(term176830, term176830.getClass(), "scheduleStatus", enum347);
        setField(term176830, term176830.getClass(), "fromScheduleId", term177070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxXrpFeePerTransaction", argTypes, term176830, args);
    }

};


