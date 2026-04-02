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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Operator_init_21447798750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum94;
     Object term28650;
     Object term28652;

    public Operator_init_21447798750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28667 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term28666 = ((Class) term28667).getDeclaredField((String) "In1");
        ((Field) term28666).setAccessible(true);
        enum94 = ((Field) term28666).get((Object) null);
        term28650 = new Integer(-1870495012);
        term28652 = new Integer(-1310015129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Operator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Op");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = enum94;
        args[1] = term28650;
        args[2] = term28652;
        args[3] = "igCAtimmYB";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


