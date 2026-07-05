package com.alkemy.ong.infrastructure.rest.response.testimonial;

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
import static com.alkemy.ong.infrastructure.rest.response.testimonial.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ListTestimonialResponse_init_15215607990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;

    public ListTestimonialResponse_init_15215607990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term701 = new Long(-2813493605142626659L);
        Object term700 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term700, term700.getClass(), "id", term701);
        setField(term700, term700.getClass(), "name", "OWDIEULEFu");
        setField(term700, term700.getClass(), "content", "dWRymuLBtr");
        setField(term700, term700.getClass(), "imageUrl", "AijpHYOFuy");
        Long term741 = new Long(-8885298608300233488L);
        Object term740 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term740, term740.getClass(), "id", term741);
        setField(term740, term740.getClass(), "name", "");
        setField(term740, term740.getClass(), "content", "");
        setField(term740, term740.getClass(), "imageUrl", "");
        Long term748 = new Long(-4325723315152823407L);
        Object term747 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.GetTestimonialResponse"));
        setField(term747, term747.getClass(), "id", term748);
        setField(term747, term747.getClass(), "name", null);
        setField(term747, term747.getClass(), "content", null);
        setField(term747, term747.getClass(), "imageUrl", null);
        term697 = new LinkedList();
        ((LinkedList) term697).add(term700);
        ((LinkedList) term697).add(term740);
        ((LinkedList) term697).add(term747);
        ((LinkedList) term697).add((Object)null);
        ((LinkedList) term697).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.testimonial.ListTestimonialResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term697;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


