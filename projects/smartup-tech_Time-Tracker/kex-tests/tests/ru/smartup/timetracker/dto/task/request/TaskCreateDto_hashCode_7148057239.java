package ru.smartup.timetracker.dto.task.request;

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
import static ru.smartup.timetracker.dto.task.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TaskCreateDto_hashCode_7148057239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public TaskCreateDto_hashCode_7148057239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto"));
        setField(term229, term229.getClass(), "name", "RMFIsYGgne");
        setIntField(term229, term229.getClass(), "projectId", -1339778481);
        setBooleanField(term229, term229.getClass(), "billable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term229, args);
    }

};


