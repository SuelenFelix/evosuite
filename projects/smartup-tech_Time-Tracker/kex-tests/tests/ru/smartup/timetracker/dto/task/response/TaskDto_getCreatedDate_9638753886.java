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

public class TaskDto_getCreatedDate_9638753886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008;

    public TaskDto_getCreatedDate_9638753886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1025 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1028 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1008, term1008.getClass(), "id", -2585684163342970173L);
        setField(term1008, term1008.getClass(), "name", "IDCWpPLRkE");
        setIntField(term1008, term1008.getClass(), "projectId", -469968304);
        setBooleanField(term1008, term1008.getClass(), "billable", false);
        setBooleanField(term1008, term1008.getClass(), "isArchived", true);
        setIntField(term1025, term1025.getClass(), "nanos", 25000000);
        setLongField(term1025, term1025.getClass(), "fastTime", 1797192828000L);
        setField(term1025, term1025.getClass(), "cdate", null);
        setField(term1008, term1008.getClass(), "createdDate", term1025);
        setIntField(term1028, term1028.getClass(), "nanos", 30000000);
        setLongField(term1028, term1028.getClass(), "fastTime", 1589447121000L);
        setField(term1028, term1028.getClass(), "cdate", null);
        setField(term1008, term1008.getClass(), "lastModifiedDate", term1028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term1008, args);
    }

};


