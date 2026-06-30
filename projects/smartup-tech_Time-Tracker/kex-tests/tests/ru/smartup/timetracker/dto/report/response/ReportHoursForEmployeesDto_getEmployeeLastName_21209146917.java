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

public class ReportHoursForEmployeesDto_getEmployeeLastName_21209146917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881;

    public ReportHoursForEmployeesDto_getEmployeeLastName_21209146917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1942 = new HashMap();
        term1881 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1881, term1881.getClass(), "projectId", 679763016);
        setField(term1881, term1881.getClass(), "projectName", "MLqYREekMl");
        setLongField(term1881, term1881.getClass(), "taskId", 4872422362414183754L);
        setField(term1881, term1881.getClass(), "taskName", "ytSBIKXogI");
        setIntField(term1881, term1881.getClass(), "employeeId", 1962444399);
        setField(term1881, term1881.getClass(), "employeeFirstName", "nHXjMycHlU");
        setField(term1881, term1881.getClass(), "employeeLastName", "ieCtQFdkii");
        setFloatField(term1881, term1881.getClass(), "billableHours", 0.41169226F);
        setFloatField(term1881, term1881.getClass(), "billableHoursFrozen", 0.29172552F);
        setFloatField(term1881, term1881.getClass(), "billableHoursNotFrozen", 0.13375676F);
        setFloatField(term1881, term1881.getClass(), "unbillableHours", 0.9276995F);
        setFloatField(term1881, term1881.getClass(), "unbillableHoursFrozen", 0.8521579F);
        setFloatField(term1881, term1881.getClass(), "unbillableHoursNotFrozen", 0.76361305F);
        setFloatField(term1881, term1881.getClass(), "totalHours", 0.98857903F);
        setFloatField(term1881, term1881.getClass(), "totalHoursFrozen", 0.07901633F);
        setFloatField(term1881, term1881.getClass(), "totalHoursNotFrozen", 0.8018383F);
        setField(term1881, term1881.getClass(), "workHoursMap", term1942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeLastName", argTypes, term1881, args);
    }

};


