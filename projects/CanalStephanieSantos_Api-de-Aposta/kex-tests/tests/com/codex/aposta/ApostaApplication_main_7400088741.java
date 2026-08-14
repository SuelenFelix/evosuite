package com.codex.aposta;

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
import static com.codex.aposta.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ApostaApplication_main_7400088741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202;

    public ApostaApplication_main_7400088741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1202 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1202, 0, "UiUYnPrcCi");
        setElement(term1202, 1, "UoYtihxVaS");
        setElement(term1202, 2, "JDswTTCZHV");
        setElement(term1202, 3, "onpbIeEKoi");
        setElement(term1202, 4, "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codex.aposta.ApostaApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1202;
        callMethod(klass, "main", argTypes, null, args);
    }

};


