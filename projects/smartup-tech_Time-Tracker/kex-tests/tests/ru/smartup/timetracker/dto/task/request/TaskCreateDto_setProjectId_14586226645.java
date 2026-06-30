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
import java.lang.Integer;

public class TaskCreateDto_setProjectId_14586226645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term138;

    public TaskCreateDto_setProjectId_14586226645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto"));
        setField(term123, term123.getClass(), "name", "EGtDIRbSSb");
        setIntField(term123, term123.getClass(), "projectId", -1922583790);
        setBooleanField(term123, term123.getClass(), "billable", true);
        term138 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.request.TaskCreateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "setProjectId", argTypes, term123, args);
    }

};


