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

public class TaskDto_setCreatedDate_151954705013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1269;
     Object term1292;

    public TaskDto_setCreatedDate_151954705013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1269 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1286 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1289 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1269, term1269.getClass(), "id", 2120084523938730454L);
        setField(term1269, term1269.getClass(), "name", "GzFkzHGYFt");
        setIntField(term1269, term1269.getClass(), "projectId", -817164822);
        setBooleanField(term1269, term1269.getClass(), "billable", false);
        setBooleanField(term1269, term1269.getClass(), "isArchived", false);
        setIntField(term1286, term1286.getClass(), "nanos", 385000000);
        setLongField(term1286, term1286.getClass(), "fastTime", 1347389761000L);
        setField(term1286, term1286.getClass(), "cdate", null);
        setField(term1269, term1269.getClass(), "createdDate", term1286);
        setIntField(term1289, term1289.getClass(), "nanos", 899000000);
        setLongField(term1289, term1289.getClass(), "fastTime", 1502147353000L);
        setField(term1289, term1289.getClass(), "cdate", null);
        setField(term1269, term1269.getClass(), "lastModifiedDate", term1289);
        term1292 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1292, term1292.getClass(), "nanos", 759000000);
        setLongField(term1292, term1292.getClass(), "fastTime", 1630941844000L);
        setField(term1292, term1292.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term1292;
        callMethod(klass, "setCreatedDate", argTypes, term1269, args);
    }

};


