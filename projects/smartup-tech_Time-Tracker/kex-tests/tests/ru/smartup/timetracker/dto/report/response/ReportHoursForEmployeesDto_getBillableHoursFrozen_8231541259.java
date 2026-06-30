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

public class ReportHoursForEmployeesDto_getBillableHoursFrozen_8231541259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2105;

    public ReportHoursForEmployeesDto_getBillableHoursFrozen_8231541259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2166 = new HashMap();
        term2105 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2105, term2105.getClass(), "projectId", -157887805);
        setField(term2105, term2105.getClass(), "projectName", "TJmVBGfTML");
        setLongField(term2105, term2105.getClass(), "taskId", -7237588299778557629L);
        setField(term2105, term2105.getClass(), "taskName", "tPlsykYBqO");
        setIntField(term2105, term2105.getClass(), "employeeId", 1876565163);
        setField(term2105, term2105.getClass(), "employeeFirstName", "bLPjGVBhlX");
        setField(term2105, term2105.getClass(), "employeeLastName", "whBvTVIIlC");
        setFloatField(term2105, term2105.getClass(), "billableHours", 0.34141678F);
        setFloatField(term2105, term2105.getClass(), "billableHoursFrozen", 0.916524F);
        setFloatField(term2105, term2105.getClass(), "billableHoursNotFrozen", 0.42916924F);
        setFloatField(term2105, term2105.getClass(), "unbillableHours", 0.22227418F);
        setFloatField(term2105, term2105.getClass(), "unbillableHoursFrozen", 0.6853048F);
        setFloatField(term2105, term2105.getClass(), "unbillableHoursNotFrozen", 0.06480974F);
        setFloatField(term2105, term2105.getClass(), "totalHours", 0.92767143F);
        setFloatField(term2105, term2105.getClass(), "totalHoursFrozen", 0.849079F);
        setFloatField(term2105, term2105.getClass(), "totalHoursNotFrozen", 0.4673223F);
        setField(term2105, term2105.getClass(), "workHoursMap", term2166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursFrozen", argTypes, term2105, args);
    }

};


