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

public class UserStat_getUserId_39037288431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32669;

    public UserStat_getUserId_39037288431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32669 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        setField(term32669, term32669.getClass(), "id", null);
        setField(term32669, term32669.getClass(), "userId", null);
        setField(term32669, term32669.getClass(), "postCount", null);
        setField(term32669, term32669.getClass(), "likeCount", null);
        setField(term32669, term32669.getClass(), "followingCount", null);
        setField(term32669, term32669.getClass(), "followerCount", null);
        setField(term32669, term32669.getClass(), "createdAt", null);
        setField(term32669, term32669.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term32669, args);
    }

};


