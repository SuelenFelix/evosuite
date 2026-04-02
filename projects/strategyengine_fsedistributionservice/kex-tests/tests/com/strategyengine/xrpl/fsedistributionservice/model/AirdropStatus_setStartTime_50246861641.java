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

public class AirdropStatus_setStartTime_50246861641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223357;
     Object term223604;

    public AirdropStatus_setStartTime_50246861641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term223358 = new ArrayList();
        Long term223362 = new Long(-7830820957252387854L);
        Class<? extends Object> term223607 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term223606 = ((Class) term223607).getDeclaredField((String) "ANNUALLY");
        ((Field) term223606).setAccessible(true);
        Object enum442 = ((Field) term223606).get((Object) null);
        Class<? extends Object> term224003 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term224002 = ((Class) term224003).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term224002).setAccessible(true);
        Object enum443 = ((Field) term224002).get((Object) null);
        Integer term223461 = new Integer(-341152642);
        Class<? extends Object> term224478 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term224477 = ((Class) term224478).getDeclaredField((String) "TRUSTLINE");
        ((Field) term224477).setAccessible(true);
        Object enum444 = ((Field) term224477).get((Object) null);
        Long term223512 = new Long(-8985577692063635272L);
        Long term223526 = new Long(6545086285386938562L);
        Class<? extends Object> term224892 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term224891 = ((Class) term224892).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term224891).setAccessible(true);
        Object enum445 = ((Field) term224891).get((Object) null);
        Class<? extends Object> term225330 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term225329 = ((Class) term225330).getDeclaredField((String) "ACTIVE");
        ((Field) term225329).setAccessible(true);
        Object enum446 = ((Field) term225329).get((Object) null);
        Long term223602 = new Long(3951346165629352117L);
        term223357 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term223364 = newInstance(Class.forName("java.util.Date"));
        Object term223366 = newInstance(Class.forName("java.util.Date"));
        Object term223368 = newInstance(Class.forName("java.util.Date"));
        Object term223370 = newInstance(Class.forName("java.util.Date"));
        setField(term223357, term223357.getClass(), "results", term223358);
        setField(term223357, term223357.getClass(), "id", term223362);
        setLongField(term223364, term223364.getClass(), "fastTime", 1585793301413L);
        setField(term223364, term223364.getClass(), "cdate", null);
        setField(term223357, term223357.getClass(), "createDate", term223364);
        setLongField(term223366, term223366.getClass(), "fastTime", 1368490169744L);
        setField(term223366, term223366.getClass(), "cdate", null);
        setField(term223357, term223357.getClass(), "updateDate", term223366);
        setLongField(term223368, term223368.getClass(), "fastTime", 1288081804912L);
        setField(term223368, term223368.getClass(), "cdate", null);
        setField(term223357, term223357.getClass(), "startTime", term223368);
        setLongField(term223370, term223370.getClass(), "fastTime", 1386992702859L);
        setField(term223370, term223370.getClass(), "cdate", null);
        setField(term223357, term223357.getClass(), "repeatUntilDate", term223370);
        setField(term223357, term223357.getClass(), "frequency", enum442);
        setField(term223357, term223357.getClass(), "status", enum443);
        setField(term223357, term223357.getClass(), "fromClassicAddress", "bMYsCPikwh");
        setField(term223357, term223357.getClass(), "trustlineIssuerClassicAddress", "hZENcMRjJX");
        setField(term223357, term223357.getClass(), "currencyName", "iUsNqPEgsp");
        setField(term223357, term223357.getClass(), "currencyNameForProcess", "ODyqlitqRS");
        setField(term223357, term223357.getClass(), "amount", "BKEyXkrXND");
        setBooleanField(term223357, term223357.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term223357, term223357.getClass(), "useBlacklist", true);
        setField(term223357, term223357.getClass(), "maximumTrustlines", term223461);
        setField(term223357, term223357.getClass(), "dropType", enum444);
        setField(term223357, term223357.getClass(), "failReason", "xpmkTXUaIW");
        setField(term223357, term223357.getClass(), "minBalance", "mkwXyNcVfj");
        setField(term223357, term223357.getClass(), "maxBalance", "JaYInVuGAK");
        setField(term223357, term223357.getClass(), "totalBlacklisted", term223512);
        setField(term223357, term223357.getClass(), "maxXrpFeePerTransaction", "BhaPbaZeBl");
        setField(term223357, term223357.getClass(), "totalRecipients", term223526);
        setField(term223357, term223357.getClass(), "paymentType", enum445);
        setField(term223357, term223357.getClass(), "snapshotTrustlineIssuerClassicAddress", "GYqwdcmcTy");
        setField(term223357, term223357.getClass(), "snapshotCurrencyName", "gUVQwUdnBZ");
        setField(term223357, term223357.getClass(), "nftIssuingAddress", "DbGJbEhLhl");
        setField(term223357, term223357.getClass(), "nftTaxon", "BGxrtAjHqX");
        setField(term223357, term223357.getClass(), "scheduleStatus", enum446);
        setField(term223357, term223357.getClass(), "fromScheduleId", term223602);
        term223604 = newInstance(Class.forName("java.util.Date"));
        setLongField(term223604, term223604.getClass(), "fastTime", 1833571871553L);
        setField(term223604, term223604.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term223604;
        callMethod(klass, "setStartTime", argTypes, term223357, args);
    }

};


