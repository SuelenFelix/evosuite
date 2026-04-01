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

public class Member_setMg_644503621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12968;
     Object term13057;

    public Member_setMg_644503621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12968 = newInstance(Class.forName("com.prac.react.model.dto.Member"));
        setIntField(term12968, term12968.getClass(), "memberNum", -523949691);
        setField(term12968, term12968.getClass(), "memberNumHash", "ZrchvNGMtd");
        setField(term12968, term12968.getClass(), "email", "WaEcyVlcIx");
        setField(term12968, term12968.getClass(), "pwd", "ONcbPCQnHd");
        setField(term12968, term12968.getClass(), "nickName", "AobDaplFLl");
        setField(term12968, term12968.getClass(), "countryCode", "pDkMNnAGgv");
        setIntField(term12968, term12968.getClass(), "age", 1398204340);
        setField(term12968, term12968.getClass(), "gender", "PaCpFXGzdX");
        setField(term12968, term12968.getClass(), "pfUrl", "FftYCNbnks");
        setIntField(term12968, term12968.getClass(), "mg", 229204365);
        setIntField(term12968, term12968.getClass(), "status", -461771056);
        term13057 = new Integer(-243422082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Member");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13057;
        callMethod(klass, "setMg", argTypes, term12968, args);
    }

};


