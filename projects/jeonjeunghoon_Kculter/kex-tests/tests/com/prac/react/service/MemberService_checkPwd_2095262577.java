package com.prac.react.service;

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
import static com.prac.react.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MemberService_checkPwd_2095262577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;
     Object term531;

    public MemberService_checkPwd_2095262577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530 = newInstance(Class.forName("com.prac.react.service.MemberService"));
        setField(term530, term530.getClass(), "md", null);
        setField(term530, term530.getClass(), "logger", null);
        term531 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term531, term531.getClass(), "memberNum", -883034806);
        setField(term531, term531.getClass(), "memberNumHash", "eZFUvlxvGV");
        setField(term531, term531.getClass(), "email", "BYqFIqCKAV");
        setField(term531, term531.getClass(), "pwd", "vrQLuWIDJX");
        setField(term531, term531.getClass(), "nickName", "flxyYxBRtu");
        setField(term531, term531.getClass(), "countryCode", "OclPbYPkcH");
        setIntField(term531, term531.getClass(), "age", 1585847225);
        setField(term531, term531.getClass(), "gender", "IoAlmYsBwc");
        setField(term531, term531.getClass(), "pfUrl", "TEParAifyi");
        setIntField(term531, term531.getClass(), "mg", 597278769);
        setIntField(term531, term531.getClass(), "status", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.MemberService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Member");
        Object[] args = new Object[1];
        args[0] = term531;
        callMethod(klass, "checkPwd", argTypes, term530, args);
    }

};


