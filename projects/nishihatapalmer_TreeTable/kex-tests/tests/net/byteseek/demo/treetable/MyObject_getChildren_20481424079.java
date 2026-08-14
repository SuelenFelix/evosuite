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

public class MyObject_getChildren_20481424079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public MyObject_getChildren_20481424079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term625 = new ArrayList();
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        ((ArrayList) term625).add((Object)null);
        Object term624 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term624, term624.getClass(), "children", term625);
        setField(term624, term624.getClass(), "description", "");
        setLongField(term624, term624.getClass(), "size", -5963439350418910964L);
        setBooleanField(term624, term624.getClass(), "enabled", false);
        ArrayList term632 = new ArrayList();
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        ((ArrayList) term632).add((Object)null);
        Object term631 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term631, term631.getClass(), "children", term632);
        setField(term631, term631.getClass(), "description", "");
        setLongField(term631, term631.getClass(), "size", -6723783499250797216L);
        setBooleanField(term631, term631.getClass(), "enabled", false);
        ArrayList term639 = new ArrayList();
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        ((ArrayList) term639).add((Object)null);
        Object term638 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term638, term638.getClass(), "children", term639);
        setField(term638, term638.getClass(), "description", "");
        setLongField(term638, term638.getClass(), "size", 41775768178052008L);
        setBooleanField(term638, term638.getClass(), "enabled", false);
        ArrayList term622 = new ArrayList();
        ((ArrayList) term622).add(term624);
        ((ArrayList) term622).add(term631);
        ((ArrayList) term622).add(term638);
        term621 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term621, term621.getClass(), "children", term622);
        setField(term621, term621.getClass(), "description", "idgaQsnJpQ");
        setLongField(term621, term621.getClass(), "size", 9013624480170062917L);
        setBooleanField(term621, term621.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term621, args);
    }

};


