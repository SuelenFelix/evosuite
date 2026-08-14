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

public class Outliner_Leaf_isBranch_13142065731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319091;

    public Outliner_Leaf_isBranch_13142065731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term319128 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term319127 = ((Class) term319128).getDeclaredField((String) "VARIABLE");
        ((Field) term319127).setAccessible(true);
        Object enum1042 = ((Field) term319127).get((Object) null);
        term319091 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf"));
        setField(term319091, term319091.getClass(), "qname", "MZOvhvkbNL");
        setIntField(term319091, term319091.getClass(), "offset", 847207929);
        setField(term319091, term319091.getClass(), "kind", enum1042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBranch", argTypes, term319091, args);
    }

};


