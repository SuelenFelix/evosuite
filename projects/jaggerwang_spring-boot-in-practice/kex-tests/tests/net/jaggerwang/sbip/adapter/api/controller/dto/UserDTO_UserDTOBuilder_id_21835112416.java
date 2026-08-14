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

public class UserDTO_UserDTOBuilder_id_21835112416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36921;

    public UserDTO_UserDTOBuilder_id_21835112416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36921 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        setField(term36921, term36921.getClass(), "id", null);
        setField(term36921, term36921.getClass(), "username", null);
        setField(term36921, term36921.getClass(), "password", null);
        setField(term36921, term36921.getClass(), "mobile", null);
        setField(term36921, term36921.getClass(), "email", null);
        setField(term36921, term36921.getClass(), "avatarId", null);
        setField(term36921, term36921.getClass(), "intro", null);
        setField(term36921, term36921.getClass(), "createdAt", null);
        setField(term36921, term36921.getClass(), "updatedAt", null);
        setField(term36921, term36921.getClass(), "avatar", null);
        setField(term36921, term36921.getClass(), "stat", null);
        setField(term36921, term36921.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term36921, args);
    }

};


