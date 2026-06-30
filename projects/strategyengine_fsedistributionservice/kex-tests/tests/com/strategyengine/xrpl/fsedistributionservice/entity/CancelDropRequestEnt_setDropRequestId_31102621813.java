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

public class CancelDropRequestEnt_setDropRequestId_31102621813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term90;

    public CancelDropRequestEnt_setDropRequestId_31102621813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84 = new Long(-4365849114644724155L);
        Long term88 = new Long(2486810210675247493L);
        term83 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt"));
        Object term86 = newInstance(Class.forName("java.util.Date"));
        setField(term83, term83.getClass(), "id", term84);
        setLongField(term86, term86.getClass(), "fastTime", 1745462962080L);
        setField(term86, term86.getClass(), "cdate", null);
        setField(term83, term83.getClass(), "createDate", term86);
        setField(term83, term83.getClass(), "dropRequestId", term88);
        term90 = new Long(7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "setDropRequestId", argTypes, term83, args);
    }

};


