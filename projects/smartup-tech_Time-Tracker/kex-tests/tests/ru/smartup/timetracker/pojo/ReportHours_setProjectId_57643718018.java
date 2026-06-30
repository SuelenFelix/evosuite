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

public class ReportHours_setProjectId_57643718018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19583;
     Object term19655;

    public ReportHours_setProjectId_57643718018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19644 = new HashMap();
        term19583 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19583, term19583.getClass(), "projectId", 1193880199);
        setField(term19583, term19583.getClass(), "projectName", "mLUZFTfjle");
        setLongField(term19583, term19583.getClass(), "taskId", 5127676408959197577L);
        setField(term19583, term19583.getClass(), "taskName", "xIeFjkHkOe");
        setIntField(term19583, term19583.getClass(), "employeeId", -1087774327);
        setField(term19583, term19583.getClass(), "employeeFirstName", "SdCKLMIYnX");
        setField(term19583, term19583.getClass(), "employeeLastName", "OJJtVNPyKZ");
        setFloatField(term19583, term19583.getClass(), "billableHours", 0.42623103F);
        setFloatField(term19583, term19583.getClass(), "billableHoursFrozen", 0.94706243F);
        setFloatField(term19583, term19583.getClass(), "billableHoursNotFrozen", 0.0027298927F);
        setFloatField(term19583, term19583.getClass(), "unbillableHours", 0.45478272F);
        setFloatField(term19583, term19583.getClass(), "unbillableHoursFrozen", 0.29874015F);
        setFloatField(term19583, term19583.getClass(), "unbillableHoursNotFrozen", 0.8780084F);
        setFloatField(term19583, term19583.getClass(), "totalHours", 0.32554477F);
        setFloatField(term19583, term19583.getClass(), "totalHoursFrozen", 0.053365767F);
        setFloatField(term19583, term19583.getClass(), "totalHoursNotFrozen", 0.8924855F);
        setField(term19583, term19583.getClass(), "workHoursMap", term19644);
        term19655 = new Integer(-1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19655;
        callMethod(klass, "setProjectId", argTypes, term19583, args);
    }

};


