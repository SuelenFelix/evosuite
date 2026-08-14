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

public class UserBO_UserBOBuilder_username_80117127814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29795;

    public UserBO_UserBOBuilder_username_80117127814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29795 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        setField(term29795, term29795.getClass(), "id", null);
        setField(term29795, term29795.getClass(), "username", null);
        setField(term29795, term29795.getClass(), "password", null);
        setField(term29795, term29795.getClass(), "mobile", null);
        setField(term29795, term29795.getClass(), "email", null);
        setField(term29795, term29795.getClass(), "avatarId", null);
        setField(term29795, term29795.getClass(), "intro", null);
        setField(term29795, term29795.getClass(), "createdAt", null);
        setField(term29795, term29795.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "username", argTypes, term29795, args);
    }

};


