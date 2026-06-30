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

public class TrackedProjectTaskForEmployee_getTaskName_15534602154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22778;

    public TrackedProjectTaskForEmployee_getTaskName_15534602154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22778 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term22778, term22778.getClass(), "employeeId", 1375330971);
        setIntField(term22778, term22778.getClass(), "projectId", -478195677);
        setField(term22778, term22778.getClass(), "projectName", "nghfqDXyCG");
        setLongField(term22778, term22778.getClass(), "taskId", 5907001541142728739L);
        setField(term22778, term22778.getClass(), "taskName", "WBAOTqErtm");
        setBooleanField(term22778, term22778.getClass(), "billable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term22778, args);
    }

};


