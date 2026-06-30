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

public class DropScheduleRunEnt_setCreateDate_209597988215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238866;
     Object term238875;

    public DropScheduleRunEnt_setCreateDate_209597988215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238867 = new Long(2355652609935652353L);
        Long term238869 = new Long(7393438062788805516L);
        Long term238871 = new Long(5383032785479262184L);
        term238866 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238873 = newInstance(Class.forName("java.util.Date"));
        setField(term238866, term238866.getClass(), "id", term238867);
        setField(term238866, term238866.getClass(), "dropScheduleId", term238869);
        setField(term238866, term238866.getClass(), "dropRequestId", term238871);
        setLongField(term238873, term238873.getClass(), "fastTime", 1810901810536L);
        setField(term238873, term238873.getClass(), "cdate", null);
        setField(term238866, term238866.getClass(), "createDate", term238873);
        term238875 = newInstance(Class.forName("java.util.Date"));
        setLongField(term238875, term238875.getClass(), "fastTime", 1865305081295L);
        setField(term238875, term238875.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term238875;
        callMethod(klass, "setCreateDate", argTypes, term238866, args);
    }

};


