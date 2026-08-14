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

public class StyleApplier_apply_13239975101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9801;

    public StyleApplier_apply_13239975101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9801 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        Object term9802 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9803 = (byte[]) newByteArray(16);
        setField(term9801, term9801.getClass(), "tags", null);
        setField(term9802, term9802.getClass(), "value", term9803);
        setByteField(term9802, term9802.getClass(), "coder", (byte) -29);
        setIntField(term9802, term9802.getClass(), "count", 1141317871);
        setField(term9801, term9801.getClass(), "buffer", term9802);
        setField(term9801, term9801.getClass(), "source", "JmcmxoGhIK");
        setIntField(term9801, term9801.getClass(), "sourceOffset", 890669485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "apply", argTypes, term9801, args);
    }

};


