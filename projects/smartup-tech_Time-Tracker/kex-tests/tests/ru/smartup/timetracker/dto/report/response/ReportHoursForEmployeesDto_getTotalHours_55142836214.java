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

public class ReportHoursForEmployeesDto_getTotalHours_55142836214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2665;

    public ReportHoursForEmployeesDto_getTotalHours_55142836214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2726 = new HashMap();
        term2665 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2665, term2665.getClass(), "projectId", 2055867847);
        setField(term2665, term2665.getClass(), "projectName", "GVizqqzXpy");
        setLongField(term2665, term2665.getClass(), "taskId", 2535595959091595249L);
        setField(term2665, term2665.getClass(), "taskName", "JqXGgAhZPl");
        setIntField(term2665, term2665.getClass(), "employeeId", -1048298087);
        setField(term2665, term2665.getClass(), "employeeFirstName", "jiKYgYHqIS");
        setField(term2665, term2665.getClass(), "employeeLastName", "DfISiziTgG");
        setFloatField(term2665, term2665.getClass(), "billableHours", 0.16755807F);
        setFloatField(term2665, term2665.getClass(), "billableHoursFrozen", 0.6467969F);
        setFloatField(term2665, term2665.getClass(), "billableHoursNotFrozen", 0.9090794F);
        setFloatField(term2665, term2665.getClass(), "unbillableHours", 0.6117589F);
        setFloatField(term2665, term2665.getClass(), "unbillableHoursFrozen", 0.2599733F);
        setFloatField(term2665, term2665.getClass(), "unbillableHoursNotFrozen", 0.7806282F);
        setFloatField(term2665, term2665.getClass(), "totalHours", 0.78148645F);
        setFloatField(term2665, term2665.getClass(), "totalHoursFrozen", 0.28933305F);
        setFloatField(term2665, term2665.getClass(), "totalHoursNotFrozen", 0.5657654F);
        setField(term2665, term2665.getClass(), "workHoursMap", term2726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHours", argTypes, term2665, args);
    }

};


