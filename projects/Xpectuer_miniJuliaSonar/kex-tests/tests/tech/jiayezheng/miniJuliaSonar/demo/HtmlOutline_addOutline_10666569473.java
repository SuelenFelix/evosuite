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
import java.util.LinkedList;

public class HtmlOutline_addOutline_10666569473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8929;
     Object term8950;

    public HtmlOutline_addOutline_10666569473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8929 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term8930 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8931 = (byte[]) newByteArray(16);
        setField(term8929, term8929.getClass(), "analyzer", null);
        setField(term8930, term8930.getClass(), "value", term8931);
        setByteField(term8930, term8930.getClass(), "coder", (byte) 75);
        setIntField(term8930, term8930.getClass(), "count", -894662986);
        setField(term8929, term8929.getClass(), "buffer", term8930);
        term8950 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term8950;
        callMethod(klass, "addOutline", argTypes, term8929, args);
    }

};


