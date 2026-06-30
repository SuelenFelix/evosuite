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

public class ReportHoursForEmployeesDto_setUnbillableHoursFrozen_188438317429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4447;
     Object term4519;

    public ReportHoursForEmployeesDto_setUnbillableHoursFrozen_188438317429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4508 = new HashMap();
        term4447 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4447, term4447.getClass(), "projectId", 1090617576);
        setField(term4447, term4447.getClass(), "projectName", "rLHAoqXgPh");
        setLongField(term4447, term4447.getClass(), "taskId", 2120084523938730454L);
        setField(term4447, term4447.getClass(), "taskName", "zUlRdimJtU");
        setIntField(term4447, term4447.getClass(), "employeeId", -1547384488);
        setField(term4447, term4447.getClass(), "employeeFirstName", "vwbEQQNQrx");
        setField(term4447, term4447.getClass(), "employeeLastName", "xtftXXMbem");
        setFloatField(term4447, term4447.getClass(), "billableHours", 0.0048968196F);
        setFloatField(term4447, term4447.getClass(), "billableHoursFrozen", 0.9113409F);
        setFloatField(term4447, term4447.getClass(), "billableHoursNotFrozen", 0.07447153F);
        setFloatField(term4447, term4447.getClass(), "unbillableHours", 0.7444535F);
        setFloatField(term4447, term4447.getClass(), "unbillableHoursFrozen", 0.36622107F);
        setFloatField(term4447, term4447.getClass(), "unbillableHoursNotFrozen", 0.37439555F);
        setFloatField(term4447, term4447.getClass(), "totalHours", 0.8797888F);
        setFloatField(term4447, term4447.getClass(), "totalHoursFrozen", 0.50103366F);
        setFloatField(term4447, term4447.getClass(), "totalHoursNotFrozen", 0.50201577F);
        setField(term4447, term4447.getClass(), "workHoursMap", term4508);
        term4519 = new Float(0.3387177F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4519;
        callMethod(klass, "setUnbillableHoursFrozen", argTypes, term4447, args);
    }

};


