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

public class ReportHoursForEmployeesDto_getProjectId_12165020891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;

    public ReportHoursForEmployeesDto_getProjectId_12165020891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1270 = new HashMap();
        term1209 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1209, term1209.getClass(), "projectId", 865208305);
        setField(term1209, term1209.getClass(), "projectName", "OclPbYPkcH");
        setLongField(term1209, term1209.getClass(), "taskId", 2442117782898005296L);
        setField(term1209, term1209.getClass(), "taskName", "IoAlmYsBwc");
        setIntField(term1209, term1209.getClass(), "employeeId", -1275173084);
        setField(term1209, term1209.getClass(), "employeeFirstName", "TEParAifyi");
        setField(term1209, term1209.getClass(), "employeeLastName", "OWDIEULEFu");
        setFloatField(term1209, term1209.getClass(), "billableHours", 0.45613784F);
        setFloatField(term1209, term1209.getClass(), "billableHoursFrozen", 0.95118606F);
        setFloatField(term1209, term1209.getClass(), "billableHoursNotFrozen", 0.111205876F);
        setFloatField(term1209, term1209.getClass(), "unbillableHours", 0.058807194F);
        setFloatField(term1209, term1209.getClass(), "unbillableHoursFrozen", 0.013315558F);
        setFloatField(term1209, term1209.getClass(), "unbillableHoursNotFrozen", 0.34010088F);
        setFloatField(term1209, term1209.getClass(), "totalHours", 0.40587604F);
        setFloatField(term1209, term1209.getClass(), "totalHoursFrozen", 0.19625396F);
        setFloatField(term1209, term1209.getClass(), "totalHoursNotFrozen", 0.234712F);
        setField(term1209, term1209.getClass(), "workHoursMap", term1270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term1209, args);
    }

};


