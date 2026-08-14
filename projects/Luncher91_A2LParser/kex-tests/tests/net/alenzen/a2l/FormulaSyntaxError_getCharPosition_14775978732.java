package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FormulaSyntaxError_getCharPosition_14775978732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20420;

    public FormulaSyntaxError_getCharPosition_14775978732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20420 = newInstance(Class.forName("net.alenzen.a2l.FormulaSyntaxError"));
        setIntField(term20420, term20420.getClass(), "line", 1265463001);
        setIntField(term20420, term20420.getClass(), "charPosition", 335112684);
        setField(term20420, term20420.getClass(), "message", "ZkMALXpEAZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.FormulaSyntaxError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharPosition", argTypes, term20420, args);
    }

};


