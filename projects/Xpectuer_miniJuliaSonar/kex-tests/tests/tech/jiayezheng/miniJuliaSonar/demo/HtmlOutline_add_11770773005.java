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

public class HtmlOutline_add_11770773005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9012;

    public HtmlOutline_add_11770773005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9012 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term9013 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9014 = (byte[]) newByteArray(16);
        setField(term9012, term9012.getClass(), "analyzer", null);
        setField(term9013, term9013.getClass(), "value", term9014);
        setByteField(term9013, term9013.getClass(), "coder", (byte) -58);
        setIntField(term9013, term9013.getClass(), "count", -1347665717);
        setField(term9012, term9012.getClass(), "buffer", term9013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LWyEaeIyAo";
        callMethod(klass, "add", argTypes, term9012, args);
    }

};


