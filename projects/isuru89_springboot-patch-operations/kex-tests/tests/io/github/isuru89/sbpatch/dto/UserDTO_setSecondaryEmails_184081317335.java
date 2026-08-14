package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDTO_setSecondaryEmails_184081317335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4665;

    public UserDTO_setSecondaryEmails_184081317335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4665 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term4665, term4665.getClass(), "id", null);
        setField(term4665, term4665.getClass(), "userName", null);
        setField(term4665, term4665.getClass(), "firstName", null);
        setField(term4665, term4665.getClass(), "lastName", null);
        setField(term4665, term4665.getClass(), "primaryEmail", null);
        setField(term4665, term4665.getClass(), "secondaryEmails", null);
        setField(term4665, term4665.getClass(), "createdAt", null);
        setField(term4665, term4665.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSecondaryEmails", argTypes, term4665, args);
    }

};


