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

public class DropRecipientEnt_DropRecipientEntBuilder_dropRequestId_4854073169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45019;
     Object term45113;

    public DropRecipientEnt_DropRecipientEntBuilder_dropRequestId_4854073169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45020 = new Long(-3277773415369003529L);
        Class<? extends Object> term45126 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term45125 = ((Class) term45126).getDeclaredField((String) "SENDING");
        ((Field) term45125).setAccessible(true);
        Object enum85 = ((Field) term45125).get((Object) null);
        Integer term45073 = new Integer(1962444399);
        Long term45075 = new Long(1253549421411622358L);
        term45019 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term45034 = newInstance(Class.forName("java.util.Date"));
        Object term45036 = newInstance(Class.forName("java.util.Date"));
        setField(term45019, term45019.getClass(), "id", term45020);
        setField(term45019, term45019.getClass(), "address", "lgQkrXANyI");
        setLongField(term45034, term45034.getClass(), "fastTime", 1603614229871L);
        setField(term45034, term45034.getClass(), "cdate", null);
        setField(term45019, term45019.getClass(), "createDate", term45034);
        setLongField(term45036, term45036.getClass(), "fastTime", 1861021148230L);
        setField(term45036, term45036.getClass(), "cdate", null);
        setField(term45019, term45019.getClass(), "updateDate", term45036);
        setField(term45019, term45019.getClass(), "status", enum85);
        setField(term45019, term45019.getClass(), "failReason", "MeTmRZXErV");
        setField(term45019, term45019.getClass(), "code", "jNxbVmoZgq");
        setField(term45019, term45019.getClass(), "retryAttempt", term45073);
        setField(term45019, term45019.getClass(), "dropRequestId", term45075);
        setField(term45019, term45019.getClass(), "snapshotBalance", "PvmBHIXaMY");
        setField(term45019, term45019.getClass(), "payAmount", "hulYxtowxw");
        setField(term45019, term45019.getClass(), "ownedNftId", "GNEmuHPNcU");
        term45113 = new Long(3666226122807672448L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term45113;
        callMethod(klass, "dropRequestId", argTypes, term45019, args);
    }

};


