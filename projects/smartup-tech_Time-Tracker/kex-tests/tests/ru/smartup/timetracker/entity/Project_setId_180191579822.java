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
import java.lang.Integer;

public class Project_setId_180191579822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63538;
     Object term63541;

    public Project_setId_180191579822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63538 = newInstance(Class.forName("ru.smartup.timetracker.entity.Project"));
        setIntField(term63538, term63538.getClass(), "id", 0);
        setField(term63538, term63538.getClass(), "name", null);
        setBooleanField(term63538, term63538.getClass(), "isArchived", false);
        setField(term63538, term63538.getClass(), "createdDate", null);
        setField(term63538, term63538.getClass(), "lastModifiedDate", null);
        term63541 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63541;
        callMethod(klass, "setId", argTypes, term63538, args);
    }

};


