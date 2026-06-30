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
import java.lang.Object;
import java.lang.Integer;

public class TrackUnitProjectTask_setProjectId_211759386410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55495;
     Object term55526;

    public TrackUnitProjectTask_setProjectId_211759386410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55495 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55498 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55495, term55495.getClass(), "employeeId", -1002370457);
        setLongField(term55495, term55495.getClass(), "trackUnitId", 1667122142089513324L);
        setLongField(term55498, term55498.getClass(), "fastTime", 1570714321079L);
        setField(term55498, term55498.getClass(), "cdate", null);
        setField(term55495, term55495.getClass(), "trackUnitWorkDay", term55498);
        setIntField(term55495, term55495.getClass(), "projectId", -2014576105);
        setField(term55495, term55495.getClass(), "projectName", "UDlkdccCRn");
        setLongField(term55495, term55495.getClass(), "taskId", -6342139649364011743L);
        setField(term55495, term55495.getClass(), "taskName", "McpzErOcYb");
        term55526 = new Integer(1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55526;
        callMethod(klass, "setProjectId", argTypes, term55495, args);
    }

};


