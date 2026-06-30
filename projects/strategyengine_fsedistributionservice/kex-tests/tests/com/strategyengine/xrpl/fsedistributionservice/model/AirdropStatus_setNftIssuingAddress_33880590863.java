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

public class AirdropStatus_setNftIssuingAddress_33880590863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298913;

    public AirdropStatus_setNftIssuingAddress_33880590863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term298914 = new ArrayList();
        Long term298918 = new Long(-4475453924678388077L);
        Class<? extends Object> term299175 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term299174 = ((Class) term299175).getDeclaredField((String) "WEEKLY");
        ((Field) term299174).setAccessible(true);
        Object enum604 = ((Field) term299174).get((Object) null);
        Class<? extends Object> term299565 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term299564 = ((Class) term299565).getDeclaredField((String) "QUEUED");
        ((Field) term299564).setAccessible(true);
        Object enum605 = ((Field) term299564).get((Object) null);
        Integer term299010 = new Integer(-1388471422);
        Class<? extends Object> term300025 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term300024 = ((Class) term300025).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term300024).setAccessible(true);
        Object enum606 = ((Field) term300024).get((Object) null);
        Long term299078 = new Long(3831842879355381917L);
        Long term299092 = new Long(-2196447813514870436L);
        Class<? extends Object> term300490 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term300489 = ((Class) term300490).getDeclaredField((String) "FLAT");
        ((Field) term300489).setAccessible(true);
        Object enum607 = ((Field) term300489).get((Object) null);
        Class<? extends Object> term300904 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term300903 = ((Class) term300904).getDeclaredField((String) "ACTIVE");
        ((Field) term300903).setAccessible(true);
        Object enum608 = ((Field) term300903).get((Object) null);
        Long term299160 = new Long(2984955721798941743L);
        term298913 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term298920 = newInstance(Class.forName("java.util.Date"));
        Object term298922 = newInstance(Class.forName("java.util.Date"));
        Object term298924 = newInstance(Class.forName("java.util.Date"));
        Object term298926 = newInstance(Class.forName("java.util.Date"));
        setField(term298913, term298913.getClass(), "results", term298914);
        setField(term298913, term298913.getClass(), "id", term298918);
        setLongField(term298920, term298920.getClass(), "fastTime", 1517240339927L);
        setField(term298920, term298920.getClass(), "cdate", null);
        setField(term298913, term298913.getClass(), "createDate", term298920);
        setLongField(term298922, term298922.getClass(), "fastTime", 1309448020135L);
        setField(term298922, term298922.getClass(), "cdate", null);
        setField(term298913, term298913.getClass(), "updateDate", term298922);
        setLongField(term298924, term298924.getClass(), "fastTime", 1601567268249L);
        setField(term298924, term298924.getClass(), "cdate", null);
        setField(term298913, term298913.getClass(), "startTime", term298924);
        setLongField(term298926, term298926.getClass(), "fastTime", 1789150469934L);
        setField(term298926, term298926.getClass(), "cdate", null);
        setField(term298913, term298913.getClass(), "repeatUntilDate", term298926);
        setField(term298913, term298913.getClass(), "frequency", enum604);
        setField(term298913, term298913.getClass(), "status", enum605);
        setField(term298913, term298913.getClass(), "fromClassicAddress", "xXjFLOrnwn");
        setField(term298913, term298913.getClass(), "trustlineIssuerClassicAddress", "EwHXheApdJ");
        setField(term298913, term298913.getClass(), "currencyName", "FSxGuVZthC");
        setField(term298913, term298913.getClass(), "currencyNameForProcess", "vZxqxBKdGD");
        setField(term298913, term298913.getClass(), "amount", "ScVMeCBvvv");
        setBooleanField(term298913, term298913.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term298913, term298913.getClass(), "useBlacklist", true);
        setField(term298913, term298913.getClass(), "maximumTrustlines", term299010);
        setField(term298913, term298913.getClass(), "dropType", enum606);
        setField(term298913, term298913.getClass(), "failReason", "xysssjuOdh");
        setField(term298913, term298913.getClass(), "minBalance", "LQWvIhnGeL");
        setField(term298913, term298913.getClass(), "maxBalance", "fSsmODkNFb");
        setField(term298913, term298913.getClass(), "totalBlacklisted", term299078);
        setField(term298913, term298913.getClass(), "maxXrpFeePerTransaction", "jXaYbKgogd");
        setField(term298913, term298913.getClass(), "totalRecipients", term299092);
        setField(term298913, term298913.getClass(), "paymentType", enum607);
        setField(term298913, term298913.getClass(), "snapshotTrustlineIssuerClassicAddress", "MxPRraPVdF");
        setField(term298913, term298913.getClass(), "snapshotCurrencyName", "dnWHLTYWVU");
        setField(term298913, term298913.getClass(), "nftIssuingAddress", "AOSOeWGCwi");
        setField(term298913, term298913.getClass(), "nftTaxon", "pBmevrFCmp");
        setField(term298913, term298913.getClass(), "scheduleStatus", enum608);
        setField(term298913, term298913.getClass(), "fromScheduleId", term299160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DOCvwqbYDn";
        callMethod(klass, "setNftIssuingAddress", argTypes, term298913, args);
    }

};


