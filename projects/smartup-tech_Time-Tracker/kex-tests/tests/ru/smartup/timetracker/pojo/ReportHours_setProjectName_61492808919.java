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

public class ReportHours_setProjectName_61492808919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19697;

    public ReportHours_setProjectName_61492808919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19758 = new HashMap();
        term19697 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19697, term19697.getClass(), "projectId", -469968304);
        setField(term19697, term19697.getClass(), "projectName", "xJgPlLxpgC");
        setLongField(term19697, term19697.getClass(), "taskId", -6573104506744284592L);
        setField(term19697, term19697.getClass(), "taskName", "EYtfuJaxiM");
        setIntField(term19697, term19697.getClass(), "employeeId", -1145578966);
        setField(term19697, term19697.getClass(), "employeeFirstName", "gCWtLVKVVe");
        setField(term19697, term19697.getClass(), "employeeLastName", "fWKJoSoCwE");
        setFloatField(term19697, term19697.getClass(), "billableHours", 0.94332385F);
        setFloatField(term19697, term19697.getClass(), "billableHoursFrozen", 0.32237554F);
        setFloatField(term19697, term19697.getClass(), "billableHoursNotFrozen", 0.7666174F);
        setFloatField(term19697, term19697.getClass(), "unbillableHours", 0.53094494F);
        setFloatField(term19697, term19697.getClass(), "unbillableHoursFrozen", 0.301957F);
        setFloatField(term19697, term19697.getClass(), "unbillableHoursNotFrozen", 0.14643145F);
        setFloatField(term19697, term19697.getClass(), "totalHours", 0.7032675F);
        setFloatField(term19697, term19697.getClass(), "totalHoursFrozen", 0.24259013F);
        setFloatField(term19697, term19697.getClass(), "totalHoursNotFrozen", 0.8598678F);
        setField(term19697, term19697.getClass(), "workHoursMap", term19758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VMeAzAHwZj";
        callMethod(klass, "setProjectName", argTypes, term19697, args);
    }

};


