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

public class TrackUnitCellUpdateDto_canEqual_194806494910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;
     Object term290;

    public TrackUnitCellUpdateDto_canEqual_194806494910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term274 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term274, term274.getClass(), "fastTime", 1797203628025L);
        setField(term274, term274.getClass(), "cdate", null);
        setField(term273, term273.getClass(), "workDay", term274);
        setFloatField(term273, term273.getClass(), "hours", 0.40176582F);
        setField(term273, term273.getClass(), "comment", "NRdvgJlhkX");
        setBooleanField(term273, term273.getClass(), "billable", false);
        term290 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term290;
        callMethod(klass, "canEqual", argTypes, term273, args);
    }

};


