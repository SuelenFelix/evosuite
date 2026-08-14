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

public class WslDistribution_getName_7909356761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public WslDistribution_getName_7909356761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.github.nscuro.bradamsang.wsl.WslDistribution"));
        setField(term27, term27.getClass(), "name", "sjlJAEtRrb");
        setBooleanField(term27, term27.getClass(), "isDefault", false);
        setIntField(term27, term27.getClass(), "wslVersion", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nscuro.bradamsang.wsl.WslDistribution");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term27, args);
    }

};


