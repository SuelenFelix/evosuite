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

public class Binding_isSynthetic_39689902523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24654;

    public Binding_isSynthetic_39689902523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24654 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24654, term24654.getClass(), "isBuiltin", false);
        setBooleanField(term24654, term24654.getClass(), "isSynthetic", false);
        setField(term24654, term24654.getClass(), "name", null);
        setField(term24654, term24654.getClass(), "node", null);
        setField(term24654, term24654.getClass(), "qname", null);
        setField(term24654, term24654.getClass(), "type", null);
        setField(term24654, term24654.getClass(), "kind", null);
        setField(term24654, term24654.getClass(), "refs", null);
        setIntField(term24654, term24654.getClass(), "start", 0);
        setIntField(term24654, term24654.getClass(), "end", 0);
        setIntField(term24654, term24654.getClass(), "bodyStart", 0);
        setIntField(term24654, term24654.getClass(), "bodyEnd", 0);
        setField(term24654, term24654.getClass(), "fileOrUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSynthetic", argTypes, term24654, args);
    }

};


