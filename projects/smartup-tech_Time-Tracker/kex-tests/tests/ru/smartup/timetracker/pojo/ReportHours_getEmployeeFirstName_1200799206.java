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

public class ReportHours_getEmployeeFirstName_1200799206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18239;

    public ReportHours_getEmployeeFirstName_1200799206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18300 = new HashMap();
        term18239 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18239, term18239.getClass(), "projectId", 1725571209);
        setField(term18239, term18239.getClass(), "projectName", "TJmVBGfTML");
        setLongField(term18239, term18239.getClass(), "taskId", 7411271909051562686L);
        setField(term18239, term18239.getClass(), "taskName", "tPlsykYBqO");
        setIntField(term18239, term18239.getClass(), "employeeId", -522618178);
        setField(term18239, term18239.getClass(), "employeeFirstName", "bLPjGVBhlX");
        setField(term18239, term18239.getClass(), "employeeLastName", "whBvTVIIlC");
        setFloatField(term18239, term18239.getClass(), "billableHours", 0.13481021F);
        setFloatField(term18239, term18239.getClass(), "billableHoursFrozen", 0.996533F);
        setFloatField(term18239, term18239.getClass(), "billableHoursNotFrozen", 0.38000882F);
        setFloatField(term18239, term18239.getClass(), "unbillableHours", 0.10577053F);
        setFloatField(term18239, term18239.getClass(), "unbillableHoursFrozen", 0.5840714F);
        setFloatField(term18239, term18239.getClass(), "unbillableHoursNotFrozen", 0.478669F);
        setFloatField(term18239, term18239.getClass(), "totalHours", 0.75592405F);
        setFloatField(term18239, term18239.getClass(), "totalHoursFrozen", 0.068145275F);
        setFloatField(term18239, term18239.getClass(), "totalHoursNotFrozen", 0.10667074F);
        setField(term18239, term18239.getClass(), "workHoursMap", term18300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeFirstName", argTypes, term18239, args);
    }

};


