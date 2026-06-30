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

public class TrackedProjectTaskForEmployee_setBillable_9550537111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23171;
     Object term23200;

    public TrackedProjectTaskForEmployee_setBillable_9550537111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23171 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23171, term23171.getClass(), "employeeId", 941650513);
        setIntField(term23171, term23171.getClass(), "projectId", 444029505);
        setField(term23171, term23171.getClass(), "projectName", "CGOpQSZZwI");
        setLongField(term23171, term23171.getClass(), "taskId", 4044358158040652353L);
        setField(term23171, term23171.getClass(), "taskName", "ypEdrstygY");
        setBooleanField(term23171, term23171.getClass(), "billable", true);
        term23200 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term23200;
        callMethod(klass, "setBillable", argTypes, term23171, args);
    }

};


