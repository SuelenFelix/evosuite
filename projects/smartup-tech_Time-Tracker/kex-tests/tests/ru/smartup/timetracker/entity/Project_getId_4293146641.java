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

public class Project_getId_4293146641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63053;

    public Project_getId_4293146641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63053 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63068 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63071 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63053, term63053.getClass(), "id", 1074848808);
        setField(term63053, term63053.getClass(), "name", "RDnkgWkcbz");
        setBooleanField(term63053, term63053.getClass(), "isArchived", false);
        setIntField(term63068, term63068.getClass(), "nanos", 547000000);
        setLongField(term63068, term63068.getClass(), "fastTime", 1406002363000L);
        setField(term63068, term63068.getClass(), "cdate", null);
        setField(term63053, term63053.getClass(), "createdDate", term63068);
        setIntField(term63071, term63071.getClass(), "nanos", 782000000);
        setLongField(term63071, term63071.getClass(), "fastTime", 1554532587000L);
        setField(term63071, term63071.getClass(), "cdate", null);
        setField(term63053, term63053.getClass(), "lastModifiedDate", term63071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term63053, args);
    }

};


