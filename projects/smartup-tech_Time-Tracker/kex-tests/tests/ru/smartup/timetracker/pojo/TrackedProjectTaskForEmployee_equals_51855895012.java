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

public class TrackedProjectTaskForEmployee_equals_51855895012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23222;
     Object term23251;

    public TrackedProjectTaskForEmployee_equals_51855895012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23222 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23222, term23222.getClass(), "employeeId", -1034506028);
        setIntField(term23222, term23222.getClass(), "projectId", -1263114719);
        setField(term23222, term23222.getClass(), "projectName", "sNQFlATEeQ");
        setLongField(term23222, term23222.getClass(), "taskId", -4443169559037975007L);
        setField(term23222, term23222.getClass(), "taskName", "ZKMLioamsY");
        setBooleanField(term23222, term23222.getClass(), "billable", true);
        term23251 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23251;
        callMethod(klass, "equals", argTypes, term23222, args);
    }

};


