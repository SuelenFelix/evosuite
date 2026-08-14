package com.github.nscuro.bradamsang.wsl;

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
import static com.github.nscuro.bradamsang.wsl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WslDistribution_getWslVersion_18993415803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;

    public WslDistribution_getWslVersion_18993415803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("com.github.nscuro.bradamsang.wsl.WslDistribution"));
        setField(term77, term77.getClass(), "name", "xxtlPwDYFs");
        setBooleanField(term77, term77.getClass(), "isDefault", false);
        setIntField(term77, term77.getClass(), "wslVersion", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.wsl.WslDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWslVersion", argTypes, term77, args);
    }

};


