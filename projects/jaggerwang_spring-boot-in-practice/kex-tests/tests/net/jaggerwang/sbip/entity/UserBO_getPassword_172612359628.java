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

public class UserBO_getPassword_172612359628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28155;

    public UserBO_getPassword_172612359628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28155 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28155, term28155.getClass(), "id", null);
        setField(term28155, term28155.getClass(), "username", null);
        setField(term28155, term28155.getClass(), "password", null);
        setField(term28155, term28155.getClass(), "mobile", null);
        setField(term28155, term28155.getClass(), "email", null);
        setField(term28155, term28155.getClass(), "avatarId", null);
        setField(term28155, term28155.getClass(), "intro", null);
        setField(term28155, term28155.getClass(), "createdAt", null);
        setField(term28155, term28155.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term28155, args);
    }

};


