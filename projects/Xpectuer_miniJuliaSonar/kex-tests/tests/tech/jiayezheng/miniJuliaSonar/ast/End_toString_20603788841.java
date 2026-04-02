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

public class End_toString_20603788841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51445;

    public End_toString_20603788841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51484 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term51483 = ((Class) term51484).getDeclaredField((String) "Complex");
        ((Field) term51483).setAccessible(true);
        Object enum171 = ((Field) term51483).get((Object) null);
        term51445 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.End"));
        setField(term51445, term51445.getClass(), "nodeType", enum171);
        setIntField(term51445, term51445.getClass(), "start", -1529797673);
        setIntField(term51445, term51445.getClass(), "end", -868676396);
        setField(term51445, term51445.getClass(), "file", "NTWMiBEaDF");
        setField(term51445, term51445.getClass(), "parent", null);
        setField(term51445, term51445.getClass(), "name", "SPBstwKFVr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.End");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term51445, args);
    }

};


