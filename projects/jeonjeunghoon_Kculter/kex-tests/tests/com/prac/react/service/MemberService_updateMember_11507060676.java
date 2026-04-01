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

public class MemberService_updateMember_11507060676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term371;

    public MemberService_updateMember_11507060676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("com.prac.react.service.MemberService"));
        setField(term370, term370.getClass(), "md", null);
        setField(term370, term370.getClass(), "logger", null);
        term371 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term371, term371.getClass(), "memberNum", -1339778481);
        setField(term371, term371.getClass(), "memberNumHash", "ZiaGIbnzTs");
        setField(term371, term371.getClass(), "email", "tbcdzjIfER");
        setField(term371, term371.getClass(), "pwd", "HyxfbSQYBe");
        setField(term371, term371.getClass(), "nickName", "pCTimMblYc");
        setField(term371, term371.getClass(), "countryCode", "hNxWaHcfhY");
        setIntField(term371, term371.getClass(), "age", 1725571209);
        setField(term371, term371.getClass(), "gender", "RkybSrpybU");
        setField(term371, term371.getClass(), "pfUrl", "xOEqzGAmDU");
        setIntField(term371, term371.getClass(), "mg", -522618178);
        setIntField(term371, term371.getClass(), "status", 1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.service.MemberService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.prac.react.model.dto.Member");
        Object[] args = new Object[1];
        args[0] = term371;
        callMethod(klass, "updateMember", argTypes, term370, args);
    }

};


