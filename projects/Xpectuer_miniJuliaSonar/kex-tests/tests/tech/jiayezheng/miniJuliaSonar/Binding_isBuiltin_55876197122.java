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

public class Binding_isBuiltin_55876197122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24647;

    public Binding_isBuiltin_55876197122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24647 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24647, term24647.getClass(), "isBuiltin", false);
        setBooleanField(term24647, term24647.getClass(), "isSynthetic", false);
        setField(term24647, term24647.getClass(), "name", null);
        setField(term24647, term24647.getClass(), "node", null);
        setField(term24647, term24647.getClass(), "qname", null);
        setField(term24647, term24647.getClass(), "type", null);
        setField(term24647, term24647.getClass(), "kind", null);
        setField(term24647, term24647.getClass(), "refs", null);
        setIntField(term24647, term24647.getClass(), "start", 0);
        setIntField(term24647, term24647.getClass(), "end", 0);
        setIntField(term24647, term24647.getClass(), "bodyStart", 0);
        setIntField(term24647, term24647.getClass(), "bodyEnd", 0);
        setField(term24647, term24647.getClass(), "fileOrUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBuiltin", argTypes, term24647, args);
    }

};


