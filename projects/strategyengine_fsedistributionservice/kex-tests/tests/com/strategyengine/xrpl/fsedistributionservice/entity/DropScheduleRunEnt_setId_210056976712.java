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

public class DropScheduleRunEnt_setId_210056976712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238833;
     Object term238842;

    public DropScheduleRunEnt_setId_210056976712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238834 = new Long(-8287954071414913487L);
        Long term238836 = new Long(-1379663556617181551L);
        Long term238838 = new Long(-927624000067769617L);
        term238833 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238840 = newInstance(Class.forName("java.util.Date"));
        setField(term238833, term238833.getClass(), "id", term238834);
        setField(term238833, term238833.getClass(), "dropScheduleId", term238836);
        setField(term238833, term238833.getClass(), "dropRequestId", term238838);
        setLongField(term238840, term238840.getClass(), "fastTime", 1508642995512L);
        setField(term238840, term238840.getClass(), "cdate", null);
        setField(term238833, term238833.getClass(), "createDate", term238840);
        term238842 = new Long(2978561187278004830L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term238842;
        callMethod(klass, "setId", argTypes, term238833, args);
    }

};


