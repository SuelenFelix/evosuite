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
import java.util.LinkedList;

public class News_init_208386857312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19483;
     Object term19521;
     Object term19560;

    public News_init_208386857312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19483 = new Long(3233502115953753827L);
        Long term19522 = new Long(-308461294344616496L);
        term19521 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term19521, term19521.getClass(), "id", term19522);
        setField(term19521, term19521.getClass(), "name", "tUKcXglBlG");
        setField(term19521, term19521.getClass(), "description", "ZGptycjjRq");
        setField(term19521, term19521.getClass(), "imageUrl", "kXJaxapFer");
        term19560 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.alkemy.ong.domain.Category");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = term19483;
        args[1] = "jieMNXAAbL";
        args[2] = "NbmTxmqOjh";
        args[3] = "rLDmBbcLaC";
        args[4] = term19521;
        args[5] = term19560;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


