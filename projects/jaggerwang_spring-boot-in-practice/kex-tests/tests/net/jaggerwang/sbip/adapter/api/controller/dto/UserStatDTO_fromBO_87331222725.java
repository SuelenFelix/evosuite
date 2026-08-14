package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserStatDTO_fromBO_87331222725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28922;

    public UserStatDTO_fromBO_87331222725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28922 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        setField(term28922, term28922.getClass(), "id", null);
        setField(term28922, term28922.getClass(), "userId", null);
        setField(term28922, term28922.getClass(), "postCount", null);
        setField(term28922, term28922.getClass(), "likeCount", null);
        setField(term28922, term28922.getClass(), "followingCount", null);
        setField(term28922, term28922.getClass(), "followerCount", null);
        setField(term28922, term28922.getClass(), "createdAt", null);
        setField(term28922, term28922.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromBO", argTypes, term28922, args);
    }

};


