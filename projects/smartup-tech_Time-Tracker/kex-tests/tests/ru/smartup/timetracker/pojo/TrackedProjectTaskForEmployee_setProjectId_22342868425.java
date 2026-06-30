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
import java.lang.Integer;

public class TrackedProjectTaskForEmployee_setProjectId_22342868425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23509;
     Object term23514;

    public TrackedProjectTaskForEmployee_setProjectId_22342868425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23509 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23509, term23509.getClass(), "employeeId", 0);
        setIntField(term23509, term23509.getClass(), "projectId", 0);
        setField(term23509, term23509.getClass(), "projectName", null);
        setLongField(term23509, term23509.getClass(), "taskId", 0L);
        setField(term23509, term23509.getClass(), "taskName", null);
        setBooleanField(term23509, term23509.getClass(), "billable", false);
        term23514 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23514;
        callMethod(klass, "setProjectId", argTypes, term23509, args);
    }

};


