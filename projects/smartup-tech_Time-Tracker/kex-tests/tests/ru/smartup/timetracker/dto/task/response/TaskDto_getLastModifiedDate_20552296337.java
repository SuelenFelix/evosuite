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

public class TaskDto_getLastModifiedDate_20552296337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;

    public TaskDto_getLastModifiedDate_20552296337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1058 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1061 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1041, term1041.getClass(), "id", 8059786003080744426L);
        setField(term1041, term1041.getClass(), "name", "nyiiPDVjAc");
        setIntField(term1041, term1041.getClass(), "projectId", -1145578966);
        setBooleanField(term1041, term1041.getClass(), "billable", false);
        setBooleanField(term1041, term1041.getClass(), "isArchived", true);
        setIntField(term1058, term1058.getClass(), "nanos", 80000000);
        setLongField(term1058, term1058.getClass(), "fastTime", 1745452162000L);
        setField(term1058, term1058.getClass(), "cdate", null);
        setField(term1041, term1041.getClass(), "createdDate", term1058);
        setIntField(term1061, term1061.getClass(), "nanos", 960000000);
        setLongField(term1061, term1061.getClass(), "fastTime", 1349058953000L);
        setField(term1061, term1061.getClass(), "cdate", null);
        setField(term1041, term1041.getClass(), "lastModifiedDate", term1061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term1041, args);
    }

};


