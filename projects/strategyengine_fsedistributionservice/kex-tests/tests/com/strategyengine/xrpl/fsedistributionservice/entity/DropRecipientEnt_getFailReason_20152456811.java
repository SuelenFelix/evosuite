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

public class DropRecipientEnt_getFailReason_20152456811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28188;

    public DropRecipientEnt_getFailReason_20152456811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28189 = new Long(-1677189124507026637L);
        Class<? extends Object> term28293 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term28292 = ((Class) term28293).getDeclaredField((String) "SENDING");
        ((Field) term28292).setAccessible(true);
        Object enum56 = ((Field) term28292).get((Object) null);
        Integer term28242 = new Integer(1725571209);
        Long term28244 = new Long(4795660804170399986L);
        term28188 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term28203 = newInstance(Class.forName("java.util.Date"));
        Object term28205 = newInstance(Class.forName("java.util.Date"));
        setField(term28188, term28188.getClass(), "id", term28189);
        setField(term28188, term28188.getClass(), "address", "lihXWlGDxk");
        setLongField(term28203, term28203.getClass(), "fastTime", 1342877876146L);
        setField(term28203, term28203.getClass(), "cdate", null);
        setField(term28188, term28188.getClass(), "createDate", term28203);
        setLongField(term28205, term28205.getClass(), "fastTime", 1511283614327L);
        setField(term28205, term28205.getClass(), "cdate", null);
        setField(term28188, term28188.getClass(), "updateDate", term28205);
        setField(term28188, term28188.getClass(), "status", enum56);
        setField(term28188, term28188.getClass(), "failReason", "JmcmxoGhIK");
        setField(term28188, term28188.getClass(), "code", "jXzmYyrnnT");
        setField(term28188, term28188.getClass(), "retryAttempt", term28242);
        setField(term28188, term28188.getClass(), "dropRequestId", term28244);
        setField(term28188, term28188.getClass(), "snapshotBalance", "igCAtimmYB");
        setField(term28188, term28188.getClass(), "payAmount", "DyiXbeYIaN");
        setField(term28188, term28188.getClass(), "ownedNftId", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailReason", argTypes, term28188, args);
    }

};


