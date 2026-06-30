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

public class Member_setMemberNum_12601331863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9948;
     Object term10037;

    public Member_setMemberNum_12601331863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9948 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term9948, term9948.getClass(), "memberNum", 1442160736);
        setField(term9948, term9948.getClass(), "memberNumHash", "YkZtEtthvz");
        setField(term9948, term9948.getClass(), "email", "dwlZSxlXOo");
        setField(term9948, term9948.getClass(), "pwd", "lKrEAkypza");
        setField(term9948, term9948.getClass(), "nickName", "KtuuNAqGCQ");
        setField(term9948, term9948.getClass(), "countryCode", "OGQsfjmReM");
        setIntField(term9948, term9948.getClass(), "age", 1114000454);
        setField(term9948, term9948.getClass(), "gender", "YsUtbngnRO");
        setField(term9948, term9948.getClass(), "pfUrl", "JisaWUxcNb");
        setIntField(term9948, term9948.getClass(), "mg", -556405712);
        setIntField(term9948, term9948.getClass(), "status", -1772434990);
        term10037 = new Integer(-1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10037;
        callMethod(klass, "setMemberNum", argTypes, term9948, args);
    }

};


