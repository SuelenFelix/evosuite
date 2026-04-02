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

public class AirdropStatus_setFromScheduleId_112943664766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310099;
     Object term310368;

    public AirdropStatus_setFromScheduleId_112943664766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310103 = new Long(3228082303360203224L);
        Class<? extends Object> term310371 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term310370 = ((Class) term310371).getDeclaredField((String) "QUEUED");
        ((Field) term310370).setAccessible(true);
        Object enum628 = ((Field) term310370).get((Object) null);
        Object term310102 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term310102, term310102.getClass(), "id", term310103);
        setField(term310102, term310102.getClass(), "responseCode", "");
        setField(term310102, term310102.getClass(), "reason", "");
        setField(term310102, term310102.getClass(), "classicAddress", "");
        setField(term310102, term310102.getClass(), "status", enum628);
        setField(term310102, term310102.getClass(), "paymentAmount", "");
        setField(term310102, term310102.getClass(), "snapshotBalance", "");
        setField(term310102, term310102.getClass(), "nftOwned", "");
        Long term310114 = new Long(8845929725457841487L);
        Class<? extends Object> term310791 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term310790 = ((Class) term310791).getDeclaredField((String) "VERIFIED");
        ((Field) term310790).setAccessible(true);
        Object enum629 = ((Field) term310790).get((Object) null);
        Object term310113 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term310113, term310113.getClass(), "id", term310114);
        setField(term310113, term310113.getClass(), "responseCode", "");
        setField(term310113, term310113.getClass(), "reason", "");
        setField(term310113, term310113.getClass(), "classicAddress", "");
        setField(term310113, term310113.getClass(), "status", enum629);
        setField(term310113, term310113.getClass(), "paymentAmount", "");
        setField(term310113, term310113.getClass(), "snapshotBalance", "");
        setField(term310113, term310113.getClass(), "nftOwned", "");
        ArrayList term310100 = new ArrayList();
        ((ArrayList) term310100).add(term310102);
        ((ArrayList) term310100).add(term310113);
        Long term310126 = new Long(2599553846982918627L);
        Class<? extends Object> term311217 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term311216 = ((Class) term311217).getDeclaredField((String) "MONTHLY");
        ((Field) term311216).setAccessible(true);
        Object enum630 = ((Field) term311216).get((Object) null);
        Class<? extends Object> term311610 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term311609 = ((Class) term311610).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term311609).setAccessible(true);
        Object enum631 = ((Field) term311609).get((Object) null);
        Integer term310224 = new Integer(1598895173);
        Class<? extends Object> term312085 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term312084 = ((Class) term312085).getDeclaredField((String) "GLOBALID");
        ((Field) term312084).setAccessible(true);
        Object enum632 = ((Field) term312084).get((Object) null);
        Long term310274 = new Long(-4821516944173509228L);
        Long term310288 = new Long(2315395988604904502L);
        Class<? extends Object> term312496 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term312495 = ((Class) term312496).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term312495).setAccessible(true);
        Object enum633 = ((Field) term312495).get((Object) null);
        Class<? extends Object> term312934 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term312933 = ((Class) term312934).getDeclaredField((String) "REJECTED");
        ((Field) term312933).setAccessible(true);
        Object enum634 = ((Field) term312933).get((Object) null);
        Long term310366 = new Long(4337555582321907177L);
        term310099 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term310128 = newInstance(Class.forName("java.util.Date"));
        Object term310130 = newInstance(Class.forName("java.util.Date"));
        Object term310132 = newInstance(Class.forName("java.util.Date"));
        Object term310134 = newInstance(Class.forName("java.util.Date"));
        setField(term310099, term310099.getClass(), "results", term310100);
        setField(term310099, term310099.getClass(), "id", term310126);
        setLongField(term310128, term310128.getClass(), "fastTime", 1634320653008L);
        setField(term310128, term310128.getClass(), "cdate", null);
        setField(term310099, term310099.getClass(), "createDate", term310128);
        setLongField(term310130, term310130.getClass(), "fastTime", 1661068134108L);
        setField(term310130, term310130.getClass(), "cdate", null);
        setField(term310099, term310099.getClass(), "updateDate", term310130);
        setLongField(term310132, term310132.getClass(), "fastTime", 1825772492805L);
        setField(term310132, term310132.getClass(), "cdate", null);
        setField(term310099, term310099.getClass(), "startTime", term310132);
        setLongField(term310134, term310134.getClass(), "fastTime", 1625188435797L);
        setField(term310134, term310134.getClass(), "cdate", null);
        setField(term310099, term310099.getClass(), "repeatUntilDate", term310134);
        setField(term310099, term310099.getClass(), "frequency", enum630);
        setField(term310099, term310099.getClass(), "status", enum631);
        setField(term310099, term310099.getClass(), "fromClassicAddress", "KZIClWErQV");
        setField(term310099, term310099.getClass(), "trustlineIssuerClassicAddress", "NlMAkCBTMT");
        setField(term310099, term310099.getClass(), "currencyName", "OZIAupXzmm");
        setField(term310099, term310099.getClass(), "currencyNameForProcess", "FYhlObvAKO");
        setField(term310099, term310099.getClass(), "amount", "GFxNoBwsCD");
        setBooleanField(term310099, term310099.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term310099, term310099.getClass(), "useBlacklist", true);
        setField(term310099, term310099.getClass(), "maximumTrustlines", term310224);
        setField(term310099, term310099.getClass(), "dropType", enum632);
        setField(term310099, term310099.getClass(), "failReason", "zBVQNMxMvk");
        setField(term310099, term310099.getClass(), "minBalance", "iJSPWddhZO");
        setField(term310099, term310099.getClass(), "maxBalance", "WbvttDefvl");
        setField(term310099, term310099.getClass(), "totalBlacklisted", term310274);
        setField(term310099, term310099.getClass(), "maxXrpFeePerTransaction", "coNhvymEkq");
        setField(term310099, term310099.getClass(), "totalRecipients", term310288);
        setField(term310099, term310099.getClass(), "paymentType", enum633);
        setField(term310099, term310099.getClass(), "snapshotTrustlineIssuerClassicAddress", "dMuXJftgrw");
        setField(term310099, term310099.getClass(), "snapshotCurrencyName", "INNyzaqXFS");
        setField(term310099, term310099.getClass(), "nftIssuingAddress", "GdZWpscDov");
        setField(term310099, term310099.getClass(), "nftTaxon", "RzzlJFJcij");
        setField(term310099, term310099.getClass(), "scheduleStatus", enum634);
        setField(term310099, term310099.getClass(), "fromScheduleId", term310366);
        term310368 = new Long(-6367418587326372844L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term310368;
        callMethod(klass, "setFromScheduleId", argTypes, term310099, args);
    }

};


