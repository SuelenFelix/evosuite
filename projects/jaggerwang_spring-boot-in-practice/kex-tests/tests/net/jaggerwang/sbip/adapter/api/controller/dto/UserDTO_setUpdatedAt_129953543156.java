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

public class UserDTO_setUpdatedAt_129953543156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16900;

    public UserDTO_setUpdatedAt_129953543156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16900 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16900, term16900.getClass(), "id", null);
        setField(term16900, term16900.getClass(), "username", null);
        setField(term16900, term16900.getClass(), "password", null);
        setField(term16900, term16900.getClass(), "mobile", null);
        setField(term16900, term16900.getClass(), "email", null);
        setField(term16900, term16900.getClass(), "avatarId", null);
        setField(term16900, term16900.getClass(), "intro", null);
        setField(term16900, term16900.getClass(), "createdAt", null);
        setField(term16900, term16900.getClass(), "updatedAt", null);
        setField(term16900, term16900.getClass(), "avatar", null);
        setField(term16900, term16900.getClass(), "stat", null);
        setField(term16900, term16900.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdatedAt", argTypes, term16900, args);
    }

};


