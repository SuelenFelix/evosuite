package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Long;
import java.lang.Integer;

public class ListSlideMapper_toResponse_16353273930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term98;

    public ListSlideMapper_toResponse_16353273930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.ListSlideMapper"));
        Object term97 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideMapper"));
        setField(term96, term96.getClass(), "slideMapper", term97);
        Long term102 = new Long(6375119433582206027L);
        Integer term116 = new Integer(1162663216);
        Object term101 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term101, term101.getClass(), "id", term102);
        setField(term101, term101.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term101, term101.getClass(), "order", term116);
        setField(term101, term101.getClass(), "text", "EGtDIRbSSb");
        setField(term101, term101.getClass(), "base64FileEncoded", "SzjVpOQTyS");
        setField(term101, term101.getClass(), "contentType", "MjGYSRKTNF");
        Long term156 = new Long(-8257434502486459194L);
        Integer term159 = new Integer(1484323161);
        Object term155 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term155, term155.getClass(), "id", term156);
        setField(term155, term155.getClass(), "imageUrl", "");
        setField(term155, term155.getClass(), "order", term159);
        setField(term155, term155.getClass(), "text", "");
        setField(term155, term155.getClass(), "base64FileEncoded", "");
        setField(term155, term155.getClass(), "contentType", "");
        Long term166 = new Long(-8400487765614892086L);
        Integer term168 = new Integer(391863371);
        Object term165 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term165, term165.getClass(), "id", term166);
        setField(term165, term165.getClass(), "imageUrl", null);
        setField(term165, term165.getClass(), "order", term168);
        setField(term165, term165.getClass(), "text", null);
        setField(term165, term165.getClass(), "base64FileEncoded", null);
        setField(term165, term165.getClass(), "contentType", null);
        term98 = new LinkedList();
        ((LinkedList) term98).add(term101);
        ((LinkedList) term98).add(term155);
        ((LinkedList) term98).add(term165);
        ((LinkedList) term98).add((Object)null);
        ((LinkedList) term98).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.ListSlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "toResponse", argTypes, term96, args);
    }

};


