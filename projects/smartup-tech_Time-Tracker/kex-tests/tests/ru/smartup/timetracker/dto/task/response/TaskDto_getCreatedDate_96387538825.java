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

public class TaskDto_getCreatedDate_96387538825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1500;

    public TaskDto_getCreatedDate_96387538825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1500 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1500, term1500.getClass(), "id", 0L);
        setField(term1500, term1500.getClass(), "name", null);
        setIntField(term1500, term1500.getClass(), "projectId", 0);
        setBooleanField(term1500, term1500.getClass(), "billable", false);
        setBooleanField(term1500, term1500.getClass(), "isArchived", false);
        setField(term1500, term1500.getClass(), "createdDate", null);
        setField(term1500, term1500.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term1500, args);
    }

};


