package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContactEntity_getMessage_140182601718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9193;

    public ContactEntity_getMessage_140182601718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9193 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity"));
        setField(term9193, term9193.getClass(), "contactId", null);
        setField(term9193, term9193.getClass(), "name", null);
        setField(term9193, term9193.getClass(), "phone", null);
        setField(term9193, term9193.getClass(), "email", null);
        setField(term9193, term9193.getClass(), "message", null);
        setField(term9193, term9193.getClass(), "deletedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ContactEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term9193, args);
    }

};


