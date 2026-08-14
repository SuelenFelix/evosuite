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

public class Outliner_Leaf_isLeaf_9282473450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318805;

    public Outliner_Leaf_isLeaf_9282473450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318843 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term318842 = ((Class) term318843).getDeclaredField((String) "PARAMETER");
        ((Field) term318842).setAccessible(true);
        Object enum1041 = ((Field) term318842).get((Object) null);
        term318805 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf"));
        setField(term318805, term318805.getClass(), "qname", "CNylzkbkqX");
        setIntField(term318805, term318805.getClass(), "offset", -709868952);
        setField(term318805, term318805.getClass(), "kind", enum1041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Leaf");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLeaf", argTypes, term318805, args);
    }

};


