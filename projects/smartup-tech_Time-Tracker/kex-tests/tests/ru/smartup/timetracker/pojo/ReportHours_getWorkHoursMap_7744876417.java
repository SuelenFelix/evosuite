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

public class ReportHours_getWorkHoursMap_7744876417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19471;

    public ReportHours_getWorkHoursMap_7744876417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19532 = new HashMap();
        term19471 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19471, term19471.getClass(), "projectId", -73683645);
        setField(term19471, term19471.getClass(), "projectName", "WzMEhMXkKx");
        setLongField(term19471, term19471.getClass(), "taskId", -316468845751588286L);
        setField(term19471, term19471.getClass(), "taskName", "XOiDvlDhdc");
        setIntField(term19471, term19471.getClass(), "employeeId", -226514366);
        setField(term19471, term19471.getClass(), "employeeFirstName", "AdxvLJhNLe");
        setField(term19471, term19471.getClass(), "employeeLastName", "lHfTrWKMPk");
        setFloatField(term19471, term19471.getClass(), "billableHours", 0.04703206F);
        setFloatField(term19471, term19471.getClass(), "billableHoursFrozen", 0.036990583F);
        setFloatField(term19471, term19471.getClass(), "billableHoursNotFrozen", 0.8998475F);
        setFloatField(term19471, term19471.getClass(), "unbillableHours", 0.60471374F);
        setFloatField(term19471, term19471.getClass(), "unbillableHoursFrozen", 0.023032188F);
        setFloatField(term19471, term19471.getClass(), "unbillableHoursNotFrozen", 0.6767213F);
        setFloatField(term19471, term19471.getClass(), "totalHours", 0.65115076F);
        setFloatField(term19471, term19471.getClass(), "totalHoursFrozen", 0.48862952F);
        setFloatField(term19471, term19471.getClass(), "totalHoursNotFrozen", 0.37227178F);
        setField(term19471, term19471.getClass(), "workHoursMap", term19532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkHoursMap", argTypes, term19471, args);
    }

};


