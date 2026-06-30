package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_DropRecipientEntBuilder_ownedNftId_139002049812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46796;

    public DropRecipientEnt_DropRecipientEntBuilder_ownedNftId_139002049812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46797 = new Long(-67485388932970712L);
        Class<? extends Object> term46914 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term46913 = ((Class) term46914).getDeclaredField((String) "VERIFIED");
        ((Field) term46913).setAccessible(true);
        Object enum88 = ((Field) term46913).get((Object) null);
        Integer term46851 = new Integer(-157887805);
        Long term46853 = new Long(5806367330808555223L);
        term46796 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term46811 = newInstance(Class.forName("java.util.Date"));
        Object term46813 = newInstance(Class.forName("java.util.Date"));
        setField(term46796, term46796.getClass(), "id", term46797);
        setField(term46796, term46796.getClass(), "address", "HpZXWDPhlg");
        setLongField(term46811, term46811.getClass(), "fastTime", 1765813478928L);
        setField(term46811, term46811.getClass(), "cdate", null);
        setField(term46796, term46796.getClass(), "createDate", term46811);
        setLongField(term46813, term46813.getClass(), "fastTime", 1598713731907L);
        setField(term46813, term46813.getClass(), "cdate", null);
        setField(term46796, term46796.getClass(), "updateDate", term46813);
        setField(term46796, term46796.getClass(), "status", enum88);
        setField(term46796, term46796.getClass(), "failReason", "lBOokzEPfe");
        setField(term46796, term46796.getClass(), "code", "dtGZCsKXbW");
        setField(term46796, term46796.getClass(), "retryAttempt", term46851);
        setField(term46796, term46796.getClass(), "dropRequestId", term46853);
        setField(term46796, term46796.getClass(), "snapshotBalance", "bdyhHbDAmJ");
        setField(term46796, term46796.getClass(), "payAmount", "BBXiTNHqGE");
        setField(term46796, term46796.getClass(), "ownedNftId", "IEYhJmgCVd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KSJeYkkvpk";
        callMethod(klass, "ownedNftId", argTypes, term46796, args);
    }

};


