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
import java.lang.Boolean;

public class TrackUnitCellDto_setBlocked_118016002733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4160;
     Object term4166;

    public TrackUnitCellDto_setBlocked_118016002733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4160 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4160, term4160.getClass(), "id", 0L);
        setField(term4160, term4160.getClass(), "workDay", null);
        setFloatField(term4160, term4160.getClass(), "hours", 0.0F);
        setBooleanField(term4160, term4160.getClass(), "blocked", false);
        setBooleanField(term4160, term4160.getClass(), "billable", false);
        setField(term4160, term4160.getClass(), "comment", null);
        setField(term4160, term4160.getClass(), "rejectReason", null);
        setBooleanField(term4160, term4160.getClass(), "rejected", false);
        term4166 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4166;
        callMethod(klass, "setBlocked", argTypes, term4160, args);
    }

};


