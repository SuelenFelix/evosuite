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

public class UserBO_UserBOBuilder_email_49163418417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29798;

    public UserBO_UserBOBuilder_email_49163418417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29798 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        setField(term29798, term29798.getClass(), "id", null);
        setField(term29798, term29798.getClass(), "username", null);
        setField(term29798, term29798.getClass(), "password", null);
        setField(term29798, term29798.getClass(), "mobile", null);
        setField(term29798, term29798.getClass(), "email", null);
        setField(term29798, term29798.getClass(), "avatarId", null);
        setField(term29798, term29798.getClass(), "intro", null);
        setField(term29798, term29798.getClass(), "createdAt", null);
        setField(term29798, term29798.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "email", argTypes, term29798, args);
    }

};


