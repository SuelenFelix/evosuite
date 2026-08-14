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

public class Binding_setQname_137069510517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24618;

    public Binding_setQname_137069510517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24618 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24618, term24618.getClass(), "isBuiltin", false);
        setBooleanField(term24618, term24618.getClass(), "isSynthetic", false);
        setField(term24618, term24618.getClass(), "name", null);
        setField(term24618, term24618.getClass(), "node", null);
        setField(term24618, term24618.getClass(), "qname", null);
        setField(term24618, term24618.getClass(), "type", null);
        setField(term24618, term24618.getClass(), "kind", null);
        setField(term24618, term24618.getClass(), "refs", null);
        setIntField(term24618, term24618.getClass(), "start", 0);
        setIntField(term24618, term24618.getClass(), "end", 0);
        setIntField(term24618, term24618.getClass(), "bodyStart", 0);
        setIntField(term24618, term24618.getClass(), "bodyEnd", 0);
        setField(term24618, term24618.getClass(), "fileOrUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQname", argTypes, term24618, args);
    }

};


