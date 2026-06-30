package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.LinkedList;

public class Author_init_13131537650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2748;
     Object term2778;

    public Author_init_13131537650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2749 = new Long(1084801489398441516L);
        Long term2764 = new Long(6273754186658578034L);
        term2748 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term2763 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term2748, term2748.getClass(), "id", term2749);
        setField(term2748, term2748.getClass(), "name", "xIeFjkHkOe");
        setField(term2763, term2763.getClass(), "id", term2764);
        setField(term2763, term2763.getClass(), "name", "SdCKLMIYnX");
        setField(term2748, term2748.getClass(), "city", term2763);
        term2778 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.datajpa.relationship.model.Zipcode");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "mLUZFTfjle";
        args[1] = term2748;
        args[2] = term2778;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


