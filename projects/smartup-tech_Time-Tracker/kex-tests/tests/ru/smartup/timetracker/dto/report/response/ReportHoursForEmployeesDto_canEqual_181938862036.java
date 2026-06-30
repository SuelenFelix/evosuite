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

public class ReportHoursForEmployeesDto_canEqual_181938862036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5306;
     Object term5378;

    public ReportHoursForEmployeesDto_canEqual_181938862036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5367 = new HashMap();
        term5306 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5306, term5306.getClass(), "projectId", 304775596);
        setField(term5306, term5306.getClass(), "projectName", "QduALnDSVo");
        setLongField(term5306, term5306.getClass(), "taskId", 6617340557564669657L);
        setField(term5306, term5306.getClass(), "taskName", "izPpKDErnQ");
        setIntField(term5306, term5306.getClass(), "employeeId", -1347665717);
        setField(term5306, term5306.getClass(), "employeeFirstName", "NnpwZBUTvx");
        setField(term5306, term5306.getClass(), "employeeLastName", "tlQSNgTkQX");
        setFloatField(term5306, term5306.getClass(), "billableHours", 0.24411172F);
        setFloatField(term5306, term5306.getClass(), "billableHoursFrozen", 0.0013046265F);
        setFloatField(term5306, term5306.getClass(), "billableHoursNotFrozen", 0.7487711F);
        setFloatField(term5306, term5306.getClass(), "unbillableHours", 0.5404409F);
        setFloatField(term5306, term5306.getClass(), "unbillableHoursFrozen", 0.51753795F);
        setFloatField(term5306, term5306.getClass(), "unbillableHoursNotFrozen", 0.9172358F);
        setFloatField(term5306, term5306.getClass(), "totalHours", 0.34114075F);
        setFloatField(term5306, term5306.getClass(), "totalHoursFrozen", 0.38042516F);
        setFloatField(term5306, term5306.getClass(), "totalHoursNotFrozen", 0.30089456F);
        setField(term5306, term5306.getClass(), "workHoursMap", term5367);
        term5378 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5378;
        callMethod(klass, "canEqual", argTypes, term5306, args);
    }

};


