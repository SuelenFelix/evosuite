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

public class TrackUnitCellDto_setRejected_52925906737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4188;
     Object term4194;

    public TrackUnitCellDto_setRejected_52925906737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4188 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4188, term4188.getClass(), "id", 0L);
        setField(term4188, term4188.getClass(), "workDay", null);
        setFloatField(term4188, term4188.getClass(), "hours", 0.0F);
        setBooleanField(term4188, term4188.getClass(), "blocked", false);
        setBooleanField(term4188, term4188.getClass(), "billable", false);
        setField(term4188, term4188.getClass(), "comment", null);
        setField(term4188, term4188.getClass(), "rejectReason", null);
        setBooleanField(term4188, term4188.getClass(), "rejected", false);
        term4194 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4194;
        callMethod(klass, "setRejected", argTypes, term4188, args);
    }

};


