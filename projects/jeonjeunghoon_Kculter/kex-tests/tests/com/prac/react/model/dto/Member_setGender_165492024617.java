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

public class Member_setGender_165492024617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12288;

    public Member_setGender_165492024617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12288 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12288, term12288.getClass(), "memberNum", -25637976);
        setField(term12288, term12288.getClass(), "memberNumHash", "BsuVlGUUjV");
        setField(term12288, term12288.getClass(), "email", "bHHjfDCntT");
        setField(term12288, term12288.getClass(), "pwd", "sEphiduvkv");
        setField(term12288, term12288.getClass(), "nickName", "PbLgCSAHce");
        setField(term12288, term12288.getClass(), "countryCode", "NWldOLAbqk");
        setIntField(term12288, term12288.getClass(), "age", 1555897383);
        setField(term12288, term12288.getClass(), "gender", "qnYaYSpDwO");
        setField(term12288, term12288.getClass(), "pfUrl", "dgbFDCdHtj");
        setIntField(term12288, term12288.getClass(), "mg", 202001407);
        setIntField(term12288, term12288.getClass(), "status", 158873461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EKpdCBubDE";
        callMethod(klass, "setGender", argTypes, term12288, args);
    }

};


