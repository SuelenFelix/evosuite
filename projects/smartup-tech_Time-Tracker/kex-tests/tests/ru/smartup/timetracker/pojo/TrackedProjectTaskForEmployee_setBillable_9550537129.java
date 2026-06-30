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
import java.lang.Boolean;

public class TrackedProjectTaskForEmployee_setBillable_9550537129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23533;
     Object term23538;

    public TrackedProjectTaskForEmployee_setBillable_9550537129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23533 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23533, term23533.getClass(), "employeeId", 0);
        setIntField(term23533, term23533.getClass(), "projectId", 0);
        setField(term23533, term23533.getClass(), "projectName", null);
        setLongField(term23533, term23533.getClass(), "taskId", 0L);
        setField(term23533, term23533.getClass(), "taskName", null);
        setBooleanField(term23533, term23533.getClass(), "billable", false);
        term23538 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23538;
        callMethod(klass, "setBillable", argTypes, term23533, args);
    }

};


