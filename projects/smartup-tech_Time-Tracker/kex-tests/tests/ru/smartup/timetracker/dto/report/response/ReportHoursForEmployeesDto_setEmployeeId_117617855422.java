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
import java.lang.Integer;

public class ReportHoursForEmployeesDto_setEmployeeId_117617855422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3609;
     Object term3681;

    public ReportHoursForEmployeesDto_setEmployeeId_117617855422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3670 = new HashMap();
        term3609 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3609, term3609.getClass(), "projectId", 287287233);
        setField(term3609, term3609.getClass(), "projectName", "gCWtLVKVVe");
        setLongField(term3609, term3609.getClass(), "taskId", 8059786003080744426L);
        setField(term3609, term3609.getClass(), "taskName", "fWKJoSoCwE");
        setIntField(term3609, term3609.getClass(), "employeeId", 962840079);
        setField(term3609, term3609.getClass(), "employeeFirstName", "wfaXBpWAUH");
        setField(term3609, term3609.getClass(), "employeeLastName", "VMeAzAHwZj");
        setFloatField(term3609, term3609.getClass(), "billableHours", 0.17512423F);
        setFloatField(term3609, term3609.getClass(), "billableHoursFrozen", 0.6328098F);
        setFloatField(term3609, term3609.getClass(), "billableHoursNotFrozen", 0.93792146F);
        setFloatField(term3609, term3609.getClass(), "unbillableHours", 0.11390102F);
        setFloatField(term3609, term3609.getClass(), "unbillableHoursFrozen", 0.10807574F);
        setFloatField(term3609, term3609.getClass(), "unbillableHoursNotFrozen", 0.6611088F);
        setFloatField(term3609, term3609.getClass(), "totalHours", 0.7808234F);
        setFloatField(term3609, term3609.getClass(), "totalHoursFrozen", 0.95308053F);
        setFloatField(term3609, term3609.getClass(), "totalHoursNotFrozen", 0.9772425F);
        setField(term3609, term3609.getClass(), "workHoursMap", term3670);
        term3681 = new Integer(1540719661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3681;
        callMethod(klass, "setEmployeeId", argTypes, term3609, args);
    }

};


