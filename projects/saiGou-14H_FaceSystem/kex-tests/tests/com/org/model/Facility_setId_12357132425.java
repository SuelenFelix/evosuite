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

public class Facility_setId_12357132425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39162;
     Object term39199;

    public Facility_setId_12357132425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39163 = new Integer(594655877);
        term39162 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39194 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39162, term39162.getClass(), "id", term39163);
        setField(term39162, term39162.getClass(), "facilityName", "bVWOnKMYwA");
        setField(term39162, term39162.getClass(), "facilityState", "IQqGtjQIFE");
        setIntField(term39190, term39190.getClass(), "year", 2019);
        setShortField(term39190, term39190.getClass(), "month", (short) 10);
        setShortField(term39190, term39190.getClass(), "day", (short) 25);
        setField(term39189, term39189.getClass(), "date", term39190);
        setByteField(term39194, term39194.getClass(), "hour", (byte) 18);
        setByteField(term39194, term39194.getClass(), "minute", (byte) 58);
        setByteField(term39194, term39194.getClass(), "second", (byte) 55);
        setIntField(term39194, term39194.getClass(), "nano", 407840282);
        setField(term39189, term39189.getClass(), "time", term39194);
        setField(term39162, term39162.getClass(), "buyTime", term39189);
        term39199 = new Integer(281155455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39199;
        callMethod(klass, "setId", argTypes, term39162, args);
    }

};


