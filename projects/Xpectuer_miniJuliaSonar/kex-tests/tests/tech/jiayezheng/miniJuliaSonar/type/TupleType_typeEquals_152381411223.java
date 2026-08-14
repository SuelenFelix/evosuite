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

public class TupleType_typeEquals_152381411223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39754;

    public TupleType_typeEquals_152381411223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39754 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        setField(term39754, term39754.getClass(), "eltTypes", null);
        setField(term39754, term39754.getClass(), "table", null);
        setField(term39754, term39754.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "typeEquals", argTypes, term39754, args);
    }

};


