package com.example.JwtAuthentication;

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
import static com.example.JwtAuthentication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JwtAuthenticationApplication_main_20855919251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4828;

    public JwtAuthenticationApplication_main_20855919251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4828 = (Object[]) newArray("java.lang.String", 9);
        setElement(term4828, 0, "tlQSNgTkQX");
        setElement(term4828, 1, "PCipZnmBOF");
        setElement(term4828, 2, "zcorEihhLK");
        setElement(term4828, 3, "GrqozDKFOk");
        setElement(term4828, 4, "CFyoseFGLF");
        setElement(term4828, 5, "SFqCrhEWLm");
        setElement(term4828, 6, "GZdcJyZntS");
        setElement(term4828, 7, "OIHoJeysUi");
        setElement(term4828, 8, "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.JwtAuthenticationApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4828;
        callMethod(klass, "main", argTypes, null, args);
    }

};


