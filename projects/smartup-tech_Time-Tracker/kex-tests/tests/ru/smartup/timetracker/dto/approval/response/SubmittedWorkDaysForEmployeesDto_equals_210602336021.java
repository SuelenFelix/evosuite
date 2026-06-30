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

public class SubmittedWorkDaysForEmployeesDto_equals_210602336021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16620;
     Object term16676;

    public SubmittedWorkDaysForEmployeesDto_equals_210602336021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16620 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16646 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16620, term16620.getClass(), "employeeId", -1547384488);
        setField(term16620, term16620.getClass(), "firstName", "gUvcueTURF");
        setField(term16620, term16620.getClass(), "lastName", "EwQBhZjCIT");
        setLongField(term16646, term16646.getClass(), "fastTime", 1531331402053L);
        setField(term16646, term16646.getClass(), "cdate", null);
        setField(term16620, term16620.getClass(), "trackUnitWorkDay", term16646);
        setIntField(term16620, term16620.getClass(), "projectId", 1442160736);
        setField(term16620, term16620.getClass(), "projectName", "aSkmSwTnEw");
        setLongField(term16620, term16620.getClass(), "trackUnitId", 4266570509071948633L);
        setLongField(term16620, term16620.getClass(), "taskId", -7291742736502427077L);
        setField(term16620, term16620.getClass(), "taskName", "xvkbvaEGYd");
        setFloatField(term16620, term16620.getClass(), "trackUnitHours", 0.8454723F);
        term16676 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16676;
        callMethod(klass, "equals", argTypes, term16620, args);
    }

};


