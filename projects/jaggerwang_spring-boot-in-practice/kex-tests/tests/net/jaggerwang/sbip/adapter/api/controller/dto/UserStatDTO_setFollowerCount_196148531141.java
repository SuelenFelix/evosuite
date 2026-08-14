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

public class UserStatDTO_setFollowerCount_196148531141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28938;

    public UserStatDTO_setFollowerCount_196148531141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28938 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        setField(term28938, term28938.getClass(), "id", null);
        setField(term28938, term28938.getClass(), "userId", null);
        setField(term28938, term28938.getClass(), "postCount", null);
        setField(term28938, term28938.getClass(), "likeCount", null);
        setField(term28938, term28938.getClass(), "followingCount", null);
        setField(term28938, term28938.getClass(), "followerCount", null);
        setField(term28938, term28938.getClass(), "createdAt", null);
        setField(term28938, term28938.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFollowerCount", argTypes, term28938, args);
    }

};


