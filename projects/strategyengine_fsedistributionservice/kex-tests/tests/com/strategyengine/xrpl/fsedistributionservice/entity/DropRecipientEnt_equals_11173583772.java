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

public class DropRecipientEnt_equals_11173583772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23009;
     Object term23103;

    public DropRecipientEnt_equals_11173583772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23010 = new Long(-7291742736502427077L);
        Class<? extends Object> term23115 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term23114 = ((Class) term23115).getDeclaredField((String) "SENDING");
        ((Field) term23114).setAccessible(true);
        Object enum47 = ((Field) term23114).get((Object) null);
        Integer term23063 = new Integer(1162663216);
        Long term23065 = new Long(-8121849829073967555L);
        term23009 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term23024 = newInstance(Class.forName("java.util.Date"));
        Object term23026 = newInstance(Class.forName("java.util.Date"));
        setField(term23009, term23009.getClass(), "id", term23010);
        setField(term23009, term23009.getClass(), "address", "WzMEhMXkKx");
        setLongField(term23024, term23024.getClass(), "fastTime", 1589746751309L);
        setField(term23024, term23024.getClass(), "cdate", null);
        setField(term23009, term23009.getClass(), "createDate", term23024);
        setLongField(term23026, term23026.getClass(), "fastTime", 1291280367982L);
        setField(term23026, term23026.getClass(), "cdate", null);
        setField(term23009, term23009.getClass(), "updateDate", term23026);
        setField(term23009, term23009.getClass(), "status", enum47);
        setField(term23009, term23009.getClass(), "failReason", "XOiDvlDhdc");
        setField(term23009, term23009.getClass(), "code", "AdxvLJhNLe");
        setField(term23009, term23009.getClass(), "retryAttempt", term23063);
        setField(term23009, term23009.getClass(), "dropRequestId", term23065);
        setField(term23009, term23009.getClass(), "snapshotBalance", "lHfTrWKMPk");
        setField(term23009, term23009.getClass(), "payAmount", "JDaAnsVTGV");
        setField(term23009, term23009.getClass(), "ownedNftId", "mLUZFTfjle");
        term23103 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23103;
        callMethod(klass, "equals", argTypes, term23009, args);
    }

};


