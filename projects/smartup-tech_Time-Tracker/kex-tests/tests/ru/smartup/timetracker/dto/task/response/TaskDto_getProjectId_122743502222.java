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

public class TaskDto_getProjectId_122743502222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;

    public TaskDto_getProjectId_122743502222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1485, term1485.getClass(), "id", 0L);
        setField(term1485, term1485.getClass(), "name", null);
        setIntField(term1485, term1485.getClass(), "projectId", 0);
        setBooleanField(term1485, term1485.getClass(), "billable", false);
        setBooleanField(term1485, term1485.getClass(), "isArchived", false);
        setField(term1485, term1485.getClass(), "createdDate", null);
        setField(term1485, term1485.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term1485, args);
    }

};


