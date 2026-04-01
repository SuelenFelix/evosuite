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

public class Member_getPwd_21150664508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10789;

    public Member_getPwd_21150664508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10789 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term10789, term10789.getClass(), "memberNum", -615654495);
        setField(term10789, term10789.getClass(), "memberNumHash", "fIZsWucfXz");
        setField(term10789, term10789.getClass(), "email", "IApvtmfhnq");
        setField(term10789, term10789.getClass(), "pwd", "VSaNnhMpRc");
        setField(term10789, term10789.getClass(), "nickName", "QNjNTLlUaV");
        setField(term10789, term10789.getClass(), "countryCode", "hIYsRyOZxk");
        setIntField(term10789, term10789.getClass(), "age", -1476117762);
        setField(term10789, term10789.getClass(), "gender", "RjNoEywJbC");
        setField(term10789, term10789.getClass(), "pfUrl", "RTTvrwwhou");
        setIntField(term10789, term10789.getClass(), "mg", -341962980);
        setIntField(term10789, term10789.getClass(), "status", 1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPwd", argTypes, term10789, args);
    }

};


