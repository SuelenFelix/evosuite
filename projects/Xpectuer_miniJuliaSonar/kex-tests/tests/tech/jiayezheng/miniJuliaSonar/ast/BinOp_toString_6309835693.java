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

public class BinOp_toString_6309835693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30180;

    public BinOp_toString_6309835693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30180 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp"));
        setField(term30180, term30180.getClass(), "op", null);
        setField(term30180, term30180.getClass(), "left", null);
        setField(term30180, term30180.getClass(), "right", null);
        setBooleanField(term30180, term30180.getClass(), "vectorized", false);
        setField(term30180, term30180.getClass(), "nodeType", null);
        setIntField(term30180, term30180.getClass(), "start", 0);
        setIntField(term30180, term30180.getClass(), "end", 0);
        setField(term30180, term30180.getClass(), "file", null);
        setField(term30180, term30180.getClass(), "parent", null);
        setField(term30180, term30180.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30180, args);
    }

};


