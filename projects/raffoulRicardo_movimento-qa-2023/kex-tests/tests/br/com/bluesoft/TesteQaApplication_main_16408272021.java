package br.com.bluesoft;

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
import static br.com.bluesoft.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TesteQaApplication_main_16408272021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1209;

    public TesteQaApplication_main_16408272021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1209 = (Object[]) newArray("java.lang.String", 5);
        setElement(term1209, 0, "jDtqGUpnZN");
        setElement(term1209, 1, "nGKItKLYNC");
        setElement(term1209, 2, "UiUYnPrcCi");
        setElement(term1209, 3, "UoYtihxVaS");
        setElement(term1209, 4, "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.TesteQaApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1209;
        callMethod(klass, "main", argTypes, null, args);
    }

};


