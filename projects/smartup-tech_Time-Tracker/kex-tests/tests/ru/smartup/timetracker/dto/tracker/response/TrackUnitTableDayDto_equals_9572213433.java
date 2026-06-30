package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TrackUnitTableDayDto_equals_9572213433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1286;
     Object term1310;

    public TrackUnitTableDayDto_equals_9572213433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1312 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1311 = ((Class) term1312).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term1311).setAccessible(true);
        Object enum3 = ((Field) term1311).get((Object) null);
        term1286 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term1288 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term1286, term1286.getClass(), "blocked", true);
        setIntField(term1288, term1288.getClass(), "year", 2020);
        setShortField(term1288, term1288.getClass(), "month", (short) 11);
        setShortField(term1288, term1288.getClass(), "day", (short) 22);
        setField(term1286, term1286.getClass(), "date", term1288);
        setField(term1286, term1286.getClass(), "status", enum3);
        setFloatField(term1286, term1286.getClass(), "standardHours", 0.09123778F);
        term1310 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1310;
        callMethod(klass, "equals", argTypes, term1286, args);
    }

};


