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

public class Project_setName_7847078617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63241;

    public Project_setName_7847078617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63241 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        Object term63256 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term63259 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term63241, term63241.getClass(), "id", 1922684808);
        setField(term63241, term63241.getClass(), "name", "TXyHhqeCjR");
        setBooleanField(term63241, term63241.getClass(), "isArchived", true);
        setIntField(term63256, term63256.getClass(), "nanos", 107000000);
        setLongField(term63256, term63256.getClass(), "fastTime", 1482193476000L);
        setField(term63256, term63256.getClass(), "cdate", null);
        setField(term63241, term63241.getClass(), "createdDate", term63256);
        setIntField(term63259, term63259.getClass(), "nanos", 540000000);
        setLongField(term63259, term63259.getClass(), "fastTime", 1268660877000L);
        setField(term63259, term63259.getClass(), "cdate", null);
        setField(term63241, term63241.getClass(), "lastModifiedDate", term63259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lZIgPZPgTu";
        callMethod(klass, "setName", argTypes, term63241, args);
    }

};


