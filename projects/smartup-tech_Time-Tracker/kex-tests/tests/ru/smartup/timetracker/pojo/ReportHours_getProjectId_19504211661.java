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

public class ReportHours_getProjectId_19504211661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17679;

    public ReportHours_getProjectId_19504211661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17740 = new HashMap();
        term17679 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term17679, term17679.getClass(), "projectId", 568599855);
        setField(term17679, term17679.getClass(), "projectName", "gGSMzuGICf");
        setLongField(term17679, term17679.getClass(), "taskId", 2442117782898005296L);
        setField(term17679, term17679.getClass(), "taskName", "hxCBltsObl");
        setIntField(term17679, term17679.getClass(), "employeeId", 1162663216);
        setField(term17679, term17679.getClass(), "employeeFirstName", "BndsHwAFMv");
        setField(term17679, term17679.getClass(), "employeeLastName", "GzFkzHGYFt");
        setFloatField(term17679, term17679.getClass(), "billableHours", 0.09123778F);
        setFloatField(term17679, term17679.getClass(), "billableHoursFrozen", 0.5523636F);
        setFloatField(term17679, term17679.getClass(), "billableHoursNotFrozen", 0.8564069F);
        setFloatField(term17679, term17679.getClass(), "unbillableHours", 0.5446086F);
        setFloatField(term17679, term17679.getClass(), "unbillableHoursFrozen", 0.5254275F);
        setFloatField(term17679, term17679.getClass(), "unbillableHoursNotFrozen", 0.2857073F);
        setFloatField(term17679, term17679.getClass(), "totalHours", 0.6880585F);
        setFloatField(term17679, term17679.getClass(), "totalHoursFrozen", 0.40176582F);
        setFloatField(term17679, term17679.getClass(), "totalHoursNotFrozen", 0.8783184F);
        setField(term17679, term17679.getClass(), "workHoursMap", term17740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term17679, args);
    }

};


