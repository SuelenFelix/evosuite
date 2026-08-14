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

public class Outliner_Leaf_getChildren_4492055945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319929;

    public Outliner_Leaf_getChildren_4492055945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term319964 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term319963 = ((Class) term319964).getDeclaredField((String) "METHOD");
        ((Field) term319963).setAccessible(true);
        Object enum1045 = ((Field) term319963).get((Object) null);
        term319929 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf"));
        setField(term319929, term319929.getClass(), "qname", "xGooBAPjZs");
        setIntField(term319929, term319929.getClass(), "offset", -975856245);
        setField(term319929, term319929.getClass(), "kind", enum1045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term319929, args);
    }

};


