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

public class Call_markInit_18286413555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3052;

    public Call_markInit_18286413555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3053 = new ArrayList();
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        ((ArrayList) term3053).add((Object)null);
        Class<? extends Object> term3110 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term3109 = ((Class) term3110).getDeclaredField((String) "Block");
        ((Field) term3109).setAccessible(true);
        Object enum8 = ((Field) term3109).get((Object) null);
        Object term3059 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.KW"));
        Object term3060 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term3060, term3060.getClass(), "type", null);
        setField(term3060, term3060.getClass(), "nodeType", null);
        setIntField(term3060, term3060.getClass(), "start", -1007160944);
        setIntField(term3060, term3060.getClass(), "end", 1135664017);
        setField(term3060, term3060.getClass(), "file", null);
        setField(term3060, term3060.getClass(), "parent", null);
        setField(term3060, term3060.getClass(), "name", null);
        setField(term3059, term3059.getClass(), "key", term3060);
        setField(term3059, term3059.getClass(), "value", null);
        setField(term3059, term3059.getClass(), "nodeType", enum8);
        setIntField(term3059, term3059.getClass(), "start", 590364439);
        setIntField(term3059, term3059.getClass(), "end", 865208305);
        setField(term3059, term3059.getClass(), "file", "");
        setField(term3059, term3059.getClass(), "parent", null);
        setField(term3059, term3059.getClass(), "name", "");
        ArrayList term3057 = new ArrayList();
        ((ArrayList) term3057).add(term3059);
        Class<? extends Object> term3347 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term3346 = ((Class) term3347).getDeclaredField((String) "RSQUARE");
        ((Field) term3346).setAccessible(true);
        Object enum9 = ((Field) term3346).get((Object) null);
        term3052 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call"));
        setField(term3052, term3052.getClass(), "name", null);
        setField(term3052, term3052.getClass(), "args", term3053);
        setField(term3052, term3052.getClass(), "keywords", term3057);
        setBooleanField(term3052, term3052.getClass(), "isInit", false);
        setField(term3052, term3052.getClass(), "nodeType", enum9);
        setIntField(term3052, term3052.getClass(), "start", -1275173084);
        setIntField(term3052, term3052.getClass(), "end", -244121226);
        setField(term3052, term3052.getClass(), "file", "eZFUvlxvGV");
        setField(term3052, term3052.getClass(), "parent", null);
        setField(term3052, term3052.getClass(), "name", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markInit", argTypes, term3052, args);
    }

};


