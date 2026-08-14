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

public class MyObject_getSize_20961949413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;

    public MyObject_getSize_20961949413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term254 = new ArrayList();
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        ((ArrayList) term254).add((Object)null);
        Object term253 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term253, term253.getClass(), "children", term254);
        setField(term253, term253.getClass(), "description", "");
        setLongField(term253, term253.getClass(), "size", -2585684163342970173L);
        setBooleanField(term253, term253.getClass(), "enabled", true);
        ArrayList term261 = new ArrayList();
        ((ArrayList) term261).add((Object)null);
        ((ArrayList) term261).add((Object)null);
        ((ArrayList) term261).add((Object)null);
        Object term260 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term260, term260.getClass(), "children", term261);
        setField(term260, term260.getClass(), "description", "");
        setLongField(term260, term260.getClass(), "size", -316468845751588286L);
        setBooleanField(term260, term260.getClass(), "enabled", false);
        ArrayList term251 = new ArrayList();
        ((ArrayList) term251).add(term253);
        ((ArrayList) term251).add(term260);
        term250 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term250, term250.getClass(), "children", term251);
        setField(term250, term250.getClass(), "description", "flxyYxBRtu");
        setLongField(term250, term250.getClass(), "size", 8059786003080744426L);
        setBooleanField(term250, term250.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term250, args);
    }

};


