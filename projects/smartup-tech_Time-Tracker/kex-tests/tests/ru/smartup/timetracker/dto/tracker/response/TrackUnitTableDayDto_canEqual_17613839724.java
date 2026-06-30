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

public class TrackUnitTableDayDto_canEqual_17613839724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1717;
     Object term1736;

    public TrackUnitTableDayDto_canEqual_17613839724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1738 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term1737 = ((Class) term1738).getDeclaredField((String) "WORK_DAY");
        ((Field) term1737).setAccessible(true);
        Object enum4 = ((Field) term1737).get((Object) null);
        term1717 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term1719 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term1717, term1717.getClass(), "blocked", true);
        setIntField(term1719, term1719.getClass(), "year", 2015);
        setShortField(term1719, term1719.getClass(), "month", (short) 9);
        setShortField(term1719, term1719.getClass(), "day", (short) 19);
        setField(term1717, term1717.getClass(), "date", term1719);
        setField(term1717, term1717.getClass(), "status", enum4);
        setFloatField(term1717, term1717.getClass(), "standardHours", 0.5523636F);
        term1736 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1736;
        callMethod(klass, "canEqual", argTypes, term1717, args);
    }

};


