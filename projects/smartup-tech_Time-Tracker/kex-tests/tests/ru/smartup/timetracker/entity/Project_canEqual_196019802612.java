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

public class Project_canEqual_196019802612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63427;
     Object term63448;

    public Project_canEqual_196019802612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63427 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63442 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63445 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63427, term63427.getClass(), "id", -1332748804);
        setField(term63427, term63427.getClass(), "name", "JeZFtaqkzW");
        setBooleanField(term63427, term63427.getClass(), "isArchived", false);
        setIntField(term63442, term63442.getClass(), "nanos", 55000000);
        setLongField(term63442, term63442.getClass(), "fastTime", 1831163148000L);
        setField(term63442, term63442.getClass(), "cdate", null);
        setField(term63427, term63427.getClass(), "createdDate", term63442);
        setIntField(term63445, term63445.getClass(), "nanos", 341000000);
        setLongField(term63445, term63445.getClass(), "fastTime", 1373113661000L);
        setField(term63445, term63445.getClass(), "cdate", null);
        setField(term63427, term63427.getClass(), "lastModifiedDate", term63445);
        term63448 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63448;
        callMethod(klass, "canEqual", argTypes, term63427, args);
    }

};


