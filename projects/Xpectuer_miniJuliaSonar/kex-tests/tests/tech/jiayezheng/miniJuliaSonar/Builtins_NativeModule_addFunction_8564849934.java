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
import java.lang.String;
import java.lang.Object;

public class Builtins_NativeModule_addFunction_8564849934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327384;

    public Builtins_NativeModule_addFunction_8564849934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327456 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term327455 = ((Class) term327456).getDeclaredField((String) "Continue");
        ((Field) term327455).setAccessible(true);
        Object enum1069 = ((Field) term327455).get((Object) null);
        term327384 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url"));
        setField(term327384, term327384.getClass(), "url", "SUnxanDYGI");
        setField(term327384, term327384.getClass(), "nodeType", enum1069);
        setIntField(term327384, term327384.getClass(), "start", 1670041824);
        setIntField(term327384, term327384.getClass(), "end", 2140388634);
        setField(term327384, term327384.getClass(), "file", "ThlPiSQgoR");
        setField(term327384, term327384.getClass(), "parent", null);
        setField(term327384, term327384.getClass(), "name", "vhFgNCkSjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins$NativeModule");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Url");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[3];
        args[0] = "OKqcbFoTHp";
        args[1] = term327384;
        args[2] = null;
        callMethod(klass, "addFunction", argTypes, null, args);
    }

};


