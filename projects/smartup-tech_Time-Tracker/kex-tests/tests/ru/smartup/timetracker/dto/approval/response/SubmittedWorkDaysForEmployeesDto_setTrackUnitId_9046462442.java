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

public class SubmittedWorkDaysForEmployeesDto_setTrackUnitId_9046462442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17106;
     Object term17112;

    public SubmittedWorkDaysForEmployeesDto_setTrackUnitId_9046462442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17106 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        setIntField(term17106, term17106.getClass(), "employeeId", 0);
        setField(term17106, term17106.getClass(), "firstName", null);
        setField(term17106, term17106.getClass(), "lastName", null);
        setField(term17106, term17106.getClass(), "trackUnitWorkDay", null);
        setIntField(term17106, term17106.getClass(), "projectId", 0);
        setField(term17106, term17106.getClass(), "projectName", null);
        setLongField(term17106, term17106.getClass(), "trackUnitId", 0L);
        setLongField(term17106, term17106.getClass(), "taskId", 0L);
        setField(term17106, term17106.getClass(), "taskName", null);
        setFloatField(term17106, term17106.getClass(), "trackUnitHours", 0.0F);
        term17112 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term17112;
        callMethod(klass, "setTrackUnitId", argTypes, term17106, args);
    }

};


