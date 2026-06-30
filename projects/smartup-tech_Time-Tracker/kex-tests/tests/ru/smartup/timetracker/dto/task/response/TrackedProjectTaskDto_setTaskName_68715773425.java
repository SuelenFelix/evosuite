package ru.smartup.timetracker.dto.task.response;

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
import static ru.smartup.timetracker.dto.task.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrackedProjectTaskDto_setTaskName_68715773425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817;

    public TrackedProjectTaskDto_setTaskName_68715773425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto"));
        setIntField(term817, term817.getClass(), "employeeId", 0);
        setIntField(term817, term817.getClass(), "projectId", 0);
        setField(term817, term817.getClass(), "projectName", null);
        setLongField(term817, term817.getClass(), "taskId", 0L);
        setField(term817, term817.getClass(), "taskName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTaskName", argTypes, term817, args);
    }

};


