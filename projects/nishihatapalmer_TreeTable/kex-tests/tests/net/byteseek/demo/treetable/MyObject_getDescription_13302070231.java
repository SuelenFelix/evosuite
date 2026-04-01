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

public class MyObject_getDescription_13302070231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public MyObject_getDescription_13302070231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term146 = new ArrayList();
        ((ArrayList) term146).add((Object)null);
        ((ArrayList) term146).add((Object)null);
        Object term145 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term145, term145.getClass(), "children", term146);
        setField(term145, term145.getClass(), "description", "");
        setLongField(term145, term145.getClass(), "size", 6967924379644551255L);
        setBooleanField(term145, term145.getClass(), "enabled", true);
        ArrayList term153 = new ArrayList();
        ((ArrayList) term153).add((Object)null);
        ((ArrayList) term153).add((Object)null);
        ((ArrayList) term153).add((Object)null);
        ((ArrayList) term153).add((Object)null);
        ((ArrayList) term153).add((Object)null);
        ((ArrayList) term153).add((Object)null);
        Object term152 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term152, term152.getClass(), "children", term153);
        setField(term152, term152.getClass(), "description", "");
        setLongField(term152, term152.getClass(), "size", 7411271909051562686L);
        setBooleanField(term152, term152.getClass(), "enabled", true);
        ArrayList term160 = new ArrayList();
        ((ArrayList) term160).add((Object)null);
        ((ArrayList) term160).add((Object)null);
        ((ArrayList) term160).add((Object)null);
        ((ArrayList) term160).add((Object)null);
        ((ArrayList) term160).add((Object)null);
        Object term159 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term159, term159.getClass(), "children", term160);
        setField(term159, term159.getClass(), "description", "");
        setLongField(term159, term159.getClass(), "size", -8400487765614892086L);
        setBooleanField(term159, term159.getClass(), "enabled", true);
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add(term145);
        ((ArrayList) term143).add(term152);
        ((ArrayList) term143).add(term145);
        ((ArrayList) term143).add(term159);
        ((ArrayList) term143).add(term152);
        ((ArrayList) term143).add(term152);
        term142 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObject"));
        setField(term142, term142.getClass(), "children", term143);
        setField(term142, term142.getClass(), "description", "LQFpaHEwXR");
        setLongField(term142, term142.getClass(), "size", -2813493605142626659L);
        setBooleanField(term142, term142.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term142, args);
    }

};


