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

public class ReportHours_getProjectName_7179789052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17791;

    public ReportHours_getProjectName_7179789052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17852 = new HashMap();
        term17791 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term17791, term17791.getClass(), "projectId", 1484323161);
        setField(term17791, term17791.getClass(), "projectName", "LvtrsXUliU");
        setLongField(term17791, term17791.getClass(), "taskId", 6375119433582206027L);
        setField(term17791, term17791.getClass(), "taskName", "xLbjWUgOIL");
        setIntField(term17791, term17791.getClass(), "employeeId", 391863371);
        setField(term17791, term17791.getClass(), "employeeFirstName", "jDtqGUpnZN");
        setField(term17791, term17791.getClass(), "employeeLastName", "nGKItKLYNC");
        setFloatField(term17791, term17791.getClass(), "billableHours", 0.26413453F);
        setFloatField(term17791, term17791.getClass(), "billableHoursFrozen", 0.7944024F);
        setFloatField(term17791, term17791.getClass(), "billableHoursNotFrozen", 0.3692338F);
        setFloatField(term17791, term17791.getClass(), "unbillableHours", 0.13906479F);
        setFloatField(term17791, term17791.getClass(), "unbillableHoursFrozen", 0.6076495F);
        setFloatField(term17791, term17791.getClass(), "unbillableHoursNotFrozen", 0.6608425F);
        setFloatField(term17791, term17791.getClass(), "totalHours", 0.37773192F);
        setFloatField(term17791, term17791.getClass(), "totalHoursFrozen", 0.24413109F);
        setFloatField(term17791, term17791.getClass(), "totalHoursNotFrozen", 0.8474802F);
        setField(term17791, term17791.getClass(), "workHoursMap", term17852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term17791, args);
    }

};


