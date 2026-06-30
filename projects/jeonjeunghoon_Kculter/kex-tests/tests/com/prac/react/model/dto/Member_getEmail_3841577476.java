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

public class Member_getEmail_3841577476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10449;

    public Member_getEmail_3841577476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10449 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term10449, term10449.getClass(), "memberNum", -1347665717);
        setField(term10449, term10449.getClass(), "memberNumHash", "UuYWMTqWTV");
        setField(term10449, term10449.getClass(), "email", "DSFGlcaXUb");
        setField(term10449, term10449.getClass(), "pwd", "sHMXNUzNeM");
        setField(term10449, term10449.getClass(), "nickName", "gPzGDOEPPw");
        setField(term10449, term10449.getClass(), "countryCode", "rwKoAngzCu");
        setIntField(term10449, term10449.getClass(), "age", -1888585309);
        setField(term10449, term10449.getClass(), "gender", "VUkRVwROTl");
        setField(term10449, term10449.getClass(), "pfUrl", "UDlkdccCRn");
        setIntField(term10449, term10449.getClass(), "mg", 683666002);
        setIntField(term10449, term10449.getClass(), "status", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term10449, args);
    }

};


