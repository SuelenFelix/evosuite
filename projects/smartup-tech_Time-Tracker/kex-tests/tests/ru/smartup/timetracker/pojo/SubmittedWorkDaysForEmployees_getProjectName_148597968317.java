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

public class SubmittedWorkDaysForEmployees_getProjectName_148597968317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56987;

    public SubmittedWorkDaysForEmployees_getProjectName_148597968317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56987 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        setIntField(term56987, term56987.getClass(), "employeeId", 0);
        setField(term56987, term56987.getClass(), "firstName", null);
        setField(term56987, term56987.getClass(), "lastName", null);
        setField(term56987, term56987.getClass(), "trackUnitWorkDay", null);
        setIntField(term56987, term56987.getClass(), "projectId", 0);
        setField(term56987, term56987.getClass(), "projectName", null);
        setLongField(term56987, term56987.getClass(), "trackUnitId", 0L);
        setLongField(term56987, term56987.getClass(), "taskId", 0L);
        setField(term56987, term56987.getClass(), "taskName", null);
        setFloatField(term56987, term56987.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term56987, args);
    }

};


