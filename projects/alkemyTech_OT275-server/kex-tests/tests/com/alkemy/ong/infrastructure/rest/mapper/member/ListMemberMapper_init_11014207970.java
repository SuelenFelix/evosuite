package com.alkemy.ong.infrastructure.rest.mapper.member;

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
import static com.alkemy.ong.infrastructure.rest.mapper.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ListMemberMapper_init_11014207970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;

    public ListMemberMapper_init_11014207970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper"));
        Object term557 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term556, term556.getClass(), "socialMediaMapper", term557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.ListMemberMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.member.GetMemberMapper");
        Object[] args = new Object[1];
        args[0] = term556;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


