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

public class UserStatDTO_UserStatDTOBuilder_createdAt_48794821318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58290;

    public UserStatDTO_UserStatDTOBuilder_createdAt_48794821318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58290 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        setField(term58290, term58290.getClass(), "id", null);
        setField(term58290, term58290.getClass(), "userId", null);
        setField(term58290, term58290.getClass(), "postCount", null);
        setField(term58290, term58290.getClass(), "likeCount", null);
        setField(term58290, term58290.getClass(), "followingCount", null);
        setField(term58290, term58290.getClass(), "followerCount", null);
        setField(term58290, term58290.getClass(), "createdAt", null);
        setField(term58290, term58290.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createdAt", argTypes, term58290, args);
    }

};


