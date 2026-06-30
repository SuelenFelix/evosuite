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

public class Member_setAge_60375873115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11968;
     Object term12057;

    public Member_setAge_60375873115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11968 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11968, term11968.getClass(), "memberNum", 71190297);
        setField(term11968, term11968.getClass(), "memberNumHash", "EULDrUNQvw");
        setField(term11968, term11968.getClass(), "email", "BtvAvsJSei");
        setField(term11968, term11968.getClass(), "pwd", "vqnBkkxoIa");
        setField(term11968, term11968.getClass(), "nickName", "bycpZjxXFn");
        setField(term11968, term11968.getClass(), "countryCode", "jQWttOAiwL");
        setIntField(term11968, term11968.getClass(), "age", 1202361360);
        setField(term11968, term11968.getClass(), "gender", "DzKFxEuEEC");
        setField(term11968, term11968.getClass(), "pfUrl", "CAMnvfDLJL");
        setIntField(term11968, term11968.getClass(), "mg", -2015048153);
        setIntField(term11968, term11968.getClass(), "status", -2063457669);
        term12057 = new Integer(-1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term12057;
        callMethod(klass, "setAge", argTypes, term11968, args);
    }

};


