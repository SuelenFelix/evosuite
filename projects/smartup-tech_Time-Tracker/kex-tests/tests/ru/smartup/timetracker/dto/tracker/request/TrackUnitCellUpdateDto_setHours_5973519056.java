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
import java.lang.Float;

public class TrackUnitCellUpdateDto_setHours_5973519056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term155;

    public TrackUnitCellUpdateDto_setHours_5973519056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term139 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term139, term139.getClass(), "fastTime", 1429023851389L);
        setField(term139, term139.getClass(), "cdate", null);
        setField(term138, term138.getClass(), "workDay", term139);
        setFloatField(term138, term138.getClass(), "hours", 0.8564069F);
        setField(term138, term138.getClass(), "comment", "EGtDIRbSSb");
        setBooleanField(term138, term138.getClass(), "billable", true);
        term155 = new Float(0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term155;
        callMethod(klass, "setHours", argTypes, term138, args);
    }

};


