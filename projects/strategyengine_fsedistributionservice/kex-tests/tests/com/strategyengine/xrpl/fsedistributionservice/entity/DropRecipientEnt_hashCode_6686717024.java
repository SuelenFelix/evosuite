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

public class DropRecipientEnt_hashCode_6686717024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24165;

    public DropRecipientEnt_hashCode_6686717024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24166 = new Long(-948292411727204525L);
        Class<? extends Object> term24269 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term24268 = ((Class) term24269).getDeclaredField((String) "QUEUED");
        ((Field) term24268).setAccessible(true);
        Object enum49 = ((Field) term24268).get((Object) null);
        Integer term24218 = new Integer(391863371);
        Long term24220 = new Long(-8892586408602479513L);
        term24165 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term24180 = newInstance(Class.forName("java.util.Date"));
        Object term24182 = newInstance(Class.forName("java.util.Date"));
        setField(term24165, term24165.getClass(), "id", term24166);
        setField(term24165, term24165.getClass(), "address", "gCWtLVKVVe");
        setLongField(term24180, term24180.getClass(), "fastTime", 1818968525805L);
        setField(term24180, term24180.getClass(), "cdate", null);
        setField(term24165, term24165.getClass(), "createDate", term24180);
        setLongField(term24182, term24182.getClass(), "fastTime", 1603905786801L);
        setField(term24182, term24182.getClass(), "cdate", null);
        setField(term24165, term24165.getClass(), "updateDate", term24182);
        setField(term24165, term24165.getClass(), "status", enum49);
        setField(term24165, term24165.getClass(), "failReason", "fWKJoSoCwE");
        setField(term24165, term24165.getClass(), "code", "wfaXBpWAUH");
        setField(term24165, term24165.getClass(), "retryAttempt", term24218);
        setField(term24165, term24165.getClass(), "dropRequestId", term24220);
        setField(term24165, term24165.getClass(), "snapshotBalance", "VMeAzAHwZj");
        setField(term24165, term24165.getClass(), "payAmount", "PznxWXsZME");
        setField(term24165, term24165.getClass(), "ownedNftId", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24165, args);
    }

};


