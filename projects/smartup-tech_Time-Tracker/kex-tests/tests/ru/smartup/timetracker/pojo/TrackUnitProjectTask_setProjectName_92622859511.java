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

public class TrackUnitProjectTask_setProjectName_92622859511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55548;

    public TrackUnitProjectTask_setProjectName_92622859511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55548 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55551 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55548, term55548.getClass(), "employeeId", 628918458);
        setLongField(term55548, term55548.getClass(), "trackUnitId", -4924950707540628022L);
        setLongField(term55551, term55551.getClass(), "fastTime", 1531331402053L);
        setField(term55551, term55551.getClass(), "cdate", null);
        setField(term55548, term55548.getClass(), "trackUnitWorkDay", term55551);
        setIntField(term55548, term55548.getClass(), "projectId", -1274456137);
        setField(term55548, term55548.getClass(), "projectName", "jqrVEUvYEz");
        setLongField(term55548, term55548.getClass(), "taskId", -4393710401270724527L);
        setField(term55548, term55548.getClass(), "taskName", "QITgiBrmfj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXxkiXgQnq";
        callMethod(klass, "setProjectName", argTypes, term55548, args);
    }

};


