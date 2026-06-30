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

public class TaskDto_setBillable_142734663730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1529;
     Object term1534;

    public TaskDto_setBillable_142734663730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1529 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1529, term1529.getClass(), "id", 0L);
        setField(term1529, term1529.getClass(), "name", null);
        setIntField(term1529, term1529.getClass(), "projectId", 0);
        setBooleanField(term1529, term1529.getClass(), "billable", false);
        setBooleanField(term1529, term1529.getClass(), "isArchived", false);
        setField(term1529, term1529.getClass(), "createdDate", null);
        setField(term1529, term1529.getClass(), "lastModifiedDate", null);
        term1534 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1534;
        callMethod(klass, "setBillable", argTypes, term1529, args);
    }

};


