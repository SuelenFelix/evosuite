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

public class Assign_unpackTargetsSymbols_16560109261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15122;

    public Assign_unpackTargetsSymbols_16560109261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15163 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term15162 = ((Class) term15163).getDeclaredField((String) "Operator");
        ((Field) term15162).setAccessible(true);
        Object enum49 = ((Field) term15162).get((Object) null);
        term15122 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign"));
        setField(term15122, term15122.getClass(), "target", null);
        setField(term15122, term15122.getClass(), "value", null);
        setBooleanField(term15122, term15122.getClass(), "nonLocal", true);
        setField(term15122, term15122.getClass(), "nodeType", enum49);
        setIntField(term15122, term15122.getClass(), "start", 941650513);
        setIntField(term15122, term15122.getClass(), "end", 444029505);
        setField(term15122, term15122.getClass(), "file", "jUbSRrkrYZ");
        setField(term15122, term15122.getClass(), "parent", null);
        setField(term15122, term15122.getClass(), "name", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unpackTargetsSymbols", argTypes, term15122, args);
    }

};


