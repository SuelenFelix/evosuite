package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Binding_compareTo_69408950116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24605;

    public Binding_compareTo_69408950116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24605 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24605, term24605.getClass(), "isBuiltin", false);
        setBooleanField(term24605, term24605.getClass(), "isSynthetic", false);
        setField(term24605, term24605.getClass(), "name", null);
        setField(term24605, term24605.getClass(), "node", null);
        setField(term24605, term24605.getClass(), "qname", null);
        setField(term24605, term24605.getClass(), "type", null);
        setField(term24605, term24605.getClass(), "kind", null);
        setField(term24605, term24605.getClass(), "refs", null);
        setIntField(term24605, term24605.getClass(), "start", 0);
        setIntField(term24605, term24605.getClass(), "end", 0);
        setIntField(term24605, term24605.getClass(), "bodyStart", 0);
        setIntField(term24605, term24605.getClass(), "bodyEnd", 0);
        setField(term24605, term24605.getClass(), "fileOrUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term24605, args);
    }

};


