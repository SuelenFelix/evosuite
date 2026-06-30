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
import java.lang.Integer;

public class TaskDto_setProjectId_129942332410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1164;
     Object term1187;

    public TaskDto_setProjectId_129942332410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1164 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1181 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1184 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1164, term1164.getClass(), "id", -7672528020740371001L);
        setField(term1164, term1164.getClass(), "name", "gGSMzuGICf");
        setIntField(term1164, term1164.getClass(), "projectId", 767834723);
        setBooleanField(term1164, term1164.getClass(), "billable", false);
        setBooleanField(term1164, term1164.getClass(), "isArchived", false);
        setIntField(term1181, term1181.getClass(), "nanos", 825000000);
        setLongField(term1181, term1181.getClass(), "fastTime", 1668558429000L);
        setField(term1181, term1181.getClass(), "cdate", null);
        setField(term1164, term1164.getClass(), "createdDate", term1181);
        setIntField(term1184, term1184.getClass(), "nanos", 647000000);
        setLongField(term1184, term1184.getClass(), "fastTime", 1725111417000L);
        setField(term1184, term1184.getClass(), "cdate", null);
        setField(term1164, term1164.getClass(), "lastModifiedDate", term1184);
        term1187 = new Integer(-602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1187;
        callMethod(klass, "setProjectId", argTypes, term1164, args);
    }

};


