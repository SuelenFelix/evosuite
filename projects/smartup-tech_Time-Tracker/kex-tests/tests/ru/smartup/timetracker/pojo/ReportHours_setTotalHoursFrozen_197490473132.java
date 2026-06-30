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

public class ReportHours_setTotalHoursFrozen_197490473132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21259;
     Object term21331;

    public ReportHours_setTotalHoursFrozen_197490473132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21320 = new HashMap();
        term21259 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21259, term21259.getClass(), "projectId", 1225272962);
        setField(term21259, term21259.getClass(), "projectName", "nhoHrZfnIN");
        setLongField(term21259, term21259.getClass(), "taskId", 5262507301787091109L);
        setField(term21259, term21259.getClass(), "taskName", "ZkMALXpEAZ");
        setIntField(term21259, term21259.getClass(), "employeeId", 1324040357);
        setField(term21259, term21259.getClass(), "employeeFirstName", "tXfQjSqDzN");
        setField(term21259, term21259.getClass(), "employeeLastName", "BjugTaMcxJ");
        setFloatField(term21259, term21259.getClass(), "billableHours", 0.9712829F);
        setFloatField(term21259, term21259.getClass(), "billableHoursFrozen", 0.65841657F);
        setFloatField(term21259, term21259.getClass(), "billableHoursNotFrozen", 0.09628683F);
        setFloatField(term21259, term21259.getClass(), "unbillableHours", 0.4426849F);
        setFloatField(term21259, term21259.getClass(), "unbillableHoursFrozen", 0.27164584F);
        setFloatField(term21259, term21259.getClass(), "unbillableHoursNotFrozen", 0.75073326F);
        setFloatField(term21259, term21259.getClass(), "totalHours", 0.6590957F);
        setFloatField(term21259, term21259.getClass(), "totalHoursFrozen", 0.0074937344F);
        setFloatField(term21259, term21259.getClass(), "totalHoursNotFrozen", 0.41169226F);
        setField(term21259, term21259.getClass(), "workHoursMap", term21320);
        term21331 = new Float(0.29172552F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term21331;
        callMethod(klass, "setTotalHoursFrozen", argTypes, term21259, args);
    }

};


