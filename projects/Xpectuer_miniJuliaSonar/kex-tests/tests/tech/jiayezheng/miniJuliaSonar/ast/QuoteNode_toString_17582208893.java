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

public class QuoteNode_toString_17582208893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17169;

    public QuoteNode_toString_17582208893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17169 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.QuoteNode"));
        setField(term17169, term17169.getClass(), "name", null);
        setField(term17169, term17169.getClass(), "nodeType", null);
        setIntField(term17169, term17169.getClass(), "start", 0);
        setIntField(term17169, term17169.getClass(), "end", 0);
        setField(term17169, term17169.getClass(), "file", null);
        setField(term17169, term17169.getClass(), "parent", null);
        setField(term17169, term17169.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.QuoteNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17169, args);
    }

};


