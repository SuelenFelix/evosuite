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

public class TrackUnitService_getSubmittedHoursByProjects_87817618311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3292;
     Object term3294;

    public TrackUnitService_getSubmittedHoursByProjects_87817618311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3292 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3292, term3292.getClass(), "fastTime", 1610940182830L);
        setField(term3292, term3292.getClass(), "cdate", null);
        HashMap term3295 = new HashMap();
        Set<Object> term3300 =  ((Map) term3295).keySet();
        term3294 = new HashSet((Collection<? extends Object>) term3300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.sql.Date");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term3292;
        args[1] = term3294;
        callMethod(klass, "getSubmittedHoursByProjects", argTypes, null, args);
    }

};


