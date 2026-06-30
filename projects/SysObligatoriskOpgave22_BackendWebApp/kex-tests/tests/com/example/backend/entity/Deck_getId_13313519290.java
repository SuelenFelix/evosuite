package com.example.backend.entity;

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
import static com.example.backend.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Deck_getId_13313519290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19777;

    public Deck_getId_13313519290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19778 = new Long(-6900715686580158779L);
        ArrayList term19804 = new ArrayList();
        term19777 = newInstance(Class.forName("com.example.backend.entity.Deck"));
        setField(term19777, term19777.getClass(), "id", term19778);
        setField(term19777, term19777.getClass(), "name", "ZEXFoMSKeG");
        setField(term19777, term19777.getClass(), "description", "HvxahUfZcJ");
        setField(term19777, term19777.getClass(), "paoCards", term19804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.backend.entity.Deck");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term19777, args);
    }

};


