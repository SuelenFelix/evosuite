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

public class DropRecipientEnt_DropRecipientEntBuilder_updateDate_1632709224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42094;
     Object term42188;

    public DropRecipientEnt_DropRecipientEntBuilder_updateDate_1632709224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42095 = new Long(8107921244631636572L);
        Class<? extends Object> term42201 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term42200 = ((Class) term42201).getDeclaredField((String) "SENDING");
        ((Field) term42200).setAccessible(true);
        Object enum80 = ((Field) term42200).get((Object) null);
        Integer term42148 = new Integer(1193880199);
        Long term42150 = new Long(-7904053112604879960L);
        term42094 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        Object term42109 = newInstance(Class.forName("java.util.Date"));
        Object term42111 = newInstance(Class.forName("java.util.Date"));
        setField(term42094, term42094.getClass(), "id", term42095);
        setField(term42094, term42094.getClass(), "address", "BbNeQJpYPr");
        setLongField(term42109, term42109.getClass(), "fastTime", 1623687334907L);
        setField(term42109, term42109.getClass(), "cdate", null);
        setField(term42094, term42094.getClass(), "createDate", term42109);
        setLongField(term42111, term42111.getClass(), "fastTime", 1597517553085L);
        setField(term42111, term42111.getClass(), "cdate", null);
        setField(term42094, term42094.getClass(), "updateDate", term42111);
        setField(term42094, term42094.getClass(), "status", enum80);
        setField(term42094, term42094.getClass(), "failReason", "riMtzCoxNj");
        setField(term42094, term42094.getClass(), "code", "YAXkVjQZcV");
        setField(term42094, term42094.getClass(), "retryAttempt", term42148);
        setField(term42094, term42094.getClass(), "dropRequestId", term42150);
        setField(term42094, term42094.getClass(), "snapshotBalance", "pumvwBWvpy");
        setField(term42094, term42094.getClass(), "payAmount", "HwLHeGLyhe");
        setField(term42094, term42094.getClass(), "ownedNftId", "RDnkgWkcbz");
        term42188 = newInstance(Class.forName("java.util.Date"));
        setLongField(term42188, term42188.getClass(), "fastTime", 1644421115303L);
        setField(term42188, term42188.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term42188;
        callMethod(klass, "updateDate", argTypes, term42094, args);
    }

};


