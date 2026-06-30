package com.alkemy.ong.infrastructure.rest.request.user;

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
import static com.alkemy.ong.infrastructure.rest.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateUserRequest_getPassword_12360750008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712;

    public UpdateUserRequest_getPassword_12360750008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest"));
        setField(term712, term712.getClass(), "firstName", "AijpHYOFuy");
        setField(term712, term712.getClass(), "lastName", "SbAoxhfrkn");
        setField(term712, term712.getClass(), "imageUrl", "kuTXqwMtDB");
        setField(term712, term712.getClass(), "password", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term712, args);
    }

};


