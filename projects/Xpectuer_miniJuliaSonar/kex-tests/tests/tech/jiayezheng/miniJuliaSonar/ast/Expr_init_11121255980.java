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

public class Expr_init_11121255980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4837;
     Object term4847;
     Object term4849;

    public Expr_init_11121255980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4837 = new LinkedList();
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        ((LinkedList) term4837).add((Object)null);
        term4847 = new Integer(1962444399);
        term4849 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Expr");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term4837;
        args[1] = term4847;
        args[2] = term4849;
        args[3] = "SbAoxhfrkn";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


