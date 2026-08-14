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

public class User_UserBuilder_toString_94035705723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13640;

    public User_UserBuilder_toString_94035705723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13640 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        setField(term13640, term13640.getClass(), "id", null);
        setField(term13640, term13640.getClass(), "username", null);
        setField(term13640, term13640.getClass(), "password", null);
        setField(term13640, term13640.getClass(), "mobile", null);
        setField(term13640, term13640.getClass(), "email", null);
        setField(term13640, term13640.getClass(), "avatarId", null);
        setField(term13640, term13640.getClass(), "intro", null);
        setField(term13640, term13640.getClass(), "createdAt", null);
        setField(term13640, term13640.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13640, args);
    }

};


