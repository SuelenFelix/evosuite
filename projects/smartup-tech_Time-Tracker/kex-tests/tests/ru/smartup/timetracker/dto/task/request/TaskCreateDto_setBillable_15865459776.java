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
import java.lang.Boolean;

public class TaskCreateDto_setBillable_15865459776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150;
     Object term165;

    public TaskCreateDto_setBillable_15865459776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto"));
        setField(term150, term150.getClass(), "name", "SzjVpOQTyS");
        setIntField(term150, term150.getClass(), "projectId", -1955890973);
        setBooleanField(term150, term150.getClass(), "billable", true);
        term165 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term165;
        callMethod(klass, "setBillable", argTypes, term150, args);
    }

};


