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

public class DropScheduleEnt_DropScheduleEntBuilder_dropScheduleStatus_200550858416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250875;

    public DropScheduleEnt_DropScheduleEntBuilder_dropScheduleStatus_200550858416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250875 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        setField(term250875, term250875.getClass(), "id", null);
        setField(term250875, term250875.getClass(), "frequency", null);
        setField(term250875, term250875.getClass(), "repeatUntilDate", null);
        setField(term250875, term250875.getClass(), "createDate", null);
        setField(term250875, term250875.getClass(), "lockUuid", null);
        setField(term250875, term250875.getClass(), "dropScheduleStatus", null);
        setField(term250875, term250875.getClass(), "dropRequestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "dropScheduleStatus", argTypes, term250875, args);
    }

};


