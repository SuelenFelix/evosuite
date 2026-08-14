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

public class StyleApplier_escape_4888056743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9925;

    public StyleApplier_escape_4888056743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9925 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term9926 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9927 = (byte[]) newByteArray(16);
        setField(term9925, term9925.getClass(), "tags", null);
        setField(term9926, term9926.getClass(), "value", term9927);
        setByteField(term9926, term9926.getClass(), "coder", (byte) -10);
        setIntField(term9926, term9926.getClass(), "count", 1045657203);
        setField(term9925, term9925.getClass(), "buffer", term9926);
        setField(term9925, term9925.getClass(), "source", "igCAtimmYB");
        setIntField(term9925, term9925.getClass(), "sourceOffset", 1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DyiXbeYIaN";
        callMethod(klass, "escape", argTypes, term9925, args);
    }

};


