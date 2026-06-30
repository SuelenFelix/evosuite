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

public class MemberService_updatePwd_3427589808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term690;
     Object term691;

    public MemberService_updatePwd_3427589808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term690 = newInstance(Class.forName("com.prac.react.service.MemberService"));
        setField(term690, term690.getClass(), "md", null);
        setField(term690, term690.getClass(), "logger", null);
        term691 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term691, term691.getClass(), "memberNum", -1456670397);
        setField(term691, term691.getClass(), "memberNumHash", "OWDIEULEFu");
        setField(term691, term691.getClass(), "email", "dWRymuLBtr");
        setField(term691, term691.getClass(), "pwd", "AijpHYOFuy");
        setField(term691, term691.getClass(), "nickName", "SbAoxhfrkn");
        setField(term691, term691.getClass(), "countryCode", "kuTXqwMtDB");
        setIntField(term691, term691.getClass(), "age", 1622346318);
        setField(term691, term691.getClass(), "gender", "Ghbwtircqb");
        setField(term691, term691.getClass(), "pfUrl", "xrwlQZdwCp");
        setIntField(term691, term691.getClass(), "mg", 1048535127);
        setIntField(term691, term691.getClass(), "status", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.MemberService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Member");
        Object[] args = new Object[1];
        args[0] = term691;
        callMethod(klass, "updatePwd", argTypes, term690, args);
    }

};


