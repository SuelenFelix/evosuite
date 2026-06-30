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

public class TrackUnitUnsubmittedHoursDto_hashCode_12706042357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12328;

    public TrackUnitUnsubmittedHoursDto_hashCode_12706042357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12328 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto"));
        Object term12329 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12329, term12329.getClass(), "year", 2027);
        setShortField(term12329, term12329.getClass(), "month", (short) 8);
        setShortField(term12329, term12329.getClass(), "day", (short) 25);
        setField(term12328, term12328.getClass(), "week", term12329);
        setFloatField(term12328, term12328.getClass(), "hours", 0.06587154F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12328, args);
    }

};


