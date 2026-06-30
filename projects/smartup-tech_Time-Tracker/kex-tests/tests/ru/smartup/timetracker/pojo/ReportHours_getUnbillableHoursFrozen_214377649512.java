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

public class ReportHours_getUnbillableHoursFrozen_214377649512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18911;

    public ReportHours_getUnbillableHoursFrozen_214377649512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18972 = new HashMap();
        term18911 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18911, term18911.getClass(), "projectId", -2068769794);
        setField(term18911, term18911.getClass(), "projectName", "JiVRgTZvKc");
        setLongField(term18911, term18911.getClass(), "taskId", -8885298608300233488L);
        setField(term18911, term18911.getClass(), "taskName", "XPKmummaqg");
        setIntField(term18911, term18911.getClass(), "employeeId", -117576464);
        setField(term18911, term18911.getClass(), "employeeFirstName", "BKLfkLiZTH");
        setField(term18911, term18911.getClass(), "employeeLastName", "SPpkrGcPRr");
        setFloatField(term18911, term18911.getClass(), "billableHours", 0.15917838F);
        setFloatField(term18911, term18911.getClass(), "billableHoursFrozen", 0.37164736F);
        setFloatField(term18911, term18911.getClass(), "billableHoursNotFrozen", 0.93741155F);
        setFloatField(term18911, term18911.getClass(), "unbillableHours", 0.71813905F);
        setFloatField(term18911, term18911.getClass(), "unbillableHoursFrozen", 0.8454723F);
        setFloatField(term18911, term18911.getClass(), "unbillableHoursNotFrozen", 0.079128504F);
        setFloatField(term18911, term18911.getClass(), "totalHours", 0.85665673F);
        setFloatField(term18911, term18911.getClass(), "totalHoursFrozen", 0.6563145F);
        setFloatField(term18911, term18911.getClass(), "totalHoursNotFrozen", 0.92038053F);
        setField(term18911, term18911.getClass(), "workHoursMap", term18972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursFrozen", argTypes, term18911, args);
    }

};


