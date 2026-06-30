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

public class DropRecipientEnt_getRetryAttempt_93895497613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29346;

    public DropRecipientEnt_getRetryAttempt_93895497613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29347 = new Long(-6673920710396545553L);
        Class<? extends Object> term29451 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term29450 = ((Class) term29451).getDeclaredField((String) "SENDING");
        ((Field) term29450).setAccessible(true);
        Object enum58 = ((Field) term29450).get((Object) null);
        Integer term29400 = new Integer(1134449235);
        Long term29402 = new Long(3412644969878030772L);
        term29346 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term29361 = newInstance(Class.forName("java.util.Date"));
        Object term29363 = newInstance(Class.forName("java.util.Date"));
        setField(term29346, term29346.getClass(), "id", term29347);
        setField(term29346, term29346.getClass(), "address", "kNqaJKIATy");
        setLongField(term29361, term29361.getClass(), "fastTime", 1316972437233L);
        setField(term29361, term29361.getClass(), "cdate", null);
        setField(term29346, term29346.getClass(), "createDate", term29361);
        setLongField(term29363, term29363.getClass(), "fastTime", 1870028835492L);
        setField(term29363, term29363.getClass(), "cdate", null);
        setField(term29346, term29346.getClass(), "updateDate", term29363);
        setField(term29346, term29346.getClass(), "status", enum58);
        setField(term29346, term29346.getClass(), "failReason", "vKQukfbJUd");
        setField(term29346, term29346.getClass(), "code", "lFRJFUMVbx");
        setField(term29346, term29346.getClass(), "retryAttempt", term29400);
        setField(term29346, term29346.getClass(), "dropRequestId", term29402);
        setField(term29346, term29346.getClass(), "snapshotBalance", "sZdUNdggUW");
        setField(term29346, term29346.getClass(), "payAmount", "OqbwYQfvAe");
        setField(term29346, term29346.getClass(), "ownedNftId", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetryAttempt", argTypes, term29346, args);
    }

};


