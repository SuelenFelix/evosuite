package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDTO_setEmail_203290934352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16896;

    public UserDTO_setEmail_203290934352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16896 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16896, term16896.getClass(), "id", null);
        setField(term16896, term16896.getClass(), "username", null);
        setField(term16896, term16896.getClass(), "password", null);
        setField(term16896, term16896.getClass(), "mobile", null);
        setField(term16896, term16896.getClass(), "email", null);
        setField(term16896, term16896.getClass(), "avatarId", null);
        setField(term16896, term16896.getClass(), "intro", null);
        setField(term16896, term16896.getClass(), "createdAt", null);
        setField(term16896, term16896.getClass(), "updatedAt", null);
        setField(term16896, term16896.getClass(), "avatar", null);
        setField(term16896, term16896.getClass(), "stat", null);
        setField(term16896, term16896.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term16896, args);
    }

};


