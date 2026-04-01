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

public class MyObject_toString_99391000710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;

    public MyObject_toString_99391000710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term675 = new ArrayList();
        ((ArrayList) term675).add((Object)null);
        ((ArrayList) term675).add((Object)null);
        ((ArrayList) term675).add((Object)null);
        ((ArrayList) term675).add((Object)null);
        ((ArrayList) term675).add((Object)null);
        Object term674 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term674, term674.getClass(), "children", term675);
        setField(term674, term674.getClass(), "description", "");
        setLongField(term674, term674.getClass(), "size", 4474998035090263139L);
        setBooleanField(term674, term674.getClass(), "enabled", false);
        ArrayList term682 = new ArrayList();
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        ((ArrayList) term682).add((Object)null);
        Object term681 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term681, term681.getClass(), "children", term682);
        setField(term681, term681.getClass(), "description", "");
        setLongField(term681, term681.getClass(), "size", 50358265865610362L);
        setBooleanField(term681, term681.getClass(), "enabled", false);
        ArrayList term672 = new ArrayList();
        ((ArrayList) term672).add(term674);
        ((ArrayList) term672).add(term681);
        term671 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term671, term671.getClass(), "children", term672);
        setField(term671, term671.getClass(), "description", "swZVeJAxjt");
        setLongField(term671, term671.getClass(), "size", 2848819812340321742L);
        setBooleanField(term671, term671.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term671, args);
    }

};


