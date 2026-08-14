package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class MyObject_addChildren_13248240028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582;
     Object term608;

    public MyObject_addChildren_13248240028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term586 = new ArrayList();
        Object term585 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term585, term585.getClass(), "children", term586);
        setField(term585, term585.getClass(), "description", "");
        setLongField(term585, term585.getClass(), "size", 414749984815662075L);
        setBooleanField(term585, term585.getClass(), "enabled", true);
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add(term585);
        term582 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term582, term582.getClass(), "children", term583);
        setField(term582, term582.getClass(), "description", "whBvTVIIlC");
        setLongField(term582, term582.getClass(), "size", 463622836963501975L);
        setBooleanField(term582, term582.getClass(), "enabled", false);
        term608 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term608;
        callMethod(klass, "addChildren", argTypes, term582, args);
    }

};


