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

public class UnionType_typeEquals_40501560919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55629;

    public UnionType_typeEquals_40501560919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55629 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        setField(term55629, term55629.getClass(), "types", null);
        setField(term55629, term55629.getClass(), "table", null);
        setField(term55629, term55629.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "typeEquals", argTypes, term55629, args);
    }

};


