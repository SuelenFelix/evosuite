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

public class Facility_getFacilityState_2444586503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39048;

    public Facility_getFacilityState_2444586503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39049 = new Integer(1402619496);
        term39048 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39080 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39048, term39048.getClass(), "id", term39049);
        setField(term39048, term39048.getClass(), "facilityName", "WvaVoeUTqA");
        setField(term39048, term39048.getClass(), "facilityState", "dkswgBXyfe");
        setIntField(term39076, term39076.getClass(), "year", 2024);
        setShortField(term39076, term39076.getClass(), "month", (short) 9);
        setShortField(term39076, term39076.getClass(), "day", (short) 8);
        setField(term39075, term39075.getClass(), "date", term39076);
        setByteField(term39080, term39080.getClass(), "hour", (byte) 6);
        setByteField(term39080, term39080.getClass(), "minute", (byte) 3);
        setByteField(term39080, term39080.getClass(), "second", (byte) 52);
        setIntField(term39080, term39080.getClass(), "nano", 511733450);
        setField(term39075, term39075.getClass(), "time", term39080);
        setField(term39048, term39048.getClass(), "buyTime", term39075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacilityState", argTypes, term39048, args);
    }

};


