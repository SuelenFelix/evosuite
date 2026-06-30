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

public class ReportHoursForEmployeesDto_getEmployeeLastName_212091469146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;

    public ReportHoursForEmployeesDto_getEmployeeLastName_212091469146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5721 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5721, term5721.getClass(), "projectId", 0);
        setField(term5721, term5721.getClass(), "projectName", null);
        setLongField(term5721, term5721.getClass(), "taskId", 0L);
        setField(term5721, term5721.getClass(), "taskName", null);
        setIntField(term5721, term5721.getClass(), "employeeId", 0);
        setField(term5721, term5721.getClass(), "employeeFirstName", null);
        setField(term5721, term5721.getClass(), "employeeLastName", null);
        setFloatField(term5721, term5721.getClass(), "billableHours", 0.0F);
        setFloatField(term5721, term5721.getClass(), "billableHoursFrozen", 0.0F);
        setFloatField(term5721, term5721.getClass(), "billableHoursNotFrozen", 0.0F);
        setFloatField(term5721, term5721.getClass(), "unbillableHours", 0.0F);
        setFloatField(term5721, term5721.getClass(), "unbillableHoursFrozen", 0.0F);
        setFloatField(term5721, term5721.getClass(), "unbillableHoursNotFrozen", 0.0F);
        setFloatField(term5721, term5721.getClass(), "totalHours", 0.0F);
        setFloatField(term5721, term5721.getClass(), "totalHoursFrozen", 0.0F);
        setFloatField(term5721, term5721.getClass(), "totalHoursNotFrozen", 0.0F);
        setField(term5721, term5721.getClass(), "workHoursMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeLastName", argTypes, term5721, args);
    }

};


