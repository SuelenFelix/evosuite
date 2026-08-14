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

public class UserDTO_UserDTOBuilder_createdAt_48677767523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36928;

    public UserDTO_UserDTOBuilder_createdAt_48677767523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36928 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder"));
        setField(term36928, term36928.getClass(), "id", null);
        setField(term36928, term36928.getClass(), "username", null);
        setField(term36928, term36928.getClass(), "password", null);
        setField(term36928, term36928.getClass(), "mobile", null);
        setField(term36928, term36928.getClass(), "email", null);
        setField(term36928, term36928.getClass(), "avatarId", null);
        setField(term36928, term36928.getClass(), "intro", null);
        setField(term36928, term36928.getClass(), "createdAt", null);
        setField(term36928, term36928.getClass(), "updatedAt", null);
        setField(term36928, term36928.getClass(), "avatar", null);
        setField(term36928, term36928.getClass(), "stat", null);
        setField(term36928, term36928.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO$UserDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createdAt", argTypes, term36928, args);
    }

};


