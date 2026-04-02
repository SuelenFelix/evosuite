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

public class DropScheduleRunEnt_getDropScheduleId_166611817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238798;

    public DropScheduleRunEnt_getDropScheduleId_166611817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238799 = new Long(-5157976075409724332L);
        Long term238801 = new Long(5638814204437933939L);
        Long term238803 = new Long(-5717327658642389548L);
        term238798 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238805 = newInstance(Class.forName("java.util.Date"));
        setField(term238798, term238798.getClass(), "id", term238799);
        setField(term238798, term238798.getClass(), "dropScheduleId", term238801);
        setField(term238798, term238798.getClass(), "dropRequestId", term238803);
        setLongField(term238805, term238805.getClass(), "fastTime", 1531781792150L);
        setField(term238805, term238805.getClass(), "cdate", null);
        setField(term238798, term238798.getClass(), "createDate", term238805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropScheduleId", argTypes, term238798, args);
    }

};


