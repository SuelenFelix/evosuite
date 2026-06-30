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

public class TrackedProjectTaskDto_getProjectId_20302470711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public TrackedProjectTaskDto_getProjectId_20302470711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto"));
        setIntField(term49, term49.getClass(), "employeeId", 1484323161);
        setIntField(term49, term49.getClass(), "projectId", 391863371);
        setField(term49, term49.getClass(), "projectName", "MuLcgQHgqz");
        setLongField(term49, term49.getClass(), "taskId", 6375119433582206027L);
        setField(term49, term49.getClass(), "taskName", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term49, args);
    }

};


