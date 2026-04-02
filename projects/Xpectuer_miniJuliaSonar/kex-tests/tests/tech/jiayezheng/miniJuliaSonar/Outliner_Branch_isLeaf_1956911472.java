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

public class Outliner_Branch_isLeaf_1956911472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247649;

    public Outliner_Branch_isLeaf_1956911472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term247650 = new ArrayList();
        Class<? extends Object> term247690 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term247689 = ((Class) term247690).getDeclaredField((String) "FUNCTION");
        ((Field) term247689).setAccessible(true);
        Object enum808 = ((Field) term247689).get((Object) null);
        term247649 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term247649, term247649.getClass(), "children", term247650);
        setField(term247649, term247649.getClass(), "qname", "jMaSLvIsta");
        setIntField(term247649, term247649.getClass(), "offset", 950385621);
        setField(term247649, term247649.getClass(), "kind", enum808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLeaf", argTypes, term247649, args);
    }

};


