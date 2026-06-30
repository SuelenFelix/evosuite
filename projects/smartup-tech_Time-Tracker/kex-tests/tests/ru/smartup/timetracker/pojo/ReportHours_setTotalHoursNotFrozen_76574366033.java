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

public class ReportHours_setTotalHoursNotFrozen_76574366033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21373;
     Object term21445;

    public ReportHours_setTotalHoursNotFrozen_76574366033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21434 = new HashMap();
        term21373 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21373, term21373.getClass(), "projectId", -1588772968);
        setField(term21373, term21373.getClass(), "projectName", "tlzpzIjMib");
        setLongField(term21373, term21373.getClass(), "taskId", -6823727938421990489L);
        setField(term21373, term21373.getClass(), "taskName", "AZdLeSugwv");
        setIntField(term21373, term21373.getClass(), "employeeId", -93135961);
        setField(term21373, term21373.getClass(), "employeeFirstName", "RMsXuyzKJV");
        setField(term21373, term21373.getClass(), "employeeLastName", "FwPbDZcHmB");
        setFloatField(term21373, term21373.getClass(), "billableHours", 0.13375676F);
        setFloatField(term21373, term21373.getClass(), "billableHoursFrozen", 0.9276995F);
        setFloatField(term21373, term21373.getClass(), "billableHoursNotFrozen", 0.8521579F);
        setFloatField(term21373, term21373.getClass(), "unbillableHours", 0.76361305F);
        setFloatField(term21373, term21373.getClass(), "unbillableHoursFrozen", 0.98857903F);
        setFloatField(term21373, term21373.getClass(), "unbillableHoursNotFrozen", 0.07901633F);
        setFloatField(term21373, term21373.getClass(), "totalHours", 0.8018383F);
        setFloatField(term21373, term21373.getClass(), "totalHoursFrozen", 0.18717843F);
        setFloatField(term21373, term21373.getClass(), "totalHoursNotFrozen", 0.017911553F);
        setField(term21373, term21373.getClass(), "workHoursMap", term21434);
        term21445 = new Float(0.53359526F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term21445;
        callMethod(klass, "setTotalHoursNotFrozen", argTypes, term21373, args);
    }

};


