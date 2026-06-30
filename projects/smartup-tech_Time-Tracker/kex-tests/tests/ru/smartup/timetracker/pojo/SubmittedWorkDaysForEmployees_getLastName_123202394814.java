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

public class SubmittedWorkDaysForEmployees_getLastName_123202394814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56969;

    public SubmittedWorkDaysForEmployees_getLastName_123202394814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56969 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        setIntField(term56969, term56969.getClass(), "employeeId", 0);
        setField(term56969, term56969.getClass(), "firstName", null);
        setField(term56969, term56969.getClass(), "lastName", null);
        setField(term56969, term56969.getClass(), "trackUnitWorkDay", null);
        setIntField(term56969, term56969.getClass(), "projectId", 0);
        setField(term56969, term56969.getClass(), "projectName", null);
        setLongField(term56969, term56969.getClass(), "trackUnitId", 0L);
        setLongField(term56969, term56969.getClass(), "taskId", 0L);
        setField(term56969, term56969.getClass(), "taskName", null);
        setFloatField(term56969, term56969.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term56969, args);
    }

};


