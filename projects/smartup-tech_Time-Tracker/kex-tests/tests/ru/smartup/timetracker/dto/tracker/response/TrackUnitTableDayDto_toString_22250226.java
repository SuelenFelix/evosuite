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

public class TrackUnitTableDayDto_toString_22250226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2534;

    public TrackUnitTableDayDto_toString_22250226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2559 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term2558 = ((Class) term2559).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term2558).setAccessible(true);
        Object enum6 = ((Field) term2558).get((Object) null);
        term2534 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term2536 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term2534, term2534.getClass(), "blocked", true);
        setIntField(term2536, term2536.getClass(), "year", 2015);
        setShortField(term2536, term2536.getClass(), "month", (short) 4);
        setShortField(term2536, term2536.getClass(), "day", (short) 14);
        setField(term2534, term2534.getClass(), "date", term2536);
        setField(term2534, term2534.getClass(), "status", enum6);
        setFloatField(term2534, term2534.getClass(), "standardHours", 0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2534, args);
    }

};


