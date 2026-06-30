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

public class Event_getAttr3_15616250377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1121;

    public Event_getAttr3_15616250377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1121 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1121, term1121.getClass(), "attr_1", "nGKItKLYNC");
        setField(term1121, term1121.getClass(), "attr_2", "UiUYnPrcCi");
        setField(term1121, term1121.getClass(), "attr_3", "UoYtihxVaS");
        setField(term1121, term1121.getClass(), "attr_4", "JDswTTCZHV");
        setField(term1121, term1121.getClass(), "attr_5", "onpbIeEKoi");
        setField(term1121, term1121.getClass(), "attr_6", "YRHGsAkhxb");
        setLongField(term1121, term1121.getClass(), "attr_7", 2535595959091595249L);
        setField(term1121, term1121.getClass(), "attr_8", "ffYhPOzlUs");
        setField(term1121, term1121.getClass(), "session_id", "MLqYREekMl");
        setLongField(term1121, term1121.getClass(), "timestamp", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_3", argTypes, term1121, args);
    }

};


