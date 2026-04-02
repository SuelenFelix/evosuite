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
import java.lang.Integer;

public class If_init_422867280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17796;
     Object term17839;
     Object term17841;

    public If_init_422867280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17797 = new ArrayList();
        ((ArrayList) term17797).add((Object)null);
        Class<? extends Object> term17856 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term17855 = ((Class) term17856).getDeclaredField((String) "TypeDecl");
        ((Field) term17855).setAccessible(true);
        Object enum58 = ((Field) term17855).get((Object) null);
        term17796 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term17796, term17796.getClass(), "args", term17797);
        setField(term17796, term17796.getClass(), "nodeType", enum58);
        setIntField(term17796, term17796.getClass(), "start", -1801760683);
        setIntField(term17796, term17796.getClass(), "end", 1141317871);
        setField(term17796, term17796.getClass(), "file", "JiVRgTZvKc");
        setField(term17796, term17796.getClass(), "parent", null);
        setField(term17796, term17796.getClass(), "name", "XPKmummaqg");
        term17839 = new Integer(890669485);
        term17841 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.If");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term17796;
        args[2] = null;
        args[3] = term17839;
        args[4] = term17841;
        args[5] = "BKLfkLiZTH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


