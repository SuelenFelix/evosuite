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
import java.lang.Boolean;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class StructDef_init_18356765650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48712;
     Object term48714;
     Object term48766;
     Object term48806;
     Object term48808;

    public StructDef_init_18356765650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48712 = new Boolean(true);
        Class<? extends Object> term48823 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term48822 = ((Class) term48823).getDeclaredField((String) "STRUCT");
        ((Field) term48822).setAccessible(true);
        Object enum162 = ((Field) term48822).get((Object) null);
        Class<? extends Object> term49073 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term49072 = ((Class) term49073).getDeclaredField((String) "FuncCombine");
        ((Field) term49072).setAccessible(true);
        Object enum163 = ((Field) term49072).get((Object) null);
        term48714 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term48714, term48714.getClass(), "type", enum162);
        setField(term48714, term48714.getClass(), "nodeType", enum163);
        setIntField(term48714, term48714.getClass(), "start", -765191335);
        setIntField(term48714, term48714.getClass(), "end", -1697741155);
        setField(term48714, term48714.getClass(), "file", "TXZAIPQJHt");
        setField(term48714, term48714.getClass(), "parent", null);
        setField(term48714, term48714.getClass(), "name", "DIbeDHICho");
        ArrayList term48767 = new ArrayList();
        ((ArrayList) term48767).add((Object)null);
        ((ArrayList) term48767).add((Object)null);
        ((ArrayList) term48767).add((Object)null);
        ((ArrayList) term48767).add((Object)null);
        ((ArrayList) term48767).add((Object)null);
        ((ArrayList) term48767).add((Object)null);
        Class<? extends Object> term49348 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term49347 = ((Class) term49348).getDeclaredField((String) "BinOp");
        ((Field) term49347).setAccessible(true);
        Object enum164 = ((Field) term49347).get((Object) null);
        term48766 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term48766, term48766.getClass(), "args", term48767);
        setField(term48766, term48766.getClass(), "nodeType", enum164);
        setIntField(term48766, term48766.getClass(), "start", 1295839803);
        setIntField(term48766, term48766.getClass(), "end", -1891015523);
        setField(term48766, term48766.getClass(), "file", "dJGPlmSRnz");
        setField(term48766, term48766.getClass(), "parent", null);
        setField(term48766, term48766.getClass(), "name", "DPskuFUobI");
        term48806 = new Integer(-1560631747);
        term48808 = new Integer(1215150180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[3] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term48712;
        args[1] = term48714;
        args[2] = null;
        args[3] = term48766;
        args[4] = term48806;
        args[5] = term48808;
        args[6] = "wBGfLpNNiZ";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


