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
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TrackUnitService_getByEmployeeIdAndProjectIdsAndRange_20709849225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3231;
     Object term3233;
     Object term3239;
     Object term3243;

    public TrackUnitService_getByEmployeeIdAndProjectIdsAndRange_20709849225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3231 = new Integer(982388293);
        HashMap term3234 = new HashMap();
        Set<Object> term3247 =  ((Map) term3234).keySet();
        term3233 = new HashSet((Collection<? extends Object>) term3247);
        term3239 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3239, term3239.getClass(), "year", 2023);
        setShortField(term3239, term3239.getClass(), "month", (short) 9);
        setShortField(term3239, term3239.getClass(), "day", (short) 22);
        term3243 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3243, term3243.getClass(), "year", 2013);
        setShortField(term3243, term3243.getClass(), "month", (short) 3);
        setShortField(term3243, term3243.getClass(), "day", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[4];
        args[0] = term3231;
        args[1] = term3233;
        args[2] = term3239;
        args[3] = term3243;
        callMethod(klass, "getByEmployeeIdAndProjectIdsAndRange", argTypes, null, args);
    }

};


