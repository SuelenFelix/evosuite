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

public class ReportHoursForProjectsDto_equals_205626583623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term769;
     Object term792;

    public ReportHoursForProjectsDto_equals_205626583623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term769 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term769, term769.getClass(), "projectId", -117576464);
        setField(term769, term769.getClass(), "projectName", "eZFUvlxvGV");
        setFloatField(term769, term769.getClass(), "billableHours", 0.86701417F);
        setFloatField(term769, term769.getClass(), "billableHoursFrozen", 0.07417786F);
        setFloatField(term769, term769.getClass(), "billableHoursNotFrozen", 0.96144617F);
        setFloatField(term769, term769.getClass(), "unbillableHours", 0.6862936F);
        setFloatField(term769, term769.getClass(), "unbillableHoursFrozen", 0.18780023F);
        setFloatField(term769, term769.getClass(), "unbillableHoursNotFrozen", 0.12764448F);
        setFloatField(term769, term769.getClass(), "totalHours", 0.8254093F);
        setFloatField(term769, term769.getClass(), "totalHoursFrozen", 0.39446723F);
        setFloatField(term769, term769.getClass(), "totalHoursNotFrozen", 0.21836233F);
        term792 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term792;
        callMethod(klass, "equals", argTypes, term769, args);
    }

};


