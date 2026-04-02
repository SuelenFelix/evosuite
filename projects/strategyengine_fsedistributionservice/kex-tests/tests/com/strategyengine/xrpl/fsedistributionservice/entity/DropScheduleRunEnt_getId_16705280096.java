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

public class DropScheduleRunEnt_getId_16705280096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238789;

    public DropScheduleRunEnt_getId_16705280096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238790 = new Long(-5608790408657117046L);
        Long term238792 = new Long(-6265886087280835813L);
        Long term238794 = new Long(8408467837292297525L);
        term238789 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238796 = newInstance(Class.forName("java.util.Date"));
        setField(term238789, term238789.getClass(), "id", term238790);
        setField(term238789, term238789.getClass(), "dropScheduleId", term238792);
        setField(term238789, term238789.getClass(), "dropRequestId", term238794);
        setLongField(term238796, term238796.getClass(), "fastTime", 1699431611544L);
        setField(term238796, term238796.getClass(), "cdate", null);
        setField(term238789, term238789.getClass(), "createDate", term238796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term238789, args);
    }

};


