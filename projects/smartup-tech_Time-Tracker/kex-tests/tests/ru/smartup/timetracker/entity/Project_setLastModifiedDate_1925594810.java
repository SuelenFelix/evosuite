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

public class Project_setLastModifiedDate_1925594810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63361;
     Object term63382;

    public Project_setLastModifiedDate_1925594810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63361 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63376 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63379 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63361, term63361.getClass(), "id", -1268314569);
        setField(term63361, term63361.getClass(), "name", "RCOqfVsRHt");
        setBooleanField(term63361, term63361.getClass(), "isArchived", true);
        setIntField(term63376, term63376.getClass(), "nanos", 602000000);
        setLongField(term63376, term63376.getClass(), "fastTime", 1854275018000L);
        setField(term63376, term63376.getClass(), "cdate", null);
        setField(term63361, term63361.getClass(), "createdDate", term63376);
        setIntField(term63379, term63379.getClass(), "nanos", 188000000);
        setLongField(term63379, term63379.getClass(), "fastTime", 1330516243000L);
        setField(term63379, term63379.getClass(), "cdate", null);
        setField(term63361, term63361.getClass(), "lastModifiedDate", term63379);
        term63382 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63382, term63382.getClass(), "nanos", 362000000);
        setLongField(term63382, term63382.getClass(), "fastTime", 1755122284000L);
        setField(term63382, term63382.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term63382;
        callMethod(klass, "setLastModifiedDate", argTypes, term63361, args);
    }

};


