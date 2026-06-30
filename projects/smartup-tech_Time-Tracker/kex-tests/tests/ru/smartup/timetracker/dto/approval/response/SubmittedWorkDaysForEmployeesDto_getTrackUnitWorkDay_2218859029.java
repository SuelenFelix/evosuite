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

public class SubmittedWorkDaysForEmployeesDto_getTrackUnitWorkDay_2218859029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17024;

    public SubmittedWorkDaysForEmployeesDto_getTrackUnitWorkDay_2218859029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17024 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17024, term17024.getClass(), "employeeId", 0);
        setField(term17024, term17024.getClass(), "firstName", null);
        setField(term17024, term17024.getClass(), "lastName", null);
        setField(term17024, term17024.getClass(), "trackUnitWorkDay", null);
        setIntField(term17024, term17024.getClass(), "projectId", 0);
        setField(term17024, term17024.getClass(), "projectName", null);
        setLongField(term17024, term17024.getClass(), "trackUnitId", 0L);
        setLongField(term17024, term17024.getClass(), "taskId", 0L);
        setField(term17024, term17024.getClass(), "taskName", null);
        setFloatField(term17024, term17024.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitWorkDay", argTypes, term17024, args);
    }

};


