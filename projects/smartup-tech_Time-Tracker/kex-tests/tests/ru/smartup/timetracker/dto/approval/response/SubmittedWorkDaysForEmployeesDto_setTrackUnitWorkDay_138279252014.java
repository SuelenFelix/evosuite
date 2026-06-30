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

public class SubmittedWorkDaysForEmployeesDto_setTrackUnitWorkDay_138279252014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15894;
     Object term15950;

    public SubmittedWorkDaysForEmployeesDto_setTrackUnitWorkDay_138279252014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15894 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15920 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15894, term15894.getClass(), "employeeId", 962840079);
        setField(term15894, term15894.getClass(), "firstName", "XJJNClzHRf");
        setField(term15894, term15894.getClass(), "lastName", "HDaezxQfQR");
        setLongField(term15920, term15920.getClass(), "fastTime", 1713891155263L);
        setField(term15920, term15920.getClass(), "cdate", null);
        setField(term15894, term15894.getClass(), "trackUnitWorkDay", term15920);
        setIntField(term15894, term15894.getClass(), "projectId", 1540719661);
        setField(term15894, term15894.getClass(), "projectName", "iikZEapDlu");
        setLongField(term15894, term15894.getClass(), "trackUnitId", 8166095254618543564L);
        setLongField(term15894, term15894.getClass(), "taskId", -4598158870068953328L);
        setField(term15894, term15894.getClass(), "taskName", "nhoHrZfnIN");
        setFloatField(term15894, term15894.getClass(), "trackUnitHours", 0.791695F);
        term15950 = newInstance(Class.forName("java.util.Date"));
        setLongField(term15950, term15950.getClass(), "fastTime", 1663413767651L);
        setField(term15950, term15950.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term15950;
        callMethod(klass, "setTrackUnitWorkDay", argTypes, term15894, args);
    }

};


