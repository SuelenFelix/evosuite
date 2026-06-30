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
import java.lang.Long;

public class TaskDto_setId_19536571458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1097;

    public TaskDto_setId_19536571458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1074 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1091 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1094 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1074, term1074.getClass(), "id", -4365849114644724155L);
        setField(term1074, term1074.getClass(), "name", "aKnKipADSo");
        setIntField(term1074, term1074.getClass(), "projectId", 679763016);
        setBooleanField(term1074, term1074.getClass(), "billable", false);
        setBooleanField(term1074, term1074.getClass(), "isArchived", false);
        setIntField(term1091, term1091.getClass(), "nanos", 457000000);
        setLongField(term1091, term1091.getClass(), "fastTime", 1706067372000L);
        setField(term1091, term1091.getClass(), "cdate", null);
        setField(term1074, term1074.getClass(), "createdDate", term1091);
        setIntField(term1094, term1094.getClass(), "nanos", 992000000);
        setLongField(term1094, term1094.getClass(), "fastTime", 1863620294000L);
        setField(term1094, term1094.getClass(), "cdate", null);
        setField(term1074, term1074.getClass(), "lastModifiedDate", term1094);
        term1097 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1097;
        callMethod(klass, "setId", argTypes, term1074, args);
    }

};


