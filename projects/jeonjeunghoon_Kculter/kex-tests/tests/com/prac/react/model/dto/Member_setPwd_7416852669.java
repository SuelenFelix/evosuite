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

public class Member_setPwd_7416852669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10948;

    public Member_setPwd_7416852669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10948 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term10948, term10948.getClass(), "memberNum", -1801760683);
        setField(term10948, term10948.getClass(), "memberNumHash", "lRORwXipuk");
        setField(term10948, term10948.getClass(), "email", "fVdTcjgHdw");
        setField(term10948, term10948.getClass(), "pwd", "wwAwLLcLPp");
        setField(term10948, term10948.getClass(), "nickName", "nHpMKOmlpQ");
        setField(term10948, term10948.getClass(), "countryCode", "fKhrQsJToZ");
        setIntField(term10948, term10948.getClass(), "age", 1141317871);
        setField(term10948, term10948.getClass(), "gender", "wsysQLGFnl");
        setField(term10948, term10948.getClass(), "pfUrl", "ckQLZGFjMX");
        setIntField(term10948, term10948.getClass(), "mg", 890669485);
        setIntField(term10948, term10948.getClass(), "status", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qphdrqUtNx";
        callMethod(klass, "setPwd", argTypes, term10948, args);
    }

};


