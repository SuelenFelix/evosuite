package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Contact_setName_11826090097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11280;

    public Contact_setName_11826090097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11281 = new Long(-7273680182770718108L);
        term11280 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11280, term11280.getClass(), "id", term11281);
        setField(term11280, term11280.getClass(), "name", "bqKksqtAdT");
        setField(term11280, term11280.getClass(), "phone", "jAIAdEmULK");
        setField(term11280, term11280.getClass(), "email", "EuAshkmbna");
        setField(term11280, term11280.getClass(), "message", "JwQlbBbGJR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HdWLwfVsAM";
        callMethod(klass, "setName", argTypes, term11280, args);
    }

};


