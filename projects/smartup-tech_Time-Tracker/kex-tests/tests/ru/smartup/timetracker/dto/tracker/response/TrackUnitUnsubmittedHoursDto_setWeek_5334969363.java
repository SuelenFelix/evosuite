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

public class TrackUnitUnsubmittedHoursDto_setWeek_5334969363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12296;
     Object term12302;

    public TrackUnitUnsubmittedHoursDto_setWeek_5334969363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12296 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto"));
        Object term12297 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12297, term12297.getClass(), "year", 2027);
        setShortField(term12297, term12297.getClass(), "month", (short) 10);
        setShortField(term12297, term12297.getClass(), "day", (short) 4);
        setField(term12296, term12296.getClass(), "week", term12297);
        setFloatField(term12296, term12296.getClass(), "hours", 0.8254093F);
        term12302 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12302, term12302.getClass(), "year", 2023);
        setShortField(term12302, term12302.getClass(), "month", (short) 3);
        setShortField(term12302, term12302.getClass(), "day", (short) 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term12302;
        callMethod(klass, "setWeek", argTypes, term12296, args);
    }

};


