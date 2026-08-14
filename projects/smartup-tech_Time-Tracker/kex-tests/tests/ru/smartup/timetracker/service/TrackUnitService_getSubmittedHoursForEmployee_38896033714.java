package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TrackUnitService_getSubmittedHoursForEmployee_38896033714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3289;
     Object term3325;
     Object term3329;

    public TrackUnitService_getSubmittedHoursForEmployee_38896033714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3290 = new HashMap();
        Set<Object> term3333 =  ((Map) term3290).keySet();
        term3289 = new HashSet((Collection<? extends Object>) term3333);
        term3325 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3325, term3325.getClass(), "year", 2027);
        setShortField(term3325, term3325.getClass(), "month", (short) 2);
        setShortField(term3325, term3325.getClass(), "day", (short) 18);
        term3329 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3329, term3329.getClass(), "year", 2028);
        setShortField(term3329, term3329.getClass(), "month", (short) 5);
        setShortField(term3329, term3329.getClass(), "day", (short) 29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[3];
        args[0] = term3289;
        args[1] = term3325;
        args[2] = term3329;
        callMethod(klass, "getSubmittedHoursForEmployee", argTypes, null, args);
    }

};


