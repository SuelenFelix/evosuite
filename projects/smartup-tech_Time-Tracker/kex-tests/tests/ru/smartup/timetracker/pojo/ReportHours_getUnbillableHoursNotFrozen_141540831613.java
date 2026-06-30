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

public class ReportHours_getUnbillableHoursNotFrozen_141540831613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19023;

    public ReportHours_getUnbillableHoursNotFrozen_141540831613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19084 = new HashMap();
        term19023 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19023, term19023.getClass(), "projectId", -1007160944);
        setField(term19023, term19023.getClass(), "projectName", "AWRooQKkdW");
        setLongField(term19023, term19023.getClass(), "taskId", -4325723315152823407L);
        setField(term19023, term19023.getClass(), "taskName", "vjxIhXHxGR");
        setIntField(term19023, term19023.getClass(), "employeeId", 1135664017);
        setField(term19023, term19023.getClass(), "employeeFirstName", "QXzGXbEXMu");
        setField(term19023, term19023.getClass(), "employeeLastName", "qxSDVejjiY");
        setFloatField(term19023, term19023.getClass(), "billableHours", 0.35686338F);
        setFloatField(term19023, term19023.getClass(), "billableHoursFrozen", 0.5804949F);
        setFloatField(term19023, term19023.getClass(), "billableHoursNotFrozen", 0.26573372F);
        setFloatField(term19023, term19023.getClass(), "unbillableHours", 0.20737511F);
        setFloatField(term19023, term19023.getClass(), "unbillableHoursFrozen", 0.1610204F);
        setFloatField(term19023, term19023.getClass(), "unbillableHoursNotFrozen", 0.791937F);
        setFloatField(term19023, term19023.getClass(), "totalHours", 0.54285216F);
        setFloatField(term19023, term19023.getClass(), "totalHoursFrozen", 0.21098667F);
        setFloatField(term19023, term19023.getClass(), "totalHoursNotFrozen", 0.24346101F);
        setField(term19023, term19023.getClass(), "workHoursMap", term19084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHoursNotFrozen", argTypes, term19023, args);
    }

};


