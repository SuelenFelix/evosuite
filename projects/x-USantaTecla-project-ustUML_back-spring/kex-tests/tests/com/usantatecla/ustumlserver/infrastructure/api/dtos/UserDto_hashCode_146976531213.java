package com.usantatecla.ustumlserver.infrastructure.api.dtos;

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
import static com.usantatecla.ustumlserver.infrastructure.api.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class UserDto_hashCode_146976531213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14515;

    public UserDto_hashCode_146976531213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14600 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term14599 = ((Class) term14600).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term14599).setAccessible(true);
        Object enum31 = ((Field) term14599).get((Object) null);
        term14515 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term14515, term14515.getClass(), "name", "AdxvLJhNLe");
        setField(term14515, term14515.getClass(), "email", "lHfTrWKMPk");
        setField(term14515, term14515.getClass(), "password", "JDaAnsVTGV");
        setField(term14515, term14515.getClass(), "role", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14515, args);
    }

};


