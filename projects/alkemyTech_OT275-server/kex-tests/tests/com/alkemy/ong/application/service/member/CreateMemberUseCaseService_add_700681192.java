package com.alkemy.ong.application.service.member;

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
import static com.alkemy.ong.application.service.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateMemberUseCaseService_add_700681192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276;

    public CreateMemberUseCaseService_add_700681192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276 = newInstance(Class.forName("com.alkemy.ong.application.service.member.CreateMemberUseCaseService"));
        setField(term276, term276.getClass(), "memberRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.member.CreateMemberUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Member");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term276, args);
    }

};


