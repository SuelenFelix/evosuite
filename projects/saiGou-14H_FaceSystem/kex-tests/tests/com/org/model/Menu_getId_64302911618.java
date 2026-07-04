package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Menu_getId_64302911618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47298;

    public Menu_getId_64302911618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47298 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term47298, term47298.getClass(), "id", null);
        setField(term47298, term47298.getClass(), "name", null);
        setField(term47298, term47298.getClass(), "path", null);
        setField(term47298, term47298.getClass(), "parentId", null);
        setField(term47298, term47298.getClass(), "icon", null);
        setField(term47298, term47298.getClass(), "introduce", null);
        setField(term47298, term47298.getClass(), "children", null);
        setField(term47298, term47298.getClass(), "meta", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Menu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term47298, args);
    }

};


