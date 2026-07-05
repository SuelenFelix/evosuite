package com.alkemy.ong.infrastructure.rest.request.contact;

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
import static com.alkemy.ong.infrastructure.rest.request.contact.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateContactRequest_getMessage_5107865178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public CreateContactRequest_getMessage_5107865178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest"));
        setField(term448, term448.getClass(), "name", null);
        setField(term448, term448.getClass(), "phone", null);
        setField(term448, term448.getClass(), "email", null);
        setField(term448, term448.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term448, args);
    }

};


