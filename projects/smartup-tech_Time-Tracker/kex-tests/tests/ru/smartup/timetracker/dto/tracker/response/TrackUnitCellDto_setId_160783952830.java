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
import java.lang.Long;

public class TrackUnitCellDto_setId_160783952830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4138;
     Object term4144;

    public TrackUnitCellDto_setId_160783952830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4138 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        setLongField(term4138, term4138.getClass(), "id", 0L);
        setField(term4138, term4138.getClass(), "workDay", null);
        setFloatField(term4138, term4138.getClass(), "hours", 0.0F);
        setBooleanField(term4138, term4138.getClass(), "blocked", false);
        setBooleanField(term4138, term4138.getClass(), "billable", false);
        setField(term4138, term4138.getClass(), "comment", null);
        setField(term4138, term4138.getClass(), "rejectReason", null);
        setBooleanField(term4138, term4138.getClass(), "rejected", false);
        term4144 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4144;
        callMethod(klass, "setId", argTypes, term4138, args);
    }

};


