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

public class TrackUnitCellDto_canEqual_214069399239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202;

    public TrackUnitCellDto_canEqual_214069399239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4202, term4202.getClass(), "id", 0L);
        setField(term4202, term4202.getClass(), "workDay", null);
        setFloatField(term4202, term4202.getClass(), "hours", 0.0F);
        setBooleanField(term4202, term4202.getClass(), "blocked", false);
        setBooleanField(term4202, term4202.getClass(), "billable", false);
        setField(term4202, term4202.getClass(), "comment", null);
        setField(term4202, term4202.getClass(), "rejectReason", null);
        setBooleanField(term4202, term4202.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term4202, args);
    }

};


