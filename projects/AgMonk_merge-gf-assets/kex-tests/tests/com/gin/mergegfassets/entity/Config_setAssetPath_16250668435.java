package com.gin.mergegfassets.entity;

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
import static com.gin.mergegfassets.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Config_setAssetPath_16250668435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9552;

    public Config_setAssetPath_16250668435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9577 = new Integer(391863371);
        term9552 = newInstance(Class.forName("com.gin.mergegfassets.entity.Config"));
        setField(term9552, term9552.getClass(), "assetPath", "JmcmxoGhIK");
        setField(term9552, term9552.getClass(), "outputPath", "jXzmYyrnnT");
        setField(term9552, term9552.getClass(), "threads", term9577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.Config");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "igCAtimmYB";
        callMethod(klass, "setAssetPath", argTypes, term9552, args);
    }

};


