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

public class ReportHoursForEmployeesDto_setBillableHours_37225510525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3991;
     Object term4063;

    public ReportHoursForEmployeesDto_setBillableHours_37225510525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4052 = new HashMap();
        term3991 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3991, term3991.getClass(), "projectId", 1063420942);
        setField(term3991, term3991.getClass(), "projectName", "ZfdXfCCFDf");
        setLongField(term3991, term3991.getClass(), "taskId", 7009926388951271268L);
        setField(term3991, term3991.getClass(), "taskName", "MwwjNtdOFT");
        setIntField(term3991, term3991.getClass(), "employeeId", 1375330971);
        setField(term3991, term3991.getClass(), "employeeFirstName", "VYkqXKVlAJ");
        setField(term3991, term3991.getClass(), "employeeLastName", "XkIoWJRNwN");
        setFloatField(term3991, term3991.getClass(), "billableHours", 0.2337023F);
        setFloatField(term3991, term3991.getClass(), "billableHoursFrozen", 0.43953127F);
        setFloatField(term3991, term3991.getClass(), "billableHoursNotFrozen", 0.082467675F);
        setFloatField(term3991, term3991.getClass(), "unbillableHours", 0.5715204F);
        setFloatField(term3991, term3991.getClass(), "unbillableHoursFrozen", 0.31783408F);
        setFloatField(term3991, term3991.getClass(), "unbillableHoursNotFrozen", 0.6420799F);
        setFloatField(term3991, term3991.getClass(), "totalHours", 0.21757495F);
        setFloatField(term3991, term3991.getClass(), "totalHoursFrozen", 0.0011409521F);
        setFloatField(term3991, term3991.getClass(), "totalHoursNotFrozen", 0.7084155F);
        setField(term3991, term3991.getClass(), "workHoursMap", term4052);
        term4063 = new Float(0.51958525F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4063;
        callMethod(klass, "setBillableHours", argTypes, term3991, args);
    }

};


