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

public class Member_getCountryCode_127189134812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11469;

    public Member_getCountryCode_127189134812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11469 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term11469, term11469.getClass(), "memberNum", 568954359);
        setField(term11469, term11469.getClass(), "memberNumHash", "GeddnXjHGy");
        setField(term11469, term11469.getClass(), "email", "vLTbaoAxBm");
        setField(term11469, term11469.getClass(), "pwd", "BXTjEyEZxD");
        setField(term11469, term11469.getClass(), "nickName", "oKhVzOKUFW");
        setField(term11469, term11469.getClass(), "countryCode", "mNHyqmOAFy");
        setIntField(term11469, term11469.getClass(), "age", 53410913);
        setField(term11469, term11469.getClass(), "gender", "UxgSdhxPCH");
        setField(term11469, term11469.getClass(), "pfUrl", "DAujxZPHJC");
        setIntField(term11469, term11469.getClass(), "mg", -375014958);
        setIntField(term11469, term11469.getClass(), "status", 1107176718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryCode", argTypes, term11469, args);
    }

};


