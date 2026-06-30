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

public class Member_getGender_19099357016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12129;

    public Member_getGender_19099357016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12129 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12129, term12129.getClass(), "memberNum", 2095798786);
        setField(term12129, term12129.getClass(), "memberNumHash", "mfHtgSbdjD");
        setField(term12129, term12129.getClass(), "email", "cmuaUiHMVL");
        setField(term12129, term12129.getClass(), "pwd", "xjoSGPWUgu");
        setField(term12129, term12129.getClass(), "nickName", "uzmqjnOUXu");
        setField(term12129, term12129.getClass(), "countryCode", "xeyjTOCOJb");
        setIntField(term12129, term12129.getClass(), "age", -1565502840);
        setField(term12129, term12129.getClass(), "gender", "DGRqjjdhzy");
        setField(term12129, term12129.getClass(), "pfUrl", "lQFkjJUPAR");
        setIntField(term12129, term12129.getClass(), "mg", 344323424);
        setIntField(term12129, term12129.getClass(), "status", 9726679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term12129, args);
    }

};


