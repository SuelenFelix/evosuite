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

public class TrackUnitRowDto_setObserved_39827336732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6017;
     Object term6022;

    public TrackUnitRowDto_setObserved_39827336732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6017 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6017, term6017.getClass(), "employeeId", 0);
        setIntField(term6017, term6017.getClass(), "projectId", 0);
        setField(term6017, term6017.getClass(), "projectName", null);
        setLongField(term6017, term6017.getClass(), "taskId", 0L);
        setField(term6017, term6017.getClass(), "taskName", null);
        setBooleanField(term6017, term6017.getClass(), "observed", false);
        setField(term6017, term6017.getClass(), "units", null);
        term6022 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6022;
        callMethod(klass, "setObserved", argTypes, term6017, args);
    }

};


