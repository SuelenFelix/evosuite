package com.amazonaws.kda.flink.starterkit;

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
import static com.amazonaws.kda.flink.starterkit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Event_getAttr5_156162311511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881;

    public Event_getAttr5_156162311511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1881 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1881, term1881.getClass(), "attr_1", "cAPeiZHKGJ");
        setField(term1881, term1881.getClass(), "attr_2", "LvJFtLBaxj");
        setField(term1881, term1881.getClass(), "attr_3", "PHvxnGHptP");
        setField(term1881, term1881.getClass(), "attr_4", "TimdotUuNC");
        setField(term1881, term1881.getClass(), "attr_5", "PkWMRdJcBb");
        setField(term1881, term1881.getClass(), "attr_6", "jSpAteRute");
        setLongField(term1881, term1881.getClass(), "attr_7", -2585684163342970173L);
        setField(term1881, term1881.getClass(), "attr_8", "swZVeJAxjt");
        setField(term1881, term1881.getClass(), "session_id", "xOcJIiQQDu");
        setLongField(term1881, term1881.getClass(), "timestamp", 8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_5", argTypes, term1881, args);
    }

};


