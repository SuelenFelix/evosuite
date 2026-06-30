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

public class Member_getStatus_140174372222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13129;

    public Member_getStatus_140174372222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13129 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term13129, term13129.getClass(), "memberNum", 1384592638);
        setField(term13129, term13129.getClass(), "memberNumHash", "lJoltmsadS");
        setField(term13129, term13129.getClass(), "email", "mvfDtZNEHr");
        setField(term13129, term13129.getClass(), "pwd", "bvSgmFUDOU");
        setField(term13129, term13129.getClass(), "nickName", "XMHwbfiHRl");
        setField(term13129, term13129.getClass(), "countryCode", "bucTnYicnp");
        setIntField(term13129, term13129.getClass(), "age", -1002370457);
        setField(term13129, term13129.getClass(), "gender", "EkgprvqZlM");
        setField(term13129, term13129.getClass(), "pfUrl", "fbnKvthhOz");
        setIntField(term13129, term13129.getClass(), "mg", -2014576105);
        setIntField(term13129, term13129.getClass(), "status", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term13129, args);
    }

};


