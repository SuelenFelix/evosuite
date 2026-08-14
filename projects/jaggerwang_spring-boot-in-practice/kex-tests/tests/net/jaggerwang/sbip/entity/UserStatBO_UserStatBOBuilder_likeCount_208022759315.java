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

public class UserStatBO_UserStatBOBuilder_likeCount_208022759315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12803;

    public UserStatBO_UserStatBOBuilder_likeCount_208022759315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12803 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        setField(term12803, term12803.getClass(), "id", null);
        setField(term12803, term12803.getClass(), "userId", null);
        setBooleanField(term12803, term12803.getClass(), "postCount$set", false);
        setField(term12803, term12803.getClass(), "postCount$value", null);
        setBooleanField(term12803, term12803.getClass(), "likeCount$set", false);
        setField(term12803, term12803.getClass(), "likeCount$value", null);
        setBooleanField(term12803, term12803.getClass(), "followingCount$set", false);
        setField(term12803, term12803.getClass(), "followingCount$value", null);
        setBooleanField(term12803, term12803.getClass(), "followerCount$set", false);
        setField(term12803, term12803.getClass(), "followerCount$value", null);
        setField(term12803, term12803.getClass(), "createdAt", null);
        setField(term12803, term12803.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "likeCount", argTypes, term12803, args);
    }

};


