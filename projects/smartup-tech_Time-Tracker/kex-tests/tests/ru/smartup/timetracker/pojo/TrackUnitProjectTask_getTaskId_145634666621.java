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

public class TrackUnitProjectTask_getTaskId_145634666621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55826;

    public TrackUnitProjectTask_getTaskId_145634666621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55826 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        setIntField(term55826, term55826.getClass(), "employeeId", 0);
        setLongField(term55826, term55826.getClass(), "trackUnitId", 0L);
        setField(term55826, term55826.getClass(), "trackUnitWorkDay", null);
        setIntField(term55826, term55826.getClass(), "projectId", 0);
        setField(term55826, term55826.getClass(), "projectName", null);
        setLongField(term55826, term55826.getClass(), "taskId", 0L);
        setField(term55826, term55826.getClass(), "taskName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term55826, args);
    }

};


