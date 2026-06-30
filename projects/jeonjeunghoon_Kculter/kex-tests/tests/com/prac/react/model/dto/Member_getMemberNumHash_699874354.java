package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Member_getMemberNumHash_699874354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10109;

    public Member_getMemberNumHash_699874354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10109 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term10109, term10109.getClass(), "memberNum", -505439934);
        setField(term10109, term10109.getClass(), "memberNumHash", "NxgmYPzWCI");
        setField(term10109, term10109.getClass(), "email", "SqjyKmayBx");
        setField(term10109, term10109.getClass(), "pwd", "XjDhvToxJy");
        setField(term10109, term10109.getClass(), "nickName", "nxSTJflLQy");
        setField(term10109, term10109.getClass(), "countryCode", "FlHzxEfFzI");
        setIntField(term10109, term10109.getClass(), "age", -344842608);
        setField(term10109, term10109.getClass(), "gender", "aSATgQUpoe");
        setField(term10109, term10109.getClass(), "pfUrl", "VkPSXewZfB");
        setIntField(term10109, term10109.getClass(), "mg", 941650513);
        setIntField(term10109, term10109.getClass(), "status", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberNumHash", argTypes, term10109, args);
    }

};


