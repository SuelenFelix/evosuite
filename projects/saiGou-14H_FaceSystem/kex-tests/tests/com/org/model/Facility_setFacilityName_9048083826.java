package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Facility_setFacilityName_9048083826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39221;

    public Facility_setFacilityName_9048083826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39222 = new Integer(85079003);
        term39221 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39253 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39221, term39221.getClass(), "id", term39222);
        setField(term39221, term39221.getClass(), "facilityName", "RmkFdgzLOk");
        setField(term39221, term39221.getClass(), "facilityState", "MbeNzUVsCl");
        setIntField(term39249, term39249.getClass(), "year", 2012);
        setShortField(term39249, term39249.getClass(), "month", (short) 4);
        setShortField(term39249, term39249.getClass(), "day", (short) 23);
        setField(term39248, term39248.getClass(), "date", term39249);
        setByteField(term39253, term39253.getClass(), "hour", (byte) 8);
        setByteField(term39253, term39253.getClass(), "minute", (byte) 11);
        setByteField(term39253, term39253.getClass(), "second", (byte) 45);
        setIntField(term39253, term39253.getClass(), "nano", 286907697);
        setField(term39248, term39248.getClass(), "time", term39253);
        setField(term39221, term39221.getClass(), "buyTime", term39248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JrFwmRIxXJ";
        callMethod(klass, "setFacilityName", argTypes, term39221, args);
    }

};


