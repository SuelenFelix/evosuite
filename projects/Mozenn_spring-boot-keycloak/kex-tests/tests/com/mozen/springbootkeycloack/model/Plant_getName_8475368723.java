package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_getName_8475368723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public Plant_getName_8475368723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140 = new Long(6375119433582206027L);
        term139 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term178 = newInstance(Class.forName("java.time.Instant"));
        setField(term139, term139.getClass(), "id", term140);
        setField(term139, term139.getClass(), "name", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "scientificName", "MjGYSRKTNF");
        setField(term139, term139.getClass(), "family", "hRNSzYYIrc");
        setLongField(term178, term178.getClass(), "seconds", 1775105656L);
        setIntField(term178, term178.getClass(), "nanos", 751452000);
        setField(term139, term139.getClass(), "createdAt", term178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term139, args);
    }

};


