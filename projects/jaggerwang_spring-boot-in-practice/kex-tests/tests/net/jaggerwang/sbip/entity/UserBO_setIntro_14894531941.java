package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserBO_setIntro_14894531941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28168;

    public UserBO_setIntro_14894531941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28168 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28168, term28168.getClass(), "id", null);
        setField(term28168, term28168.getClass(), "username", null);
        setField(term28168, term28168.getClass(), "password", null);
        setField(term28168, term28168.getClass(), "mobile", null);
        setField(term28168, term28168.getClass(), "email", null);
        setField(term28168, term28168.getClass(), "avatarId", null);
        setField(term28168, term28168.getClass(), "intro", null);
        setField(term28168, term28168.getClass(), "createdAt", null);
        setField(term28168, term28168.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIntro", argTypes, term28168, args);
    }

};


