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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Outliner_Branch_getChildren_15731440865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248517;

    public Outliner_Branch_getChildren_15731440865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248518 = new ArrayList();
        Class<? extends Object> term248559 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term248558 = ((Class) term248559).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term248558).setAccessible(true);
        Object enum811 = ((Field) term248558).get((Object) null);
        term248517 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term248517, term248517.getClass(), "children", term248518);
        setField(term248517, term248517.getClass(), "qname", "STfCNGDtwG");
        setIntField(term248517, term248517.getClass(), "offset", -139694079);
        setField(term248517, term248517.getClass(), "kind", enum811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term248517, args);
    }

};


