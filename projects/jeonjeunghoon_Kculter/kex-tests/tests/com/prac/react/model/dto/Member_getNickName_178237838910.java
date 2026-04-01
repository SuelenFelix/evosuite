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

public class Member_getNickName_178237838910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11129;

    public Member_getNickName_178237838910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11129 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11129, term11129.getClass(), "memberNum", -893623680);
        setField(term11129, term11129.getClass(), "memberNumHash", "bwlLFAfNWx");
        setField(term11129, term11129.getClass(), "email", "JWodNQzjjV");
        setField(term11129, term11129.getClass(), "pwd", "CAgxWjhxNf");
        setField(term11129, term11129.getClass(), "nickName", "goAoCMhKBu");
        setField(term11129, term11129.getClass(), "countryCode", "BWxJSgKHRT");
        setIntField(term11129, term11129.getClass(), "age", -1963434938);
        setField(term11129, term11129.getClass(), "gender", "AGXoIndFnm");
        setField(term11129, term11129.getClass(), "pfUrl", "mwmFMNEzkK");
        setIntField(term11129, term11129.getClass(), "mg", 906181092);
        setIntField(term11129, term11129.getClass(), "status", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickName", argTypes, term11129, args);
    }

};


