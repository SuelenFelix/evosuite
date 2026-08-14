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

public class UserDTO_hashCode_127761425762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16906;

    public UserDTO_hashCode_127761425762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16906 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16906, term16906.getClass(), "id", null);
        setField(term16906, term16906.getClass(), "username", null);
        setField(term16906, term16906.getClass(), "password", null);
        setField(term16906, term16906.getClass(), "mobile", null);
        setField(term16906, term16906.getClass(), "email", null);
        setField(term16906, term16906.getClass(), "avatarId", null);
        setField(term16906, term16906.getClass(), "intro", null);
        setField(term16906, term16906.getClass(), "createdAt", null);
        setField(term16906, term16906.getClass(), "updatedAt", null);
        setField(term16906, term16906.getClass(), "avatar", null);
        setField(term16906, term16906.getClass(), "stat", null);
        setField(term16906, term16906.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term16906, args);
    }

};


