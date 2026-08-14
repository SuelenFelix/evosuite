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
     Object term69007;

    public __makePathString_112378181940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69007 = (Object[]) newArray("java.lang.String", 9);
        setElement(term69007, 0, "cHZGcMhatT");
        setElement(term69007, 1, "OZGyrUPedG");
        setElement(term69007, 2, "GAxMzRqmXU");
        setElement(term69007, 3, "XMhUDGKSWO");
        setElement(term69007, 4, "jLgzxtuvVo");
        setElement(term69007, 5, "wmmxjOkPnH");
        setElement(term69007, 6, "jgRohUQWxJ");
        setElement(term69007, 7, "CJlAiZDIQO");
        setElement(term69007, 8, "osgWaTBVoE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term69007;
        callMethod(klass, "makePathString", argTypes, null, args);
    }

};


