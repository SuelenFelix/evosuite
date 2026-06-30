package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class ListSlideResponse_init_15257518671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public ListSlideResponse_init_15257518671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1201 = new Integer(1135664017);
        Object term1188 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1188, term1188.getClass(), "imageUrl", "xLbjWUgOIL");
        setField(term1188, term1188.getClass(), "order", term1201);
        Integer term1206 = new Integer(590364439);
        Object term1204 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1204, term1204.getClass(), "imageUrl", "");
        setField(term1204, term1204.getClass(), "order", term1206);
        Integer term1210 = new Integer(865208305);
        Object term1209 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1209, term1209.getClass(), "imageUrl", null);
        setField(term1209, term1209.getClass(), "order", term1210);
        term1185 = new LinkedList();
        ((LinkedList) term1185).add(term1188);
        ((LinkedList) term1185).add(term1204);
        ((LinkedList) term1185).add(term1209);
        ((LinkedList) term1185).add((Object)null);
        ((LinkedList) term1185).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.ListSlideResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1185;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


