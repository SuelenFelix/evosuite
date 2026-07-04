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

public class Facility_getBuyTime_5854320854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39105;

    public Facility_getBuyTime_5854320854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39106 = new Integer(1253501512);
        term39105 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39137 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39105, term39105.getClass(), "id", term39106);
        setField(term39105, term39105.getClass(), "facilityName", "YHtTpcXHtC");
        setField(term39105, term39105.getClass(), "facilityState", "uqzybgAbHn");
        setIntField(term39133, term39133.getClass(), "year", 2015);
        setShortField(term39133, term39133.getClass(), "month", (short) 1);
        setShortField(term39133, term39133.getClass(), "day", (short) 25);
        setField(term39132, term39132.getClass(), "date", term39133);
        setByteField(term39137, term39137.getClass(), "hour", (byte) 16);
        setByteField(term39137, term39137.getClass(), "minute", (byte) 22);
        setByteField(term39137, term39137.getClass(), "second", (byte) 44);
        setIntField(term39137, term39137.getClass(), "nano", 980528775);
        setField(term39132, term39132.getClass(), "time", term39137);
        setField(term39105, term39105.getClass(), "buyTime", term39132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuyTime", argTypes, term39105, args);
    }

};


