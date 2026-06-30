package io.reactive.learning.controller;

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
import static io.reactive.learning.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class Anything_setOrigin_12539404236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;

    public Anything_setOrigin_12539404236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term544 = new HashMap();
        term507 = newInstance(Class.forName("io.reactive.learning.controller.Anything"));
        setField(term507, term507.getClass(), "url", "AijpHYOFuy");
        setField(term507, term507.getClass(), "method", "SbAoxhfrkn");
        setField(term507, term507.getClass(), "origin", "kuTXqwMtDB");
        setField(term507, term507.getClass(), "headers", term544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.reactive.learning.controller.Anything");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setOrigin", argTypes, term507, args);
    }

};


