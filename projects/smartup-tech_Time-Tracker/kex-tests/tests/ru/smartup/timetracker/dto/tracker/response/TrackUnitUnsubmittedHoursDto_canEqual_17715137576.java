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

public class TrackUnitUnsubmittedHoursDto_canEqual_17715137576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12321;
     Object term12327;

    public TrackUnitUnsubmittedHoursDto_canEqual_17715137576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12321 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto"));
        Object term12322 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term12322, term12322.getClass(), "year", 2021);
        setShortField(term12322, term12322.getClass(), "month", (short) 9);
        setShortField(term12322, term12322.getClass(), "day", (short) 30);
        setField(term12321, term12321.getClass(), "week", term12322);
        setFloatField(term12321, term12321.getClass(), "hours", 0.5037956F);
        term12327 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitUnsubmittedHoursDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12327;
        callMethod(klass, "canEqual", argTypes, term12321, args);
    }

};


