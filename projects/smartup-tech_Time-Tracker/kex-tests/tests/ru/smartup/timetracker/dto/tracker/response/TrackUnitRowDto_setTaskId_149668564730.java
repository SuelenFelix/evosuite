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

public class TrackUnitRowDto_setTaskId_149668564730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6005;
     Object term6010;

    public TrackUnitRowDto_setTaskId_149668564730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6005 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6005, term6005.getClass(), "employeeId", 0);
        setIntField(term6005, term6005.getClass(), "projectId", 0);
        setField(term6005, term6005.getClass(), "projectName", null);
        setLongField(term6005, term6005.getClass(), "taskId", 0L);
        setField(term6005, term6005.getClass(), "taskName", null);
        setBooleanField(term6005, term6005.getClass(), "observed", false);
        setField(term6005, term6005.getClass(), "units", null);
        term6010 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6010;
        callMethod(klass, "setTaskId", argTypes, term6005, args);
    }

};


