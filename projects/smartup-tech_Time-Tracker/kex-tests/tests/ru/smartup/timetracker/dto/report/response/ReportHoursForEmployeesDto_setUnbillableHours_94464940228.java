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
import java.lang.Float;

public class ReportHoursForEmployeesDto_setUnbillableHours_94464940228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4333;
     Object term4405;

    public ReportHoursForEmployeesDto_setUnbillableHours_94464940228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4394 = new HashMap();
        term4333 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4333, term4333.getClass(), "projectId", 1240914516);
        setField(term4333, term4333.getClass(), "projectName", "smnHEqRFRx");
        setLongField(term4333, term4333.getClass(), "taskId", 1967728129628047933L);
        setField(term4333, term4333.getClass(), "taskName", "XYtryyobou");
        setIntField(term4333, term4333.getClass(), "employeeId", -1465035361);
        setField(term4333, term4333.getClass(), "employeeFirstName", "OYbzXylRWW");
        setField(term4333, term4333.getClass(), "employeeLastName", "DSNsTGYXDF");
        setFloatField(term4333, term4333.getClass(), "billableHours", 0.77281576F);
        setFloatField(term4333, term4333.getClass(), "billableHoursFrozen", 0.10087359F);
        setFloatField(term4333, term4333.getClass(), "billableHoursNotFrozen", 0.881735F);
        setFloatField(term4333, term4333.getClass(), "unbillableHours", 0.59576315F);
        setFloatField(term4333, term4333.getClass(), "unbillableHoursFrozen", 0.20885146F);
        setFloatField(term4333, term4333.getClass(), "unbillableHoursNotFrozen", 0.9963416F);
        setFloatField(term4333, term4333.getClass(), "totalHours", 0.4575047F);
        setFloatField(term4333, term4333.getClass(), "totalHoursFrozen", 0.31476378F);
        setFloatField(term4333, term4333.getClass(), "totalHoursNotFrozen", 0.9229568F);
        setField(term4333, term4333.getClass(), "workHoursMap", term4394);
        term4405 = new Float(0.24810332F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4405;
        callMethod(klass, "setUnbillableHours", argTypes, term4333, args);
    }

};


