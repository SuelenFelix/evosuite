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
import java.lang.Float;

public class ReportHours_setUnbillableHoursFrozen_115046409729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20917;
     Object term20989;

    public ReportHours_setUnbillableHoursFrozen_115046409729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20978 = new HashMap();
        term20917 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20917, term20917.getClass(), "projectId", 493620644);
        setField(term20917, term20917.getClass(), "projectName", "JppkknKVOw");
        setLongField(term20917, term20917.getClass(), "taskId", 2120084523938730454L);
        setField(term20917, term20917.getClass(), "taskName", "iljANwuEjk");
        setIntField(term20917, term20917.getClass(), "employeeId", 1328271830);
        setField(term20917, term20917.getClass(), "employeeFirstName", "kNqaJKIATy");
        setField(term20917, term20917.getClass(), "employeeLastName", "vKQukfbJUd");
        setFloatField(term20917, term20917.getClass(), "billableHours", 0.011630058F);
        setFloatField(term20917, term20917.getClass(), "billableHoursFrozen", 0.87770385F);
        setFloatField(term20917, term20917.getClass(), "billableHoursNotFrozen", 0.034274876F);
        setFloatField(term20917, term20917.getClass(), "unbillableHours", 0.008025646F);
        setFloatField(term20917, term20917.getClass(), "unbillableHoursFrozen", 0.47933108F);
        setFloatField(term20917, term20917.getClass(), "unbillableHoursNotFrozen", 0.40598297F);
        setFloatField(term20917, term20917.getClass(), "totalHours", 0.7799478F);
        setFloatField(term20917, term20917.getClass(), "totalHoursFrozen", 0.37100673F);
        setFloatField(term20917, term20917.getClass(), "totalHoursNotFrozen", 0.119950235F);
        setField(term20917, term20917.getClass(), "workHoursMap", term20978);
        term20989 = new Float(0.78186196F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term20989;
        callMethod(klass, "setUnbillableHoursFrozen", argTypes, term20917, args);
    }

};


