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

public class ReportHours_getTotalHours_128534743949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21853;

    public ReportHours_getTotalHours_128534743949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21853 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21853, term21853.getClass(), "projectId", 0);
        setField(term21853, term21853.getClass(), "projectName", null);
        setLongField(term21853, term21853.getClass(), "taskId", 0L);
        setField(term21853, term21853.getClass(), "taskName", null);
        setIntField(term21853, term21853.getClass(), "employeeId", 0);
        setField(term21853, term21853.getClass(), "employeeFirstName", null);
        setField(term21853, term21853.getClass(), "employeeLastName", null);
        setFloatField(term21853, term21853.getClass(), "billableHours", 0.0F);
        setFloatField(term21853, term21853.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21853, term21853.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21853, term21853.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21853, term21853.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21853, term21853.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21853, term21853.getClass(), "totalHours", 0.0F);
        setFloatField(term21853, term21853.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21853, term21853.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21853, term21853.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHours", argTypes, term21853, args);
    }

};


