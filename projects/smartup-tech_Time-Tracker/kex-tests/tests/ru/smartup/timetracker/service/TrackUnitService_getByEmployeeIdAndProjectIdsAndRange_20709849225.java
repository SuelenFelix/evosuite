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
     Object term3255;
     Object term3257;
     Object term3263;
     Object term3267;

    public TrackUnitService_getByEmployeeIdAndProjectIdsAndRange_20709849225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3255 = new Integer(982388293);
        HashMap term3258 = new HashMap();
        Set<Object> term3271 =  ((Map) term3258).keySet();
        term3257 = new HashSet((Collection<? extends Object>) term3271);
        term3263 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3263, term3263.getClass(), "year", 2023);
        setShortField(term3263, term3263.getClass(), "month", (short) 9);
        setShortField(term3263, term3263.getClass(), "day", (short) 22);
        term3267 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3267, term3267.getClass(), "year", 2013);
        setShortField(term3267, term3267.getClass(), "month", (short) 3);
        setShortField(term3267, term3267.getClass(), "day", (short) 8);
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
        args[0] = term3255;
        args[1] = term3257;
        args[2] = term3263;
        args[3] = term3267;
        callMethod(klass, "getByEmployeeIdAndProjectIdsAndRange", argTypes, null, args);
    }

};


