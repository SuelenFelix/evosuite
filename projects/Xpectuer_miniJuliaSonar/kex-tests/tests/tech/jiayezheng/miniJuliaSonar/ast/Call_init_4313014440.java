package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class Call_init_4313014440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2096;
     Object term2100;
     Object term2103;
     Object term2105;

    public Call_init_4313014440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2096 = new LinkedList();
        ((LinkedList) term2096).add((Object)null);
        term2100 = new LinkedList();
        term2103 = new Integer(1725571209);
        term2105 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term2096;
        args[2] = term2100;
        args[3] = term2103;
        args[4] = term2105;
        args[5] = "hRNSzYYIrc";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


