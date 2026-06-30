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
import java.util.LinkedHashMap;

public class ReportHoursForEmployeesDto_setWorkHoursMap_151399630134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5017;
     Object term5089;

    public ReportHoursForEmployeesDto_setWorkHoursMap_151399630134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5078 = new HashMap();
        term5017 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5017, term5017.getClass(), "projectId", 444029505);
        setField(term5017, term5017.getClass(), "projectName", "wzsPSPcRdj");
        setLongField(term5017, term5017.getClass(), "taskId", -484994522244390100L);
        setField(term5017, term5017.getClass(), "taskName", "kGMQdqJYyB");
        setIntField(term5017, term5017.getClass(), "employeeId", -1034506028);
        setField(term5017, term5017.getClass(), "employeeFirstName", "XJJNClzHRf");
        setField(term5017, term5017.getClass(), "employeeLastName", "HDaezxQfQR");
        setFloatField(term5017, term5017.getClass(), "billableHours", 0.76814204F);
        setFloatField(term5017, term5017.getClass(), "billableHoursFrozen", 0.8399796F);
        setFloatField(term5017, term5017.getClass(), "billableHoursNotFrozen", 0.27949923F);
        setFloatField(term5017, term5017.getClass(), "unbillableHours", 0.009446323F);
        setFloatField(term5017, term5017.getClass(), "unbillableHoursFrozen", 0.4339754F);
        setFloatField(term5017, term5017.getClass(), "unbillableHoursNotFrozen", 0.201316F);
        setFloatField(term5017, term5017.getClass(), "totalHours", 0.06504935F);
        setFloatField(term5017, term5017.getClass(), "totalHoursFrozen", 0.3323205F);
        setFloatField(term5017, term5017.getClass(), "totalHoursNotFrozen", 0.8179653F);
        setField(term5017, term5017.getClass(), "workHoursMap", term5078);
        term5089 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term5089;
        callMethod(klass, "setWorkHoursMap", argTypes, term5017, args);
    }

};


