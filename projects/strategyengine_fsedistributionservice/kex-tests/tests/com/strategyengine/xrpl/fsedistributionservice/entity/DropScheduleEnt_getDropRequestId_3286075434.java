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

public class DropScheduleEnt_getDropRequestId_3286075434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21579;

    public DropScheduleEnt_getDropRequestId_3286075434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21579 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        setField(term21579, term21579.getClass(), "id", null);
        setField(term21579, term21579.getClass(), "frequency", null);
        setField(term21579, term21579.getClass(), "repeatUntilDate", null);
        setField(term21579, term21579.getClass(), "createDate", null);
        setField(term21579, term21579.getClass(), "lockUuid", null);
        setField(term21579, term21579.getClass(), "dropScheduleStatus", null);
        setField(term21579, term21579.getClass(), "dropRequestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term21579, args);
    }

};


