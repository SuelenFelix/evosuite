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

public class Position_canEqual_176951322414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108631;
     Object term108653;

    public Position_canEqual_176951322414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108631 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108647 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108650 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108631, term108631.getClass(), "id", 872295704);
        setField(term108631, term108631.getClass(), "name", "pqFUMTCKJd");
        setFloatField(term108631, term108631.getClass(), "externalRate", 0.15917838F);
        setBooleanField(term108631, term108631.getClass(), "isArchived", false);
        setIntField(term108647, term108647.getClass(), "nanos", 206000000);
        setLongField(term108647, term108647.getClass(), "fastTime", 1842595015000L);
        setField(term108647, term108647.getClass(), "cdate", null);
        setField(term108631, term108631.getClass(), "createdDate", term108647);
        setIntField(term108650, term108650.getClass(), "nanos", 389000000);
        setLongField(term108650, term108650.getClass(), "fastTime", 1425751725000L);
        setField(term108650, term108650.getClass(), "cdate", null);
        setField(term108631, term108631.getClass(), "lastModifiedDate", term108650);
        term108653 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108653;
        callMethod(klass, "canEqual", argTypes, term108631, args);
    }

};


