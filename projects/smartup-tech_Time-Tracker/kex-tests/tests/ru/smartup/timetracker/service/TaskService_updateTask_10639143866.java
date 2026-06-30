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
     Object term22004;

    public TaskService_updateTask_10639143866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22004 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term22021 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term22024 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term22004, term22004.getClass(), "id", -6573104506744284592L);
        setField(term22004, term22004.getClass(), "name", "dkZFDZxcde");
        setIntField(term22004, term22004.getClass(), "projectId", 1209799204);
        setBooleanField(term22004, term22004.getClass(), "billable", true);
        setBooleanField(term22004, term22004.getClass(), "isArchived", false);
        setIntField(term22021, term22021.getClass(), "nanos", 879000000);
        setLongField(term22021, term22021.getClass(), "fastTime", 1578532431000L);
        setField(term22021, term22021.getClass(), "cdate", null);
        setField(term22004, term22004.getClass(), "createdDate", term22021);
        setIntField(term22024, term22024.getClass(), "nanos", 939000000);
        setLongField(term22024, term22024.getClass(), "fastTime", 1476086371000L);
        setField(term22024, term22024.getClass(), "cdate", null);
        setField(term22004, term22004.getClass(), "lastModifiedDate", term22024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TaskService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Task");
        Object[] args = new Object[1];
        args[0] = term22004;
        callMethod(klass, "updateTask", argTypes, null, args);
    }

};


