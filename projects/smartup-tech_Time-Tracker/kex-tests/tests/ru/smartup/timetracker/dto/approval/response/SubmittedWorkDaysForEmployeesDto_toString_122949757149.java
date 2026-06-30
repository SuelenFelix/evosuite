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

public class SubmittedWorkDaysForEmployeesDto_toString_122949757149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17154;

    public SubmittedWorkDaysForEmployeesDto_toString_122949757149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17154 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17154, term17154.getClass(), "employeeId", 0);
        setField(term17154, term17154.getClass(), "firstName", null);
        setField(term17154, term17154.getClass(), "lastName", null);
        setField(term17154, term17154.getClass(), "trackUnitWorkDay", null);
        setIntField(term17154, term17154.getClass(), "projectId", 0);
        setField(term17154, term17154.getClass(), "projectName", null);
        setLongField(term17154, term17154.getClass(), "trackUnitId", 0L);
        setLongField(term17154, term17154.getClass(), "taskId", 0L);
        setField(term17154, term17154.getClass(), "taskName", null);
        setFloatField(term17154, term17154.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17154, args);
    }

};


