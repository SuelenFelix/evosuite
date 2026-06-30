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

public class ReportHoursForProjectsDto_hashCode_179001478525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837;

    public ReportHoursForProjectsDto_hashCode_179001478525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term837 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term837, term837.getClass(), "projectId", 1135664017);
        setField(term837, term837.getClass(), "projectName", "vrQLuWIDJX");
        setFloatField(term837, term837.getClass(), "billableHours", 0.59315026F);
        setFloatField(term837, term837.getClass(), "billableHoursFrozen", 0.09037483F);
        setFloatField(term837, term837.getClass(), "billableHoursNotFrozen", 0.39231926F);
        setFloatField(term837, term837.getClass(), "unbillableHours", 0.6561919F);
        setFloatField(term837, term837.getClass(), "unbillableHoursFrozen", 0.2958501F);
        setFloatField(term837, term837.getClass(), "unbillableHoursNotFrozen", 0.73301786F);
        setFloatField(term837, term837.getClass(), "totalHours", 0.7997349F);
        setFloatField(term837, term837.getClass(), "totalHoursFrozen", 0.76181644F);
        setFloatField(term837, term837.getClass(), "totalHoursNotFrozen", 0.24343538F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term837, args);
    }

};


