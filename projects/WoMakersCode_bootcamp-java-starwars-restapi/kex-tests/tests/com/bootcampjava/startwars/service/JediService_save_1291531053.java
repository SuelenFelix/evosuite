package com.bootcampjava.startwars.service;

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
import static com.bootcampjava.startwars.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class JediService_save_1291531053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public JediService_save_1291531053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4 = new Integer(568599855);
        term3 = newInstance(Class.forName("com.bootcampjava.startwars.model.Jedi"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setIntField(term3, term3.getClass(), "strength", 1162663216);
        setIntField(term3, term3.getClass(), "version", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bootcampjava.startwars.service.JediService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bootcampjava.startwars.model.Jedi");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "save", argTypes, null, args);
    }

};


