package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class VectorType_toTupleType_104396608911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65475;
     Object term65476;

    public VectorType_toTupleType_104396608911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65475 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.VectorType"));
        setField(term65475, term65475.getClass(), "eltType", null);
        setField(term65475, term65475.getClass(), "positional", null);
        setField(term65475, term65475.getClass(), "values", null);
        setField(term65475, term65475.getClass(), "table", null);
        setField(term65475, term65475.getClass(), "file", null);
        term65476 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.VectorType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65476;
        callMethod(klass, "toTupleType", argTypes, term65475, args);
    }

};


