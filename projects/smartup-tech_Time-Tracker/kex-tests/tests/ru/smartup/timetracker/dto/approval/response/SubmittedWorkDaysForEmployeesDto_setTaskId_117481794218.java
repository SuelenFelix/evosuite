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
import java.lang.Long;

public class SubmittedWorkDaysForEmployeesDto_setTaskId_117481794218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16306;
     Object term16362;

    public SubmittedWorkDaysForEmployeesDto_setTaskId_117481794218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16306 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16332 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16306, term16306.getClass(), "employeeId", 972867650);
        setField(term16306, term16306.getClass(), "firstName", "PCipZnmBOF");
        setField(term16306, term16306.getClass(), "lastName", "zcorEihhLK");
        setLongField(term16332, term16332.getClass(), "fastTime", 1643981113575L);
        setField(term16332, term16332.getClass(), "cdate", null);
        setField(term16306, term16306.getClass(), "trackUnitWorkDay", term16332);
        setIntField(term16306, term16306.getClass(), "projectId", 1655935355);
        setField(term16306, term16306.getClass(), "projectName", "GrqozDKFOk");
        setLongField(term16306, term16306.getClass(), "trackUnitId", -7884871963229073324L);
        setLongField(term16306, term16306.getClass(), "taskId", -8649738738252714180L);
        setField(term16306, term16306.getClass(), "taskName", "CFyoseFGLF");
        setFloatField(term16306, term16306.getClass(), "trackUnitHours", 0.15917838F);
        term16362 = new Long(-7278883608542636188L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16362;
        callMethod(klass, "setTaskId", argTypes, term16306, args);
    }

};


