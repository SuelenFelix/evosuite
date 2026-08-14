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
import java.lang.Long;

public class TrackUnitService_getByEmployeeIdAndTaskIdAndRange_16850186154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3219;
     Object term3221;
     Object term3223;
     Object term3227;

    public TrackUnitService_getByEmployeeIdAndTaskIdAndRange_16850186154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3219 = new Integer(371943306);
        term3221 = new Long(5270370404989704783L);
        term3223 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3223, term3223.getClass(), "year", 2025);
        setShortField(term3223, term3223.getClass(), "month", (short) 3);
        setShortField(term3223, term3223.getClass(), "day", (short) 8);
        term3227 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3227, term3227.getClass(), "year", 2025);
        setShortField(term3227, term3227.getClass(), "month", (short) 11);
        setShortField(term3227, term3227.getClass(), "day", (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[4];
        args[0] = term3219;
        args[1] = term3221;
        args[2] = term3223;
        args[3] = term3227;
        callMethod(klass, "getByEmployeeIdAndTaskIdAndRange", argTypes, null, args);
    }

};


