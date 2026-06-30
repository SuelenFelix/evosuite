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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_dropRequestId_11975921483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239796;
     Object term239805;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_dropRequestId_11975921483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239797 = new Long(2823262561274956150L);
        Long term239799 = new Long(8039153062846287600L);
        Long term239801 = new Long(-7087265016767824631L);
        term239796 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        Object term239803 = newInstance(Class.forName("java.util.Date"));
        setField(term239796, term239796.getClass(), "id", term239797);
        setField(term239796, term239796.getClass(), "dropScheduleId", term239799);
        setField(term239796, term239796.getClass(), "dropRequestId", term239801);
        setLongField(term239803, term239803.getClass(), "fastTime", 1612520677766L);
        setField(term239803, term239803.getClass(), "cdate", null);
        setField(term239796, term239796.getClass(), "createDate", term239803);
        term239805 = new Long(-8121348431673567857L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term239805;
        callMethod(klass, "dropRequestId", argTypes, term239796, args);
    }

};


