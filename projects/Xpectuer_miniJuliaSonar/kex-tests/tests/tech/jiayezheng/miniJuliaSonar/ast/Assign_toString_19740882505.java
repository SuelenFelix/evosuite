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

public class Assign_toString_19740882505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15744;

    public Assign_toString_19740882505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15744 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign"));
        setField(term15744, term15744.getClass(), "target", null);
        setField(term15744, term15744.getClass(), "value", null);
        setBooleanField(term15744, term15744.getClass(), "nonLocal", false);
        setField(term15744, term15744.getClass(), "nodeType", null);
        setIntField(term15744, term15744.getClass(), "start", 0);
        setIntField(term15744, term15744.getClass(), "end", 0);
        setField(term15744, term15744.getClass(), "file", null);
        setField(term15744, term15744.getClass(), "parent", null);
        setField(term15744, term15744.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15744, args);
    }

};


