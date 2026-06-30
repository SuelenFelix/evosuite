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

public class AirdropStatus_getDropType_11819884421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159085;

    public AirdropStatus_getDropType_11819884421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159089 = new Long(-4776514981294468834L);
        Class<? extends Object> term159352 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term159351 = ((Class) term159352).getDeclaredField((String) "VERIFIED");
        ((Field) term159351).setAccessible(true);
        Object enum305 = ((Field) term159351).get((Object) null);
        Object term159088 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term159088, term159088.getClass(), "id", term159089);
        setField(term159088, term159088.getClass(), "responseCode", "");
        setField(term159088, term159088.getClass(), "reason", "");
        setField(term159088, term159088.getClass(), "classicAddress", "");
        setField(term159088, term159088.getClass(), "status", enum305);
        setField(term159088, term159088.getClass(), "paymentAmount", "");
        setField(term159088, term159088.getClass(), "snapshotBalance", "");
        setField(term159088, term159088.getClass(), "nftOwned", "");
        Long term159100 = new Long(-7273680182770718108L);
        Class<? extends Object> term159778 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term159777 = ((Class) term159778).getDeclaredField((String) "VERIFIED");
        ((Field) term159777).setAccessible(true);
        Object enum306 = ((Field) term159777).get((Object) null);
        Object term159099 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term159099, term159099.getClass(), "id", term159100);
        setField(term159099, term159099.getClass(), "responseCode", "");
        setField(term159099, term159099.getClass(), "reason", "");
        setField(term159099, term159099.getClass(), "classicAddress", "");
        setField(term159099, term159099.getClass(), "status", enum306);
        setField(term159099, term159099.getClass(), "paymentAmount", "");
        setField(term159099, term159099.getClass(), "snapshotBalance", "");
        setField(term159099, term159099.getClass(), "nftOwned", "");
        ArrayList term159086 = new ArrayList();
        ((ArrayList) term159086).add(term159088);
        ((ArrayList) term159086).add(term159099);
        Long term159112 = new Long(-421166328269063791L);
        Class<? extends Object> term160204 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term160203 = ((Class) term160204).getDeclaredField((String) "WEEKLY");
        ((Field) term160203).setAccessible(true);
        Object enum307 = ((Field) term160203).get((Object) null);
        Class<? extends Object> term160594 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term160593 = ((Class) term160594).getDeclaredField((String) "REJECTED");
        ((Field) term160593).setAccessible(true);
        Object enum308 = ((Field) term160593).get((Object) null);
        Integer term159206 = new Integer(-341962980);
        Class<? extends Object> term161060 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term161059 = ((Class) term161060).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term161059).setAccessible(true);
        Object enum309 = ((Field) term161059).get((Object) null);
        Long term159265 = new Long(4811527754205378980L);
        Long term159279 = new Long(9174730812791817537L);
        Class<? extends Object> term161498 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term161497 = ((Class) term161498).getDeclaredField((String) "FLAT");
        ((Field) term161497).setAccessible(true);
        Object enum310 = ((Field) term161497).get((Object) null);
        Class<? extends Object> term161912 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term161911 = ((Class) term161912).getDeclaredField((String) "COMPLETE");
        ((Field) term161911).setAccessible(true);
        Object enum311 = ((Field) term161911).get((Object) null);
        Long term159349 = new Long(8024477479047145752L);
        term159085 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term159114 = newInstance(Class.forName("java.util.Date"));
        Object term159116 = newInstance(Class.forName("java.util.Date"));
        Object term159118 = newInstance(Class.forName("java.util.Date"));
        Object term159120 = newInstance(Class.forName("java.util.Date"));
        setField(term159085, term159085.getClass(), "results", term159086);
        setField(term159085, term159085.getClass(), "id", term159112);
        setLongField(term159114, term159114.getClass(), "fastTime", 1646940924790L);
        setField(term159114, term159114.getClass(), "cdate", null);
        setField(term159085, term159085.getClass(), "createDate", term159114);
        setLongField(term159116, term159116.getClass(), "fastTime", 1820353382770L);
        setField(term159116, term159116.getClass(), "cdate", null);
        setField(term159085, term159085.getClass(), "updateDate", term159116);
        setLongField(term159118, term159118.getClass(), "fastTime", 1580485206758L);
        setField(term159118, term159118.getClass(), "cdate", null);
        setField(term159085, term159085.getClass(), "startTime", term159118);
        setLongField(term159120, term159120.getClass(), "fastTime", 1606117692592L);
        setField(term159120, term159120.getClass(), "cdate", null);
        setField(term159085, term159085.getClass(), "repeatUntilDate", term159120);
        setField(term159085, term159085.getClass(), "frequency", enum307);
        setField(term159085, term159085.getClass(), "status", enum308);
        setField(term159085, term159085.getClass(), "fromClassicAddress", "VNHIbCXqhH");
        setField(term159085, term159085.getClass(), "trustlineIssuerClassicAddress", "csnhUIxUaP");
        setField(term159085, term159085.getClass(), "currencyName", "fmWYICGnwt");
        setField(term159085, term159085.getClass(), "currencyNameForProcess", "FlZbOFNISk");
        setField(term159085, term159085.getClass(), "amount", "zDtePZrZQH");
        setBooleanField(term159085, term159085.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term159085, term159085.getClass(), "useBlacklist", true);
        setField(term159085, term159085.getClass(), "maximumTrustlines", term159206);
        setField(term159085, term159085.getClass(), "dropType", enum309);
        setField(term159085, term159085.getClass(), "failReason", "YPVZjrbvVl");
        setField(term159085, term159085.getClass(), "minBalance", "TWsXTUTREq");
        setField(term159085, term159085.getClass(), "maxBalance", "tVsPWASlsh");
        setField(term159085, term159085.getClass(), "totalBlacklisted", term159265);
        setField(term159085, term159085.getClass(), "maxXrpFeePerTransaction", "PjZoebHrvq");
        setField(term159085, term159085.getClass(), "totalRecipients", term159279);
        setField(term159085, term159085.getClass(), "paymentType", enum310);
        setField(term159085, term159085.getClass(), "snapshotTrustlineIssuerClassicAddress", "VwpicfUdWr");
        setField(term159085, term159085.getClass(), "snapshotCurrencyName", "UDKBkeWilS");
        setField(term159085, term159085.getClass(), "nftIssuingAddress", "bNeNAYRdqb");
        setField(term159085, term159085.getClass(), "nftTaxon", "dcGBEVfYLI");
        setField(term159085, term159085.getClass(), "scheduleStatus", enum311);
        setField(term159085, term159085.getClass(), "fromScheduleId", term159349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropType", argTypes, term159085, args);
    }

};


