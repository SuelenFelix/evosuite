package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ReportHours_getTaskId_12974639463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17903;

    public ReportHours_getTaskId_12974639463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17964 = new HashMap();
        term17903 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term17903, term17903.getClass(), "projectId", -1922583790);
        setField(term17903, term17903.getClass(), "projectName", "UoYtihxVaS");
        setLongField(term17903, term17903.getClass(), "taskId", -8257434502486459194L);
        setField(term17903, term17903.getClass(), "taskName", "JDswTTCZHV");
        setIntField(term17903, term17903.getClass(), "employeeId", -616727354);
        setField(term17903, term17903.getClass(), "employeeFirstName", "onpbIeEKoi");
        setField(term17903, term17903.getClass(), "employeeLastName", "YRHGsAkhxb");
        setFloatField(term17903, term17903.getClass(), "billableHours", 0.9985961F);
        setFloatField(term17903, term17903.getClass(), "billableHoursFrozen", 0.51832694F);
        setFloatField(term17903, term17903.getClass(), "billableHoursNotFrozen", 0.97262454F);
        setFloatField(term17903, term17903.getClass(), "unbillableHours", 0.76550204F);
        setFloatField(term17903, term17903.getClass(), "unbillableHoursFrozen", 0.26441735F);
        setFloatField(term17903, term17903.getClass(), "unbillableHoursNotFrozen", 0.13745493F);
        setFloatField(term17903, term17903.getClass(), "totalHours", 0.20144695F);
        setFloatField(term17903, term17903.getClass(), "totalHoursFrozen", 0.7031006F);
        setFloatField(term17903, term17903.getClass(), "totalHoursNotFrozen", 0.9431611F);
        setField(term17903, term17903.getClass(), "workHoursMap", term17964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term17903, args);
    }

};


