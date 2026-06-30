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

public class TrackUnitUnsubmittedHoursDto_equals_17192909105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12314;
     Object term12320;

    public TrackUnitUnsubmittedHoursDto_equals_17192909105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12314 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto"));
        Object term12315 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12315, term12315.getClass(), "year", 2015);
        setShortField(term12315, term12315.getClass(), "month", (short) 3);
        setShortField(term12315, term12315.getClass(), "day", (short) 10);
        setField(term12314, term12314.getClass(), "week", term12315);
        setFloatField(term12314, term12314.getClass(), "hours", 0.78659093F);
        term12320 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12320;
        callMethod(klass, "equals", argTypes, term12314, args);
    }

};


