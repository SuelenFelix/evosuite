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

public class FuncDef_setVararg_14653480771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40420;
     Object term40641;

    public FuncDef_setVararg_14653480771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40678 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term40677 = ((Class) term40678).getDeclaredField((String) "LOCAL");
        ((Field) term40677).setAccessible(true);
        Object enum134 = ((Field) term40677).get((Object) null);
        Class<? extends Object> term40925 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term40924 = ((Class) term40925).getDeclaredField((String) "UnionType");
        ((Field) term40924).setAccessible(true);
        Object enum135 = ((Field) term40924).get((Object) null);
        ArrayList term40470 = new ArrayList();
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ((ArrayList) term40470).add((Object)null);
        ArrayList term40474 = new ArrayList();
        ((ArrayList) term40474).add((Object)null);
        ((ArrayList) term40474).add((Object)null);
        ((ArrayList) term40474).add((Object)null);
        Class<? extends Object> term41194 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term41193 = ((Class) term41194).getDeclaredField((String) "STRUCT");
        ((Field) term41193).setAccessible(true);
        Object enum136 = ((Field) term41193).get((Object) null);
        Class<? extends Object> term41444 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term41443 = ((Class) term41444).getDeclaredField((String) "JuliaVector");
        ((Field) term41443).setAccessible(true);
        Object enum137 = ((Field) term41443).get((Object) null);
        Class<? extends Object> term41719 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term41718 = ((Class) term41719).getDeclaredField((String) "Complex");
        ((Field) term41718).setAccessible(true);
        Object enum138 = ((Field) term41718).get((Object) null);
        Class<? extends Object> term41982 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term41981 = ((Class) term41982).getDeclaredField((String) "BinOp");
        ((Field) term41981).setAccessible(true);
        Object enum139 = ((Field) term41981).get((Object) null);
        Class<? extends Object> term42239 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term42238 = ((Class) term42239).getDeclaredField((String) "Break");
        ((Field) term42238).setAccessible(true);
        Object enum140 = ((Field) term42238).get((Object) null);
        term40420 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        Object term40421 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term40478 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term40530 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term40568 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.End"));
        setField(term40421, term40421.getClass(), "type", enum134);
        setField(term40421, term40421.getClass(), "nodeType", enum135);
        setIntField(term40421, term40421.getClass(), "start", 1745276158);
        setIntField(term40421, term40421.getClass(), "end", 2009020256);
        setField(term40421, term40421.getClass(), "file", "UKAReurpHG");
        setField(term40421, term40421.getClass(), "parent", null);
        setField(term40421, term40421.getClass(), "name", "WVRMUmrljA");
        setField(term40420, term40420.getClass(), "name", term40421);
        setField(term40420, term40420.getClass(), "params", term40470);
        setField(term40420, term40420.getClass(), "defaults", term40474);
        setField(term40478, term40478.getClass(), "type", enum136);
        setField(term40478, term40478.getClass(), "nodeType", enum137);
        setIntField(term40478, term40478.getClass(), "start", 2049577015);
        setIntField(term40478, term40478.getClass(), "end", 1236004505);
        setField(term40478, term40478.getClass(), "file", "NTlKJDDWlk");
        setField(term40478, term40478.getClass(), "parent", null);
        setField(term40478, term40478.getClass(), "name", "vOuMEpOQAg");
        setField(term40420, term40420.getClass(), "vararg", term40478);
        setField(term40530, term40530.getClass(), "type", enum134);
        setField(term40530, term40530.getClass(), "nodeType", enum138);
        setIntField(term40530, term40530.getClass(), "start", 1050765721);
        setIntField(term40530, term40530.getClass(), "end", 474518942);
        setField(term40530, term40530.getClass(), "file", "SIODFGaQhr");
        setField(term40530, term40530.getClass(), "parent", null);
        setField(term40530, term40530.getClass(), "name", "qYzsiuXOgS");
        setField(term40420, term40420.getClass(), "kwarg", term40530);
        setField(term40420, term40420.getClass(), "body", null);
        setField(term40568, term40568.getClass(), "nodeType", enum139);
        setIntField(term40568, term40568.getClass(), "start", -1656687479);
        setIntField(term40568, term40568.getClass(), "end", -249614216);
        setField(term40568, term40568.getClass(), "file", "bxrCBbrrct");
        setField(term40568, term40568.getClass(), "parent", null);
        setField(term40568, term40568.getClass(), "name", "CKWpJaaaxX");
        setField(term40420, term40420.getClass(), "end", term40568);
        setBooleanField(term40420, term40420.getClass(), "called", false);
        setBooleanField(term40420, term40420.getClass(), "isLambda", false);
        setField(term40420, term40420.getClass(), "nodeType", enum140);
        setIntField(term40420, term40420.getClass(), "start", -519881101);
        setIntField(term40420, term40420.getClass(), "end", -680920524);
        setField(term40420, term40420.getClass(), "file", "UBRmXJmfrt");
        setField(term40420, term40420.getClass(), "parent", null);
        setField(term40420, term40420.getClass(), "name", "WZzvmIHhzZ");
        Class<? extends Object> term42496 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term42495 = ((Class) term42496).getDeclaredField((String) "Comma");
        ((Field) term42495).setAccessible(true);
        Object enum141 = ((Field) term42495).get((Object) null);
        term40641 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term40641, term40641.getClass(), "type", enum136);
        setField(term40641, term40641.getClass(), "nodeType", enum141);
        setIntField(term40641, term40641.getClass(), "start", -916335264);
        setIntField(term40641, term40641.getClass(), "end", -919416536);
        setField(term40641, term40641.getClass(), "file", "doQLHkjpNm");
        setField(term40641, term40641.getClass(), "parent", null);
        setField(term40641, term40641.getClass(), "name", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Object[] args = new Object[1];
        args[0] = term40641;
        callMethod(klass, "setVararg", argTypes, term40420, args);
    }

};


