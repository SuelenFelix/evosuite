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

public class HtmlOutline_addEntry_8262489054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8969;

    public HtmlOutline_addEntry_8262489054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8969 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term8970 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8971 = (byte[]) newByteArray(16);
        setField(term8969, term8969.getClass(), "analyzer", null);
        setField(term8970, term8970.getClass(), "value", term8971);
        setByteField(term8970, term8970.getClass(), "coder", (byte) 18);
        setIntField(term8970, term8970.getClass(), "count", 304775596);
        setField(term8969, term8969.getClass(), "buffer", term8970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEntry", argTypes, term8969, args);
    }

};


