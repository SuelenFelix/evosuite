package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideEntity_setImageUrl_3105333755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15860;

    public SlideEntity_setImageUrl_3105333755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15861 = new Long(8802866251294305945L);
        Integer term15887 = new Integer(-616727354);
        term15860 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term15860, term15860.getClass(), "slideId", term15861);
        setField(term15860, term15860.getClass(), "imageUrl", "vpZIqpFbKM");
        setField(term15860, term15860.getClass(), "text", "dAbwpJCDif");
        setField(term15860, term15860.getClass(), "position", term15887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ATSXJPySio";
        callMethod(klass, "setImageUrl", argTypes, term15860, args);
    }

};


