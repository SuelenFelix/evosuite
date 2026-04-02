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

public class AirdropStatus_getMaxBalance_206914626224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169816;

    public AirdropStatus_getMaxBalance_206914626224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169820 = new Long(8010417010297313651L);
        Class<? extends Object> term170124 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term170123 = ((Class) term170124).getDeclaredField((String) "SENDING");
        ((Field) term170123).setAccessible(true);
        Object enum328 = ((Field) term170123).get((Object) null);
        Object term169819 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term169819, term169819.getClass(), "id", term169820);
        setField(term169819, term169819.getClass(), "responseCode", "");
        setField(term169819, term169819.getClass(), "reason", "");
        setField(term169819, term169819.getClass(), "classicAddress", "");
        setField(term169819, term169819.getClass(), "status", enum328);
        setField(term169819, term169819.getClass(), "paymentAmount", "");
        setField(term169819, term169819.getClass(), "snapshotBalance", "");
        setField(term169819, term169819.getClass(), "nftOwned", "");
        Long term169831 = new Long(5845993504299821981L);
        Class<? extends Object> term170547 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term170546 = ((Class) term170547).getDeclaredField((String) "FAILED");
        ((Field) term170546).setAccessible(true);
        Object enum329 = ((Field) term170546).get((Object) null);
        Object term169830 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term169830, term169830.getClass(), "id", term169831);
        setField(term169830, term169830.getClass(), "responseCode", "");
        setField(term169830, term169830.getClass(), "reason", "");
        setField(term169830, term169830.getClass(), "classicAddress", "");
        setField(term169830, term169830.getClass(), "status", enum329);
        setField(term169830, term169830.getClass(), "paymentAmount", "");
        setField(term169830, term169830.getClass(), "snapshotBalance", "");
        setField(term169830, term169830.getClass(), "nftOwned", "");
        Long term169842 = new Long(-1528017371096319990L);
        Object term169841 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term169841, term169841.getClass(), "id", term169842);
        setField(term169841, term169841.getClass(), "responseCode", "");
        setField(term169841, term169841.getClass(), "reason", "");
        setField(term169841, term169841.getClass(), "classicAddress", "");
        setField(term169841, term169841.getClass(), "status", enum328);
        setField(term169841, term169841.getClass(), "paymentAmount", "");
        setField(term169841, term169841.getClass(), "snapshotBalance", "");
        setField(term169841, term169841.getClass(), "nftOwned", "");
        Long term169851 = new Long(-1526328443223793465L);
        Class<? extends Object> term170967 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term170966 = ((Class) term170967).getDeclaredField((String) "FAILED");
        ((Field) term170966).setAccessible(true);
        Object enum330 = ((Field) term170966).get((Object) null);
        Object term169850 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term169850, term169850.getClass(), "id", term169851);
        setField(term169850, term169850.getClass(), "responseCode", "");
        setField(term169850, term169850.getClass(), "reason", "");
        setField(term169850, term169850.getClass(), "classicAddress", "");
        setField(term169850, term169850.getClass(), "status", enum330);
        setField(term169850, term169850.getClass(), "paymentAmount", "");
        setField(term169850, term169850.getClass(), "snapshotBalance", "");
        setField(term169850, term169850.getClass(), "nftOwned", "");
        Long term169862 = new Long(-412186147449928821L);
        Object term169861 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term169861, term169861.getClass(), "id", term169862);
        setField(term169861, term169861.getClass(), "responseCode", "");
        setField(term169861, term169861.getClass(), "reason", "");
        setField(term169861, term169861.getClass(), "classicAddress", "");
        setField(term169861, term169861.getClass(), "status", enum328);
        setField(term169861, term169861.getClass(), "paymentAmount", "");
        setField(term169861, term169861.getClass(), "snapshotBalance", "");
        setField(term169861, term169861.getClass(), "nftOwned", "");
        ArrayList term169817 = new ArrayList();
        ((ArrayList) term169817).add(term169819);
        ((ArrayList) term169817).add(term169830);
        ((ArrayList) term169817).add(term169841);
        ((ArrayList) term169817).add(term169850);
        ((ArrayList) term169817).add(term169861);
        Long term169872 = new Long(-1449569009562240465L);
        Class<? extends Object> term171387 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term171386 = ((Class) term171387).getDeclaredField((String) "WEEKLY");
        ((Field) term171386).setAccessible(true);
        Object enum331 = ((Field) term171386).get((Object) null);
        Class<? extends Object> term171777 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term171776 = ((Class) term171777).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term171776).setAccessible(true);
        Object enum332 = ((Field) term171776).get((Object) null);
        Integer term169978 = new Integer(1141317871);
        Class<? extends Object> term172279 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term172278 = ((Class) term172279).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term172278).setAccessible(true);
        Object enum333 = ((Field) term172278).get((Object) null);
        Long term170037 = new Long(2287449183416662404L);
        Long term170051 = new Long(-1223573843683081410L);
        Class<? extends Object> term172717 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term172716 = ((Class) term172717).getDeclaredField((String) "FLAT");
        ((Field) term172716).setAccessible(true);
        Object enum334 = ((Field) term172716).get((Object) null);
        Class<? extends Object> term173131 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term173130 = ((Class) term173131).getDeclaredField((String) "COMPLETE");
        ((Field) term173130).setAccessible(true);
        Object enum335 = ((Field) term173130).get((Object) null);
        Long term170121 = new Long(3453457027014743006L);
        term169816 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term169874 = newInstance(Class.forName("java.util.Date"));
        Object term169876 = newInstance(Class.forName("java.util.Date"));
        Object term169878 = newInstance(Class.forName("java.util.Date"));
        Object term169880 = newInstance(Class.forName("java.util.Date"));
        setField(term169816, term169816.getClass(), "results", term169817);
        setField(term169816, term169816.getClass(), "id", term169872);
        setLongField(term169874, term169874.getClass(), "fastTime", 1367603522080L);
        setField(term169874, term169874.getClass(), "cdate", null);
        setField(term169816, term169816.getClass(), "createDate", term169874);
        setLongField(term169876, term169876.getClass(), "fastTime", 1414854822554L);
        setField(term169876, term169876.getClass(), "cdate", null);
        setField(term169816, term169816.getClass(), "updateDate", term169876);
        setLongField(term169878, term169878.getClass(), "fastTime", 1878671485848L);
        setField(term169878, term169878.getClass(), "cdate", null);
        setField(term169816, term169816.getClass(), "startTime", term169878);
        setLongField(term169880, term169880.getClass(), "fastTime", 1472742328615L);
        setField(term169880, term169880.getClass(), "cdate", null);
        setField(term169816, term169816.getClass(), "repeatUntilDate", term169880);
        setField(term169816, term169816.getClass(), "frequency", enum331);
        setField(term169816, term169816.getClass(), "status", enum332);
        setField(term169816, term169816.getClass(), "fromClassicAddress", "YNXNgIokRz");
        setField(term169816, term169816.getClass(), "trustlineIssuerClassicAddress", "XRDgUBBIlB");
        setField(term169816, term169816.getClass(), "currencyName", "kWMQGdvKwx");
        setField(term169816, term169816.getClass(), "currencyNameForProcess", "zRwnGNjqEc");
        setField(term169816, term169816.getClass(), "amount", "PadBNsKGSM");
        setBooleanField(term169816, term169816.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term169816, term169816.getClass(), "useBlacklist", false);
        setField(term169816, term169816.getClass(), "maximumTrustlines", term169978);
        setField(term169816, term169816.getClass(), "dropType", enum333);
        setField(term169816, term169816.getClass(), "failReason", "BqLgONTWcn");
        setField(term169816, term169816.getClass(), "minBalance", "QyyvfuUsSl");
        setField(term169816, term169816.getClass(), "maxBalance", "urXLfQoyuc");
        setField(term169816, term169816.getClass(), "totalBlacklisted", term170037);
        setField(term169816, term169816.getClass(), "maxXrpFeePerTransaction", "KoWkwRBvcY");
        setField(term169816, term169816.getClass(), "totalRecipients", term170051);
        setField(term169816, term169816.getClass(), "paymentType", enum334);
        setField(term169816, term169816.getClass(), "snapshotTrustlineIssuerClassicAddress", "kqDHOsurKa");
        setField(term169816, term169816.getClass(), "snapshotCurrencyName", "NCqNKzmHkE");
        setField(term169816, term169816.getClass(), "nftIssuingAddress", "eFSnWGCXQK");
        setField(term169816, term169816.getClass(), "nftTaxon", "GrrqChmbDB");
        setField(term169816, term169816.getClass(), "scheduleStatus", enum335);
        setField(term169816, term169816.getClass(), "fromScheduleId", term170121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxBalance", argTypes, term169816, args);
    }

};


