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

public class UserStat_UserStatBuilder_postCount_36660384014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4500;

    public UserStat_UserStatBuilder_postCount_36660384014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4500 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        setField(term4500, term4500.getClass(), "id", null);
        setField(term4500, term4500.getClass(), "userId", null);
        setField(term4500, term4500.getClass(), "postCount", null);
        setField(term4500, term4500.getClass(), "likeCount", null);
        setField(term4500, term4500.getClass(), "followingCount", null);
        setField(term4500, term4500.getClass(), "followerCount", null);
        setField(term4500, term4500.getClass(), "createdAt", null);
        setField(term4500, term4500.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "postCount", argTypes, term4500, args);
    }

};


