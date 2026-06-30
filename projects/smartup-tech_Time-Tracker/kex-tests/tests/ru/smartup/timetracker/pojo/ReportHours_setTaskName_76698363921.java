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

public class ReportHours_setTaskName_76698363921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19945;

    public ReportHours_setTaskName_76698363921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20006 = new HashMap();
        term19945 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19945, term19945.getClass(), "projectId", 767834723);
        setField(term19945, term19945.getClass(), "projectName", "pXOkjyeIRb");
        setLongField(term19945, term19945.getClass(), "taskId", -2585684163342970173L);
        setField(term19945, term19945.getClass(), "taskName", "GgZWSjxjyE");
        setIntField(term19945, term19945.getClass(), "employeeId", -602026508);
        setField(term19945, term19945.getClass(), "employeeFirstName", "EeBVbzjcCI");
        setField(term19945, term19945.getClass(), "employeeLastName", "UfQtPRyWRC");
        setFloatField(term19945, term19945.getClass(), "billableHours", 0.23081815F);
        setFloatField(term19945, term19945.getClass(), "billableHoursFrozen", 0.88196456F);
        setFloatField(term19945, term19945.getClass(), "billableHoursNotFrozen", 0.8818646F);
        setFloatField(term19945, term19945.getClass(), "unbillableHours", 0.5412182F);
        setFloatField(term19945, term19945.getClass(), "unbillableHoursFrozen", 0.5584653F);
        setFloatField(term19945, term19945.getClass(), "unbillableHoursNotFrozen", 0.16988689F);
        setFloatField(term19945, term19945.getClass(), "totalHours", 0.026718378F);
        setFloatField(term19945, term19945.getClass(), "totalHoursFrozen", 0.39286935F);
        setFloatField(term19945, term19945.getClass(), "totalHoursNotFrozen", 0.13618106F);
        setField(term19945, term19945.getClass(), "workHoursMap", term20006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WHcwFgsGFC";
        callMethod(klass, "setTaskName", argTypes, term19945, args);
    }

};


