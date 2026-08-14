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

public class UserBO_setCreatedAt_33309040442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28169;

    public UserBO_setCreatedAt_33309040442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28169 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        setField(term28169, term28169.getClass(), "id", null);
        setField(term28169, term28169.getClass(), "username", null);
        setField(term28169, term28169.getClass(), "password", null);
        setField(term28169, term28169.getClass(), "mobile", null);
        setField(term28169, term28169.getClass(), "email", null);
        setField(term28169, term28169.getClass(), "avatarId", null);
        setField(term28169, term28169.getClass(), "intro", null);
        setField(term28169, term28169.getClass(), "createdAt", null);
        setField(term28169, term28169.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedAt", argTypes, term28169, args);
    }

};


