package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedWorkDaysForEmployees_getLastName_12320239483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56179;

    public SubmittedWorkDaysForEmployees_getLastName_12320239483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56179 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56205 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56179, term56179.getClass(), "employeeId", -506958186);
        setField(term56179, term56179.getClass(), "firstName", "bwlLFAfNWx");
        setField(term56179, term56179.getClass(), "lastName", "JWodNQzjjV");
        setLongField(term56205, term56205.getClass(), "fastTime", 1354735325477L);
        setField(term56205, term56205.getClass(), "cdate", null);
        setField(term56179, term56179.getClass(), "trackUnitWorkDay", term56205);
        setIntField(term56179, term56179.getClass(), "projectId", -507387516);
        setField(term56179, term56179.getClass(), "projectName", "CAgxWjhxNf");
        setLongField(term56179, term56179.getClass(), "trackUnitId", -2255965562447970862L);
        setLongField(term56179, term56179.getClass(), "taskId", 148047808219672941L);
        setField(term56179, term56179.getClass(), "taskName", "goAoCMhKBu");
        setFloatField(term56179, term56179.getClass(), "trackUnitHours", 0.94859296F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term56179, args);
    }

};


