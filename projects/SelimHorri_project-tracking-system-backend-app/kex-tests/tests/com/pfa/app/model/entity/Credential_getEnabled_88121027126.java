package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Credential_getEnabled_88121027126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40892;

    public Credential_getEnabled_88121027126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40892 = newInstance(Class.forName("com.pfa.app.model.entity.Credential"));
        setField(term40892, term40892.getClass(), "credentialId", null);
        setField(term40892, term40892.getClass(), "username", null);
        setField(term40892, term40892.getClass(), "password", null);
        setField(term40892, term40892.getClass(), "enabled", null);
        setField(term40892, term40892.getClass(), "role", null);
        setField(term40892, term40892.getClass(), "employee", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Credential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term40892, args);
    }

};


