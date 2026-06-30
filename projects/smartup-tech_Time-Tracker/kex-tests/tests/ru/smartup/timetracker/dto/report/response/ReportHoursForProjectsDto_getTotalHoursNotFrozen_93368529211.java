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

public class ReportHoursForProjectsDto_getTotalHoursNotFrozen_93368529211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public ReportHoursForProjectsDto_getTotalHoursNotFrozen_93368529211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term331, term331.getClass(), "projectId", 1725571209);
        setField(term331, term331.getClass(), "projectName", "NRdvgJlhkX");
        setFloatField(term331, term331.getClass(), "billableHours", 0.5873228F);
        setFloatField(term331, term331.getClass(), "billableHoursFrozen", 0.5703112F);
        setFloatField(term331, term331.getClass(), "billableHoursNotFrozen", 0.8823181F);
        setFloatField(term331, term331.getClass(), "unbillableHours", 0.91971004F);
        setFloatField(term331, term331.getClass(), "unbillableHoursFrozen", 0.21924508F);
        setFloatField(term331, term331.getClass(), "unbillableHoursNotFrozen", 0.10338366F);
        setFloatField(term331, term331.getClass(), "totalHours", 0.75913525F);
        setFloatField(term331, term331.getClass(), "totalHoursFrozen", 0.7059082F);
        setFloatField(term331, term331.getClass(), "totalHoursNotFrozen", 0.791695F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursNotFrozen", argTypes, term331, args);
    }

};


