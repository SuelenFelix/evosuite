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

public class Outliner_Branch_isBranch_1902680813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247941;

    public Outliner_Branch_isBranch_1902680813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term247942 = new ArrayList();
        Class<? extends Object> term247983 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term247982 = ((Class) term247983).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term247982).setAccessible(true);
        Object enum809 = ((Field) term247982).get((Object) null);
        term247941 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term247941, term247941.getClass(), "children", term247942);
        setField(term247941, term247941.getClass(), "qname", "sSyiKfZXEJ");
        setIntField(term247941, term247941.getClass(), "offset", -232352320);
        setField(term247941, term247941.getClass(), "kind", enum809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBranch", argTypes, term247941, args);
    }

};


