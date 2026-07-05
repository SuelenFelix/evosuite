package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Category_setImageUrl_12292274049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15724;

    public Category_setImageUrl_12292274049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15725 = new Long(-1365372122034008688L);
        term15724 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term15724, term15724.getClass(), "id", term15725);
        setField(term15724, term15724.getClass(), "name", "jLgzxtuvVo");
        setField(term15724, term15724.getClass(), "description", "wmmxjOkPnH");
        setField(term15724, term15724.getClass(), "imageUrl", "jgRohUQWxJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CJlAiZDIQO";
        callMethod(klass, "setImageUrl", argTypes, term15724, args);
    }

};


