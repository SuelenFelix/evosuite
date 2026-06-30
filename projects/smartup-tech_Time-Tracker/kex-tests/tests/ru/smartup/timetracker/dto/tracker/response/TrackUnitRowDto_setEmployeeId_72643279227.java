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

public class TrackUnitRowDto_setEmployeeId_72643279227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5986;
     Object term5991;

    public TrackUnitRowDto_setEmployeeId_72643279227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5986 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5986, term5986.getClass(), "employeeId", 0);
        setIntField(term5986, term5986.getClass(), "projectId", 0);
        setField(term5986, term5986.getClass(), "projectName", null);
        setLongField(term5986, term5986.getClass(), "taskId", 0L);
        setField(term5986, term5986.getClass(), "taskName", null);
        setBooleanField(term5986, term5986.getClass(), "observed", false);
        setField(term5986, term5986.getClass(), "units", null);
        term5991 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5991;
        callMethod(klass, "setEmployeeId", argTypes, term5986, args);
    }

};


