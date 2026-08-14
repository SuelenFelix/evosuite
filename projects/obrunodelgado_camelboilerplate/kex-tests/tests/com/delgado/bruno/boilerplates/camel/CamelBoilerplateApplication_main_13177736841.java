package com.delgado.bruno.boilerplates.camel;

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
import static com.delgado.bruno.boilerplates.camel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CamelBoilerplateApplication_main_13177736841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;

    public CamelBoilerplateApplication_main_13177736841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = (Object[]) newArray("java.lang.String", 4);
        setElement(term322, 0, "oVcInYnLWB");
        setElement(term322, 1, "aJlieCFVtF");
        setElement(term322, 2, "ZiaGIbnzTs");
        setElement(term322, 3, "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.CamelBoilerplateApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term322;
        callMethod(klass, "main", argTypes, null, args);
    }

};


