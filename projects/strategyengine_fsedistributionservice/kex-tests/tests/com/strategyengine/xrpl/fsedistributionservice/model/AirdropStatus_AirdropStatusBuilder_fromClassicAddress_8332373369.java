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

public class AirdropStatus_AirdropStatusBuilder_fromClassicAddress_8332373369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475322;

    public AirdropStatus_AirdropStatusBuilder_fromClassicAddress_8332373369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term475323 = new ArrayList();
        Long term475327 = new Long(4992284695861622180L);
        Class<? extends Object> term475583 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term475582 = ((Class) term475583).getDeclaredField((String) "ANNUALLY");
        ((Field) term475582).setAccessible(true);
        Object enum887 = ((Field) term475582).get((Object) null);
        Class<? extends Object> term475979 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term475978 = ((Class) term475979).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term475978).setAccessible(true);
        Object enum888 = ((Field) term475978).get((Object) null);
        Integer term475435 = new Integer(1935707624);
        Class<? extends Object> term476481 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term476480 = ((Class) term476481).getDeclaredField((String) "TRUSTLINE");
        ((Field) term476480).setAccessible(true);
        Object enum889 = ((Field) term476480).get((Object) null);
        Long term475486 = new Long(-6376003179103732362L);
        Long term475500 = new Long(-2050936198165389315L);
        Class<? extends Object> term476895 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term476894 = ((Class) term476895).getDeclaredField((String) "FLAT");
        ((Field) term476894).setAccessible(true);
        Object enum890 = ((Field) term476894).get((Object) null);
        Class<? extends Object> term477309 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term477308 = ((Class) term477309).getDeclaredField((String) "ACTIVE");
        ((Field) term477308).setAccessible(true);
        Object enum891 = ((Field) term477308).get((Object) null);
        Long term475568 = new Long(-8751837616810275039L);
        term475322 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term475329 = newInstance(Class.forName("java.util.Date"));
        Object term475331 = newInstance(Class.forName("java.util.Date"));
        Object term475333 = newInstance(Class.forName("java.util.Date"));
        Object term475335 = newInstance(Class.forName("java.util.Date"));
        setField(term475322, term475322.getClass(), "results", term475323);
        setField(term475322, term475322.getClass(), "id", term475327);
        setLongField(term475329, term475329.getClass(), "fastTime", 1630991272268L);
        setField(term475329, term475329.getClass(), "cdate", null);
        setField(term475322, term475322.getClass(), "createDate", term475329);
        setLongField(term475331, term475331.getClass(), "fastTime", 1597389969262L);
        setField(term475331, term475331.getClass(), "cdate", null);
        setField(term475322, term475322.getClass(), "updateDate", term475331);
        setLongField(term475333, term475333.getClass(), "fastTime", 1472249489629L);
        setField(term475333, term475333.getClass(), "cdate", null);
        setField(term475322, term475322.getClass(), "startTime", term475333);
        setLongField(term475335, term475335.getClass(), "fastTime", 1533646079618L);
        setField(term475335, term475335.getClass(), "cdate", null);
        setField(term475322, term475322.getClass(), "repeatUntilDate", term475335);
        setField(term475322, term475322.getClass(), "frequency", enum887);
        setField(term475322, term475322.getClass(), "status", enum888);
        setField(term475322, term475322.getClass(), "fromClassicAddress", "KegshKdpZe");
        setField(term475322, term475322.getClass(), "trustlineIssuerClassicAddress", "uSUOJfFAeX");
        setField(term475322, term475322.getClass(), "currencyName", "KOOGHqzUDs");
        setField(term475322, term475322.getClass(), "currencyNameForProcess", "JRdGhDJvlf");
        setField(term475322, term475322.getClass(), "amount", "eTowdwLwIC");
        setBooleanField(term475322, term475322.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term475322, term475322.getClass(), "useBlacklist", true);
        setField(term475322, term475322.getClass(), "maximumTrustlines", term475435);
        setField(term475322, term475322.getClass(), "dropType", enum889);
        setField(term475322, term475322.getClass(), "failReason", "ZZsQCEEVKE");
        setField(term475322, term475322.getClass(), "minBalance", "hKBSHXXlvX");
        setField(term475322, term475322.getClass(), "maxBalance", "pZqmVVEcJR");
        setField(term475322, term475322.getClass(), "totalBlacklisted", term475486);
        setField(term475322, term475322.getClass(), "maxXrpFeePerTransaction", "vaYnGhiSYc");
        setField(term475322, term475322.getClass(), "totalRecipients", term475500);
        setField(term475322, term475322.getClass(), "paymentType", enum890);
        setField(term475322, term475322.getClass(), "snapshotTrustlineIssuerClassicAddress", "iCvpnoRweF");
        setField(term475322, term475322.getClass(), "snapshotCurrencyName", "inQpmScxiy");
        setField(term475322, term475322.getClass(), "nftIssuingAddress", "pxviRKMdhZ");
        setField(term475322, term475322.getClass(), "nftTaxon", "mzpZtwUvBH");
        setField(term475322, term475322.getClass(), "scheduleStatus", enum891);
        setField(term475322, term475322.getClass(), "fromScheduleId", term475568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjGhzsSgdc";
        callMethod(klass, "fromClassicAddress", argTypes, term475322, args);
    }

};


