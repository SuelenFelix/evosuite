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

public class Facility_getId_20379482161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38934;

    public Facility_getId_20379482161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38935 = new Integer(-547325184);
        term38934 = newInstance(Class.forName("com.org.model.Facility"));
        Object term38961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38966 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38934, term38934.getClass(), "id", term38935);
        setField(term38934, term38934.getClass(), "facilityName", "iVMKgSDqtv");
        setField(term38934, term38934.getClass(), "facilityState", "snUMTDsDAQ");
        setIntField(term38962, term38962.getClass(), "year", 2026);
        setShortField(term38962, term38962.getClass(), "month", (short) 6);
        setShortField(term38962, term38962.getClass(), "day", (short) 16);
        setField(term38961, term38961.getClass(), "date", term38962);
        setByteField(term38966, term38966.getClass(), "hour", (byte) 23);
        setByteField(term38966, term38966.getClass(), "minute", (byte) 43);
        setByteField(term38966, term38966.getClass(), "second", (byte) 38);
        setIntField(term38966, term38966.getClass(), "nano", 395188532);
        setField(term38961, term38961.getClass(), "time", term38966);
        setField(term38934, term38934.getClass(), "buyTime", term38961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term38934, args);
    }

};


