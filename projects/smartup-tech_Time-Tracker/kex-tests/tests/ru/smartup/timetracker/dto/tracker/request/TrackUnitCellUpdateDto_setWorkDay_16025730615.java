package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TrackUnitCellUpdateDto_setWorkDay_16025730615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term126;

    public TrackUnitCellUpdateDto_setWorkDay_16025730615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term110 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term110, term110.getClass(), "fastTime", 1442639565302L);
        setField(term110, term110.getClass(), "cdate", null);
        setField(term109, term109.getClass(), "workDay", term110);
        setFloatField(term109, term109.getClass(), "hours", 0.5523636F);
        setField(term109, term109.getClass(), "comment", "jJCZpVmanW");
        setBooleanField(term109, term109.getClass(), "billable", true);
        term126 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term126, term126.getClass(), "fastTime", 1515890130018L);
        setField(term126, term126.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term126;
        callMethod(klass, "setWorkDay", argTypes, term109, args);
    }

};


