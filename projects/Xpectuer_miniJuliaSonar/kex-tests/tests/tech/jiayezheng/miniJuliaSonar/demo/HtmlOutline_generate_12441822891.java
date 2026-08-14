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

public class HtmlOutline_generate_12441822891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8817;

    public HtmlOutline_generate_12441822891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8817 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term8818 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8819 = (byte[]) newByteArray(16);
        setField(term8817, term8817.getClass(), "analyzer", null);
        setField(term8818, term8818.getClass(), "value", term8819);
        setByteField(term8818, term8818.getClass(), "coder", (byte) 48);
        setIntField(term8818, term8818.getClass(), "count", -1034506028);
        setField(term8817, term8817.getClass(), "buffer", term8818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "generate", argTypes, term8817, args);
    }

};


