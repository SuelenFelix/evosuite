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

public class ReportHours_setUnbillableHoursNotFrozen_124129467030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21031;
     Object term21103;

    public ReportHours_setUnbillableHoursNotFrozen_124129467030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21092 = new HashMap();
        term21031 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21031, term21031.getClass(), "projectId", 1596070772);
        setField(term21031, term21031.getClass(), "projectName", "sZdUNdggUW");
        setLongField(term21031, term21031.getClass(), "taskId", 6855071767938501807L);
        setField(term21031, term21031.getClass(), "taskName", "OqbwYQfvAe");
        setIntField(term21031, term21031.getClass(), "employeeId", 97029295);
        setField(term21031, term21031.getClass(), "employeeFirstName", "tRxZafjqIx");
        setField(term21031, term21031.getClass(), "employeeLastName", "DhjNLmRMCu");
        setFloatField(term21031, term21031.getClass(), "billableHours", 0.9698374F);
        setFloatField(term21031, term21031.getClass(), "billableHoursFrozen", 0.04640019F);
        setFloatField(term21031, term21031.getClass(), "billableHoursNotFrozen", 0.7216883F);
        setFloatField(term21031, term21031.getClass(), "unbillableHours", 0.9123573F);
        setFloatField(term21031, term21031.getClass(), "unbillableHoursFrozen", 0.07144344F);
        setFloatField(term21031, term21031.getClass(), "unbillableHoursNotFrozen", 0.4063537F);
        setFloatField(term21031, term21031.getClass(), "totalHours", 0.46776146F);
        setFloatField(term21031, term21031.getClass(), "totalHoursFrozen", 0.47720432F);
        setFloatField(term21031, term21031.getClass(), "totalHoursNotFrozen", 0.2877797F);
        setField(term21031, term21031.getClass(), "workHoursMap", term21092);
        term21103 = new Float(0.24465042F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term21103;
        callMethod(klass, "setUnbillableHoursNotFrozen", argTypes, term21031, args);
    }

};


