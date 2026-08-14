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

public class UserStatBO_setFollowerCount_127034707145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12379;

    public UserStatBO_setFollowerCount_127034707145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12379 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        setField(term12379, term12379.getClass(), "id", null);
        setField(term12379, term12379.getClass(), "userId", null);
        setField(term12379, term12379.getClass(), "postCount", null);
        setField(term12379, term12379.getClass(), "likeCount", null);
        setField(term12379, term12379.getClass(), "followingCount", null);
        setField(term12379, term12379.getClass(), "followerCount", null);
        setField(term12379, term12379.getClass(), "createdAt", null);
        setField(term12379, term12379.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFollowerCount", argTypes, term12379, args);
    }

};


