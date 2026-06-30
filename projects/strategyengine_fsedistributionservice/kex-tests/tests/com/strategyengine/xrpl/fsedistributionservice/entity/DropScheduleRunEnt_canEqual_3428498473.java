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

public class DropScheduleRunEnt_canEqual_3428498473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238761;
     Object term238770;

    public DropScheduleRunEnt_canEqual_3428498473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238762 = new Long(1731335447688885587L);
        Long term238764 = new Long(-6206610574921547811L);
        Long term238766 = new Long(-1625372334693179543L);
        term238761 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238768 = newInstance(Class.forName("java.util.Date"));
        setField(term238761, term238761.getClass(), "id", term238762);
        setField(term238761, term238761.getClass(), "dropScheduleId", term238764);
        setField(term238761, term238761.getClass(), "dropRequestId", term238766);
        setLongField(term238768, term238768.getClass(), "fastTime", 1654512603723L);
        setField(term238768, term238768.getClass(), "cdate", null);
        setField(term238761, term238761.getClass(), "createDate", term238768);
        term238770 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term238770;
        callMethod(klass, "canEqual", argTypes, term238761, args);
    }

};


