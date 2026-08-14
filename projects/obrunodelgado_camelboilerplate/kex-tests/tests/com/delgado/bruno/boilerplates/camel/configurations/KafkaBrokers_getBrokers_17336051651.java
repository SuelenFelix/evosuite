package com.delgado.bruno.boilerplates.camel.configurations;

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
import static com.delgado.bruno.boilerplates.camel.configurations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class KafkaBrokers_getBrokers_17336051651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public KafkaBrokers_getBrokers_17336051651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113 = new ArrayList();
        ((ArrayList) term113).add("EGtDIRbSSb");
        ((ArrayList) term113).add("SzjVpOQTyS");
        ((ArrayList) term113).add("MjGYSRKTNF");
        ((ArrayList) term113).add("hRNSzYYIrc");
        term112 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.configurations.KafkaBrokers"));
        setField(term112, term112.getClass(), "brokers", term113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.configurations.KafkaBrokers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBrokers", argTypes, term112, args);
    }

};


