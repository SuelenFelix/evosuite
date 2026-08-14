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

public class TaskService_updateTask_10639143866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22144;

    public TaskService_updateTask_10639143866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22144 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term22161 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22164 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term22144, term22144.getClass(), "id", -6573104506744284592L);
        setField(term22144, term22144.getClass(), "name", "dkZFDZxcde");
        setIntField(term22144, term22144.getClass(), "projectId", 1209799204);
        setBooleanField(term22144, term22144.getClass(), "billable", true);
        setBooleanField(term22144, term22144.getClass(), "isArchived", false);
        setIntField(term22161, term22161.getClass(), "nanos", 879000000);
        setLongField(term22161, term22161.getClass(), "fastTime", 1578532431000L);
        setField(term22161, term22161.getClass(), "cdate", null);
        setField(term22144, term22144.getClass(), "createdDate", term22161);
        setIntField(term22164, term22164.getClass(), "nanos", 939000000);
        setLongField(term22164, term22164.getClass(), "fastTime", 1476086371000L);
        setField(term22164, term22164.getClass(), "cdate", null);
        setField(term22144, term22144.getClass(), "lastModifiedDate", term22164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = term22144;
        callMethod(klass, "updateTask", argTypes, null, args);
    }

};


