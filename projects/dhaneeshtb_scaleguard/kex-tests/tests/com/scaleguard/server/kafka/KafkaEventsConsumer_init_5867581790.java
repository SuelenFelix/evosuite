package com.scaleguard.server.kafka;

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
import static com.scaleguard.server.kafka.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class KafkaEventsConsumer_init_5867581790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;

    public KafkaEventsConsumer_init_5867581790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361 = new LinkedList();
        ((LinkedList) term361).add("ZiaGIbnzTs");
        ((LinkedList) term361).add("tbcdzjIfER");
        ((LinkedList) term361).add("");
        ((LinkedList) term361).add((Object)null);
        ((LinkedList) term361).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.kafka.KafkaEventsConsumer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "oVcInYnLWB";
        args[1] = "aJlieCFVtF";
        args[2] = term361;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


