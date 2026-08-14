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

public class Style_toString_7375108637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8491;

    public Style_toString_7375108637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8491 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term8491, term8491.getClass(), "type", null);
        setIntField(term8491, term8491.getClass(), "start", 0);
        setIntField(term8491, term8491.getClass(), "end", 0);
        setField(term8491, term8491.getClass(), "message", null);
        setField(term8491, term8491.getClass(), "url", null);
        setField(term8491, term8491.getClass(), "id", null);
        setField(term8491, term8491.getClass(), "highlight", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8491, args);
    }

};


