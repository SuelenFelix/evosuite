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

public class ReportHours_setBillableHoursNotFrozen_90316293327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20689;
     Object term20761;

    public ReportHours_setBillableHoursNotFrozen_90316293327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20750 = new HashMap();
        term20689 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20689, term20689.getClass(), "projectId", -1048298087);
        setField(term20689, term20689.getClass(), "projectName", "lihXWlGDxk");
        setLongField(term20689, term20689.getClass(), "taskId", -4502405999831680926L);
        setField(term20689, term20689.getClass(), "taskName", "JmcmxoGhIK");
        setIntField(term20689, term20689.getClass(), "employeeId", 292681826);
        setField(term20689, term20689.getClass(), "employeeFirstName", "jXzmYyrnnT");
        setField(term20689, term20689.getClass(), "employeeLastName", "igCAtimmYB");
        setFloatField(term20689, term20689.getClass(), "billableHours", 0.11164951F);
        setFloatField(term20689, term20689.getClass(), "billableHoursFrozen", 0.30746937F);
        setFloatField(term20689, term20689.getClass(), "billableHoursNotFrozen", 0.9695807F);
        setFloatField(term20689, term20689.getClass(), "unbillableHours", 0.124525845F);
        setFloatField(term20689, term20689.getClass(), "unbillableHoursFrozen", 0.45613784F);
        setFloatField(term20689, term20689.getClass(), "unbillableHoursNotFrozen", 0.95118606F);
        setFloatField(term20689, term20689.getClass(), "totalHours", 0.111205876F);
        setFloatField(term20689, term20689.getClass(), "totalHoursFrozen", 0.058807194F);
        setFloatField(term20689, term20689.getClass(), "totalHoursNotFrozen", 0.013315558F);
        setField(term20689, term20689.getClass(), "workHoursMap", term20750);
        term20761 = new Float(0.34010088F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term20761;
        callMethod(klass, "setBillableHoursNotFrozen", argTypes, term20689, args);
    }

};


