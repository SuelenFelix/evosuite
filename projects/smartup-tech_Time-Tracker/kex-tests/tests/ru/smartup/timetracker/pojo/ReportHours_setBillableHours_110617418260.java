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
import java.lang.Float;

public class ReportHours_setBillableHours_110617418260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22002;
     Object term22015;

    public ReportHours_setBillableHours_110617418260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22002 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term22002, term22002.getClass(), "projectId", 0);
        setField(term22002, term22002.getClass(), "projectName", null);
        setLongField(term22002, term22002.getClass(), "taskId", 0L);
        setField(term22002, term22002.getClass(), "taskName", null);
        setIntField(term22002, term22002.getClass(), "employeeId", 0);
        setField(term22002, term22002.getClass(), "employeeFirstName", null);
        setField(term22002, term22002.getClass(), "employeeLastName", null);
        setFloatField(term22002, term22002.getClass(), "billableHours", 0.0F);
        setFloatField(term22002, term22002.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term22002, term22002.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term22002, term22002.getClass(), "unbillableHours", 0.0F);
        setFloatField(term22002, term22002.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term22002, term22002.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term22002, term22002.getClass(), "totalHours", 0.0F);
        setFloatField(term22002, term22002.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term22002, term22002.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term22002, term22002.getClass(), "workHoursMap", null);
        term22015 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term22015;
        callMethod(klass, "setBillableHours", argTypes, term22002, args);
    }

};


