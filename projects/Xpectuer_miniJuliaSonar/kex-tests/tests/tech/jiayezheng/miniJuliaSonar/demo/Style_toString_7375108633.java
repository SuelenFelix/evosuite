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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Style_toString_7375108633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7983;

    public Style_toString_7375108633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8121 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term8120 = ((Class) term8121).getDeclaredField((String) "ANCHOR");
        ((Field) term8120).setAccessible(true);
        Object enum25 = ((Field) term8120).get((Object) null);
        ArrayList term8032 = new ArrayList();
        ((ArrayList) term8032).add("yGtHPyvYiQ");
        ((ArrayList) term8032).add("MvRIxilFMJ");
        ((ArrayList) term8032).add("iNwOJRBEjp");
        ((ArrayList) term8032).add("XylxrMBraH");
        ((ArrayList) term8032).add("pORebkoRdD");
        ((ArrayList) term8032).add("mXGCWJDOqA");
        ((ArrayList) term8032).add("dpNsDgfPso");
        term7983 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term7983, term7983.getClass(), "type", enum25);
        setIntField(term7983, term7983.getClass(), "start", 941650513);
        setIntField(term7983, term7983.getClass(), "end", 444029505);
        setField(term7983, term7983.getClass(), "message", "SJiQaLvSKv");
        setField(term7983, term7983.getClass(), "url", "OEXDRUKcFl");
        setField(term7983, term7983.getClass(), "id", "RYdKCNNMBR");
        setField(term7983, term7983.getClass(), "highlight", term8032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7983, args);
    }

};


