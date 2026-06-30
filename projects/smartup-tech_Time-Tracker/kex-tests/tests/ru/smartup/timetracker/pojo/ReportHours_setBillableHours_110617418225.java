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

public class ReportHours_setBillableHours_110617418225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20461;
     Object term20533;

    public ReportHours_setBillableHours_110617418225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20522 = new HashMap();
        term20461 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20461, term20461.getClass(), "projectId", 1632125673);
        setField(term20461, term20461.getClass(), "projectName", "smnHEqRFRx");
        setLongField(term20461, term20461.getClass(), "taskId", 7009926388951271268L);
        setField(term20461, term20461.getClass(), "taskName", "XYtryyobou");
        setIntField(term20461, term20461.getClass(), "employeeId", 454281060);
        setField(term20461, term20461.getClass(), "employeeFirstName", "OYbzXylRWW");
        setField(term20461, term20461.getClass(), "employeeLastName", "DSNsTGYXDF");
        setFloatField(term20461, term20461.getClass(), "billableHours", 0.20511848F);
        setFloatField(term20461, term20461.getClass(), "billableHoursFrozen", 0.08659977F);
        setFloatField(term20461, term20461.getClass(), "billableHoursNotFrozen", 0.22873008F);
        setFloatField(term20461, term20461.getClass(), "unbillableHours", 0.96286476F);
        setFloatField(term20461, term20461.getClass(), "unbillableHoursFrozen", 0.9824895F);
        setFloatField(term20461, term20461.getClass(), "unbillableHoursNotFrozen", 0.62323177F);
        setFloatField(term20461, term20461.getClass(), "totalHours", 0.59315026F);
        setFloatField(term20461, term20461.getClass(), "totalHoursFrozen", 0.09037483F);
        setFloatField(term20461, term20461.getClass(), "totalHoursNotFrozen", 0.39231926F);
        setField(term20461, term20461.getClass(), "workHoursMap", term20522);
        term20533 = new Float(0.6561919F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term20533;
        callMethod(klass, "setBillableHours", argTypes, term20461, args);
    }

};


