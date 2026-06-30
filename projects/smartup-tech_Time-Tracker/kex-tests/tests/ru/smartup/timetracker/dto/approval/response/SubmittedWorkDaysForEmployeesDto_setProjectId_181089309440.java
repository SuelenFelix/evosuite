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
import java.lang.Integer;

public class SubmittedWorkDaysForEmployeesDto_setProjectId_181089309440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17092;
     Object term17098;

    public SubmittedWorkDaysForEmployeesDto_setProjectId_181089309440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17092 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17092, term17092.getClass(), "employeeId", 0);
        setField(term17092, term17092.getClass(), "firstName", null);
        setField(term17092, term17092.getClass(), "lastName", null);
        setField(term17092, term17092.getClass(), "trackUnitWorkDay", null);
        setIntField(term17092, term17092.getClass(), "projectId", 0);
        setField(term17092, term17092.getClass(), "projectName", null);
        setLongField(term17092, term17092.getClass(), "trackUnitId", 0L);
        setLongField(term17092, term17092.getClass(), "taskId", 0L);
        setField(term17092, term17092.getClass(), "taskName", null);
        setFloatField(term17092, term17092.getClass(), "trackUnitHours", 0.0F);
        term17098 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17098;
        callMethod(klass, "setProjectId", argTypes, term17092, args);
    }

};


