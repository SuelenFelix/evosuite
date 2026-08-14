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

public class UserStatBO_UserStatBOBuilder_postCount_110089315214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12798;

    public UserStatBO_UserStatBOBuilder_postCount_110089315214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12798 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        setField(term12798, term12798.getClass(), "id", null);
        setField(term12798, term12798.getClass(), "userId", null);
        setBooleanField(term12798, term12798.getClass(), "postCount$set", false);
        setField(term12798, term12798.getClass(), "postCount$value", null);
        setBooleanField(term12798, term12798.getClass(), "likeCount$set", false);
        setField(term12798, term12798.getClass(), "likeCount$value", null);
        setBooleanField(term12798, term12798.getClass(), "followingCount$set", false);
        setField(term12798, term12798.getClass(), "followingCount$value", null);
        setBooleanField(term12798, term12798.getClass(), "followerCount$set", false);
        setField(term12798, term12798.getClass(), "followerCount$value", null);
        setField(term12798, term12798.getClass(), "createdAt", null);
        setField(term12798, term12798.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "postCount", argTypes, term12798, args);
    }

};


