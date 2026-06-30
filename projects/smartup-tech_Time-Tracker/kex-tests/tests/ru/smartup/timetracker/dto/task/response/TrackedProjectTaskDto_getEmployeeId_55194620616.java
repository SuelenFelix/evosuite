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

public class TrackedProjectTaskDto_getEmployeeId_55194620616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;

    public TrackedProjectTaskDto_getEmployeeId_55194620616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto"));
        setIntField(term775, term775.getClass(), "employeeId", 0);
        setIntField(term775, term775.getClass(), "projectId", 0);
        setField(term775, term775.getClass(), "projectName", null);
        setLongField(term775, term775.getClass(), "taskId", 0L);
        setField(term775, term775.getClass(), "taskName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term775, args);
    }

};


