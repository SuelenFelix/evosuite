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

public class DropScheduleRunEnt_toString_21064588415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238780;

    public DropScheduleRunEnt_toString_21064588415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238781 = new Long(-1610129689783641208L);
        Long term238783 = new Long(-2613029888948149747L);
        Long term238785 = new Long(-6418282217428803693L);
        term238780 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt"));
        Object term238787 = newInstance(Class.forName("java.util.Date"));
        setField(term238780, term238780.getClass(), "id", term238781);
        setField(term238780, term238780.getClass(), "dropScheduleId", term238783);
        setField(term238780, term238780.getClass(), "dropRequestId", term238785);
        setLongField(term238787, term238787.getClass(), "fastTime", 1868705614427L);
        setField(term238787, term238787.getClass(), "cdate", null);
        setField(term238780, term238780.getClass(), "createDate", term238787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term238780, args);
    }

};


