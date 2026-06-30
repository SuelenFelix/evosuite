package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Activity_setImageUrl_17045274918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6534;

    public Activity_setImageUrl_17045274918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6535 = new Long(-5386201758403679145L);
        term6534 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6534, term6534.getClass(), "id", term6535);
        setField(term6534, term6534.getClass(), "content", "awDQVEVIKi");
        setField(term6534, term6534.getClass(), "imageUrl", "HJwNgUzZZR");
        setField(term6534, term6534.getClass(), "name", "FvUCZgTXhq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wWWidPCHzx";
        callMethod(klass, "setImageUrl", argTypes, term6534, args);
    }

};


