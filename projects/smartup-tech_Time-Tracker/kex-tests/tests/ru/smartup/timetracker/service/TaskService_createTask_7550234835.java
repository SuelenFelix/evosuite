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
     Object term22111;

    public TaskService_createTask_7550234835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22111 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term22128 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22131 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term22111, term22111.getClass(), "id", 5127676408959197577L);
        setField(term22111, term22111.getClass(), "name", "TjWpyghUWN");
        setIntField(term22111, term22111.getClass(), "projectId", 1272542218);
        setBooleanField(term22111, term22111.getClass(), "billable", false);
        setBooleanField(term22111, term22111.getClass(), "isArchived", false);
        setIntField(term22128, term22128.getClass(), "nanos", 235000000);
        setLongField(term22128, term22128.getClass(), "fastTime", 1732167331000L);
        setField(term22128, term22128.getClass(), "cdate", null);
        setField(term22111, term22111.getClass(), "createdDate", term22128);
        setIntField(term22131, term22131.getClass(), "nanos", 814000000);
        setLongField(term22131, term22131.getClass(), "fastTime", 1498604526000L);
        setField(term22131, term22131.getClass(), "cdate", null);
        setField(term22111, term22111.getClass(), "lastModifiedDate", term22131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = term22111;
        callMethod(klass, "createTask", argTypes, null, args);
    }

};


