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

public class DropScheduleRunEnt_DropScheduleRunEntBuilder_id_17135992528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239836;

    public DropScheduleRunEnt_DropScheduleRunEntBuilder_id_17135992528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239836 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder"));
        setField(term239836, term239836.getClass(), "id", null);
        setField(term239836, term239836.getClass(), "dropScheduleId", null);
        setField(term239836, term239836.getClass(), "dropRequestId", null);
        setField(term239836, term239836.getClass(), "createDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleRunEnt$DropScheduleRunEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term239836, args);
    }

};


