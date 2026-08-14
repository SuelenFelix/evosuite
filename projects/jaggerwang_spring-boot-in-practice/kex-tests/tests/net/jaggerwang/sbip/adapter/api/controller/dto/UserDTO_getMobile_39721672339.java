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

public class UserDTO_getMobile_39721672339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16883;

    public UserDTO_getMobile_39721672339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16883 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16883, term16883.getClass(), "id", null);
        setField(term16883, term16883.getClass(), "username", null);
        setField(term16883, term16883.getClass(), "password", null);
        setField(term16883, term16883.getClass(), "mobile", null);
        setField(term16883, term16883.getClass(), "email", null);
        setField(term16883, term16883.getClass(), "avatarId", null);
        setField(term16883, term16883.getClass(), "intro", null);
        setField(term16883, term16883.getClass(), "createdAt", null);
        setField(term16883, term16883.getClass(), "updatedAt", null);
        setField(term16883, term16883.getClass(), "avatar", null);
        setField(term16883, term16883.getClass(), "stat", null);
        setField(term16883, term16883.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMobile", argTypes, term16883, args);
    }

};


