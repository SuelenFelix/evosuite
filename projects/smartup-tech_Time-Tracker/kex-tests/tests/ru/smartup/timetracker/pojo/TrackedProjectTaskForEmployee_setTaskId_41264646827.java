package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TrackedProjectTaskForEmployee_setTaskId_41264646827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23521;
     Object term23526;

    public TrackedProjectTaskForEmployee_setTaskId_41264646827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23521 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23521, term23521.getClass(), "employeeId", 0);
        setIntField(term23521, term23521.getClass(), "projectId", 0);
        setField(term23521, term23521.getClass(), "projectName", null);
        setLongField(term23521, term23521.getClass(), "taskId", 0L);
        setField(term23521, term23521.getClass(), "taskName", null);
        setBooleanField(term23521, term23521.getClass(), "billable", false);
        term23526 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23526;
        callMethod(klass, "setTaskId", argTypes, term23521, args);
    }

};


