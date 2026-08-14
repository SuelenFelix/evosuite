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
     Object term8935;
     Object term8956;

    public HtmlOutline_addOutline_10666569473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8935 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline"));
        Object term8936 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8937 = (byte[]) newByteArray(16);
        setField(term8935, term8935.getClass(), "analyzer", null);
        setField(term8936, term8936.getClass(), "value", term8937);
        setByteField(term8936, term8936.getClass(), "coder", (byte) 75);
        setIntField(term8936, term8936.getClass(), "count", -894662986);
        setField(term8935, term8935.getClass(), "buffer", term8936);
        term8956 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.HtmlOutline");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term8956;
        callMethod(klass, "addOutline", argTypes, term8935, args);
    }

};


