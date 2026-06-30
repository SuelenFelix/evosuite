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
import java.lang.Boolean;

public class TrackUnitCellUpdateDto_setBillable_19657932978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term233;

    public TrackUnitCellUpdateDto_setBillable_19657932978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term217 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term217, term217.getClass(), "fastTime", 1645834034896L);
        setField(term217, term217.getClass(), "cdate", null);
        setField(term216, term216.getClass(), "workDay", term217);
        setFloatField(term216, term216.getClass(), "hours", 0.2857073F);
        setField(term216, term216.getClass(), "comment", "hRNSzYYIrc");
        setBooleanField(term216, term216.getClass(), "billable", true);
        term233 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term233;
        callMethod(klass, "setBillable", argTypes, term216, args);
    }

};


