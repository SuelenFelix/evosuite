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

public class For_toString_20603476983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4834;

    public For_toString_20603476983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4834 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.For"));
        setField(term4834, term4834.getClass(), "target", null);
        setField(term4834, term4834.getClass(), "iter", null);
        setField(term4834, term4834.getClass(), "body", null);
        setField(term4834, term4834.getClass(), "nodeType", null);
        setIntField(term4834, term4834.getClass(), "start", 0);
        setIntField(term4834, term4834.getClass(), "end", 0);
        setField(term4834, term4834.getClass(), "file", null);
        setField(term4834, term4834.getClass(), "parent", null);
        setField(term4834, term4834.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.For");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4834, args);
    }

};


