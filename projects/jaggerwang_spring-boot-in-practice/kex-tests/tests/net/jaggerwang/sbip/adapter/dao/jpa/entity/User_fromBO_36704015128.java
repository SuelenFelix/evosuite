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

public class User_fromBO_36704015128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31116;

    public User_fromBO_36704015128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31116 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        setField(term31116, term31116.getClass(), "id", null);
        setField(term31116, term31116.getClass(), "username", null);
        setField(term31116, term31116.getClass(), "password", null);
        setField(term31116, term31116.getClass(), "mobile", null);
        setField(term31116, term31116.getClass(), "email", null);
        setField(term31116, term31116.getClass(), "avatarId", null);
        setField(term31116, term31116.getClass(), "intro", null);
        setField(term31116, term31116.getClass(), "createdAt", null);
        setField(term31116, term31116.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromBO", argTypes, term31116, args);
    }

};


