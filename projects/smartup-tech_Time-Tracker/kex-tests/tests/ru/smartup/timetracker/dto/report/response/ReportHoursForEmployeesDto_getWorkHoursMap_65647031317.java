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

public class ReportHoursForEmployeesDto_getWorkHoursMap_65647031317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3001;

    public ReportHoursForEmployeesDto_getWorkHoursMap_65647031317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3062 = new HashMap();
        term3001 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3001, term3001.getClass(), "projectId", 1328271830);
        setField(term3001, term3001.getClass(), "projectName", "sEnIVFtZuQ");
        setLongField(term3001, term3001.getClass(), "taskId", -316468845751588286L);
        setField(term3001, term3001.getClass(), "taskName", "ZVecLZMLHF");
        setIntField(term3001, term3001.getClass(), "employeeId", 1596070772);
        setField(term3001, term3001.getClass(), "employeeFirstName", "fztQhjqwdP");
        setField(term3001, term3001.getClass(), "employeeLastName", "eVpkWxjuki");
        setFloatField(term3001, term3001.getClass(), "billableHours", 0.2114355F);
        setFloatField(term3001, term3001.getClass(), "billableHoursFrozen", 0.23823452F);
        setFloatField(term3001, term3001.getClass(), "billableHoursNotFrozen", 0.25258613F);
        setFloatField(term3001, term3001.getClass(), "unbillableHours", 0.6037093F);
        setFloatField(term3001, term3001.getClass(), "unbillableHoursFrozen", 0.78008145F);
        setFloatField(term3001, term3001.getClass(), "unbillableHoursNotFrozen", 0.48050702F);
        setFloatField(term3001, term3001.getClass(), "totalHours", 0.38612437F);
        setFloatField(term3001, term3001.getClass(), "totalHoursFrozen", 0.49902177F);
        setFloatField(term3001, term3001.getClass(), "totalHoursNotFrozen", 0.26487374F);
        setField(term3001, term3001.getClass(), "workHoursMap", term3062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkHoursMap", argTypes, term3001, args);
    }

};


