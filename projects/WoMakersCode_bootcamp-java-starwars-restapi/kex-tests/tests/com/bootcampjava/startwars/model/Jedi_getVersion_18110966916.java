package com.bootcampjava.startwars.model;

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
import static com.bootcampjava.startwars.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Jedi_getVersion_18110966916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;

    public Jedi_getVersion_18110966916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term157 = new Integer(-1922583790);
        term156 = newInstance(Class.forName("com.bootcampjava.startwars.model.Jedi"));
        setField(term156, term156.getClass(), "id", term157);
        setField(term156, term156.getClass(), "name", "SzjVpOQTyS");
        setIntField(term156, term156.getClass(), "strength", -1339778481);
        setIntField(term156, term156.getClass(), "version", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bootcampjava.startwars.model.Jedi");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term156, args);
    }

};


