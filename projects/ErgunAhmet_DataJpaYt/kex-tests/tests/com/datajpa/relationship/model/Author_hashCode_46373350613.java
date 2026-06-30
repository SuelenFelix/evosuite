package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Author_hashCode_46373350613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3954;

    public Author_hashCode_46373350613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3955 = new Long(-8892586408602479513L);
        Long term3970 = new Long(4616440478358528406L);
        Long term3985 = new Long(3427570961451840069L);
        ArrayList term3999 = new ArrayList();
        term3954 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3969 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3984 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3954, term3954.getClass(), "id", term3955);
        setField(term3954, term3954.getClass(), "name", "vwbEQQNQrx");
        setField(term3969, term3969.getClass(), "id", term3970);
        setField(term3969, term3969.getClass(), "name", "xtftXXMbem");
        setField(term3984, term3984.getClass(), "id", term3985);
        setField(term3984, term3984.getClass(), "name", "cudZvLMQon");
        setField(term3969, term3969.getClass(), "city", term3984);
        setField(term3954, term3954.getClass(), "zipcode", term3969);
        setField(term3954, term3954.getClass(), "books", term3999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3954, args);
    }

};


