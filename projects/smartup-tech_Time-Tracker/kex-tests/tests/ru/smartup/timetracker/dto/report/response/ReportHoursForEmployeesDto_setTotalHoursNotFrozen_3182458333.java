package ru.smartup.timetracker.dto.report.response;

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
import static ru.smartup.timetracker.dto.report.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Float;

public class ReportHoursForEmployeesDto_setTotalHoursNotFrozen_3182458333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4903;
     Object term4975;

    public ReportHoursForEmployeesDto_setTotalHoursNotFrozen_3182458333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4964 = new HashMap();
        term4903 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4903, term4903.getClass(), "projectId", -344842608);
        setField(term4903, term4903.getClass(), "projectName", "sZdUNdggUW");
        setLongField(term4903, term4903.getClass(), "taskId", -6823727938421990489L);
        setField(term4903, term4903.getClass(), "taskName", "OqbwYQfvAe");
        setIntField(term4903, term4903.getClass(), "employeeId", 941650513);
        setField(term4903, term4903.getClass(), "employeeFirstName", "tRxZafjqIx");
        setField(term4903, term4903.getClass(), "employeeLastName", "DhjNLmRMCu");
        setFloatField(term4903, term4903.getClass(), "billableHours", 0.54699636F);
        setFloatField(term4903, term4903.getClass(), "billableHoursFrozen", 0.6221715F);
        setFloatField(term4903, term4903.getClass(), "billableHoursNotFrozen", 0.4815951F);
        setFloatField(term4903, term4903.getClass(), "unbillableHours", 0.6375926F);
        setFloatField(term4903, term4903.getClass(), "unbillableHoursFrozen", 0.20844287F);
        setFloatField(term4903, term4903.getClass(), "unbillableHoursNotFrozen", 0.69335157F);
        setFloatField(term4903, term4903.getClass(), "totalHours", 0.66750294F);
        setFloatField(term4903, term4903.getClass(), "totalHoursFrozen", 0.70398474F);
        setFloatField(term4903, term4903.getClass(), "totalHoursNotFrozen", 0.26454407F);
        setField(term4903, term4903.getClass(), "workHoursMap", term4964);
        term4975 = new Float(0.7157998F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4975;
        callMethod(klass, "setTotalHoursNotFrozen", argTypes, term4903, args);
    }

};


