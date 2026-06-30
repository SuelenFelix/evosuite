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

public class TaskCreateDto_getName_92771170612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public TaskCreateDto_getName_92771170612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto"));
        setField(term279, term279.getClass(), "name", null);
        setIntField(term279, term279.getClass(), "projectId", 0);
        setBooleanField(term279, term279.getClass(), "billable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term279, args);
    }

};


