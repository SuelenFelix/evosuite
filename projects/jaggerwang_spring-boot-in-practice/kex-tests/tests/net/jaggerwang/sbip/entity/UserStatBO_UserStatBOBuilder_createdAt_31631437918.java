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

public class UserStatBO_UserStatBOBuilder_createdAt_31631437918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12818;

    public UserStatBO_UserStatBOBuilder_createdAt_31631437918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12818 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder"));
        setField(term12818, term12818.getClass(), "id", null);
        setField(term12818, term12818.getClass(), "userId", null);
        setBooleanField(term12818, term12818.getClass(), "postCount$set", false);
        setField(term12818, term12818.getClass(), "postCount$value", null);
        setBooleanField(term12818, term12818.getClass(), "likeCount$set", false);
        setField(term12818, term12818.getClass(), "likeCount$value", null);
        setBooleanField(term12818, term12818.getClass(), "followingCount$set", false);
        setField(term12818, term12818.getClass(), "followingCount$value", null);
        setBooleanField(term12818, term12818.getClass(), "followerCount$set", false);
        setField(term12818, term12818.getClass(), "followerCount$value", null);
        setField(term12818, term12818.getClass(), "createdAt", null);
        setField(term12818, term12818.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO$UserStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createdAt", argTypes, term12818, args);
    }

};


