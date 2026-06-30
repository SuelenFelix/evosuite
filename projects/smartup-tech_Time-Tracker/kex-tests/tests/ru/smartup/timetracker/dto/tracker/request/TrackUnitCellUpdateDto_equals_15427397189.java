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

public class TrackUnitCellUpdateDto_equals_15427397189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;
     Object term262;

    public TrackUnitCellUpdateDto_equals_15427397189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term246 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term246, term246.getClass(), "fastTime", 1500721068023L);
        setField(term246, term246.getClass(), "cdate", null);
        setField(term245, term245.getClass(), "workDay", term246);
        setFloatField(term245, term245.getClass(), "hours", 0.6880585F);
        setField(term245, term245.getClass(), "comment", "RMFIsYGgne");
        setBooleanField(term245, term245.getClass(), "billable", true);
        term262 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term262;
        callMethod(klass, "equals", argTypes, term245, args);
    }

};


