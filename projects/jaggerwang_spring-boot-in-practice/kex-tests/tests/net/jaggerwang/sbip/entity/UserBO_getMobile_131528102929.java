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

public class UserBO_getMobile_131528102929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28156;

    public UserBO_getMobile_131528102929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28156 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28156, term28156.getClass(), "id", null);
        setField(term28156, term28156.getClass(), "username", null);
        setField(term28156, term28156.getClass(), "password", null);
        setField(term28156, term28156.getClass(), "mobile", null);
        setField(term28156, term28156.getClass(), "email", null);
        setField(term28156, term28156.getClass(), "avatarId", null);
        setField(term28156, term28156.getClass(), "intro", null);
        setField(term28156, term28156.getClass(), "createdAt", null);
        setField(term28156, term28156.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMobile", argTypes, term28156, args);
    }

};


