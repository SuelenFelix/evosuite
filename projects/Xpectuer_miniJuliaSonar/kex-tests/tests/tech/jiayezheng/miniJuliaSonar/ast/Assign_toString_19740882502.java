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

public class Assign_toString_19740882502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15428;

    public Assign_toString_19740882502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15469 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term15468 = ((Class) term15469).getDeclaredField((String) "Continue");
        ((Field) term15468).setAccessible(true);
        Object enum50 = ((Field) term15468).get((Object) null);
        term15428 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign"));
        setField(term15428, term15428.getClass(), "target", null);
        setField(term15428, term15428.getClass(), "value", null);
        setBooleanField(term15428, term15428.getClass(), "nonLocal", true);
        setField(term15428, term15428.getClass(), "nodeType", enum50);
        setIntField(term15428, term15428.getClass(), "start", -1034506028);
        setIntField(term15428, term15428.getClass(), "end", -1263114719);
        setField(term15428, term15428.getClass(), "file", "cAPeiZHKGJ");
        setField(term15428, term15428.getClass(), "parent", null);
        setField(term15428, term15428.getClass(), "name", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Assign");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15428, args);
    }

};


