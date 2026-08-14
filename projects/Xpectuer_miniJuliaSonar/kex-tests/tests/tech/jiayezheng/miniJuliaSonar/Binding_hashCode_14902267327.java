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

public class Binding_hashCode_14902267327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24688;

    public Binding_hashCode_14902267327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24688 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24688, term24688.getClass(), "isBuiltin", false);
        setBooleanField(term24688, term24688.getClass(), "isSynthetic", false);
        setField(term24688, term24688.getClass(), "name", null);
        setField(term24688, term24688.getClass(), "node", null);
        setField(term24688, term24688.getClass(), "qname", null);
        setField(term24688, term24688.getClass(), "type", null);
        setField(term24688, term24688.getClass(), "kind", null);
        setField(term24688, term24688.getClass(), "refs", null);
        setIntField(term24688, term24688.getClass(), "start", 0);
        setIntField(term24688, term24688.getClass(), "end", 0);
        setIntField(term24688, term24688.getClass(), "bodyStart", 0);
        setIntField(term24688, term24688.getClass(), "bodyEnd", 0);
        setField(term24688, term24688.getClass(), "fileOrUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24688, args);
    }

};


