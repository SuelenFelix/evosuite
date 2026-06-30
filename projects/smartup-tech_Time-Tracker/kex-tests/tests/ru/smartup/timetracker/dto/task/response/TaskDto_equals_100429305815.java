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
import java.lang.Object;

public class TaskDto_equals_100429305815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1341;
     Object term1364;

    public TaskDto_equals_100429305815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1341 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1358 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1361 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1341, term1341.getClass(), "id", -5892135042702373494L);
        setField(term1341, term1341.getClass(), "name", "LvtrsXUliU");
        setIntField(term1341, term1341.getClass(), "projectId", -1968847291);
        setBooleanField(term1341, term1341.getClass(), "billable", true);
        setBooleanField(term1341, term1341.getClass(), "isArchived", true);
        setIntField(term1358, term1358.getClass(), "nanos", 764000000);
        setLongField(term1358, term1358.getClass(), "fastTime", 1496849028000L);
        setField(term1358, term1358.getClass(), "cdate", null);
        setField(term1341, term1341.getClass(), "createdDate", term1358);
        setIntField(term1361, term1361.getClass(), "nanos", 367000000);
        setLongField(term1361, term1361.getClass(), "fastTime", 1691857668000L);
        setField(term1361, term1361.getClass(), "cdate", null);
        setField(term1341, term1341.getClass(), "lastModifiedDate", term1361);
        term1364 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1364;
        callMethod(klass, "equals", argTypes, term1341, args);
    }

};


