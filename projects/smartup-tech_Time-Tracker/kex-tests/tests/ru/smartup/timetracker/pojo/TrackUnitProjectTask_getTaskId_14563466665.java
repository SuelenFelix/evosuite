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

public class TrackUnitProjectTask_getTaskId_14563466665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55234;

    public TrackUnitProjectTask_getTaskId_14563466665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55234 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55237 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55234, term55234.getClass(), "employeeId", 1830648570);
        setLongField(term55234, term55234.getClass(), "trackUnitId", -8033714905181142681L);
        setLongField(term55237, term55237.getClass(), "fastTime", 1663413767651L);
        setField(term55237, term55237.getClass(), "cdate", null);
        setField(term55234, term55234.getClass(), "trackUnitWorkDay", term55237);
        setIntField(term55234, term55234.getClass(), "projectId", -227365013);
        setField(term55234, term55234.getClass(), "projectName", "PSizQDoxxe");
        setLongField(term55234, term55234.getClass(), "taskId", -9040825890007374809L);
        setField(term55234, term55234.getClass(), "taskName", "mKaHyMybrK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term55234, args);
    }

};


