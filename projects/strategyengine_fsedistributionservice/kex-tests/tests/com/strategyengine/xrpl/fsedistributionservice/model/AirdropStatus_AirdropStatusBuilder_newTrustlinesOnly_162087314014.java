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
import java.lang.Boolean;

public class AirdropStatus_AirdropStatusBuilder_newTrustlinesOnly_162087314014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492317;
     Object term492571;

    public AirdropStatus_AirdropStatusBuilder_newTrustlinesOnly_162087314014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term492318 = new ArrayList();
        Long term492322 = new Long(-3895780534600959979L);
        Class<? extends Object> term492574 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term492573 = ((Class) term492574).getDeclaredField((String) "WEEKLY");
        ((Field) term492573).setAccessible(true);
        Object enum923 = ((Field) term492573).get((Object) null);
        Class<? extends Object> term492964 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term492963 = ((Class) term492964).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term492963).setAccessible(true);
        Object enum924 = ((Field) term492963).get((Object) null);
        Integer term492428 = new Integer(267763294);
        Class<? extends Object> term493466 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term493465 = ((Class) term493466).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term493465).setAccessible(true);
        Object enum925 = ((Field) term493465).get((Object) null);
        Long term492487 = new Long(789661870469773196L);
        Long term492501 = new Long(-3484599398786804700L);
        Class<? extends Object> term493904 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term493903 = ((Class) term493904).getDeclaredField((String) "FLAT");
        ((Field) term493903).setAccessible(true);
        Object enum926 = ((Field) term493903).get((Object) null);
        Class<? extends Object> term494318 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term494317 = ((Class) term494318).getDeclaredField((String) "ACTIVE");
        ((Field) term494317).setAccessible(true);
        Object enum927 = ((Field) term494317).get((Object) null);
        Long term492569 = new Long(-5259338558309636239L);
        term492317 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term492324 = newInstance(Class.forName("java.util.Date"));
        Object term492326 = newInstance(Class.forName("java.util.Date"));
        Object term492328 = newInstance(Class.forName("java.util.Date"));
        Object term492330 = newInstance(Class.forName("java.util.Date"));
        setField(term492317, term492317.getClass(), "results", term492318);
        setField(term492317, term492317.getClass(), "id", term492322);
        setLongField(term492324, term492324.getClass(), "fastTime", 1785977742653L);
        setField(term492324, term492324.getClass(), "cdate", null);
        setField(term492317, term492317.getClass(), "createDate", term492324);
        setLongField(term492326, term492326.getClass(), "fastTime", 1267970948843L);
        setField(term492326, term492326.getClass(), "cdate", null);
        setField(term492317, term492317.getClass(), "updateDate", term492326);
        setLongField(term492328, term492328.getClass(), "fastTime", 1532965089867L);
        setField(term492328, term492328.getClass(), "cdate", null);
        setField(term492317, term492317.getClass(), "startTime", term492328);
        setLongField(term492330, term492330.getClass(), "fastTime", 1618584030428L);
        setField(term492330, term492330.getClass(), "cdate", null);
        setField(term492317, term492317.getClass(), "repeatUntilDate", term492330);
        setField(term492317, term492317.getClass(), "frequency", enum923);
        setField(term492317, term492317.getClass(), "status", enum924);
        setField(term492317, term492317.getClass(), "fromClassicAddress", "KJGZNumCAL");
        setField(term492317, term492317.getClass(), "trustlineIssuerClassicAddress", "iBvRhpQbES");
        setField(term492317, term492317.getClass(), "currencyName", "kNYoaOPXRc");
        setField(term492317, term492317.getClass(), "currencyNameForProcess", "tYZxePZIvy");
        setField(term492317, term492317.getClass(), "amount", "kvHeZIxKeu");
        setBooleanField(term492317, term492317.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term492317, term492317.getClass(), "useBlacklist", false);
        setField(term492317, term492317.getClass(), "maximumTrustlines", term492428);
        setField(term492317, term492317.getClass(), "dropType", enum925);
        setField(term492317, term492317.getClass(), "failReason", "sFuwqpHtuJ");
        setField(term492317, term492317.getClass(), "minBalance", "bMJcegMICR");
        setField(term492317, term492317.getClass(), "maxBalance", "ISmVucBSqp");
        setField(term492317, term492317.getClass(), "totalBlacklisted", term492487);
        setField(term492317, term492317.getClass(), "maxXrpFeePerTransaction", "zJfxfAWdxN");
        setField(term492317, term492317.getClass(), "totalRecipients", term492501);
        setField(term492317, term492317.getClass(), "paymentType", enum926);
        setField(term492317, term492317.getClass(), "snapshotTrustlineIssuerClassicAddress", "lPOtrbBtKg");
        setField(term492317, term492317.getClass(), "snapshotCurrencyName", "DoQKZouOMo");
        setField(term492317, term492317.getClass(), "nftIssuingAddress", "eBKpRbeIXG");
        setField(term492317, term492317.getClass(), "nftTaxon", "ImITtFnAXw");
        setField(term492317, term492317.getClass(), "scheduleStatus", enum927);
        setField(term492317, term492317.getClass(), "fromScheduleId", term492569);
        term492571 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term492571;
        callMethod(klass, "newTrustlinesOnly", argTypes, term492317, args);
    }

};


