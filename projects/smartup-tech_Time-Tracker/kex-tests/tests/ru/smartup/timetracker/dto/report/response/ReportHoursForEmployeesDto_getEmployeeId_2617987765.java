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

public class ReportHoursForEmployeesDto_getEmployeeId_2617987765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1657;

    public ReportHoursForEmployeesDto_getEmployeeId_2617987765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1718 = new HashMap();
        term1657 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1657, term1657.getClass(), "projectId", -1087774327);
        setField(term1657, term1657.getClass(), "projectName", "LvtrsXUliU");
        setLongField(term1657, term1657.getClass(), "taskId", 5270370404989704783L);
        setField(term1657, term1657.getClass(), "taskName", "xLbjWUgOIL");
        setIntField(term1657, term1657.getClass(), "employeeId", -1530420153);
        setField(term1657, term1657.getClass(), "employeeFirstName", "jDtqGUpnZN");
        setField(term1657, term1657.getClass(), "employeeLastName", "nGKItKLYNC");
        setFloatField(term1657, term1657.getClass(), "billableHours", 0.110482514F);
        setFloatField(term1657, term1657.getClass(), "billableHoursFrozen", 0.61427236F);
        setFloatField(term1657, term1657.getClass(), "billableHoursNotFrozen", 0.94188213F);
        setFloatField(term1657, term1657.getClass(), "unbillableHours", 0.43556267F);
        setFloatField(term1657, term1657.getClass(), "unbillableHoursFrozen", 0.8789557F);
        setFloatField(term1657, term1657.getClass(), "unbillableHoursNotFrozen", 0.8414608F);
        setFloatField(term1657, term1657.getClass(), "totalHours", 0.78664905F);
        setFloatField(term1657, term1657.getClass(), "totalHoursFrozen", 0.78593165F);
        setFloatField(term1657, term1657.getClass(), "totalHoursNotFrozen", 0.98989093F);
        setField(term1657, term1657.getClass(), "workHoursMap", term1718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term1657, args);
    }

};


