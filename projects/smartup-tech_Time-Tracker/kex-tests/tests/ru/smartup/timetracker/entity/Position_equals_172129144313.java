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

public class Position_equals_172129144313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108598;
     Object term108620;

    public Position_equals_172129144313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108598 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108614 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108617 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108598, term108598.getClass(), "id", 993627098);
        setField(term108598, term108598.getClass(), "name", "asMqnMNrZp");
        setFloatField(term108598, term108598.getClass(), "externalRate", 0.5602794F);
        setBooleanField(term108598, term108598.getClass(), "isArchived", false);
        setIntField(term108614, term108614.getClass(), "nanos", 131000000);
        setLongField(term108614, term108614.getClass(), "fastTime", 1431586737000L);
        setField(term108614, term108614.getClass(), "cdate", null);
        setField(term108598, term108598.getClass(), "createdDate", term108614);
        setIntField(term108617, term108617.getClass(), "nanos", 310000000);
        setLongField(term108617, term108617.getClass(), "fastTime", 1417932721000L);
        setField(term108617, term108617.getClass(), "cdate", null);
        setField(term108598, term108598.getClass(), "lastModifiedDate", term108617);
        term108620 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108620;
        callMethod(klass, "equals", argTypes, term108598, args);
    }

};


