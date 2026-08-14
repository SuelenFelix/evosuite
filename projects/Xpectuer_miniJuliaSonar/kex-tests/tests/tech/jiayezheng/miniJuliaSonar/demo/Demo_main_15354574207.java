package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Demo_main_15354574207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8618;

    public Demo_main_15354574207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8618 = (Object[]) newArray("java.lang.String", 9);
        setElement(term8618, 0, "SdCKLMIYnX");
        setElement(term8618, 1, "OJJtVNPyKZ");
        setElement(term8618, 2, "AKNapTAfmD");
        setElement(term8618, 3, "xJgPlLxpgC");
        setElement(term8618, 4, "EYtfuJaxiM");
        setElement(term8618, 5, "gCWtLVKVVe");
        setElement(term8618, 6, "fWKJoSoCwE");
        setElement(term8618, 7, "wfaXBpWAUH");
        setElement(term8618, 8, "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Demo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8618;
        callMethod(klass, "main", argTypes, null, args);
    }

};


