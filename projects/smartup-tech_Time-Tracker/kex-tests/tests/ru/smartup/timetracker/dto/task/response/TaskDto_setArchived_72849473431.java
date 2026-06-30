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
import java.lang.Boolean;

public class TaskDto_setArchived_72849473431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;
     Object term1541;

    public TaskDto_setArchived_72849473431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1536 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1536, term1536.getClass(), "id", 0L);
        setField(term1536, term1536.getClass(), "name", null);
        setIntField(term1536, term1536.getClass(), "projectId", 0);
        setBooleanField(term1536, term1536.getClass(), "billable", false);
        setBooleanField(term1536, term1536.getClass(), "isArchived", false);
        setField(term1536, term1536.getClass(), "createdDate", null);
        setField(term1536, term1536.getClass(), "lastModifiedDate", null);
        term1541 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1541;
        callMethod(klass, "setArchived", argTypes, term1536, args);
    }

};


