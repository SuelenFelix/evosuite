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
import java.lang.Boolean;

public class TaskDto_setArchived_72849473412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1234;
     Object term1257;

    public TaskDto_setArchived_72849473412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1234 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1251 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1254 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1234, term1234.getClass(), "id", 1967728129628047933L);
        setField(term1234, term1234.getClass(), "name", "BndsHwAFMv");
        setIntField(term1234, term1234.getClass(), "projectId", 1876565163);
        setBooleanField(term1234, term1234.getClass(), "billable", true);
        setBooleanField(term1234, term1234.getClass(), "isArchived", true);
        setIntField(term1251, term1251.getClass(), "nanos", 394000000);
        setLongField(term1251, term1251.getClass(), "fastTime", 1538068116000L);
        setField(term1251, term1251.getClass(), "cdate", null);
        setField(term1234, term1234.getClass(), "createdDate", term1251);
        setIntField(term1254, term1254.getClass(), "nanos", 937000000);
        setLongField(term1254, term1254.getClass(), "fastTime", 1744079265000L);
        setField(term1254, term1254.getClass(), "cdate", null);
        setField(term1234, term1234.getClass(), "lastModifiedDate", term1254);
        term1257 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1257;
        callMethod(klass, "setArchived", argTypes, term1234, args);
    }

};


