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

public class UserBO_builder_149230917725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28152;

    public UserBO_builder_149230917725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28152 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28152, term28152.getClass(), "id", null);
        setField(term28152, term28152.getClass(), "username", null);
        setField(term28152, term28152.getClass(), "password", null);
        setField(term28152, term28152.getClass(), "mobile", null);
        setField(term28152, term28152.getClass(), "email", null);
        setField(term28152, term28152.getClass(), "avatarId", null);
        setField(term28152, term28152.getClass(), "intro", null);
        setField(term28152, term28152.getClass(), "createdAt", null);
        setField(term28152, term28152.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term28152, args);
    }

};


