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

public class TrackUnitProjectTask_setEmployeeId_19834161617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55336;
     Object term55367;

    public TrackUnitProjectTask_setEmployeeId_19834161617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55336 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55339 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55336, term55336.getClass(), "employeeId", 1283079251);
        setLongField(term55336, term55336.getClass(), "trackUnitId", 2354625302846375590L);
        setLongField(term55339, term55339.getClass(), "fastTime", 1490956290070L);
        setField(term55339, term55339.getClass(), "cdate", null);
        setField(term55336, term55336.getClass(), "trackUnitWorkDay", term55339);
        setIntField(term55336, term55336.getClass(), "projectId", -523949691);
        setField(term55336, term55336.getClass(), "projectName", "UuYWMTqWTV");
        setLongField(term55336, term55336.getClass(), "taskId", 7276637106827860087L);
        setField(term55336, term55336.getClass(), "taskName", "DSFGlcaXUb");
        term55367 = new Integer(1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55367;
        callMethod(klass, "setEmployeeId", argTypes, term55336, args);
    }

};


