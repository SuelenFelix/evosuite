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

public class Contact_getMessage_16648989215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11096;

    public Contact_getMessage_16648989215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11097 = new Long(6351887424140565471L);
        term11096 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11096, term11096.getClass(), "id", term11097);
        setField(term11096, term11096.getClass(), "name", "sRzUJLYMmB");
        setField(term11096, term11096.getClass(), "phone", "XxILklSDwz");
        setField(term11096, term11096.getClass(), "email", "TLjhFZbwKO");
        setField(term11096, term11096.getClass(), "message", "nxEbLIApFc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term11096, args);
    }

};


