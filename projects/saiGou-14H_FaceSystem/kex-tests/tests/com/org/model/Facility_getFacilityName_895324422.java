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

public class Facility_getFacilityName_895324422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38991;

    public Facility_getFacilityName_895324422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38992 = new Integer(1470261214);
        term38991 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38991, term38991.getClass(), "id", term38992);
        setField(term38991, term38991.getClass(), "facilityName", "mLLEZxImzO");
        setField(term38991, term38991.getClass(), "facilityState", "pmCySZHNoC");
        setIntField(term39019, term39019.getClass(), "year", 2010);
        setShortField(term39019, term39019.getClass(), "month", (short) 12);
        setShortField(term39019, term39019.getClass(), "day", (short) 4);
        setField(term39018, term39018.getClass(), "date", term39019);
        setByteField(term39023, term39023.getClass(), "hour", (byte) 18);
        setByteField(term39023, term39023.getClass(), "minute", (byte) 23);
        setByteField(term39023, term39023.getClass(), "second", (byte) 50);
        setIntField(term39023, term39023.getClass(), "nano", 773671553);
        setField(term39018, term39018.getClass(), "time", term39023);
        setField(term38991, term38991.getClass(), "buyTime", term39018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacilityName", argTypes, term38991, args);
    }

};


