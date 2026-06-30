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

public class ReportHoursForEmployeesDto_toString_5577962638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5531;

    public ReportHoursForEmployeesDto_toString_5577962638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5592 = new HashMap();
        term5531 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5531, term5531.getClass(), "projectId", 1596213415);
        setField(term5531, term5531.getClass(), "projectName", "OIHoJeysUi");
        setLongField(term5531, term5531.getClass(), "taskId", -8708192233349544946L);
        setField(term5531, term5531.getClass(), "taskName", "WXMWFDGcLB");
        setIntField(term5531, term5531.getClass(), "employeeId", -268815336);
        setField(term5531, term5531.getClass(), "employeeFirstName", "wKWbJssZuG");
        setField(term5531, term5531.getClass(), "employeeLastName", "NzBMMhkhpT");
        setFloatField(term5531, term5531.getClass(), "billableHours", 0.50859785F);
        setFloatField(term5531, term5531.getClass(), "billableHoursFrozen", 0.07298303F);
        setFloatField(term5531, term5531.getClass(), "billableHoursNotFrozen", 0.17523181F);
        setFloatField(term5531, term5531.getClass(), "unbillableHours", 0.61014116F);
        setFloatField(term5531, term5531.getClass(), "unbillableHoursFrozen", 0.18494946F);
        setFloatField(term5531, term5531.getClass(), "unbillableHoursNotFrozen", 0.07932997F);
        setFloatField(term5531, term5531.getClass(), "totalHours", 0.069800556F);
        setFloatField(term5531, term5531.getClass(), "totalHoursFrozen", 0.4335752F);
        setFloatField(term5531, term5531.getClass(), "totalHoursNotFrozen", 0.26342428F);
        setField(term5531, term5531.getClass(), "workHoursMap", term5592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5531, args);
    }

};


