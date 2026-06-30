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

public class Contact_setId_6003792546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11187;
     Object term11238;

    public Contact_setId_6003792546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11188 = new Long(6273670659288205855L);
        term11187 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11187, term11187.getClass(), "id", term11188);
        setField(term11187, term11187.getClass(), "name", "zzsdNZhejE");
        setField(term11187, term11187.getClass(), "phone", "ILoodMZrgR");
        setField(term11187, term11187.getClass(), "email", "XQiKmsCacK");
        setField(term11187, term11187.getClass(), "message", "cTCixEbHYT");
        term11238 = new Long(-4776514981294468834L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11238;
        callMethod(klass, "setId", argTypes, term11187, args);
    }

};


