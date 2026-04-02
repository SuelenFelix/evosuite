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
     Object term248801;
     Object term248828;

    public Outliner_Branch_setChildren_15421595886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term248802 = new ArrayList();
        Class<? extends Object> term248842 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term248841 = ((Class) term248842).getDeclaredField((String) "SCOPE");
        ((Field) term248841).setAccessible(true);
        Object enum812 = ((Field) term248841).get((Object) null);
        term248801 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch"));
        setField(term248801, term248801.getClass(), "children", term248802);
        setField(term248801, term248801.getClass(), "qname", "NobNtKSnxv");
        setIntField(term248801, term248801.getClass(), "offset", -1602072035);
        setField(term248801, term248801.getClass(), "kind", enum812);
        term248828 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Outliner$Branch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term248828;
        callMethod(klass, "setChildren", argTypes, term248801, args);
    }

};


