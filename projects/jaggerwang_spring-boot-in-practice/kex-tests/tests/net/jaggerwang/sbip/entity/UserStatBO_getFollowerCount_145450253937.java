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

public class UserStatBO_getFollowerCount_145450253937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12371;

    public UserStatBO_getFollowerCount_145450253937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12371 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        setField(term12371, term12371.getClass(), "id", null);
        setField(term12371, term12371.getClass(), "userId", null);
        setField(term12371, term12371.getClass(), "postCount", null);
        setField(term12371, term12371.getClass(), "likeCount", null);
        setField(term12371, term12371.getClass(), "followingCount", null);
        setField(term12371, term12371.getClass(), "followerCount", null);
        setField(term12371, term12371.getClass(), "createdAt", null);
        setField(term12371, term12371.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowerCount", argTypes, term12371, args);
    }

};


