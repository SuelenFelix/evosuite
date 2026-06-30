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

public class ReportHours_setEmployeeFirstName_92726542423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20193;

    public ReportHours_setEmployeeFirstName_92726542423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20254 = new HashMap();
        term20193 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20193, term20193.getClass(), "projectId", -1016503459);
        setField(term20193, term20193.getClass(), "projectName", "XkIoWJRNwN");
        setLongField(term20193, term20193.getClass(), "taskId", -4365849114644724155L);
        setField(term20193, term20193.getClass(), "taskName", "aNWLJdrZMq");
        setIntField(term20193, term20193.getClass(), "employeeId", -1968847291);
        setField(term20193, term20193.getClass(), "employeeFirstName", "HHmNoYxIGj");
        setField(term20193, term20193.getClass(), "employeeLastName", "PtirvZmsGt");
        setFloatField(term20193, term20193.getClass(), "billableHours", 0.25674725F);
        setFloatField(term20193, term20193.getClass(), "billableHoursFrozen", 0.9006361F);
        setFloatField(term20193, term20193.getClass(), "billableHoursNotFrozen", 0.71533775F);
        setFloatField(term20193, term20193.getClass(), "unbillableHours", 0.5644914F);
        setFloatField(term20193, term20193.getClass(), "unbillableHoursFrozen", 0.6949883F);
        setFloatField(term20193, term20193.getClass(), "unbillableHoursNotFrozen", 0.5098958F);
        setFloatField(term20193, term20193.getClass(), "totalHours", 0.86701417F);
        setFloatField(term20193, term20193.getClass(), "totalHoursFrozen", 0.07417786F);
        setFloatField(term20193, term20193.getClass(), "totalHoursNotFrozen", 0.96144617F);
        setField(term20193, term20193.getClass(), "workHoursMap", term20254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        callMethod(klass, "setEmployeeFirstName", argTypes, term20193, args);
    }

};


