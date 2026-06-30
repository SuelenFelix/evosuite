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

public class TrackedProjectTaskForEmployee_hashCode_96724562514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23322;

    public TrackedProjectTaskForEmployee_hashCode_96724562514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23322 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23322, term23322.getClass(), "employeeId", -1347665717);
        setIntField(term23322, term23322.getClass(), "projectId", -1888585309);
        setField(term23322, term23322.getClass(), "projectName", "beAMpkroCQ");
        setLongField(term23322, term23322.getClass(), "taskId", -5788180182343976541L);
        setField(term23322, term23322.getClass(), "taskName", "uSUvKAyuvd");
        setBooleanField(term23322, term23322.getClass(), "billable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term23322, args);
    }

};


