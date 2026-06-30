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

public class ReportHoursForEmployeesDto_hashCode_56653931637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5419;

    public ReportHoursForEmployeesDto_hashCode_56653931637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5480 = new HashMap();
        term5419 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term5419, term5419.getClass(), "projectId", -1888585309);
        setField(term5419, term5419.getClass(), "projectName", "zcorEihhLK");
        setLongField(term5419, term5419.getClass(), "taskId", 1439298019805881866L);
        setField(term5419, term5419.getClass(), "taskName", "GrqozDKFOk");
        setIntField(term5419, term5419.getClass(), "employeeId", 683666002);
        setField(term5419, term5419.getClass(), "employeeFirstName", "CFyoseFGLF");
        setField(term5419, term5419.getClass(), "employeeLastName", "SFqCrhEWLm");
        setFloatField(term5419, term5419.getClass(), "billableHours", 0.6704848F);
        setFloatField(term5419, term5419.getClass(), "billableHoursFrozen", 0.14253372F);
        setFloatField(term5419, term5419.getClass(), "billableHoursNotFrozen", 0.6213122F);
        setFloatField(term5419, term5419.getClass(), "unbillableHours", 0.040501416F);
        setFloatField(term5419, term5419.getClass(), "unbillableHoursFrozen", 0.54085016F);
        setFloatField(term5419, term5419.getClass(), "unbillableHoursNotFrozen", 0.76599944F);
        setFloatField(term5419, term5419.getClass(), "totalHours", 6.133914E-4F);
        setFloatField(term5419, term5419.getClass(), "totalHoursFrozen", 0.5547277F);
        setFloatField(term5419, term5419.getClass(), "totalHoursNotFrozen", 0.41934013F);
        setField(term5419, term5419.getClass(), "workHoursMap", term5480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5419, args);
    }

};


