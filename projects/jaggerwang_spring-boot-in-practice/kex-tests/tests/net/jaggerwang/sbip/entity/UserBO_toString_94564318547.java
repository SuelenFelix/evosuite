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

public class UserBO_toString_94564318547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28174;

    public UserBO_toString_94564318547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28174 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28174, term28174.getClass(), "id", null);
        setField(term28174, term28174.getClass(), "username", null);
        setField(term28174, term28174.getClass(), "password", null);
        setField(term28174, term28174.getClass(), "mobile", null);
        setField(term28174, term28174.getClass(), "email", null);
        setField(term28174, term28174.getClass(), "avatarId", null);
        setField(term28174, term28174.getClass(), "intro", null);
        setField(term28174, term28174.getClass(), "createdAt", null);
        setField(term28174, term28174.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28174, args);
    }

};


