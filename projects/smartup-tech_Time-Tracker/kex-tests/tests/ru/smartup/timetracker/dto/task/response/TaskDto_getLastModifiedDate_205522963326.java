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

public class TaskDto_getLastModifiedDate_205522963326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1505;

    public TaskDto_getLastModifiedDate_205522963326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1505 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1505, term1505.getClass(), "id", 0L);
        setField(term1505, term1505.getClass(), "name", null);
        setIntField(term1505, term1505.getClass(), "projectId", 0);
        setBooleanField(term1505, term1505.getClass(), "billable", false);
        setBooleanField(term1505, term1505.getClass(), "isArchived", false);
        setField(term1505, term1505.getClass(), "createdDate", null);
        setField(term1505, term1505.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term1505, args);
    }

};


