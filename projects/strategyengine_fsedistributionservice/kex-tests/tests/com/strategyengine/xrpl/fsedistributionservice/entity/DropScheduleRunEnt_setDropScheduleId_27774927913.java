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

public class DropScheduleRunEnt_setDropScheduleId_27774927913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238844;
     Object term238853;

    public DropScheduleRunEnt_setDropScheduleId_27774927913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238845 = new Long(4903104596895674146L);
        Long term238847 = new Long(3410093279424884335L);
        Long term238849 = new Long(-8848853088235282046L);
        term238844 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238851 = newInstance(Class.forName("java.util.Date"));
        setField(term238844, term238844.getClass(), "id", term238845);
        setField(term238844, term238844.getClass(), "dropScheduleId", term238847);
        setField(term238844, term238844.getClass(), "dropRequestId", term238849);
        setLongField(term238851, term238851.getClass(), "fastTime", 1858927441805L);
        setField(term238851, term238851.getClass(), "cdate", null);
        setField(term238844, term238844.getClass(), "createDate", term238851);
        term238853 = new Long(5646422912118770408L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term238853;
        callMethod(klass, "setDropScheduleId", argTypes, term238844, args);
    }

};


