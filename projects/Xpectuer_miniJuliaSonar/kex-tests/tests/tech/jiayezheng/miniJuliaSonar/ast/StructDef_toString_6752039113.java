package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StructDef_toString_6752039113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50824;

    public StructDef_toString_6752039113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50824 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef"));
        setBooleanField(term50824, term50824.getClass(), "mutable", false);
        setField(term50824, term50824.getClass(), "name", null);
        setField(term50824, term50824.getClass(), "baseType", null);
        setField(term50824, term50824.getClass(), "body", null);
        setField(term50824, term50824.getClass(), "nodeType", null);
        setIntField(term50824, term50824.getClass(), "start", 0);
        setIntField(term50824, term50824.getClass(), "end", 0);
        setField(term50824, term50824.getClass(), "file", null);
        setField(term50824, term50824.getClass(), "parent", null);
        setField(term50824, term50824.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term50824, args);
    }

};


