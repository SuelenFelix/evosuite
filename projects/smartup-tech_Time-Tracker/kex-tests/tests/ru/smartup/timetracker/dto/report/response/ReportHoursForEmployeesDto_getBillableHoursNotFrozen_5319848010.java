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

public class ReportHoursForEmployeesDto_getBillableHoursNotFrozen_5319848010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2217;

    public ReportHoursForEmployeesDto_getBillableHoursNotFrozen_5319848010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2278 = new HashMap();
        term2217 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2217, term2217.getClass(), "projectId", -817164822);
        setField(term2217, term2217.getClass(), "projectName", "JUmudUmaaV");
        setLongField(term2217, term2217.getClass(), "taskId", 6967924379644551255L);
        setField(term2217, term2217.getClass(), "taskName", "KoyGrUJeJW");
        setIntField(term2217, term2217.getClass(), "employeeId", -1016503459);
        setField(term2217, term2217.getClass(), "employeeFirstName", "HqBOwkVqjD");
        setField(term2217, term2217.getClass(), "employeeLastName", "MAcUBcBckh");
        setFloatField(term2217, term2217.getClass(), "billableHours", 0.23129123F);
        setFloatField(term2217, term2217.getClass(), "billableHoursFrozen", 0.82184F);
        setFloatField(term2217, term2217.getClass(), "billableHoursNotFrozen", 0.6047138F);
        setFloatField(term2217, term2217.getClass(), "unbillableHours", 0.3017112F);
        setFloatField(term2217, term2217.getClass(), "unbillableHoursFrozen", 0.5597136F);
        setFloatField(term2217, term2217.getClass(), "unbillableHoursNotFrozen", 0.6366371F);
        setFloatField(term2217, term2217.getClass(), "totalHours", 0.28292418F);
        setFloatField(term2217, term2217.getClass(), "totalHoursFrozen", 0.6687146F);
        setFloatField(term2217, term2217.getClass(), "totalHoursNotFrozen", 0.5407563F);
        setField(term2217, term2217.getClass(), "workHoursMap", term2278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursNotFrozen", argTypes, term2217, args);
    }

};


