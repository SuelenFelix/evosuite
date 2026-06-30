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
import java.lang.String;
import java.lang.Object;
import java.lang.Float;
import java.lang.Boolean;

public class TrackUnitTableDayDto_init_10036328700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object enum0;
     Object term16;
     Object term18;

    public TrackUnitTableDayDto_init_10036328700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1, term1.getClass(), "year", 2012);
        setShortField(term1, term1.getClass(), "month", (short) 8);
        setShortField(term1, term1.getClass(), "day", (short) 25);
        Class<? extends Object> term61 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term60 = ((Class) term61).getDeclaredField((String) "WEEKEND");
        ((Field) term60).setAccessible(true);
        enum0 = ((Field) term60).get((Object) null);
        term16 = new Float(0.13238746F);
        term18 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[2] = float.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = enum0;
        args[2] = term16;
        args[3] = term18;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


