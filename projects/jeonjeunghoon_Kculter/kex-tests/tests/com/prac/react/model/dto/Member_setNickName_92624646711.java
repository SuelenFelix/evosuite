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

public class Member_setNickName_92624646711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11288;

    public Member_setNickName_92624646711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11288 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11288, term11288.getClass(), "memberNum", 1386130016);
        setField(term11288, term11288.getClass(), "memberNumHash", "kVAmKknVln");
        setField(term11288, term11288.getClass(), "email", "MRFLbEGYKG");
        setField(term11288, term11288.getClass(), "pwd", "BYrGukTyof");
        setField(term11288, term11288.getClass(), "nickName", "jiCGTTzKGB");
        setField(term11288, term11288.getClass(), "countryCode", "MqICFYzDJj");
        setIntField(term11288, term11288.getClass(), "age", 1072005683);
        setField(term11288, term11288.getClass(), "gender", "YgQvdcBQKw");
        setField(term11288, term11288.getClass(), "pfUrl", "FiYYLuailz");
        setIntField(term11288, term11288.getClass(), "mg", 1861318859);
        setIntField(term11288, term11288.getClass(), "status", 1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XebAeSnCKZ";
        callMethod(klass, "setNickName", argTypes, term11288, args);
    }

};


