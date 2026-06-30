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

public class AirdropStatus_setStatus_78933710044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233127;
     Object enum464;

    public AirdropStatus_setStatus_78933710044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term233128 = new ArrayList();
        Long term233132 = new Long(-8605430501912680279L);
        Class<? extends Object> term233375 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term233374 = ((Class) term233375).getDeclaredField((String) "ANNUALLY");
        ((Field) term233374).setAccessible(true);
        Object enum463 = ((Field) term233374).get((Object) null);
        Class<? extends Object> term233771 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term233770 = ((Class) term233771).getDeclaredField((String) "SCHEDULED");
        ((Field) term233770).setAccessible(true);
        enum464 = ((Field) term233770).get((Object) null);
        Integer term233229 = new Integer(96566506);
        Class<? extends Object> term234240 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term234239 = ((Class) term234240).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term234239).setAccessible(true);
        Object enum465 = ((Field) term234239).get((Object) null);
        Long term233288 = new Long(2985226914509512766L);
        Long term233302 = new Long(4041117732464806744L);
        Class<? extends Object> term234678 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term234677 = ((Class) term234678).getDeclaredField((String) "FLAT");
        ((Field) term234677).setAccessible(true);
        Object enum466 = ((Field) term234677).get((Object) null);
        Class<? extends Object> term235092 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term235091 = ((Class) term235092).getDeclaredField((String) "COMPLETE");
        ((Field) term235091).setAccessible(true);
        Object enum467 = ((Field) term235091).get((Object) null);
        Long term233372 = new Long(7199459243454109261L);
        term233127 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term233134 = newInstance(Class.forName("java.util.Date"));
        Object term233136 = newInstance(Class.forName("java.util.Date"));
        Object term233138 = newInstance(Class.forName("java.util.Date"));
        Object term233140 = newInstance(Class.forName("java.util.Date"));
        setField(term233127, term233127.getClass(), "results", term233128);
        setField(term233127, term233127.getClass(), "id", term233132);
        setLongField(term233134, term233134.getClass(), "fastTime", 1380474204882L);
        setField(term233134, term233134.getClass(), "cdate", null);
        setField(term233127, term233127.getClass(), "createDate", term233134);
        setLongField(term233136, term233136.getClass(), "fastTime", 1396829453851L);
        setField(term233136, term233136.getClass(), "cdate", null);
        setField(term233127, term233127.getClass(), "updateDate", term233136);
        setLongField(term233138, term233138.getClass(), "fastTime", 1284961766979L);
        setField(term233138, term233138.getClass(), "cdate", null);
        setField(term233127, term233127.getClass(), "startTime", term233138);
        setLongField(term233140, term233140.getClass(), "fastTime", 1765037341041L);
        setField(term233140, term233140.getClass(), "cdate", null);
        setField(term233127, term233127.getClass(), "repeatUntilDate", term233140);
        setField(term233127, term233127.getClass(), "frequency", enum463);
        setField(term233127, term233127.getClass(), "status", enum464);
        setField(term233127, term233127.getClass(), "fromClassicAddress", "XRaUSsHhJf");
        setField(term233127, term233127.getClass(), "trustlineIssuerClassicAddress", "ndknwPavsb");
        setField(term233127, term233127.getClass(), "currencyName", "XbwSBHmjuZ");
        setField(term233127, term233127.getClass(), "currencyNameForProcess", "vHdYsSmEmG");
        setField(term233127, term233127.getClass(), "amount", "UDIVCqBmxp");
        setBooleanField(term233127, term233127.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term233127, term233127.getClass(), "useBlacklist", true);
        setField(term233127, term233127.getClass(), "maximumTrustlines", term233229);
        setField(term233127, term233127.getClass(), "dropType", enum465);
        setField(term233127, term233127.getClass(), "failReason", "npyBQorcHP");
        setField(term233127, term233127.getClass(), "minBalance", "pzvYCQwkoA");
        setField(term233127, term233127.getClass(), "maxBalance", "TGLDiqWTkO");
        setField(term233127, term233127.getClass(), "totalBlacklisted", term233288);
        setField(term233127, term233127.getClass(), "maxXrpFeePerTransaction", "NwjEUxXUkk");
        setField(term233127, term233127.getClass(), "totalRecipients", term233302);
        setField(term233127, term233127.getClass(), "paymentType", enum466);
        setField(term233127, term233127.getClass(), "snapshotTrustlineIssuerClassicAddress", "CFBoXISoRu");
        setField(term233127, term233127.getClass(), "snapshotCurrencyName", "gRmiKAUyCW");
        setField(term233127, term233127.getClass(), "nftIssuingAddress", "rfXVAViErl");
        setField(term233127, term233127.getClass(), "nftTaxon", "GcMaBtNShc");
        setField(term233127, term233127.getClass(), "scheduleStatus", enum467);
        setField(term233127, term233127.getClass(), "fromScheduleId", term233372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Object[] args = new Object[1];
        args[0] = enum464;
        callMethod(klass, "setStatus", argTypes, term233127, args);
    }

};


