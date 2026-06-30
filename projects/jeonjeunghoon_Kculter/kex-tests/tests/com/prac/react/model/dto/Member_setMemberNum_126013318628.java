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

public class Member_setMemberNum_126013318628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13617;
     Object term13622;

    public Member_setMemberNum_126013318628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13617 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13617, term13617.getClass(), "memberNum", 0);
        setField(term13617, term13617.getClass(), "memberNumHash", null);
        setField(term13617, term13617.getClass(), "email", null);
        setField(term13617, term13617.getClass(), "pwd", null);
        setField(term13617, term13617.getClass(), "nickName", null);
        setField(term13617, term13617.getClass(), "countryCode", null);
        setIntField(term13617, term13617.getClass(), "age", 0);
        setField(term13617, term13617.getClass(), "gender", null);
        setField(term13617, term13617.getClass(), "pfUrl", null);
        setIntField(term13617, term13617.getClass(), "mg", 0);
        setIntField(term13617, term13617.getClass(), "status", 0);
        term13622 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13622;
        callMethod(klass, "setMemberNum", argTypes, term13617, args);
    }

};


