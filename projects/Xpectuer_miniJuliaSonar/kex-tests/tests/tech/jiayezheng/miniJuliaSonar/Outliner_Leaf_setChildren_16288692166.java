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
import java.util.LinkedList;

public class Outliner_Leaf_setChildren_16288692166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320203;
     Object term320230;

    public Outliner_Leaf_setChildren_16288692166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term320244 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term320243 = ((Class) term320244).getDeclaredField((String) "PARAMETER");
        ((Field) term320243).setAccessible(true);
        Object enum1046 = ((Field) term320243).get((Object) null);
        term320203 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf"));
        setField(term320203, term320203.getClass(), "qname", "iAEyqLNmqO");
        setIntField(term320203, term320203.getClass(), "offset", -1023366103);
        setField(term320203, term320203.getClass(), "kind", enum1046);
        term320230 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term320230;
        callMethod(klass, "setChildren", argTypes, term320203, args);
    }

};


