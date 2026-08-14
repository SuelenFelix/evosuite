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

public class UserFollow_getCreatedAt_33904512123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12000;

    public UserFollow_getCreatedAt_33904512123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12000 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        setField(term12000, term12000.getClass(), "id", null);
        setField(term12000, term12000.getClass(), "followingId", null);
        setField(term12000, term12000.getClass(), "followerId", null);
        setField(term12000, term12000.getClass(), "createdAt", null);
        setField(term12000, term12000.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term12000, args);
    }

};


