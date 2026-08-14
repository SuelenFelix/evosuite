package com.coreoz.windmill.imports;

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
import static com.coreoz.windmill.imports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class FileSchema_init_2955418470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term774;

    public FileSchema_init_2955418470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term774 = new LinkedList();
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
        ((LinkedList) term774).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.FileSchema");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term774;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


