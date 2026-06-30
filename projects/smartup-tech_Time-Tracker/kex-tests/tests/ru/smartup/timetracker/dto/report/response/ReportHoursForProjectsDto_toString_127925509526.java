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

public class ReportHoursForProjectsDto_toString_127925509526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870;

    public ReportHoursForProjectsDto_toString_127925509526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term870 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term870, term870.getClass(), "projectId", 590364439);
        setField(term870, term870.getClass(), "projectName", "flxyYxBRtu");
        setFloatField(term870, term870.getClass(), "billableHours", 0.7385589F);
        setFloatField(term870, term870.getClass(), "billableHoursFrozen", 0.8736398F);
        setFloatField(term870, term870.getClass(), "billableHoursNotFrozen", 0.7080134F);
        setFloatField(term870, term870.getClass(), "unbillableHours", 0.74126697F);
        setFloatField(term870, term870.getClass(), "unbillableHoursFrozen", 0.60597336F);
        setFloatField(term870, term870.getClass(), "unbillableHoursNotFrozen", 0.11164951F);
        setFloatField(term870, term870.getClass(), "totalHours", 0.30746937F);
        setFloatField(term870, term870.getClass(), "totalHoursFrozen", 0.9695807F);
        setFloatField(term870, term870.getClass(), "totalHoursNotFrozen", 0.124525845F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term870, args);
    }

};


