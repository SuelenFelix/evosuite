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

public class Facility_setFacilityState_11959813507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39300;

    public Facility_setFacilityState_11959813507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39301 = new Integer(-2010823131);
        term39300 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39332 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39300, term39300.getClass(), "id", term39301);
        setField(term39300, term39300.getClass(), "facilityName", "CBPHkMUpDJ");
        setField(term39300, term39300.getClass(), "facilityState", "kcrVudpPVv");
        setIntField(term39328, term39328.getClass(), "year", 2025);
        setShortField(term39328, term39328.getClass(), "month", (short) 7);
        setShortField(term39328, term39328.getClass(), "day", (short) 22);
        setField(term39327, term39327.getClass(), "date", term39328);
        setByteField(term39332, term39332.getClass(), "hour", (byte) 19);
        setByteField(term39332, term39332.getClass(), "minute", (byte) 18);
        setByteField(term39332, term39332.getClass(), "second", (byte) 28);
        setIntField(term39332, term39332.getClass(), "nano", 975087142);
        setField(term39327, term39327.getClass(), "time", term39332);
        setField(term39300, term39300.getClass(), "buyTime", term39327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fHMfHuQbLa";
        callMethod(klass, "setFacilityState", argTypes, term39300, args);
    }

};


