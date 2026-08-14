package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setCreatedAt_154426639448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31136;

    public User_setCreatedAt_154426639448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31136 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        setField(term31136, term31136.getClass(), "id", null);
        setField(term31136, term31136.getClass(), "username", null);
        setField(term31136, term31136.getClass(), "password", null);
        setField(term31136, term31136.getClass(), "mobile", null);
        setField(term31136, term31136.getClass(), "email", null);
        setField(term31136, term31136.getClass(), "avatarId", null);
        setField(term31136, term31136.getClass(), "intro", null);
        setField(term31136, term31136.getClass(), "createdAt", null);
        setField(term31136, term31136.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedAt", argTypes, term31136, args);
    }

};


