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

public class ReportHoursForEmployeesDto_setEmployeeFirstName_19334634723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;

    public ReportHoursForEmployeesDto_setEmployeeFirstName_19334634723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3784 = new HashMap();
        term3723 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3723, term3723.getClass(), "projectId", 1265463001);
        setField(term3723, term3723.getClass(), "projectName", "ZzIujlwVsw");
        setLongField(term3723, term3723.getClass(), "taskId", -4365849114644724155L);
        setField(term3723, term3723.getClass(), "taskName", "LWyEaeIyAo");
        setIntField(term3723, term3723.getClass(), "employeeId", 335112684);
        setField(term3723, term3723.getClass(), "employeeFirstName", "yVMkkQhvmN");
        setField(term3723, term3723.getClass(), "employeeLastName", "mvrkADEgpp");
        setFloatField(term3723, term3723.getClass(), "billableHours", 0.38157493F);
        setFloatField(term3723, term3723.getClass(), "billableHoursFrozen", 0.32009327F);
        setFloatField(term3723, term3723.getClass(), "billableHoursNotFrozen", 0.27008587F);
        setFloatField(term3723, term3723.getClass(), "unbillableHours", 0.9013029F);
        setFloatField(term3723, term3723.getClass(), "unbillableHoursFrozen", 0.877631F);
        setFloatField(term3723, term3723.getClass(), "unbillableHoursNotFrozen", 0.17556727F);
        setFloatField(term3723, term3723.getClass(), "totalHours", 0.9955187F);
        setFloatField(term3723, term3723.getClass(), "totalHoursFrozen", 0.9136597F);
        setFloatField(term3723, term3723.getClass(), "totalHoursNotFrozen", 0.27209377F);
        setField(term3723, term3723.getClass(), "workHoursMap", term3784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        callMethod(klass, "setEmployeeFirstName", argTypes, term3723, args);
    }

};


