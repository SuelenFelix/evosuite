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

public class Task_setArchived_72064413112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100494;
     Object term100517;

    public Task_setArchived_72064413112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100494 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100511 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100514 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100494, term100494.getClass(), "id", -7278883608542636188L);
        setField(term100494, term100494.getClass(), "name", "pxokrVaeMd");
        setIntField(term100494, term100494.getClass(), "projectId", -1385748168);
        setBooleanField(term100494, term100494.getClass(), "billable", true);
        setBooleanField(term100494, term100494.getClass(), "isArchived", true);
        setIntField(term100511, term100511.getClass(), "nanos", 540000000);
        setLongField(term100511, term100511.getClass(), "fastTime", 1469110231000L);
        setField(term100511, term100511.getClass(), "cdate", null);
        setField(term100494, term100494.getClass(), "createdDate", term100511);
        setIntField(term100514, term100514.getClass(), "nanos", 634000000);
        setLongField(term100514, term100514.getClass(), "fastTime", 1722582116000L);
        setField(term100514, term100514.getClass(), "cdate", null);
        setField(term100494, term100494.getClass(), "lastModifiedDate", term100514);
        term100517 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100517;
        callMethod(klass, "setArchived", argTypes, term100494, args);
    }

};


