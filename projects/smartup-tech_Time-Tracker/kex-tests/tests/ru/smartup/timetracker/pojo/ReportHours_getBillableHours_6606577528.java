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

public class ReportHours_getBillableHours_6606577528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18463;

    public ReportHours_getBillableHours_6606577528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18524 = new HashMap();
        term18463 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18463, term18463.getClass(), "projectId", 1585847225);
        setField(term18463, term18463.getClass(), "projectName", "vQVyKLdtaz");
        setLongField(term18463, term18463.getClass(), "taskId", 6811161968424632369L);
        setField(term18463, term18463.getClass(), "taskName", "OWKQODBLzb");
        setIntField(term18463, term18463.getClass(), "employeeId", 597278769);
        setField(term18463, term18463.getClass(), "employeeFirstName", "wGmYcqUkgE");
        setField(term18463, term18463.getClass(), "employeeLastName", "idgaQsnJpQ");
        setFloatField(term18463, term18463.getClass(), "billableHours", 0.63008493F);
        setFloatField(term18463, term18463.getClass(), "billableHoursFrozen", 0.97831506F);
        setFloatField(term18463, term18463.getClass(), "billableHoursNotFrozen", 0.9737084F);
        setFloatField(term18463, term18463.getClass(), "unbillableHours", 0.21723765F);
        setFloatField(term18463, term18463.getClass(), "unbillableHoursFrozen", 0.06688923F);
        setFloatField(term18463, term18463.getClass(), "unbillableHoursNotFrozen", 0.22417867F);
        setFloatField(term18463, term18463.getClass(), "totalHours", 0.35872674F);
        setFloatField(term18463, term18463.getClass(), "totalHoursFrozen", 0.2946385F);
        setFloatField(term18463, term18463.getClass(), "totalHoursNotFrozen", 0.07802445F);
        setField(term18463, term18463.getClass(), "workHoursMap", term18524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHours", argTypes, term18463, args);
    }

};


