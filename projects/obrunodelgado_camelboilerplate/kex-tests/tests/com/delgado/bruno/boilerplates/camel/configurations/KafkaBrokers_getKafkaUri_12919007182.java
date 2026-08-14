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

public class KafkaBrokers_getKafkaUri_12919007182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public KafkaBrokers_getKafkaUri_12919007182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term206 = new ArrayList();
        ((ArrayList) term206).add("RMFIsYGgne");
        ((ArrayList) term206).add("NRdvgJlhkX");
        ((ArrayList) term206).add("uuaPigETmJ");
        term205 = newInstance(Class.forName("com.delgado.bruno.boilerplates.camel.configurations.KafkaBrokers"));
        setField(term205, term205.getClass(), "brokers", term206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.delgado.bruno.boilerplates.camel.configurations.KafkaBrokers");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "MxlszYVzRf";
        args[1] = "LQFpaHEwXR";
        callMethod(klass, "getKafkaUri", argTypes, term205, args);
    }

};


