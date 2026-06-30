package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ReportHours_getTotalHoursFrozen_80424385715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19247;

    public ReportHours_getTotalHoursFrozen_80424385715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19308 = new HashMap();
        term19247 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19247, term19247.getClass(), "projectId", -1275173084);
        setField(term19247, term19247.getClass(), "projectName", "OEXDRUKcFl");
        setLongField(term19247, term19247.getClass(), "taskId", -5476826692763582090L);
        setField(term19247, term19247.getClass(), "taskName", "RYdKCNNMBR");
        setIntField(term19247, term19247.getClass(), "employeeId", -244121226);
        setField(term19247, term19247.getClass(), "employeeFirstName", "yGtHPyvYiQ");
        setField(term19247, term19247.getClass(), "employeeLastName", "MvRIxilFMJ");
        setFloatField(term19247, term19247.getClass(), "billableHours", 0.9205692F);
        setFloatField(term19247, term19247.getClass(), "billableHoursFrozen", 0.5306474F);
        setFloatField(term19247, term19247.getClass(), "billableHoursNotFrozen", 0.12532318F);
        setFloatField(term19247, term19247.getClass(), "unbillableHours", 0.022483587F);
        setFloatField(term19247, term19247.getClass(), "unbillableHoursFrozen", 0.9200632F);
        setFloatField(term19247, term19247.getClass(), "unbillableHoursNotFrozen", 0.025133014F);
        setFloatField(term19247, term19247.getClass(), "totalHours", 0.5428452F);
        setFloatField(term19247, term19247.getClass(), "totalHoursFrozen", 0.016575277F);
        setFloatField(term19247, term19247.getClass(), "totalHoursNotFrozen", 0.27994657F);
        setField(term19247, term19247.getClass(), "workHoursMap", term19308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHoursFrozen", argTypes, term19247, args);
    }

};


