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
import java.lang.Long;

public class SubmittedWorkDaysForEmployeesDto_setTaskId_117481794243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17114;
     Object term17120;

    public SubmittedWorkDaysForEmployeesDto_setTaskId_117481794243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17114 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17114, term17114.getClass(), "employeeId", 0);
        setField(term17114, term17114.getClass(), "firstName", null);
        setField(term17114, term17114.getClass(), "lastName", null);
        setField(term17114, term17114.getClass(), "trackUnitWorkDay", null);
        setIntField(term17114, term17114.getClass(), "projectId", 0);
        setField(term17114, term17114.getClass(), "projectName", null);
        setLongField(term17114, term17114.getClass(), "trackUnitId", 0L);
        setLongField(term17114, term17114.getClass(), "taskId", 0L);
        setField(term17114, term17114.getClass(), "taskName", null);
        setFloatField(term17114, term17114.getClass(), "trackUnitHours", 0.0F);
        term17120 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17120;
        callMethod(klass, "setTaskId", argTypes, term17114, args);
    }

};


