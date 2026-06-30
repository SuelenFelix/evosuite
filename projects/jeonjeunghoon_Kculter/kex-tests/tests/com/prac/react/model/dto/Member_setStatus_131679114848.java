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
import java.lang.Integer;

public class Member_setStatus_131679114848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13723;
     Object term13728;

    public Member_setStatus_131679114848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13723 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13723, term13723.getClass(), "memberNum", 0);
        setField(term13723, term13723.getClass(), "memberNumHash", null);
        setField(term13723, term13723.getClass(), "email", null);
        setField(term13723, term13723.getClass(), "pwd", null);
        setField(term13723, term13723.getClass(), "nickName", null);
        setField(term13723, term13723.getClass(), "countryCode", null);
        setIntField(term13723, term13723.getClass(), "age", 0);
        setField(term13723, term13723.getClass(), "gender", null);
        setField(term13723, term13723.getClass(), "pfUrl", null);
        setIntField(term13723, term13723.getClass(), "mg", 0);
        setIntField(term13723, term13723.getClass(), "status", 0);
        term13728 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13728;
        callMethod(klass, "setStatus", argTypes, term13723, args);
    }

};


