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

public class MemberService_insertMember_16036647713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term48;

    public MemberService_insertMember_16036647713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("com.prac.react.service.MemberService"));
        setField(term47, term47.getClass(), "md", null);
        setField(term47, term47.getClass(), "logger", null);
        term48 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term48, term48.getClass(), "memberNum", 568599855);
        setField(term48, term48.getClass(), "memberNumHash", "MuLcgQHgqz");
        setField(term48, term48.getClass(), "email", "xxtlPwDYFs");
        setField(term48, term48.getClass(), "pwd", "jJCZpVmanW");
        setField(term48, term48.getClass(), "nickName", "EGtDIRbSSb");
        setField(term48, term48.getClass(), "countryCode", "SzjVpOQTyS");
        setIntField(term48, term48.getClass(), "age", 1162663216);
        setField(term48, term48.getClass(), "gender", "MjGYSRKTNF");
        setField(term48, term48.getClass(), "pfUrl", "hRNSzYYIrc");
        setIntField(term48, term48.getClass(), "mg", 1484323161);
        setIntField(term48, term48.getClass(), "status", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.MemberService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Member");
        Object[] args = new Object[1];
        args[0] = term48;
        callMethod(klass, "insertMember", argTypes, term47, args);
    }

};


