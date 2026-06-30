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

public class ReportHours_getEmployeeId_4721203015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18127;

    public ReportHours_getEmployeeId_4721203015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18188 = new HashMap();
        term18127 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18127, term18127.getClass(), "projectId", 1227103734);
        setField(term18127, term18127.getClass(), "projectName", "hoicvmsovO");
        setLongField(term18127, term18127.getClass(), "taskId", 5270370404989704783L);
        setField(term18127, term18127.getClass(), "taskName", "eqJfYWRaEL");
        setIntField(term18127, term18127.getClass(), "employeeId", -1339778481);
        setField(term18127, term18127.getClass(), "employeeFirstName", "fhkbdRViHi");
        setField(term18127, term18127.getClass(), "employeeLastName", "uWHnvSvaPl");
        setFloatField(term18127, term18127.getClass(), "billableHours", 0.15826964F);
        setFloatField(term18127, term18127.getClass(), "billableHoursFrozen", 0.45691717F);
        setFloatField(term18127, term18127.getClass(), "billableHoursNotFrozen", 0.17877543F);
        setFloatField(term18127, term18127.getClass(), "unbillableHours", 0.8598297F);
        setFloatField(term18127, term18127.getClass(), "unbillableHoursFrozen", 0.96323884F);
        setFloatField(term18127, term18127.getClass(), "unbillableHoursNotFrozen", 0.43692183F);
        setFloatField(term18127, term18127.getClass(), "totalHours", 0.80973893F);
        setFloatField(term18127, term18127.getClass(), "totalHoursFrozen", 0.7633268F);
        setFloatField(term18127, term18127.getClass(), "totalHoursNotFrozen", 0.541592F);
        setField(term18127, term18127.getClass(), "workHoursMap", term18188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term18127, args);
    }

};


