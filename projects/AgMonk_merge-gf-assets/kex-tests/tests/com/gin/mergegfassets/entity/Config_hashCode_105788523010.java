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

public class Config_hashCode_105788523010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9835;

    public Config_hashCode_105788523010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9860 = new Integer(-1339778481);
        term9835 = newInstance(Class.forName("com.gin.mergegfassets.entity.Config"));
        setField(term9835, term9835.getClass(), "assetPath", "vKQukfbJUd");
        setField(term9835, term9835.getClass(), "outputPath", "lFRJFUMVbx");
        setField(term9835, term9835.getClass(), "threads", term9860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.entity.Config");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term9835, args);
    }

};


