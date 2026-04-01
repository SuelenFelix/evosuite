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

public class Member_setPfUrl_15356154619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12628;

    public Member_setPfUrl_15356154619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12628 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12628, term12628.getClass(), "memberNum", -1498296052);
        setField(term12628, term12628.getClass(), "memberNumHash", "ncSPTkhKjO");
        setField(term12628, term12628.getClass(), "email", "jcWKHRWhyj");
        setField(term12628, term12628.getClass(), "pwd", "nrQjODRMLD");
        setField(term12628, term12628.getClass(), "nickName", "PNoWXrsFic");
        setField(term12628, term12628.getClass(), "countryCode", "QZBHZqZope");
        setIntField(term12628, term12628.getClass(), "age", 2098647989);
        setField(term12628, term12628.getClass(), "gender", "VBUahCvyxC");
        setField(term12628, term12628.getClass(), "pfUrl", "MlzTkzKMCX");
        setIntField(term12628, term12628.getClass(), "mg", 1598895173);
        setIntField(term12628, term12628.getClass(), "status", 1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UqKUbMyPMJ";
        callMethod(klass, "setPfUrl", argTypes, term12628, args);
    }

};


