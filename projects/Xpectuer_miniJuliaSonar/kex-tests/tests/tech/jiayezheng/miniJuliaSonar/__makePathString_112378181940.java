package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class __makePathString_112378181940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69001;

    public __makePathString_112378181940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69001 = (Object[]) newArray("java.lang.String", 9);
        setElement(term69001, 0, "cHZGcMhatT");
        setElement(term69001, 1, "OZGyrUPedG");
        setElement(term69001, 2, "GAxMzRqmXU");
        setElement(term69001, 3, "XMhUDGKSWO");
        setElement(term69001, 4, "jLgzxtuvVo");
        setElement(term69001, 5, "wmmxjOkPnH");
        setElement(term69001, 6, "jgRohUQWxJ");
        setElement(term69001, 7, "CJlAiZDIQO");
        setElement(term69001, 8, "osgWaTBVoE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69001;
        callMethod(klass, "makePathString", argTypes, null, args);
    }

};


