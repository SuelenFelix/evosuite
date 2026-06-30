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
import java.lang.Float;

public class TrackUnitCellDto_setHours_78998094832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4152;
     Object term4158;

    public TrackUnitCellDto_setHours_78998094832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4152 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4152, term4152.getClass(), "id", 0L);
        setField(term4152, term4152.getClass(), "workDay", null);
        setFloatField(term4152, term4152.getClass(), "hours", 0.0F);
        setBooleanField(term4152, term4152.getClass(), "blocked", false);
        setBooleanField(term4152, term4152.getClass(), "billable", false);
        setField(term4152, term4152.getClass(), "comment", null);
        setField(term4152, term4152.getClass(), "rejectReason", null);
        setBooleanField(term4152, term4152.getClass(), "rejected", false);
        term4158 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4158;
        callMethod(klass, "setHours", argTypes, term4152, args);
    }

};


