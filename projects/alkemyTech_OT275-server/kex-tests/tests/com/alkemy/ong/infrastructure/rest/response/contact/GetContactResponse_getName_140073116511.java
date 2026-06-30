package com.alkemy.ong.infrastructure.rest.response.contact;

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
import static com.alkemy.ong.infrastructure.rest.response.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetContactResponse_getName_140073116511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850;

    public GetContactResponse_getName_140073116511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term850 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term850, term850.getClass(), "id", null);
        setField(term850, term850.getClass(), "name", null);
        setField(term850, term850.getClass(), "phone", null);
        setField(term850, term850.getClass(), "email", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term850, args);
    }

};


