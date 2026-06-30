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

public class ReportHoursForEmployeesDto_getUnbillableHoursNotFrozen_68148923913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2553;

    public ReportHoursForEmployeesDto_getUnbillableHoursNotFrozen_68148923913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2614 = new HashMap();
        term2553 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2553, term2553.getClass(), "projectId", 454281060);
        setField(term2553, term2553.getClass(), "projectName", "TimdotUuNC");
        setLongField(term2553, term2553.getClass(), "taskId", -4325723315152823407L);
        setField(term2553, term2553.getClass(), "taskName", "PkWMRdJcBb");
        setIntField(term2553, term2553.getClass(), "employeeId", -1786399638);
        setField(term2553, term2553.getClass(), "employeeFirstName", "jSpAteRute");
        setField(term2553, term2553.getClass(), "employeeLastName", "swZVeJAxjt");
        setFloatField(term2553, term2553.getClass(), "billableHours", 0.4131598F);
        setFloatField(term2553, term2553.getClass(), "billableHoursFrozen", 0.6693176F);
        setFloatField(term2553, term2553.getClass(), "billableHoursNotFrozen", 0.50650495F);
        setFloatField(term2553, term2553.getClass(), "unbillableHours", 0.29628682F);
        setFloatField(term2553, term2553.getClass(), "unbillableHoursFrozen", 0.28167832F);
        setFloatField(term2553, term2553.getClass(), "unbillableHoursNotFrozen", 0.2547418F);
        setFloatField(term2553, term2553.getClass(), "totalHours", 0.19656086F);
        setFloatField(term2553, term2553.getClass(), "totalHoursFrozen", 0.99575853F);
        setFloatField(term2553, term2553.getClass(), "totalHoursNotFrozen", 0.5778128F);
        setField(term2553, term2553.getClass(), "workHoursMap", term2614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursNotFrozen", argTypes, term2553, args);
    }

};


