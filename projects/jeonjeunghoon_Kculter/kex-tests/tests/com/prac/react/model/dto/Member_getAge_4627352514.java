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

public class Member_getAge_4627352514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11809;

    public Member_getAge_4627352514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11809 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11809, term11809.getClass(), "memberNum", 96566506);
        setField(term11809, term11809.getClass(), "memberNumHash", "iiHBhsNFgk");
        setField(term11809, term11809.getClass(), "email", "HknsTajwxJ");
        setField(term11809, term11809.getClass(), "pwd", "XtiurrVYKw");
        setField(term11809, term11809.getClass(), "nickName", "rsumfoDNHa");
        setField(term11809, term11809.getClass(), "countryCode", "ceCWHUTQUM");
        setIntField(term11809, term11809.getClass(), "age", -343325701);
        setField(term11809, term11809.getClass(), "gender", "LrqwfrKKtS");
        setField(term11809, term11809.getClass(), "pfUrl", "ZUdnQXfzCI");
        setIntField(term11809, term11809.getClass(), "mg", 107945604);
        setIntField(term11809, term11809.getClass(), "status", -1963464809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term11809, args);
    }

};


