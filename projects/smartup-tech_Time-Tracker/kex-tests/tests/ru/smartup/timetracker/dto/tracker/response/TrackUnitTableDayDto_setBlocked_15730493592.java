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
import java.lang.Boolean;

public class TrackUnitTableDayDto_setBlocked_15730493592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term878;
     Object term896;

    public TrackUnitTableDayDto_setBlocked_15730493592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term899 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term898 = ((Class) term899).getDeclaredField((String) "WEEKEND");
        ((Field) term898).setAccessible(true);
        Object enum2 = ((Field) term898).get((Object) null);
        term878 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term880 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term878, term878.getClass(), "blocked", false);
        setIntField(term880, term880.getClass(), "year", 2021);
        setShortField(term880, term880.getClass(), "month", (short) 1);
        setShortField(term880, term880.getClass(), "day", (short) 18);
        setField(term878, term878.getClass(), "date", term880);
        setField(term878, term878.getClass(), "status", enum2);
        setFloatField(term878, term878.getClass(), "standardHours", 0.3455959F);
        term896 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term896;
        callMethod(klass, "setBlocked", argTypes, term878, args);
    }

};


