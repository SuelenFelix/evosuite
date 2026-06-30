package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubmittedWorkDaysForEmployeesDto_getTaskName_3400419534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17054;

    public SubmittedWorkDaysForEmployeesDto_getTaskName_3400419534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17054 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17054, term17054.getClass(), "employeeId", 0);
        setField(term17054, term17054.getClass(), "firstName", null);
        setField(term17054, term17054.getClass(), "lastName", null);
        setField(term17054, term17054.getClass(), "trackUnitWorkDay", null);
        setIntField(term17054, term17054.getClass(), "projectId", 0);
        setField(term17054, term17054.getClass(), "projectName", null);
        setLongField(term17054, term17054.getClass(), "trackUnitId", 0L);
        setLongField(term17054, term17054.getClass(), "taskId", 0L);
        setField(term17054, term17054.getClass(), "taskName", null);
        setFloatField(term17054, term17054.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term17054, args);
    }

};


