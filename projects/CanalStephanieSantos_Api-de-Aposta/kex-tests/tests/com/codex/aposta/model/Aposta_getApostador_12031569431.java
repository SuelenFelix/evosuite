package com.codex.aposta.model;

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
import static com.codex.aposta.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Aposta_getApostador_12031569431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587;

    public Aposta_getApostador_12031569431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601 = new Long(6967924379644551255L);
        term587 = newInstance(Class.forName("com.codex.aposta.model.Aposta"));
        Object term600 = newInstance(Class.forName("com.codex.aposta.model.Apostador"));
        setField(term587, term587.getClass(), "numeroAposta", "vrQLuWIDJX");
        setField(term600, term600.getClass(), "id", term601);
        setField(term600, term600.getClass(), "nome", "flxyYxBRtu");
        setField(term600, term600.getClass(), "email", "OclPbYPkcH");
        setField(term587, term587.getClass(), "apostador", term600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.model.Aposta");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApostador", argTypes, term587, args);
    }

};


