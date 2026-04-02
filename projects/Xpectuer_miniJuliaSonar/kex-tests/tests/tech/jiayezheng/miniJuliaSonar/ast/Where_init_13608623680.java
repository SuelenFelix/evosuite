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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Integer;

public class Where_init_13608623680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24020;
     Object term24112;
     Object term24218;
     Object term24220;

    public Where_init_13608623680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24235 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term24234 = ((Class) term24235).getDeclaredField((String) "LOCAL");
        ((Field) term24234).setAccessible(true);
        Object enum78 = ((Field) term24234).get((Object) null);
        Class<? extends Object> term24482 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term24481 = ((Class) term24482).getDeclaredField((String) "JuliaModule");
        ((Field) term24481).setAccessible(true);
        Object enum79 = ((Field) term24481).get((Object) null);
        ArrayList term24072 = new ArrayList();
        ((ArrayList) term24072).add((Object)null);
        Class<? extends Object> term24757 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term24756 = ((Class) term24757).getDeclaredField((String) "Global");
        ((Field) term24756).setAccessible(true);
        Object enum80 = ((Field) term24756).get((Object) null);
        term24020 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType"));
        Object term24021 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term24021, term24021.getClass(), "type", enum78);
        setField(term24021, term24021.getClass(), "nodeType", enum79);
        setIntField(term24021, term24021.getClass(), "start", 1283079251);
        setIntField(term24021, term24021.getClass(), "end", -523949691);
        setField(term24021, term24021.getClass(), "file", "PznxWXsZME");
        setField(term24021, term24021.getClass(), "parent", null);
        setField(term24021, term24021.getClass(), "name", "ZzIujlwVsw");
        setField(term24020, term24020.getClass(), "type", term24021);
        setField(term24020, term24020.getClass(), "params", term24072);
        setField(term24020, term24020.getClass(), "nodeType", enum80);
        setIntField(term24020, term24020.getClass(), "start", 1398204340);
        setIntField(term24020, term24020.getClass(), "end", 229204365);
        setField(term24020, term24020.getClass(), "file", "LWyEaeIyAo");
        setField(term24020, term24020.getClass(), "parent", null);
        setField(term24020, term24020.getClass(), "name", "yVMkkQhvmN");
        Class<? extends Object> term25017 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term25016 = ((Class) term25017).getDeclaredField((String) "Lambda");
        ((Field) term25016).setAccessible(true);
        Object enum81 = ((Field) term25016).get((Object) null);
        Class<? extends Object> term25227 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term25226 = ((Class) term25227).getDeclaredField((String) "RPAREN");
        ((Field) term25226).setAccessible(true);
        Object enum82 = ((Field) term25226).get((Object) null);
        Object term24115 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp"));
        setField(term24115, term24115.getClass(), "op", enum81);
        setField(term24115, term24115.getClass(), "left", null);
        setField(term24115, term24115.getClass(), "right", null);
        setBooleanField(term24115, term24115.getClass(), "vectorized", true);
        setField(term24115, term24115.getClass(), "nodeType", enum82);
        setIntField(term24115, term24115.getClass(), "start", -461771056);
        setIntField(term24115, term24115.getClass(), "end", -243422082);
        setField(term24115, term24115.getClass(), "file", "mvrkADEgpp");
        setField(term24115, term24115.getClass(), "parent", null);
        setField(term24115, term24115.getClass(), "name", "pXOkjyeIRb");
        Class<? extends Object> term25487 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term25486 = ((Class) term25487).getDeclaredField((String) "In");
        ((Field) term25486).setAccessible(true);
        Object enum83 = ((Field) term25486).get((Object) null);
        Class<? extends Object> term25685 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term25684 = ((Class) term25685).getDeclaredField((String) "JuliaBool");
        ((Field) term25684).setAccessible(true);
        Object enum84 = ((Field) term25684).get((Object) null);
        Object term24151 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp"));
        setField(term24151, term24151.getClass(), "op", enum83);
        setField(term24151, term24151.getClass(), "left", null);
        setField(term24151, term24151.getClass(), "right", null);
        setBooleanField(term24151, term24151.getClass(), "vectorized", true);
        setField(term24151, term24151.getClass(), "nodeType", enum84);
        setIntField(term24151, term24151.getClass(), "start", 1384592638);
        setIntField(term24151, term24151.getClass(), "end", -1002370457);
        setField(term24151, term24151.getClass(), "file", "");
        setField(term24151, term24151.getClass(), "parent", null);
        setField(term24151, term24151.getClass(), "name", "");
        Object term24162 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp"));
        setField(term24162, term24162.getClass(), "op", null);
        setField(term24162, term24162.getClass(), "left", null);
        setField(term24162, term24162.getClass(), "right", null);
        setBooleanField(term24162, term24162.getClass(), "vectorized", false);
        setField(term24162, term24162.getClass(), "nodeType", null);
        setIntField(term24162, term24162.getClass(), "start", -2014576105);
        setIntField(term24162, term24162.getClass(), "end", 1296895584);
        setField(term24162, term24162.getClass(), "file", null);
        setField(term24162, term24162.getClass(), "parent", null);
        setField(term24162, term24162.getClass(), "name", null);
        term24112 = new LinkedList();
        ((LinkedList) term24112).add(term24115);
        ((LinkedList) term24112).add(term24151);
        ((LinkedList) term24112).add(term24162);
        ((LinkedList) term24112).add((Object)null);
        ((LinkedList) term24112).add((Object)null);
        ((LinkedList) term24112).add((Object)null);
        ((LinkedList) term24112).add((Object)null);
        term24218 = new Integer(197109649);
        term24220 = new Integer(-1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Where");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term24020;
        args[1] = term24112;
        args[2] = term24218;
        args[3] = term24220;
        args[4] = "HHmNoYxIGj";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


