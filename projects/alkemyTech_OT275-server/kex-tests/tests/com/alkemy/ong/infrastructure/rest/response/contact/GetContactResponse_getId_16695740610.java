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

public class GetContactResponse_getId_16695740610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term849;

    public GetContactResponse_getId_16695740610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term849 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse"));
        setField(term849, term849.getClass(), "id", null);
        setField(term849, term849.getClass(), "name", null);
        setField(term849, term849.getClass(), "phone", null);
        setField(term849, term849.getClass(), "email", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.contact.GetContactResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term849, args);
    }

};


