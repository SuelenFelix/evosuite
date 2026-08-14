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

public class SubType_toString_30680611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38458;

    public SubType_toString_30680611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38592 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term38591 = ((Class) term38592).getDeclaredField((String) "GLOBAL");
        ((Field) term38591).setAccessible(true);
        Object enum127 = ((Field) term38591).get((Object) null);
        Class<? extends Object> term38842 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term38841 = ((Class) term38842).getDeclaredField((String) "TypeDecl");
        ((Field) term38841).setAccessible(true);
        Object enum128 = ((Field) term38841).get((Object) null);
        Class<? extends Object> term39108 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term39107 = ((Class) term39108).getDeclaredField((String) "BinOp");
        ((Field) term39107).setAccessible(true);
        Object enum129 = ((Field) term39107).get((Object) null);
        Class<? extends Object> term39365 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term39364 = ((Class) term39365).getDeclaredField((String) "Div");
        ((Field) term39364).setAccessible(true);
        Object enum130 = ((Field) term39364).get((Object) null);
        Class<? extends Object> term39566 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term39565 = ((Class) term39566).getDeclaredField((String) "Missing");
        ((Field) term39565).setAccessible(true);
        Object enum131 = ((Field) term39565).get((Object) null);
        term38458 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.SubType"));
        Object term38459 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term38508 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term38459, term38459.getClass(), "type", enum127);
        setField(term38459, term38459.getClass(), "nodeType", enum128);
        setIntField(term38459, term38459.getClass(), "start", 1743683601);
        setIntField(term38459, term38459.getClass(), "end", -945116798);
        setField(term38459, term38459.getClass(), "file", "MHGKyEnwKc");
        setField(term38459, term38459.getClass(), "parent", null);
        setField(term38459, term38459.getClass(), "name", "ShIELyuULw");
        setField(term38458, term38458.getClass(), "subType", term38459);
        setField(term38508, term38508.getClass(), "type", enum127);
        setField(term38508, term38508.getClass(), "nodeType", enum129);
        setIntField(term38508, term38508.getClass(), "start", 1593461795);
        setIntField(term38508, term38508.getClass(), "end", 515182546);
        setField(term38508, term38508.getClass(), "file", "IpQuOGMgmj");
        setField(term38508, term38508.getClass(), "parent", null);
        setField(term38508, term38508.getClass(), "name", "pJbnHTYrxn");
        setField(term38458, term38458.getClass(), "baseType", term38508);
        setField(term38458, term38458.getClass(), "op", enum130);
        setField(term38458, term38458.getClass(), "nodeType", enum131);
        setIntField(term38458, term38458.getClass(), "start", -936895502);
        setIntField(term38458, term38458.getClass(), "end", -129547140);
        setField(term38458, term38458.getClass(), "file", "iIRsCSYqXH");
        setField(term38458, term38458.getClass(), "parent", null);
        setField(term38458, term38458.getClass(), "name", "nghfqDXyCG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.SubType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38458, args);
    }

};


