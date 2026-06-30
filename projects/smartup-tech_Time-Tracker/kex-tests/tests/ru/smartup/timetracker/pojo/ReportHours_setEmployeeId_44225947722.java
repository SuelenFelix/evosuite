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
import java.lang.Integer;

public class ReportHours_setEmployeeId_44225947722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20079;
     Object term20151;

    public ReportHours_setEmployeeId_44225947722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20140 = new HashMap();
        term20079 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term20079, term20079.getClass(), "projectId", -157887805);
        setField(term20079, term20079.getClass(), "projectName", "HzqpegHiRq");
        setLongField(term20079, term20079.getClass(), "taskId", 8059786003080744426L);
        setField(term20079, term20079.getClass(), "taskName", "jwsfVjMoJT");
        setIntField(term20079, term20079.getClass(), "employeeId", 1876565163);
        setField(term20079, term20079.getClass(), "employeeFirstName", "ZfdXfCCFDf");
        setField(term20079, term20079.getClass(), "employeeLastName", "MwwjNtdOFT");
        setFloatField(term20079, term20079.getClass(), "billableHours", 0.11577946F);
        setFloatField(term20079, term20079.getClass(), "billableHoursFrozen", 0.55778444F);
        setFloatField(term20079, term20079.getClass(), "billableHoursNotFrozen", 0.5617009F);
        setFloatField(term20079, term20079.getClass(), "unbillableHours", 0.6716574F);
        setFloatField(term20079, term20079.getClass(), "unbillableHoursFrozen", 0.090670586F);
        setFloatField(term20079, term20079.getClass(), "unbillableHoursNotFrozen", 0.54697996F);
        setFloatField(term20079, term20079.getClass(), "totalHours", 0.268304F);
        setFloatField(term20079, term20079.getClass(), "totalHoursFrozen", 0.6116407F);
        setFloatField(term20079, term20079.getClass(), "totalHoursNotFrozen", 0.71719724F);
        setField(term20079, term20079.getClass(), "workHoursMap", term20140);
        term20151 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20151;
        callMethod(klass, "setEmployeeId", argTypes, term20079, args);
    }

};


