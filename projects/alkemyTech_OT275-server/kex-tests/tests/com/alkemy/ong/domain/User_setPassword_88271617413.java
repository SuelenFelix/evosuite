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
import java.lang.Object;

public class User_setPassword_88271617413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21887;

    public User_setPassword_88271617413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21888 = new Long(-1572808624189549793L);
        Long term21951 = new Long(-6151316713456472560L);
        term21887 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term21950 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term21887, term21887.getClass(), "id", term21888);
        setField(term21887, term21887.getClass(), "firstName", "zIAIXHeKXt");
        setField(term21887, term21887.getClass(), "lastName", "fVkSkOqFEO");
        setField(term21887, term21887.getClass(), "email", "DLfgyAqDDu");
        setField(term21887, term21887.getClass(), "password", "ryuQaXtwNj");
        setField(term21887, term21887.getClass(), "imageUrl", "OutjKNDSgR");
        setField(term21950, term21950.getClass(), "id", term21951);
        setField(term21950, term21950.getClass(), "name", "brfLLGXcwA");
        setField(term21950, term21950.getClass(), "description", "zoVKwYYMOI");
        setField(term21887, term21887.getClass(), "role", term21950);
        setField(term21887, term21887.getClass(), "token", "DGCeQsmIOU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "otcpSHwkzG";
        callMethod(klass, "setPassword", argTypes, term21887, args);
    }

};


