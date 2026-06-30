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

public class ReportHoursForEmployeesDto_getTotalHoursNotFrozen_213780653516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2889;

    public ReportHoursForEmployeesDto_getTotalHoursNotFrozen_213780653516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2950 = new HashMap();
        term2889 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2889, term2889.getClass(), "projectId", -184153539);
        setField(term2889, term2889.getClass(), "projectName", "AWRooQKkdW");
        setLongField(term2889, term2889.getClass(), "taskId", -872011222785455006L);
        setField(term2889, term2889.getClass(), "taskName", "vjxIhXHxGR");
        setIntField(term2889, term2889.getClass(), "employeeId", 493620644);
        setField(term2889, term2889.getClass(), "employeeFirstName", "QXzGXbEXMu");
        setField(term2889, term2889.getClass(), "employeeLastName", "qxSDVejjiY");
        setFloatField(term2889, term2889.getClass(), "billableHours", 0.9765248F);
        setFloatField(term2889, term2889.getClass(), "billableHoursFrozen", 0.17890882F);
        setFloatField(term2889, term2889.getClass(), "billableHoursNotFrozen", 0.9184034F);
        setFloatField(term2889, term2889.getClass(), "unbillableHours", 0.7326771F);
        setFloatField(term2889, term2889.getClass(), "unbillableHoursFrozen", 0.9457448F);
        setFloatField(term2889, term2889.getClass(), "unbillableHoursNotFrozen", 0.42393434F);
        setFloatField(term2889, term2889.getClass(), "totalHours", 0.32382548F);
        setFloatField(term2889, term2889.getClass(), "totalHoursFrozen", 0.8069875F);
        setFloatField(term2889, term2889.getClass(), "totalHoursNotFrozen", 0.28438938F);
        setField(term2889, term2889.getClass(), "workHoursMap", term2950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursNotFrozen", argTypes, term2889, args);
    }

};


