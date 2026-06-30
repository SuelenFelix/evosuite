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
import java.lang.Integer;

public class SubmittedWorkDaysForEmployeesDto_setProjectId_181089309415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15992;
     Object term16048;

    public SubmittedWorkDaysForEmployeesDto_setProjectId_181089309415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15992 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16018 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15992, term15992.getClass(), "employeeId", 1265463001);
        setField(term15992, term15992.getClass(), "firstName", "ZkMALXpEAZ");
        setField(term15992, term15992.getClass(), "lastName", "tXfQjSqDzN");
        setLongField(term16018, term16018.getClass(), "fastTime", 1263744156294L);
        setField(term16018, term16018.getClass(), "cdate", null);
        setField(term15992, term15992.getClass(), "trackUnitWorkDay", term16018);
        setIntField(term15992, term15992.getClass(), "projectId", 335112684);
        setField(term15992, term15992.getClass(), "projectName", "BjugTaMcxJ");
        setLongField(term15992, term15992.getClass(), "trackUnitId", 138235087558060686L);
        setLongField(term15992, term15992.getClass(), "taskId", 5381386339318883012L);
        setField(term15992, term15992.getClass(), "taskName", "vGiuZVPJNH");
        setFloatField(term15992, term15992.getClass(), "trackUnitHours", 0.07096106F);
        term16048 = new Integer(1551099402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16048;
        callMethod(klass, "setProjectId", argTypes, term15992, args);
    }

};


