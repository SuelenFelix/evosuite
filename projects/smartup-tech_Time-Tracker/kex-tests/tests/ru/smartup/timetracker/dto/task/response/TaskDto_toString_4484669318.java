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

public class TaskDto_toString_4484669318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1442;

    public TaskDto_toString_4484669318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1442 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1459 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1462 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1442, term1442.getClass(), "id", -484994522244390100L);
        setField(term1442, term1442.getClass(), "name", "nGKItKLYNC");
        setIntField(term1442, term1442.getClass(), "projectId", 1632125673);
        setBooleanField(term1442, term1442.getClass(), "billable", true);
        setBooleanField(term1442, term1442.getClass(), "isArchived", true);
        setIntField(term1459, term1459.getClass(), "nanos", 101000000);
        setLongField(term1459, term1459.getClass(), "fastTime", 1488715102000L);
        setField(term1459, term1459.getClass(), "cdate", null);
        setField(term1442, term1442.getClass(), "createdDate", term1459);
        setIntField(term1462, term1462.getClass(), "nanos", 361000000);
        setLongField(term1462, term1462.getClass(), "fastTime", 1311549317000L);
        setField(term1462, term1462.getClass(), "cdate", null);
        setField(term1442, term1442.getClass(), "lastModifiedDate", term1462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1442, args);
    }

};


