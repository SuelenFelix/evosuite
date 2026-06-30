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

public class ReportHoursForEmployeesDto_getEmployeeFirstName_85399899745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5708;

    public ReportHoursForEmployeesDto_getEmployeeFirstName_85399899745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5708 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5708, term5708.getClass(), "projectId", 0);
        setField(term5708, term5708.getClass(), "projectName", null);
        setLongField(term5708, term5708.getClass(), "taskId", 0L);
        setField(term5708, term5708.getClass(), "taskName", null);
        setIntField(term5708, term5708.getClass(), "employeeId", 0);
        setField(term5708, term5708.getClass(), "employeeFirstName", null);
        setField(term5708, term5708.getClass(), "employeeLastName", null);
        setFloatField(term5708, term5708.getClass(), "billableHours", 0.0F);
        setFloatField(term5708, term5708.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5708, term5708.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5708, term5708.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5708, term5708.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5708, term5708.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5708, term5708.getClass(), "totalHours", 0.0F);
        setFloatField(term5708, term5708.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5708, term5708.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5708, term5708.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeFirstName", argTypes, term5708, args);
    }

};


