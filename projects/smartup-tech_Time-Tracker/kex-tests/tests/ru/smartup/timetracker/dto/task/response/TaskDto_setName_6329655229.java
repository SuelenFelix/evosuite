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

public class TaskDto_setName_6329655229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;

    public TaskDto_setName_6329655229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1126 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1129 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1109, term1109.getClass(), "id", 7009926388951271268L);
        setField(term1109, term1109.getClass(), "name", "wSQxaModmm");
        setIntField(term1109, term1109.getClass(), "projectId", 1962444399);
        setBooleanField(term1109, term1109.getClass(), "billable", true);
        setBooleanField(term1109, term1109.getClass(), "isArchived", true);
        setIntField(term1126, term1126.getClass(), "nanos", 364000000);
        setLongField(term1126, term1126.getClass(), "fastTime", 1882628084000L);
        setField(term1126, term1126.getClass(), "cdate", null);
        setField(term1109, term1109.getClass(), "createdDate", term1126);
        setIntField(term1129, term1129.getClass(), "nanos", 580000000);
        setLongField(term1129, term1129.getClass(), "fastTime", 1437746523000L);
        setField(term1129, term1129.getClass(), "cdate", null);
        setField(term1109, term1109.getClass(), "lastModifiedDate", term1129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setName", argTypes, term1109, args);
    }

};


