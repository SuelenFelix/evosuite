package ru.smartup.timetracker.entity.field.pk;

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
import static ru.smartup.timetracker.entity.field.pk.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TrackedProjectTaskPK_canEqual_20693076698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1770;

    public TrackedProjectTaskPK_canEqual_20693076698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1770 = newInstance(Class.forName("ru.smartup.timetracker.entity.field.pk.TrackedProjectTaskPK"));
        setIntField(term1770, term1770.getClass(), "employeeId", 0);
        setLongField(term1770, term1770.getClass(), "taskId", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.pk.TrackedProjectTaskPK");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term1770, args);
    }

};


