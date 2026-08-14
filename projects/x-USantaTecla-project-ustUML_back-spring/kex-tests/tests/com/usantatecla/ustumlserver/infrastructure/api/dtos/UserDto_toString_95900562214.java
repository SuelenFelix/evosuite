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

public class UserDto_toString_95900562214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14875;

    public UserDto_toString_95900562214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14960 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term14959 = ((Class) term14960).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term14959).setAccessible(true);
        Object enum32 = ((Field) term14959).get((Object) null);
        term14875 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto"));
        setField(term14875, term14875.getClass(), "name", "mLUZFTfjle");
        setField(term14875, term14875.getClass(), "email", "xIeFjkHkOe");
        setField(term14875, term14875.getClass(), "password", "SdCKLMIYnX");
        setField(term14875, term14875.getClass(), "role", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.UserDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14875, args);
    }

};


