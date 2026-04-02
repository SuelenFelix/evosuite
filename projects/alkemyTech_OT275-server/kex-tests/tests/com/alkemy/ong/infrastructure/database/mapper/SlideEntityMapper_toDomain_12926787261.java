package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class SlideEntityMapper_toDomain_12926787261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;
     Object term512;

    public SlideEntityMapper_toDomain_12926787261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper"));
        Long term516 = new Long(6967924379644551255L);
        Integer term542 = new Integer(568599855);
        Object term515 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term515, term515.getClass(), "slideId", term516);
        setField(term515, term515.getClass(), "imageUrl", "kuTXqwMtDB");
        setField(term515, term515.getClass(), "text", "Ghbwtircqb");
        setField(term515, term515.getClass(), "position", term542);
        Long term546 = new Long(-2813493605142626659L);
        Integer term550 = new Integer(1162663216);
        Object term545 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term545, term545.getClass(), "slideId", term546);
        setField(term545, term545.getClass(), "imageUrl", "");
        setField(term545, term545.getClass(), "text", "");
        setField(term545, term545.getClass(), "position", term550);
        Long term554 = new Long(-8885298608300233488L);
        Integer term556 = new Integer(1484323161);
        Object term553 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term553, term553.getClass(), "slideId", term554);
        setField(term553, term553.getClass(), "imageUrl", null);
        setField(term553, term553.getClass(), "text", null);
        setField(term553, term553.getClass(), "position", term556);
        term512 = new LinkedList();
        ((LinkedList) term512).add(term515);
        ((LinkedList) term512).add(term545);
        ((LinkedList) term512).add(term553);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
        ((LinkedList) term512).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "toDomain", argTypes, term511, args);
    }

};


