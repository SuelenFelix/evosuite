package org.zerhusen;

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
import static org.zerhusen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JwtDemoApplication_main_2712555451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;

    public JwtDemoApplication_main_2712555451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term802 = (Object[]) newArray("java.lang.String", 5);
        setElement(term802, 0, "kuTXqwMtDB");
        setElement(term802, 1, "Ghbwtircqb");
        setElement(term802, 2, "xrwlQZdwCp");
        setElement(term802, 3, "IDCWpPLRkE");
        setElement(term802, 4, "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.JwtDemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term802;
        callMethod(klass, "main", argTypes, null, args);
    }

};


