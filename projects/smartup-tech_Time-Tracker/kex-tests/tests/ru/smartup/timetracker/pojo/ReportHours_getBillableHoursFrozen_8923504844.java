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

public class ReportHours_getBillableHoursFrozen_8923504844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21788;

    public ReportHours_getBillableHoursFrozen_8923504844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21788 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21788, term21788.getClass(), "projectId", 0);
        setField(term21788, term21788.getClass(), "projectName", null);
        setLongField(term21788, term21788.getClass(), "taskId", 0L);
        setField(term21788, term21788.getClass(), "taskName", null);
        setIntField(term21788, term21788.getClass(), "employeeId", 0);
        setField(term21788, term21788.getClass(), "employeeFirstName", null);
        setField(term21788, term21788.getClass(), "employeeLastName", null);
        setFloatField(term21788, term21788.getClass(), "billableHours", 0.0F);
        setFloatField(term21788, term21788.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term21788, term21788.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term21788, term21788.getClass(), "unbillableHours", 0.0F);
        setFloatField(term21788, term21788.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term21788, term21788.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term21788, term21788.getClass(), "totalHours", 0.0F);
        setFloatField(term21788, term21788.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term21788, term21788.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term21788, term21788.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursFrozen", argTypes, term21788, args);
    }

};


