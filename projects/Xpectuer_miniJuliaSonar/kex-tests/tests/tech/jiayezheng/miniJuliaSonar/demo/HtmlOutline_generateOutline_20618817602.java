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

public class HtmlOutline_generateOutline_20618817602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8876;

    public HtmlOutline_generateOutline_20618817602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8876 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term8877 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8878 = (byte[]) newByteArray(16);
        setField(term8876, term8876.getClass(), "analyzer", null);
        setField(term8877, term8877.getClass(), "value", term8878);
        setByteField(term8877, term8877.getClass(), "coder", (byte) 89);
        setIntField(term8877, term8877.getClass(), "count", -1263114719);
        setField(term8876, term8876.getClass(), "buffer", term8877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Analyzer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "ZzIujlwVsw";
        callMethod(klass, "generateOutline", argTypes, term8876, args);
    }

};


