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

public class SubmittedWorkDaysForEmployees_getTaskName_26231737120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57005;

    public SubmittedWorkDaysForEmployees_getTaskName_26231737120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57005 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        setIntField(term57005, term57005.getClass(), "employeeId", 0);
        setField(term57005, term57005.getClass(), "firstName", null);
        setField(term57005, term57005.getClass(), "lastName", null);
        setField(term57005, term57005.getClass(), "trackUnitWorkDay", null);
        setIntField(term57005, term57005.getClass(), "projectId", 0);
        setField(term57005, term57005.getClass(), "projectName", null);
        setLongField(term57005, term57005.getClass(), "trackUnitId", 0L);
        setLongField(term57005, term57005.getClass(), "taskId", 0L);
        setField(term57005, term57005.getClass(), "taskName", null);
        setFloatField(term57005, term57005.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term57005, args);
    }

};


