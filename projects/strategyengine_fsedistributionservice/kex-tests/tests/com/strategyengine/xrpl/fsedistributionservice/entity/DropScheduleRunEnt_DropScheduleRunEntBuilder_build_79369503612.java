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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_build_79369503612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239840;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_build_79369503612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239840 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        setField(term239840, term239840.getClass(), "id", null);
        setField(term239840, term239840.getClass(), "dropScheduleId", null);
        setField(term239840, term239840.getClass(), "dropRequestId", null);
        setField(term239840, term239840.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term239840, args);
    }

};


