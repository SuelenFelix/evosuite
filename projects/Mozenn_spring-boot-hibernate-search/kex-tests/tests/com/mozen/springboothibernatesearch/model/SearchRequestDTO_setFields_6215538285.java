package com.mozen.springboothibernatesearch.model;

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
import static com.mozen.springboothibernatesearch.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class SearchRequestDTO_setFields_6215538285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1296;
     Object term1314;

    public SearchRequestDTO_setFields_6215538285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1309 = new ArrayList();
        term1296 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO"));
        setField(term1296, term1296.getClass(), "text", "JDswTTCZHV");
        setField(term1296, term1296.getClass(), "fields", term1309);
        setIntField(term1296, term1296.getClass(), "limit", -1922583790);
        term1314 = new LinkedList();
        ((LinkedList) term1314).add("onpbIeEKoi");
        ((LinkedList) term1314).add("YRHGsAkhxb");
        ((LinkedList) term1314).add("");
        ((LinkedList) term1314).add((Object)null);
        ((LinkedList) term1314).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1314;
        callMethod(klass, "setFields", argTypes, term1296, args);
    }

};


