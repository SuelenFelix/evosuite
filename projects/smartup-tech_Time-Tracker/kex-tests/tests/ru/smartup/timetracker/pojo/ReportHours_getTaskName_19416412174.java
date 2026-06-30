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

public class ReportHours_getTaskName_19416412174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18015;

    public ReportHours_getTaskName_19416412174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18076 = new HashMap();
        term18015 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18015, term18015.getClass(), "projectId", -1955890973);
        setField(term18015, term18015.getClass(), "projectName", "MLqYREekMl");
        setLongField(term18015, term18015.getClass(), "taskId", -8400487765614892086L);
        setField(term18015, term18015.getClass(), "taskName", "ytSBIKXogI");
        setIntField(term18015, term18015.getClass(), "employeeId", -2038273078);
        setField(term18015, term18015.getClass(), "employeeFirstName", "nHXjMycHlU");
        setField(term18015, term18015.getClass(), "employeeLastName", "ieCtQFdkii");
        setFloatField(term18015, term18015.getClass(), "billableHours", 0.95272815F);
        setFloatField(term18015, term18015.getClass(), "billableHoursFrozen", 0.7254646F);
        setFloatField(term18015, term18015.getClass(), "billableHoursNotFrozen", 0.9828442F);
        setFloatField(term18015, term18015.getClass(), "unbillableHours", 0.9472605F);
        setFloatField(term18015, term18015.getClass(), "unbillableHoursFrozen", 0.27797186F);
        setFloatField(term18015, term18015.getClass(), "unbillableHoursNotFrozen", 0.7467328F);
        setFloatField(term18015, term18015.getClass(), "totalHours", 0.6436713F);
        setFloatField(term18015, term18015.getClass(), "totalHoursFrozen", 0.89057696F);
        setFloatField(term18015, term18015.getClass(), "totalHoursNotFrozen", 0.7332741F);
        setField(term18015, term18015.getClass(), "workHoursMap", term18076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term18015, args);
    }

};


