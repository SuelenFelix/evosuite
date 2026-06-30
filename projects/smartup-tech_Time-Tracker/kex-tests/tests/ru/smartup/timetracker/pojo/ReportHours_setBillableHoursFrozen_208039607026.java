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

public class ReportHours_setBillableHoursFrozen_208039607026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20575;
     Object term20647;

    public ReportHours_setBillableHoursFrozen_208039607026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20636 = new HashMap();
        term20575 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20575, term20575.getClass(), "projectId", -1786399638);
        setField(term20575, term20575.getClass(), "projectName", "rLHAoqXgPh");
        setLongField(term20575, term20575.getClass(), "taskId", -7672528020740371001L);
        setField(term20575, term20575.getClass(), "taskName", "zUlRdimJtU");
        setIntField(term20575, term20575.getClass(), "employeeId", 2055867847);
        setField(term20575, term20575.getClass(), "employeeFirstName", "vwbEQQNQrx");
        setField(term20575, term20575.getClass(), "employeeLastName", "xtftXXMbem");
        setFloatField(term20575, term20575.getClass(), "billableHours", 0.2958501F);
        setFloatField(term20575, term20575.getClass(), "billableHoursFrozen", 0.73301786F);
        setFloatField(term20575, term20575.getClass(), "billableHoursNotFrozen", 0.7997349F);
        setFloatField(term20575, term20575.getClass(), "unbillableHours", 0.76181644F);
        setFloatField(term20575, term20575.getClass(), "unbillableHoursFrozen", 0.24343538F);
        setFloatField(term20575, term20575.getClass(), "unbillableHoursNotFrozen", 0.7385589F);
        setFloatField(term20575, term20575.getClass(), "totalHours", 0.8736398F);
        setFloatField(term20575, term20575.getClass(), "totalHoursFrozen", 0.7080134F);
        setFloatField(term20575, term20575.getClass(), "totalHoursNotFrozen", 0.74126697F);
        setField(term20575, term20575.getClass(), "workHoursMap", term20636);
        term20647 = new Float(0.60597336F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term20647;
        callMethod(klass, "setBillableHoursFrozen", argTypes, term20575, args);
    }

};


