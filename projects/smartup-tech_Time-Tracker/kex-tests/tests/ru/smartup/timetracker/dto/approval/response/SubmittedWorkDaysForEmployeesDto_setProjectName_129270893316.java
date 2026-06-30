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

public class SubmittedWorkDaysForEmployeesDto_setProjectName_129270893316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16090;

    public SubmittedWorkDaysForEmployeesDto_setProjectName_129270893316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16090 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16116 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16090, term16090.getClass(), "employeeId", -2027534003);
        setField(term16090, term16090.getClass(), "firstName", "tlzpzIjMib");
        setField(term16090, term16090.getClass(), "lastName", "AZdLeSugwv");
        setLongField(term16116, term16116.getClass(), "fastTime", 1490956290070L);
        setField(term16116, term16116.getClass(), "cdate", null);
        setField(term16090, term16090.getClass(), "trackUnitWorkDay", term16116);
        setIntField(term16090, term16090.getClass(), "projectId", 1063420942);
        setField(term16090, term16090.getClass(), "projectName", "RMsXuyzKJV");
        setLongField(term16090, term16090.getClass(), "trackUnitId", -1333707622307134180L);
        setLongField(term16090, term16090.getClass(), "taskId", -4360569253593381888L);
        setField(term16090, term16090.getClass(), "taskName", "FwPbDZcHmB");
        setFloatField(term16090, term16090.getClass(), "trackUnitHours", 0.6862221F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hOncybyCAH";
        callMethod(klass, "setProjectName", argTypes, term16090, args);
    }

};


