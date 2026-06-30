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

public class ReportHoursForEmployeesDto_setProjectId_131035625718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3113;
     Object term3185;

    public ReportHoursForEmployeesDto_setProjectId_131035625718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3174 = new HashMap();
        term3113 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3113, term3113.getClass(), "projectId", 97029295);
        setField(term3113, term3113.getClass(), "projectName", "OEXDRUKcFl");
        setLongField(term3113, term3113.getClass(), "taskId", 5127676408959197577L);
        setField(term3113, term3113.getClass(), "taskName", "RYdKCNNMBR");
        setIntField(term3113, term3113.getClass(), "employeeId", -1371869594);
        setField(term3113, term3113.getClass(), "employeeFirstName", "yGtHPyvYiQ");
        setField(term3113, term3113.getClass(), "employeeLastName", "MvRIxilFMJ");
        setFloatField(term3113, term3113.getClass(), "billableHours", 0.22767627F);
        setFloatField(term3113, term3113.getClass(), "billableHoursFrozen", 0.07017553F);
        setFloatField(term3113, term3113.getClass(), "billableHoursNotFrozen", 0.46300822F);
        setFloatField(term3113, term3113.getClass(), "unbillableHours", 0.18817449F);
        setFloatField(term3113, term3113.getClass(), "unbillableHoursFrozen", 0.87325114F);
        setFloatField(term3113, term3113.getClass(), "unbillableHoursNotFrozen", 0.57387376F);
        setFloatField(term3113, term3113.getClass(), "totalHours", 0.897776F);
        setFloatField(term3113, term3113.getClass(), "totalHoursFrozen", 0.5694716F);
        setFloatField(term3113, term3113.getClass(), "totalHoursNotFrozen", 0.31070864F);
        setField(term3113, term3113.getClass(), "workHoursMap", term3174);
        term3185 = new Integer(-2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3185;
        callMethod(klass, "setProjectId", argTypes, term3113, args);
    }

};


