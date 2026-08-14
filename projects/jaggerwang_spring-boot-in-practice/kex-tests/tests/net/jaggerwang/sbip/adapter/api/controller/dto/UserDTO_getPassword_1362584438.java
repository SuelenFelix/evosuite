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

public class UserDTO_getPassword_1362584438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16882;

    public UserDTO_getPassword_1362584438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16882 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16882, term16882.getClass(), "id", null);
        setField(term16882, term16882.getClass(), "username", null);
        setField(term16882, term16882.getClass(), "password", null);
        setField(term16882, term16882.getClass(), "mobile", null);
        setField(term16882, term16882.getClass(), "email", null);
        setField(term16882, term16882.getClass(), "avatarId", null);
        setField(term16882, term16882.getClass(), "intro", null);
        setField(term16882, term16882.getClass(), "createdAt", null);
        setField(term16882, term16882.getClass(), "updatedAt", null);
        setField(term16882, term16882.getClass(), "avatar", null);
        setField(term16882, term16882.getClass(), "stat", null);
        setField(term16882, term16882.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term16882, args);
    }

};


