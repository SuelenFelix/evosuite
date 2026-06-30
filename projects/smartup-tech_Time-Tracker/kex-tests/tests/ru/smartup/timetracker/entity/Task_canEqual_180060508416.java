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

public class Task_canEqual_180060508416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100635;
     Object term100658;

    public Task_canEqual_180060508416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100635 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100652 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100655 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100635, term100635.getClass(), "id", -2783999800714825789L);
        setField(term100635, term100635.getClass(), "name", "DNOtiLPAIY");
        setIntField(term100635, term100635.getClass(), "projectId", -348612876);
        setBooleanField(term100635, term100635.getClass(), "billable", false);
        setBooleanField(term100635, term100635.getClass(), "isArchived", false);
        setIntField(term100652, term100652.getClass(), "nanos", 250000000);
        setLongField(term100652, term100652.getClass(), "fastTime", 1420603641000L);
        setField(term100652, term100652.getClass(), "cdate", null);
        setField(term100635, term100635.getClass(), "createdDate", term100652);
        setIntField(term100655, term100655.getClass(), "nanos", 504000000);
        setLongField(term100655, term100655.getClass(), "fastTime", 1651815003000L);
        setField(term100655, term100655.getClass(), "cdate", null);
        setField(term100635, term100635.getClass(), "lastModifiedDate", term100655);
        term100658 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100658;
        callMethod(klass, "canEqual", argTypes, term100635, args);
    }

};


