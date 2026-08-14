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

public class UserBO_UserBOBuilder_build_185809700622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29803;

    public UserBO_UserBOBuilder_build_185809700622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29803 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        setField(term29803, term29803.getClass(), "id", null);
        setField(term29803, term29803.getClass(), "username", null);
        setField(term29803, term29803.getClass(), "password", null);
        setField(term29803, term29803.getClass(), "mobile", null);
        setField(term29803, term29803.getClass(), "email", null);
        setField(term29803, term29803.getClass(), "avatarId", null);
        setField(term29803, term29803.getClass(), "intro", null);
        setField(term29803, term29803.getClass(), "createdAt", null);
        setField(term29803, term29803.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term29803, args);
    }

};


