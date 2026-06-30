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

public class ReportHoursForEmployeesDto_getProjectName_159401722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;

    public ReportHoursForEmployeesDto_getProjectName_159401722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1382 = new HashMap();
        term1321 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1321, term1321.getClass(), "projectId", -244121226);
        setField(term1321, term1321.getClass(), "projectName", "AijpHYOFuy");
        setLongField(term1321, term1321.getClass(), "taskId", 6375119433582206027L);
        setField(term1321, term1321.getClass(), "taskName", "SbAoxhfrkn");
        setIntField(term1321, term1321.getClass(), "employeeId", -203030934);
        setField(term1321, term1321.getClass(), "employeeFirstName", "kuTXqwMtDB");
        setField(term1321, term1321.getClass(), "employeeLastName", "Ghbwtircqb");
        setFloatField(term1321, term1321.getClass(), "billableHours", 0.450692F);
        setFloatField(term1321, term1321.getClass(), "billableHoursFrozen", 0.35089302F);
        setFloatField(term1321, term1321.getClass(), "billableHoursNotFrozen", 0.9341364F);
        setFloatField(term1321, term1321.getClass(), "unbillableHours", 0.7244789F);
        setFloatField(term1321, term1321.getClass(), "unbillableHoursFrozen", 0.9022041F);
        setFloatField(term1321, term1321.getClass(), "unbillableHoursNotFrozen", 0.06234348F);
        setFloatField(term1321, term1321.getClass(), "totalHours", 0.6512871F);
        setFloatField(term1321, term1321.getClass(), "totalHoursFrozen", 0.011630058F);
        setFloatField(term1321, term1321.getClass(), "totalHoursNotFrozen", 0.87770385F);
        setField(term1321, term1321.getClass(), "workHoursMap", term1382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term1321, args);
    }

};


