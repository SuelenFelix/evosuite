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

public class UserBO_getIntro_27472309732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28159;

    public UserBO_getIntro_27472309732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28159 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28159, term28159.getClass(), "id", null);
        setField(term28159, term28159.getClass(), "username", null);
        setField(term28159, term28159.getClass(), "password", null);
        setField(term28159, term28159.getClass(), "mobile", null);
        setField(term28159, term28159.getClass(), "email", null);
        setField(term28159, term28159.getClass(), "avatarId", null);
        setField(term28159, term28159.getClass(), "intro", null);
        setField(term28159, term28159.getClass(), "createdAt", null);
        setField(term28159, term28159.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntro", argTypes, term28159, args);
    }

};


