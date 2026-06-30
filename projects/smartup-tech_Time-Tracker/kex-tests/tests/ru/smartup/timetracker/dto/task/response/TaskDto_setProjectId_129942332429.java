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
import java.lang.Integer;

public class TaskDto_setProjectId_129942332429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522;
     Object term1527;

    public TaskDto_setProjectId_129942332429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1522 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        setLongField(term1522, term1522.getClass(), "id", 0L);
        setField(term1522, term1522.getClass(), "name", null);
        setIntField(term1522, term1522.getClass(), "projectId", 0);
        setBooleanField(term1522, term1522.getClass(), "billable", false);
        setBooleanField(term1522, term1522.getClass(), "isArchived", false);
        setField(term1522, term1522.getClass(), "createdDate", null);
        setField(term1522, term1522.getClass(), "lastModifiedDate", null);
        term1527 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1527;
        callMethod(klass, "setProjectId", argTypes, term1522, args);
    }

};


