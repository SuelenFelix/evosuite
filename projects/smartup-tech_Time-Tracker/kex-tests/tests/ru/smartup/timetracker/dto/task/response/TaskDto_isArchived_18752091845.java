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

public class TaskDto_isArchived_18752091845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;

    public TaskDto_isArchived_18752091845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term975 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term992 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term995 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term975, term975.getClass(), "id", 8428634514691209827L);
        setField(term975, term975.getClass(), "name", "xrwlQZdwCp");
        setIntField(term975, term975.getClass(), "projectId", -1530420153);
        setBooleanField(term975, term975.getClass(), "billable", false);
        setBooleanField(term975, term975.getClass(), "isArchived", true);
        setIntField(term992, term992.getClass(), "nanos", 896000000);
        setLongField(term992, term992.getClass(), "fastTime", 1645823234000L);
        setField(term992, term992.getClass(), "cdate", null);
        setField(term975, term975.getClass(), "createdDate", term992);
        setIntField(term995, term995.getClass(), "nanos", 23000000);
        setLongField(term995, term995.getClass(), "fastTime", 1500710268000L);
        setField(term995, term995.getClass(), "cdate", null);
        setField(term975, term975.getClass(), "lastModifiedDate", term995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term975, args);
    }

};


