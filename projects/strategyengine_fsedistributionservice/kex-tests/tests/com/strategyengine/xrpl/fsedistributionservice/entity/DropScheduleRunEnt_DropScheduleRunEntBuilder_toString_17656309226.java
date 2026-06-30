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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_toString_17656309226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239827;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_toString_17656309226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239828 = new Long(-1237494311441603673L);
        Long term239830 = new Long(3550928874058758597L);
        Long term239832 = new Long(987797117310260031L);
        term239827 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239834 = newInstance(Class.forName("java.util.Date"));
        setField(term239827, term239827.getClass(), "id", term239828);
        setField(term239827, term239827.getClass(), "dropScheduleId", term239830);
        setField(term239827, term239827.getClass(), "dropRequestId", term239832);
        setLongField(term239834, term239834.getClass(), "fastTime", 1677431024970L);
        setField(term239834, term239834.getClass(), "cdate", null);
        setField(term239827, term239827.getClass(), "createDate", term239834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term239827, args);
    }

};


