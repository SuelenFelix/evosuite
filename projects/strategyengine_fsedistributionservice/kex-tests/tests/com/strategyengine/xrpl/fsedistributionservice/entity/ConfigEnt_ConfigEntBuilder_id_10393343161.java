package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ConfigEnt_ConfigEntBuilder_id_10393343161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250879;
     Object term250906;

    public ConfigEnt_ConfigEntBuilder_id_10393343161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term250880 = new Long(-308461294344616496L);
        term250879 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ConfigEnt$ConfigEntBuilder"));
        setField(term250879, term250879.getClass(), "id", term250880);
        setField(term250879, term250879.getClass(), "key", "dcGBEVfYLI");
        setField(term250879, term250879.getClass(), "value", "AbYQkbUCWK");
        term250906 = new Long(-6325201865655646423L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ConfigEnt$ConfigEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term250906;
        callMethod(klass, "id", argTypes, term250879, args);
    }

};


