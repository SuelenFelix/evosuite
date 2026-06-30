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
import java.lang.Object;

public class SubmittedWorkDaysForEmployeesDto_getEmployeeId_14355167211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14600;

    public SubmittedWorkDaysForEmployeesDto_getEmployeeId_14355167211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14600 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term14626 = newInstance(Class.forName("java.util.Date"));
        setIntField(term14600, term14600.getClass(), "employeeId", 1876565163);
        setField(term14600, term14600.getClass(), "firstName", "GgZWSjxjyE");
        setField(term14600, term14600.getClass(), "lastName", "EeBVbzjcCI");
        setLongField(term14626, term14626.getClass(), "fastTime", 1393200035243L);
        setField(term14626, term14626.getClass(), "cdate", null);
        setField(term14600, term14600.getClass(), "trackUnitWorkDay", term14626);
        setIntField(term14600, term14600.getClass(), "projectId", -817164822);
        setField(term14600, term14600.getClass(), "projectName", "UfQtPRyWRC");
        setLongField(term14600, term14600.getClass(), "trackUnitId", 5671808784468963649L);
        setLongField(term14600, term14600.getClass(), "taskId", 2297097306706899827L);
        setField(term14600, term14600.getClass(), "taskName", "FPvxVzzSvD");
        setFloatField(term14600, term14600.getClass(), "trackUnitHours", 0.25392914F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term14600, args);
    }

};


