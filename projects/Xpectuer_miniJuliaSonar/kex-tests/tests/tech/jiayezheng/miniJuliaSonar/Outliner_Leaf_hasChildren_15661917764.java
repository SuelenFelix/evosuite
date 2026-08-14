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

public class Outliner_Leaf_hasChildren_15661917764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319655;

    public Outliner_Leaf_hasChildren_15661917764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term319690 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term319689 = ((Class) term319690).getDeclaredField((String) "MODULE");
        ((Field) term319689).setAccessible(true);
        Object enum1044 = ((Field) term319689).get((Object) null);
        term319655 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf"));
        setField(term319655, term319655.getClass(), "qname", "PiqFzmVzrH");
        setIntField(term319655, term319655.getClass(), "offset", 1574458332);
        setField(term319655, term319655.getClass(), "kind", enum1044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasChildren", argTypes, term319655, args);
    }

};


