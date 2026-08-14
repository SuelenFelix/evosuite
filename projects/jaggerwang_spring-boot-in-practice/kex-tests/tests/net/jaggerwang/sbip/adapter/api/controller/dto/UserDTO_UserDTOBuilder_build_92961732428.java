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

public class UserDTO_UserDTOBuilder_build_92961732428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36933;

    public UserDTO_UserDTOBuilder_build_92961732428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36933 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        setField(term36933, term36933.getClass(), "id", null);
        setField(term36933, term36933.getClass(), "username", null);
        setField(term36933, term36933.getClass(), "password", null);
        setField(term36933, term36933.getClass(), "mobile", null);
        setField(term36933, term36933.getClass(), "email", null);
        setField(term36933, term36933.getClass(), "avatarId", null);
        setField(term36933, term36933.getClass(), "intro", null);
        setField(term36933, term36933.getClass(), "createdAt", null);
        setField(term36933, term36933.getClass(), "updatedAt", null);
        setField(term36933, term36933.getClass(), "avatar", null);
        setField(term36933, term36933.getClass(), "stat", null);
        setField(term36933, term36933.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term36933, args);
    }

};


