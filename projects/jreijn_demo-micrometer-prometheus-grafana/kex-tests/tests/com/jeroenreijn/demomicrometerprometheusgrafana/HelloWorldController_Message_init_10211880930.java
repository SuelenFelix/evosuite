package com.jeroenreijn.demomicrometerprometheusgrafana;

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
import static com.jeroenreijn.demomicrometerprometheusgrafana.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HelloWorldController_Message_init_10211880930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public HelloWorldController_Message_init_10211880930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("com.jeroenreijn.demomicrometerprometheusgrafana.HelloWorldController"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jeroenreijn.demomicrometerprometheusgrafana.HelloWorldController$Message");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.jeroenreijn.demomicrometerprometheusgrafana.HelloWorldController");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term113;
        args[1] = "EGtDIRbSSb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


