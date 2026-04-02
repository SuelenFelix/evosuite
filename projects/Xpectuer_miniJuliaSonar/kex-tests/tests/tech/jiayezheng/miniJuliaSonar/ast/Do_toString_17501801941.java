package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Do_toString_17501801941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22009;

    public Do_toString_17501801941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22010 = new ArrayList();
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ((ArrayList) term22010).add((Object)null);
        ArrayList term22015 = new ArrayList();
        ((ArrayList) term22015).add((Object)null);
        ((ArrayList) term22015).add((Object)null);
        ((ArrayList) term22015).add((Object)null);
        Class<? extends Object> term22102 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term22101 = ((Class) term22102).getDeclaredField((String) "StructDef");
        ((Field) term22101).setAccessible(true);
        Object enum72 = ((Field) term22101).get((Object) null);
        Class<? extends Object> term22371 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term22370 = ((Class) term22371).getDeclaredField((String) "PrimitiveType");
        ((Field) term22370).setAccessible(true);
        Object enum73 = ((Field) term22370).get((Object) null);
        term22009 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Do"));
        Object term22014 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term22009, term22009.getClass(), "binder", term22010);
        setField(term22009, term22009.getClass(), "value", null);
        setField(term22014, term22014.getClass(), "args", term22015);
        setField(term22014, term22014.getClass(), "nodeType", enum72);
        setIntField(term22014, term22014.getClass(), "start", -1565502840);
        setIntField(term22014, term22014.getClass(), "end", 344323424);
        setField(term22014, term22014.getClass(), "file", "hCWPJQKpdc");
        setField(term22014, term22014.getClass(), "parent", null);
        setField(term22014, term22014.getClass(), "name", "WzMEhMXkKx");
        setField(term22009, term22009.getClass(), "body", term22014);
        setField(term22009, term22009.getClass(), "nodeType", enum73);
        setIntField(term22009, term22009.getClass(), "start", 9726679);
        setIntField(term22009, term22009.getClass(), "end", -25637976);
        setField(term22009, term22009.getClass(), "file", "XOiDvlDhdc");
        setField(term22009, term22009.getClass(), "parent", null);
        setField(term22009, term22009.getClass(), "name", "AdxvLJhNLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Do");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term22009, args);
    }

};


