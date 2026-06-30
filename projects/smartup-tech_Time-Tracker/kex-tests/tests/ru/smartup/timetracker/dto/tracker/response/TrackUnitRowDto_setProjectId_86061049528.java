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
import java.lang.Integer;

public class TrackUnitRowDto_setProjectId_86061049528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5993;
     Object term5998;

    public TrackUnitRowDto_setProjectId_86061049528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5993 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5993, term5993.getClass(), "employeeId", 0);
        setIntField(term5993, term5993.getClass(), "projectId", 0);
        setField(term5993, term5993.getClass(), "projectName", null);
        setLongField(term5993, term5993.getClass(), "taskId", 0L);
        setField(term5993, term5993.getClass(), "taskName", null);
        setBooleanField(term5993, term5993.getClass(), "observed", false);
        setField(term5993, term5993.getClass(), "units", null);
        term5998 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5998;
        callMethod(klass, "setProjectId", argTypes, term5993, args);
    }

};


