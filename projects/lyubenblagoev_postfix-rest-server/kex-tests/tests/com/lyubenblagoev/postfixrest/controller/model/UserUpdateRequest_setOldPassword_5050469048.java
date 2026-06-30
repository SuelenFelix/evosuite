package com.lyubenblagoev.postfixrest.controller.model;

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
import static com.lyubenblagoev.postfixrest.controller.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserUpdateRequest_setOldPassword_5050469048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782;

    public UserUpdateRequest_setOldPassword_5050469048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest"));
        setField(term782, term782.getClass(), "email", "Ghbwtircqb");
        setField(term782, term782.getClass(), "password", "xrwlQZdwCp");
        setField(term782, term782.getClass(), "passwordConfirmation", "IDCWpPLRkE");
        setField(term782, term782.getClass(), "oldPassword", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.controller.model.UserUpdateRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aKnKipADSo";
        callMethod(klass, "setOldPassword", argTypes, term782, args);
    }

};


