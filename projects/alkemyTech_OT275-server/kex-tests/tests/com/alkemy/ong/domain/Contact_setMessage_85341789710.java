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

public class Contact_setMessage_85341789710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11619;

    public Contact_setMessage_85341789710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11620 = new Long(9174730812791817537L);
        term11619 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11619, term11619.getClass(), "id", term11620);
        setField(term11619, term11619.getClass(), "name", "rzoDGjHkzG");
        setField(term11619, term11619.getClass(), "phone", "NsphHxYiuC");
        setField(term11619, term11619.getClass(), "email", "XYJztkznbY");
        setField(term11619, term11619.getClass(), "message", "NeTiWVoyjZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CGeclMyIOP";
        callMethod(klass, "setMessage", argTypes, term11619, args);
    }

};


