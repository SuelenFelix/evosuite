package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TrackedProjectTask_setEmployeeId_8455630671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100835;
     Object term100838;

    public TrackedProjectTask_setEmployeeId_8455630671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100835 = newInstance(Class.forName("ru.smartup.timetracker.entity.TrackedProjectTask"));
        setIntField(term100835, term100835.getClass(), "employeeId", 1163761623);
        setLongField(term100835, term100835.getClass(), "taskId", -8121849829073967555L);
        term100838 = new Integer(718742281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackedProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100838;
        callMethod(klass, "setEmployeeId", argTypes, term100835, args);
    }

};


