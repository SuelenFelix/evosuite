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

public class ReportHours_getBillableHoursFrozen_892350489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18575;

    public ReportHours_getBillableHoursFrozen_892350489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18636 = new HashMap();
        term18575 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18575, term18575.getClass(), "projectId", -1685132342);
        setField(term18575, term18575.getClass(), "projectName", "jUbSRrkrYZ");
        setLongField(term18575, term18575.getClass(), "taskId", -7237588299778557629L);
        setField(term18575, term18575.getClass(), "taskName", "bWWfajKbEX");
        setIntField(term18575, term18575.getClass(), "employeeId", -1456670397);
        setField(term18575, term18575.getClass(), "employeeFirstName", "cAPeiZHKGJ");
        setField(term18575, term18575.getClass(), "employeeLastName", "LvJFtLBaxj");
        setFloatField(term18575, term18575.getClass(), "billableHours", 0.36114347F);
        setFloatField(term18575, term18575.getClass(), "billableHoursFrozen", 0.52792794F);
        setFloatField(term18575, term18575.getClass(), "billableHoursNotFrozen", 0.24759698F);
        setFloatField(term18575, term18575.getClass(), "unbillableHours", 0.32021916F);
        setFloatField(term18575, term18575.getClass(), "unbillableHoursFrozen", 0.8886614F);
        setFloatField(term18575, term18575.getClass(), "unbillableHoursNotFrozen", 0.22651339F);
        setFloatField(term18575, term18575.getClass(), "totalHours", 0.38555247F);
        setFloatField(term18575, term18575.getClass(), "totalHoursFrozen", 0.8878841F);
        setFloatField(term18575, term18575.getClass(), "totalHoursNotFrozen", 0.2889229F);
        setField(term18575, term18575.getClass(), "workHoursMap", term18636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursFrozen", argTypes, term18575, args);
    }

};


