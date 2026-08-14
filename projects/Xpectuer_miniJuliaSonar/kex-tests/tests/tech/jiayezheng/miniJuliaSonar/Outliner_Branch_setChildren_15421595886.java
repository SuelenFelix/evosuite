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
import java.util.LinkedList;

public class Outliner_Branch_setChildren_15421595886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248807;
     Object term248834;

    public Outliner_Branch_setChildren_15421595886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248808 = new ArrayList();
        Class<? extends Object> term248848 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term248847 = ((Class) term248848).getDeclaredField((String) "SCOPE");
        ((Field) term248847).setAccessible(true);
        Object enum812 = ((Field) term248847).get((Object) null);
        term248807 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term248807, term248807.getClass(), "children", term248808);
        setField(term248807, term248807.getClass(), "qname", "NobNtKSnxv");
        setIntField(term248807, term248807.getClass(), "offset", -1602072035);
        setField(term248807, term248807.getClass(), "kind", enum812);
        term248834 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term248834;
        callMethod(klass, "setChildren", argTypes, term248807, args);
    }

};


