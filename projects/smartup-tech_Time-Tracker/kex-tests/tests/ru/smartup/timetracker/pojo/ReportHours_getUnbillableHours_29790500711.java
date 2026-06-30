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

public class ReportHours_getUnbillableHours_29790500711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18799;

    public ReportHours_getUnbillableHours_29790500711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18860 = new HashMap();
        term18799 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18799, term18799.getClass(), "projectId", -655067527);
        setField(term18799, term18799.getClass(), "projectName", "GVizqqzXpy");
        setLongField(term18799, term18799.getClass(), "taskId", -2813493605142626659L);
        setField(term18799, term18799.getClass(), "taskName", "JqXGgAhZPl");
        setIntField(term18799, term18799.getClass(), "employeeId", -6029667);
        setField(term18799, term18799.getClass(), "employeeFirstName", "jiKYgYHqIS");
        setField(term18799, term18799.getClass(), "employeeLastName", "DfISiziTgG");
        setFloatField(term18799, term18799.getClass(), "billableHours", 0.91971004F);
        setFloatField(term18799, term18799.getClass(), "billableHoursFrozen", 0.21924508F);
        setFloatField(term18799, term18799.getClass(), "billableHoursNotFrozen", 0.10338366F);
        setFloatField(term18799, term18799.getClass(), "unbillableHours", 0.75913525F);
        setFloatField(term18799, term18799.getClass(), "unbillableHoursFrozen", 0.7059082F);
        setFloatField(term18799, term18799.getClass(), "unbillableHoursNotFrozen", 0.791695F);
        setFloatField(term18799, term18799.getClass(), "totalHours", 0.07096106F);
        setFloatField(term18799, term18799.getClass(), "totalHoursFrozen", 0.6862221F);
        setFloatField(term18799, term18799.getClass(), "totalHoursNotFrozen", 0.5602794F);
        setField(term18799, term18799.getClass(), "workHoursMap", term18860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHours", argTypes, term18799, args);
    }

};


