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

public class SubmittedWorkDaysForEmployeesDto_setLastName_65064005838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17080;

    public SubmittedWorkDaysForEmployeesDto_setLastName_65064005838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17080 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17080, term17080.getClass(), "employeeId", 0);
        setField(term17080, term17080.getClass(), "firstName", null);
        setField(term17080, term17080.getClass(), "lastName", null);
        setField(term17080, term17080.getClass(), "trackUnitWorkDay", null);
        setIntField(term17080, term17080.getClass(), "projectId", 0);
        setField(term17080, term17080.getClass(), "projectName", null);
        setLongField(term17080, term17080.getClass(), "trackUnitId", 0L);
        setLongField(term17080, term17080.getClass(), "taskId", 0L);
        setField(term17080, term17080.getClass(), "taskName", null);
        setFloatField(term17080, term17080.getClass(), "trackUnitHours", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term17080, args);
    }

};


