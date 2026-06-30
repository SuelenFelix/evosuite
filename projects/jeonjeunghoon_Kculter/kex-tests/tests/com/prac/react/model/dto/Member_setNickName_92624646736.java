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

public class Member_setNickName_92624646736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13659;

    public Member_setNickName_92624646736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13659 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13659, term13659.getClass(), "memberNum", 0);
        setField(term13659, term13659.getClass(), "memberNumHash", null);
        setField(term13659, term13659.getClass(), "email", null);
        setField(term13659, term13659.getClass(), "pwd", null);
        setField(term13659, term13659.getClass(), "nickName", null);
        setField(term13659, term13659.getClass(), "countryCode", null);
        setIntField(term13659, term13659.getClass(), "age", 0);
        setField(term13659, term13659.getClass(), "gender", null);
        setField(term13659, term13659.getClass(), "pfUrl", null);
        setIntField(term13659, term13659.getClass(), "mg", 0);
        setIntField(term13659, term13659.getClass(), "status", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNickName", argTypes, term13659, args);
    }

};


