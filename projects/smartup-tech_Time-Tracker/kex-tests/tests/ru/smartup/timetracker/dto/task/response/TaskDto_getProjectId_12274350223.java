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

public class TaskDto_getProjectId_12274350223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term909;

    public TaskDto_getProjectId_12274350223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term909 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term926 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term929 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term909, term909.getClass(), "id", -6573104506744284592L);
        setField(term909, term909.getClass(), "name", "kuTXqwMtDB");
        setIntField(term909, term909.getClass(), "projectId", 1193880199);
        setBooleanField(term909, term909.getClass(), "billable", true);
        setBooleanField(term909, term909.getClass(), "isArchived", true);
        setIntField(term926, term926.getClass(), "nanos", 302000000);
        setLongField(term926, term926.getClass(), "fastTime", 1442628765000L);
        setField(term926, term926.getClass(), "cdate", null);
        setField(term909, term909.getClass(), "createdDate", term926);
        setIntField(term929, term929.getClass(), "nanos", 18000000);
        setLongField(term929, term929.getClass(), "fastTime", 1515879330000L);
        setField(term929, term929.getClass(), "cdate", null);
        setField(term909, term909.getClass(), "lastModifiedDate", term929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term909, args);
    }

};


