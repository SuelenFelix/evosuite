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

public class CreateContactRequest_getPhone_18931860526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public CreateContactRequest_getPhone_18931860526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest"));
        setField(term446, term446.getClass(), "name", null);
        setField(term446, term446.getClass(), "phone", null);
        setField(term446, term446.getClass(), "email", null);
        setField(term446, term446.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.contact.CreateContactRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term446, args);
    }

};


