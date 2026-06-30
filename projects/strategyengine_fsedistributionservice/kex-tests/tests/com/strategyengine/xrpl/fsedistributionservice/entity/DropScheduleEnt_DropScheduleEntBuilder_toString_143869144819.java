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

public class DropScheduleEnt_DropScheduleEntBuilder_toString_143869144819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250878;

    public DropScheduleEnt_DropScheduleEntBuilder_toString_143869144819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250878 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder"));
        setField(term250878, term250878.getClass(), "id", null);
        setField(term250878, term250878.getClass(), "frequency", null);
        setField(term250878, term250878.getClass(), "repeatUntilDate", null);
        setField(term250878, term250878.getClass(), "createDate", null);
        setField(term250878, term250878.getClass(), "lockUuid", null);
        setField(term250878, term250878.getClass(), "dropScheduleStatus", null);
        setField(term250878, term250878.getClass(), "dropRequestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt$DropScheduleEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term250878, args);
    }

};


