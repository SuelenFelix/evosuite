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

public class DropScheduleRunEnt_setDropRequestId_118565934914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238855;
     Object term238864;

    public DropScheduleRunEnt_setDropRequestId_118565934914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238856 = new Long(1370021222113276207L);
        Long term238858 = new Long(2671083699707412572L);
        Long term238860 = new Long(8940743873279878610L);
        term238855 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238862 = newInstance(Class.forName("java.util.Date"));
        setField(term238855, term238855.getClass(), "id", term238856);
        setField(term238855, term238855.getClass(), "dropScheduleId", term238858);
        setField(term238855, term238855.getClass(), "dropRequestId", term238860);
        setLongField(term238862, term238862.getClass(), "fastTime", 1720881038437L);
        setField(term238862, term238862.getClass(), "cdate", null);
        setField(term238855, term238855.getClass(), "createDate", term238862);
        term238864 = new Long(-1865007698397606253L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term238864;
        callMethod(klass, "setDropRequestId", argTypes, term238855, args);
    }

};


