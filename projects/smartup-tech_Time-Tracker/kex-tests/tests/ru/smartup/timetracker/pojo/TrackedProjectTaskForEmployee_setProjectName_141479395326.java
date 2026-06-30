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

public class TrackedProjectTaskForEmployee_setProjectName_141479395326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23516;

    public TrackedProjectTaskForEmployee_setProjectName_141479395326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23516 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23516, term23516.getClass(), "employeeId", 0);
        setIntField(term23516, term23516.getClass(), "projectId", 0);
        setField(term23516, term23516.getClass(), "projectName", null);
        setLongField(term23516, term23516.getClass(), "taskId", 0L);
        setField(term23516, term23516.getClass(), "taskName", null);
        setBooleanField(term23516, term23516.getClass(), "billable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProjectName", argTypes, term23516, args);
    }

};


