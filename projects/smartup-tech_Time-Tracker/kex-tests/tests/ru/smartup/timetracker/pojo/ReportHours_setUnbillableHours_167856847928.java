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
import java.lang.Float;

public class ReportHours_setUnbillableHours_167856847928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20803;
     Object term20875;

    public ReportHours_setUnbillableHours_167856847928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20864 = new HashMap();
        term20803 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20803, term20803.getClass(), "projectId", 458147407);
        setField(term20803, term20803.getClass(), "projectName", "VGizxZnyHX");
        setLongField(term20803, term20803.getClass(), "taskId", 1967728129628047933L);
        setField(term20803, term20803.getClass(), "taskName", "kVEZMHmRtR");
        setIntField(term20803, term20803.getClass(), "employeeId", -184153539);
        setField(term20803, term20803.getClass(), "employeeFirstName", "ekxGuOYIwi");
        setField(term20803, term20803.getClass(), "employeeLastName", "RbVQXSpxXy");
        setFloatField(term20803, term20803.getClass(), "billableHours", 0.40587604F);
        setFloatField(term20803, term20803.getClass(), "billableHoursFrozen", 0.19625396F);
        setFloatField(term20803, term20803.getClass(), "billableHoursNotFrozen", 0.234712F);
        setFloatField(term20803, term20803.getClass(), "unbillableHours", 0.450692F);
        setFloatField(term20803, term20803.getClass(), "unbillableHoursFrozen", 0.35089302F);
        setFloatField(term20803, term20803.getClass(), "unbillableHoursNotFrozen", 0.9341364F);
        setFloatField(term20803, term20803.getClass(), "totalHours", 0.7244789F);
        setFloatField(term20803, term20803.getClass(), "totalHoursFrozen", 0.9022041F);
        setFloatField(term20803, term20803.getClass(), "totalHoursNotFrozen", 0.06234348F);
        setField(term20803, term20803.getClass(), "workHoursMap", term20864);
        term20875 = new Float(0.6512871F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term20875;
        callMethod(klass, "setUnbillableHours", argTypes, term20803, args);
    }

};


