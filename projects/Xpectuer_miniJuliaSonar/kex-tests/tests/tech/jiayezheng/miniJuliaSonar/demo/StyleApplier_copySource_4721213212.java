package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class StyleApplier_copySource_4721213212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9861;
     Object term9895;
     Object term9897;

    public StyleApplier_copySource_4721213212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9861 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term9862 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9863 = (byte[]) newByteArray(16);
        setField(term9861, term9861.getClass(), "tags", null);
        setField(term9862, term9862.getClass(), "value", term9863);
        setByteField(term9862, term9862.getClass(), "coder", (byte) -54);
        setIntField(term9862, term9862.getClass(), "count", 691577392);
        setField(term9861, term9861.getClass(), "buffer", term9862);
        setField(term9861, term9861.getClass(), "source", "jXzmYyrnnT");
        setIntField(term9861, term9861.getClass(), "sourceOffset", -893623680);
        term9895 = new Integer(-1963434938);
        term9897 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9895;
        args[1] = term9897;
        callMethod(klass, "copySource", argTypes, term9861, args);
    }

};


