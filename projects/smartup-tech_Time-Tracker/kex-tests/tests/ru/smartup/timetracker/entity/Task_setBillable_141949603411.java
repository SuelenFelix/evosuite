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
import java.lang.Object;
import java.lang.Boolean;

public class Task_setBillable_141949603411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100459;
     Object term100482;

    public Task_setBillable_141949603411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100459 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100476 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100479 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100459, term100459.getClass(), "id", -8649738738252714180L);
        setField(term100459, term100459.getClass(), "name", "ZwKmasCVIy");
        setIntField(term100459, term100459.getClass(), "projectId", 1543696412);
        setBooleanField(term100459, term100459.getClass(), "billable", true);
        setBooleanField(term100459, term100459.getClass(), "isArchived", true);
        setIntField(term100476, term100476.getClass(), "nanos", 376000000);
        setLongField(term100476, term100476.getClass(), "fastTime", 1660570212000L);
        setField(term100476, term100476.getClass(), "cdate", null);
        setField(term100459, term100459.getClass(), "createdDate", term100476);
        setIntField(term100479, term100479.getClass(), "nanos", 275000000);
        setLongField(term100479, term100479.getClass(), "fastTime", 1482545887000L);
        setField(term100479, term100479.getClass(), "cdate", null);
        setField(term100459, term100459.getClass(), "lastModifiedDate", term100479);
        term100482 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100482;
        callMethod(klass, "setBillable", argTypes, term100459, args);
    }

};


