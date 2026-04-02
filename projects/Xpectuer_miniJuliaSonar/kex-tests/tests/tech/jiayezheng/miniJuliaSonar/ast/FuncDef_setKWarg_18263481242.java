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

public class FuncDef_setKWarg_18263481242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42752;
     Object term42955;

    public FuncDef_setKWarg_18263481242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42989 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term42988 = ((Class) term42989).getDeclaredField((String) "LOCAL");
        ((Field) term42988).setAccessible(true);
        Object enum142 = ((Field) term42988).get((Object) null);
        Class<? extends Object> term43236 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term43235 = ((Class) term43236).getDeclaredField((String) "Global");
        ((Field) term43235).setAccessible(true);
        Object enum143 = ((Field) term43235).get((Object) null);
        ArrayList term42799 = new ArrayList();
        ((ArrayList) term42799).add((Object)null);
        ((ArrayList) term42799).add((Object)null);
        ((ArrayList) term42799).add((Object)null);
        ((ArrayList) term42799).add((Object)null);
        ArrayList term42803 = new ArrayList();
        ((ArrayList) term42803).add((Object)null);
        ((ArrayList) term42803).add((Object)null);
        Class<? extends Object> term43496 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term43495 = ((Class) term43496).getDeclaredField((String) "LBRACE");
        ((Field) term43495).setAccessible(true);
        Object enum144 = ((Field) term43495).get((Object) null);
        Class<? extends Object> term43756 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term43755 = ((Class) term43756).getDeclaredField((String) "Dot");
        ((Field) term43755).setAccessible(true);
        Object enum145 = ((Field) term43755).get((Object) null);
        Class<? extends Object> term44007 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term44006 = ((Class) term44007).getDeclaredField((String) "While");
        ((Field) term44006).setAccessible(true);
        Object enum146 = ((Field) term44006).get((Object) null);
        Class<? extends Object> term44264 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term44263 = ((Class) term44264).getDeclaredField((String) "UnionType");
        ((Field) term44263).setAccessible(true);
        Object enum147 = ((Field) term44263).get((Object) null);
        term42752 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        Object term42753 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term42807 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term42844 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term42878 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.End"));
        setField(term42753, term42753.getClass(), "type", enum142);
        setField(term42753, term42753.getClass(), "nodeType", enum143);
        setIntField(term42753, term42753.getClass(), "start", -43417861);
        setIntField(term42753, term42753.getClass(), "end", -1533843432);
        setField(term42753, term42753.getClass(), "file", "CGOpQSZZwI");
        setField(term42753, term42753.getClass(), "parent", null);
        setField(term42753, term42753.getClass(), "name", "ypEdrstygY");
        setField(term42752, term42752.getClass(), "name", term42753);
        setField(term42752, term42752.getClass(), "params", term42799);
        setField(term42752, term42752.getClass(), "defaults", term42803);
        setField(term42807, term42807.getClass(), "type", enum142);
        setField(term42807, term42807.getClass(), "nodeType", enum144);
        setIntField(term42807, term42807.getClass(), "start", -123338791);
        setIntField(term42807, term42807.getClass(), "end", -1467089634);
        setField(term42807, term42807.getClass(), "file", "sNQFlATEeQ");
        setField(term42807, term42807.getClass(), "parent", null);
        setField(term42807, term42807.getClass(), "name", "ZKMLioamsY");
        setField(term42752, term42752.getClass(), "vararg", term42807);
        setField(term42844, term42844.getClass(), "type", enum142);
        setField(term42844, term42844.getClass(), "nodeType", enum145);
        setIntField(term42844, term42844.getClass(), "start", 413548937);
        setIntField(term42844, term42844.getClass(), "end", 1901317214);
        setField(term42844, term42844.getClass(), "file", "WVbxuoDBcn");
        setField(term42844, term42844.getClass(), "parent", null);
        setField(term42844, term42844.getClass(), "name", "pvDEABOxLt");
        setField(term42752, term42752.getClass(), "kwarg", term42844);
        setField(term42752, term42752.getClass(), "body", null);
        setField(term42878, term42878.getClass(), "nodeType", enum146);
        setIntField(term42878, term42878.getClass(), "start", 1166710220);
        setIntField(term42878, term42878.getClass(), "end", -1070592289);
        setField(term42878, term42878.getClass(), "file", "beAMpkroCQ");
        setField(term42878, term42878.getClass(), "parent", null);
        setField(term42878, term42878.getClass(), "name", "uSUvKAyuvd");
        setField(term42752, term42752.getClass(), "end", term42878);
        setBooleanField(term42752, term42752.getClass(), "called", true);
        setBooleanField(term42752, term42752.getClass(), "isLambda", true);
        setField(term42752, term42752.getClass(), "nodeType", enum147);
        setIntField(term42752, term42752.getClass(), "start", -1464172784);
        setIntField(term42752, term42752.getClass(), "end", 32185364);
        setField(term42752, term42752.getClass(), "file", "onQLVONGuf");
        setField(term42752, term42752.getClass(), "parent", null);
        setField(term42752, term42752.getClass(), "name", "SOrEHbcbmn");
        Class<? extends Object> term44533 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term44532 = ((Class) term44533).getDeclaredField((String) "Do");
        ((Field) term44532).setAccessible(true);
        Object enum148 = ((Field) term44532).get((Object) null);
        term42955 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term42955, term42955.getClass(), "type", enum142);
        setField(term42955, term42955.getClass(), "nodeType", enum148);
        setIntField(term42955, term42955.getClass(), "start", 1768204942);
        setIntField(term42955, term42955.getClass(), "end", 1252951645);
        setField(term42955, term42955.getClass(), "file", "bnsyeQXFdu");
        setField(term42955, term42955.getClass(), "parent", null);
        setField(term42955, term42955.getClass(), "name", "BwtdjiefJn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Object[] args = new Object[1];
        args[0] = term42955;
        callMethod(klass, "setKWarg", argTypes, term42752, args);
    }

};


