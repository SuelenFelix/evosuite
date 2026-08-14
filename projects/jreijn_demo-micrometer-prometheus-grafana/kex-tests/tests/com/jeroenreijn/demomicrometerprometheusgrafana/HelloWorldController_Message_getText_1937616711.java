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

public class HelloWorldController_Message_getText_1937616711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;

    public HelloWorldController_Message_getText_1937616711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136 = newInstance(Class.forName("com.jeroenreijn.demomicrometerprometheusgrafana.HelloWorldController$Message"));
        setField(term136, term136.getClass(), "text", "SzjVpOQTyS");
        setField(term136, term136.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jeroenreijn.demomicrometerprometheusgrafana.HelloWorldController$Message");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term136, args);
    }

};


