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

public class TrackUnitTableDayDto_isBlocked_19376437891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public TrackUnitTableDayDto_isBlocked_19376437891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term472 = ((Class) term473).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term472).setAccessible(true);
        Object enum1 = ((Field) term472).get((Object) null);
        term448 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term450 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term448, term448.getClass(), "blocked", false);
        setIntField(term450, term450.getClass(), "year", 2016);
        setShortField(term450, term450.getClass(), "month", (short) 11);
        setShortField(term450, term450.getClass(), "day", (short) 29);
        setField(term448, term448.getClass(), "date", term450);
        setField(term448, term448.getClass(), "status", enum1);
        setFloatField(term448, term448.getClass(), "standardHours", 0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlocked", argTypes, term448, args);
    }

};


