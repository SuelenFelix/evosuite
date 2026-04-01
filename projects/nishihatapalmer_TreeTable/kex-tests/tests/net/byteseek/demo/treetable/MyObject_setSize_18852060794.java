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
import java.lang.Long;

public class MyObject_setSize_18852060794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;
     Object term333;

    public MyObject_setSize_18852060794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297 = new ArrayList();
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        ((ArrayList) term297).add((Object)null);
        Object term296 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term296, term296.getClass(), "children", term297);
        setField(term296, term296.getClass(), "description", "");
        setLongField(term296, term296.getClass(), "size", -5892135042702373494L);
        setBooleanField(term296, term296.getClass(), "enabled", true);
        ArrayList term304 = new ArrayList();
        ((ArrayList) term304).add((Object)null);
        ((ArrayList) term304).add((Object)null);
        Object term303 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term303, term303.getClass(), "children", term304);
        setField(term303, term303.getClass(), "description", "");
        setLongField(term303, term303.getClass(), "size", -4502405999831680926L);
        setBooleanField(term303, term303.getClass(), "enabled", true);
        ArrayList term311 = new ArrayList();
        ((ArrayList) term311).add((Object)null);
        ((ArrayList) term311).add((Object)null);
        ((ArrayList) term311).add((Object)null);
        ((ArrayList) term311).add((Object)null);
        ((ArrayList) term311).add((Object)null);
        Object term310 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term310, term310.getClass(), "children", term311);
        setField(term310, term310.getClass(), "description", "");
        setLongField(term310, term310.getClass(), "size", -4365849114644724155L);
        setBooleanField(term310, term310.getClass(), "enabled", false);
        ArrayList term294 = new ArrayList();
        ((ArrayList) term294).add(term296);
        ((ArrayList) term294).add(term303);
        ((ArrayList) term294).add(term310);
        term293 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term293, term293.getClass(), "children", term294);
        setField(term293, term293.getClass(), "description", "xrwlQZdwCp");
        setLongField(term293, term293.getClass(), "size", 5262507301787091109L);
        setBooleanField(term293, term293.getClass(), "enabled", false);
        term333 = new Long(-6823727938421990489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term333;
        callMethod(klass, "setSize", argTypes, term293, args);
    }

};


