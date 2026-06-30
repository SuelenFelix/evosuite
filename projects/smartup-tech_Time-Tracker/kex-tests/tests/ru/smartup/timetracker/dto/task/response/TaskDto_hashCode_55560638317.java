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

public class TaskDto_hashCode_55560638317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;

    public TaskDto_hashCode_55560638317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1409 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1426 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1429 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1409, term1409.getClass(), "id", -6823727938421990489L);
        setField(term1409, term1409.getClass(), "name", "jDtqGUpnZN");
        setIntField(term1409, term1409.getClass(), "projectId", -14890619);
        setBooleanField(term1409, term1409.getClass(), "billable", false);
        setBooleanField(term1409, term1409.getClass(), "isArchived", true);
        setIntField(term1426, term1426.getClass(), "nanos", 559000000);
        setLongField(term1426, term1426.getClass(), "fastTime", 1876862000000L);
        setField(term1426, term1426.getClass(), "cdate", null);
        setField(term1409, term1409.getClass(), "createdDate", term1426);
        setIntField(term1429, term1429.getClass(), "nanos", 366000000);
        setLongField(term1429, term1429.getClass(), "fastTime", 1304521299000L);
        setField(term1429, term1429.getClass(), "cdate", null);
        setField(term1409, term1409.getClass(), "lastModifiedDate", term1429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1409, args);
    }

};


