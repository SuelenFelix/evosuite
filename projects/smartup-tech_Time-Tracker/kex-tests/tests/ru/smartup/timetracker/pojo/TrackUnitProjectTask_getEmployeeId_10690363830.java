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

public class TrackUnitProjectTask_getEmployeeId_10690363830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54979;

    public TrackUnitProjectTask_getEmployeeId_10690363830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54979 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term54982 = newInstance(Class.forName("java.util.Date"));
        setIntField(term54979, term54979.getClass(), "employeeId", 1555897383);
        setLongField(term54979, term54979.getClass(), "trackUnitId", -2177368829816872572L);
        setLongField(term54982, term54982.getClass(), "fastTime", 1276505397937L);
        setField(term54982, term54982.getClass(), "cdate", null);
        setField(term54979, term54979.getClass(), "trackUnitWorkDay", term54982);
        setIntField(term54979, term54979.getClass(), "projectId", 202001407);
        setField(term54979, term54979.getClass(), "projectName", "SqjyKmayBx");
        setLongField(term54979, term54979.getClass(), "taskId", -8463029266761149071L);
        setField(term54979, term54979.getClass(), "taskName", "XjDhvToxJy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term54979, args);
    }

};


