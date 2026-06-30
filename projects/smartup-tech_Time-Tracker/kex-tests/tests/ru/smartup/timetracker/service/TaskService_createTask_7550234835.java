package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskService_createTask_7550234835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21971;

    public TaskService_createTask_7550234835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21971 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term21988 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term21991 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term21971, term21971.getClass(), "id", 5127676408959197577L);
        setField(term21971, term21971.getClass(), "name", "TjWpyghUWN");
        setIntField(term21971, term21971.getClass(), "projectId", 1272542218);
        setBooleanField(term21971, term21971.getClass(), "billable", false);
        setBooleanField(term21971, term21971.getClass(), "isArchived", false);
        setIntField(term21988, term21988.getClass(), "nanos", 235000000);
        setLongField(term21988, term21988.getClass(), "fastTime", 1732167331000L);
        setField(term21988, term21988.getClass(), "cdate", null);
        setField(term21971, term21971.getClass(), "createdDate", term21988);
        setIntField(term21991, term21991.getClass(), "nanos", 814000000);
        setLongField(term21991, term21991.getClass(), "fastTime", 1498604526000L);
        setField(term21991, term21991.getClass(), "cdate", null);
        setField(term21971, term21971.getClass(), "lastModifiedDate", term21991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = term21971;
        callMethod(klass, "createTask", argTypes, null, args);
    }

};


