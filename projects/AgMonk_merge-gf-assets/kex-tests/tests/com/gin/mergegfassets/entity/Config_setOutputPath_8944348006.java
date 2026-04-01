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

public class Config_setOutputPath_8944348006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9621;

    public Config_setOutputPath_8944348006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9646 = new Integer(-1922583790);
        term9621 = newInstance(Class.forName("com.gin.mergegfassets.entity.Config"));
        setField(term9621, term9621.getClass(), "assetPath", "DyiXbeYIaN");
        setField(term9621, term9621.getClass(), "outputPath", "VGizxZnyHX");
        setField(term9621, term9621.getClass(), "threads", term9646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.Config");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        callMethod(klass, "setOutputPath", argTypes, term9621, args);
    }

};


