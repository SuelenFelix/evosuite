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

public class AirdropStatus_AirdropStatusBuilder_useBlacklist_47039707915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494732;
     Object term494975;

    public AirdropStatus_AirdropStatusBuilder_useBlacklist_47039707915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term494733 = new ArrayList();
        Long term494737 = new Long(-94386090490716219L);
        Class<? extends Object> term494978 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term494977 = ((Class) term494978).getDeclaredField((String) "MONTHLY");
        ((Field) term494977).setAccessible(true);
        Object enum928 = ((Field) term494977).get((Object) null);
        Class<? extends Object> term495371 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term495370 = ((Class) term495371).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term495370).setAccessible(true);
        Object enum929 = ((Field) term495370).get((Object) null);
        Integer term494838 = new Integer(-1497710478);
        Class<? extends Object> term495855 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term495854 = ((Class) term495855).getDeclaredField((String) "TRUSTLINE");
        ((Field) term495854).setAccessible(true);
        Object enum930 = ((Field) term495854).get((Object) null);
        Long term494889 = new Long(-5539140353886034290L);
        Long term494903 = new Long(-2993798135603613656L);
        Class<? extends Object> term496269 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term496268 = ((Class) term496269).getDeclaredField((String) "FLAT");
        ((Field) term496268).setAccessible(true);
        Object enum931 = ((Field) term496268).get((Object) null);
        Class<? extends Object> term496683 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term496682 = ((Class) term496683).getDeclaredField((String) "COMPLETE");
        ((Field) term496682).setAccessible(true);
        Object enum932 = ((Field) term496682).get((Object) null);
        Long term494973 = new Long(7643902889687500887L);
        term494732 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term494739 = newInstance(Class.forName("java.util.Date"));
        Object term494741 = newInstance(Class.forName("java.util.Date"));
        Object term494743 = newInstance(Class.forName("java.util.Date"));
        Object term494745 = newInstance(Class.forName("java.util.Date"));
        setField(term494732, term494732.getClass(), "results", term494733);
        setField(term494732, term494732.getClass(), "id", term494737);
        setLongField(term494739, term494739.getClass(), "fastTime", 1829653462126L);
        setField(term494739, term494739.getClass(), "cdate", null);
        setField(term494732, term494732.getClass(), "createDate", term494739);
        setLongField(term494741, term494741.getClass(), "fastTime", 1679432216993L);
        setField(term494741, term494741.getClass(), "cdate", null);
        setField(term494732, term494732.getClass(), "updateDate", term494741);
        setLongField(term494743, term494743.getClass(), "fastTime", 1758414985665L);
        setField(term494743, term494743.getClass(), "cdate", null);
        setField(term494732, term494732.getClass(), "startTime", term494743);
        setLongField(term494745, term494745.getClass(), "fastTime", 1302922894613L);
        setField(term494745, term494745.getClass(), "cdate", null);
        setField(term494732, term494732.getClass(), "repeatUntilDate", term494745);
        setField(term494732, term494732.getClass(), "frequency", enum928);
        setField(term494732, term494732.getClass(), "status", enum929);
        setField(term494732, term494732.getClass(), "fromClassicAddress", "NxaXDGmFox");
        setField(term494732, term494732.getClass(), "trustlineIssuerClassicAddress", "wNfCoECSdJ");
        setField(term494732, term494732.getClass(), "currencyName", "tCNdSxfOaB");
        setField(term494732, term494732.getClass(), "currencyNameForProcess", "MGMcdMpSfC");
        setField(term494732, term494732.getClass(), "amount", "kMdSIzbJlX");
        setBooleanField(term494732, term494732.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term494732, term494732.getClass(), "useBlacklist", false);
        setField(term494732, term494732.getClass(), "maximumTrustlines", term494838);
        setField(term494732, term494732.getClass(), "dropType", enum930);
        setField(term494732, term494732.getClass(), "failReason", "SjYMHgEWRM");
        setField(term494732, term494732.getClass(), "minBalance", "KZGFIzWwqH");
        setField(term494732, term494732.getClass(), "maxBalance", "AelQdYRmHZ");
        setField(term494732, term494732.getClass(), "totalBlacklisted", term494889);
        setField(term494732, term494732.getClass(), "maxXrpFeePerTransaction", "bOPaMsPSyq");
        setField(term494732, term494732.getClass(), "totalRecipients", term494903);
        setField(term494732, term494732.getClass(), "paymentType", enum931);
        setField(term494732, term494732.getClass(), "snapshotTrustlineIssuerClassicAddress", "slpsXDdiXm");
        setField(term494732, term494732.getClass(), "snapshotCurrencyName", "CrwhMcTxfa");
        setField(term494732, term494732.getClass(), "nftIssuingAddress", "HqjOaRqVoo");
        setField(term494732, term494732.getClass(), "nftTaxon", "HouDaCvEOJ");
        setField(term494732, term494732.getClass(), "scheduleStatus", enum932);
        setField(term494732, term494732.getClass(), "fromScheduleId", term494973);
        term494975 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term494975;
        callMethod(klass, "useBlacklist", argTypes, term494732, args);
    }

};


