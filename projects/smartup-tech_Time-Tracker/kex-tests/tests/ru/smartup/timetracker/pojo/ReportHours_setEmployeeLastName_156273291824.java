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

public class ReportHours_setEmployeeLastName_156273291824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20327;

    public ReportHours_setEmployeeLastName_156273291824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20388 = new HashMap();
        term20327 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20327, term20327.getClass(), "projectId", 579005622);
        setField(term20327, term20327.getClass(), "projectName", "VeDtgDzGAN");
        setLongField(term20327, term20327.getClass(), "taskId", 2486810210675247493L);
        setField(term20327, term20327.getClass(), "taskName", "aWYOWZFyaX");
        setIntField(term20327, term20327.getClass(), "employeeId", -14890619);
        setField(term20327, term20327.getClass(), "employeeFirstName", "BRIVNtfUWU");
        setField(term20327, term20327.getClass(), "employeeLastName", "DbiCVtPPCT");
        setFloatField(term20327, term20327.getClass(), "billableHours", 0.6862936F);
        setFloatField(term20327, term20327.getClass(), "billableHoursFrozen", 0.18780023F);
        setFloatField(term20327, term20327.getClass(), "billableHoursNotFrozen", 0.12764448F);
        setFloatField(term20327, term20327.getClass(), "unbillableHours", 0.8254093F);
        setFloatField(term20327, term20327.getClass(), "unbillableHoursFrozen", 0.39446723F);
        setFloatField(term20327, term20327.getClass(), "unbillableHoursNotFrozen", 0.21836233F);
        setFloatField(term20327, term20327.getClass(), "totalHours", 0.78659093F);
        setFloatField(term20327, term20327.getClass(), "totalHoursFrozen", 0.5037956F);
        setFloatField(term20327, term20327.getClass(), "totalHoursNotFrozen", 0.06587154F);
        setField(term20327, term20327.getClass(), "workHoursMap", term20388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PapWxkhEWe";
        callMethod(klass, "setEmployeeLastName", argTypes, term20327, args);
    }

};


