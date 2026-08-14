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

public class TupleType_hashCode_852254724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39755;

    public TupleType_hashCode_852254724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39755 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        setField(term39755, term39755.getClass(), "eltTypes", null);
        setField(term39755, term39755.getClass(), "table", null);
        setField(term39755, term39755.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term39755, args);
    }

};


