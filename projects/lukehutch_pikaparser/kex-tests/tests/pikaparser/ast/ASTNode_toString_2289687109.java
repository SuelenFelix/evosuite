package pikaparser.ast;

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
import static pikaparser.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ASTNode_toString_2289687109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term820;

    public ASTNode_toString_2289687109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term854 = new ArrayList();
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        ((ArrayList) term854).add((Object)null);
        Object term849 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term849, term849.getClass(), "label", "");
        setField(term849, term849.getClass(), "nodeType", null);
        setIntField(term849, term849.getClass(), "startPos", 2095798786);
        setIntField(term849, term849.getClass(), "len", -1565502840);
        setField(term849, term849.getClass(), "input", "");
        setField(term849, term849.getClass(), "children", term854);
        ArrayList term862 = new ArrayList();
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        Object term857 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term857, term857.getClass(), "label", "");
        setField(term857, term857.getClass(), "nodeType", null);
        setIntField(term857, term857.getClass(), "startPos", 202001407);
        setIntField(term857, term857.getClass(), "len", 158873461);
        setField(term857, term857.getClass(), "input", "");
        setField(term857, term857.getClass(), "children", term862);
        Object term865 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term865, term865.getClass(), "label", null);
        setField(term865, term865.getClass(), "nodeType", null);
        setIntField(term865, term865.getClass(), "startPos", 0);
        setIntField(term865, term865.getClass(), "len", 0);
        setField(term865, term865.getClass(), "input", null);
        setField(term865, term865.getClass(), "children", null);
        Object term868 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term868, term868.getClass(), "label", null);
        setField(term868, term868.getClass(), "nodeType", null);
        setIntField(term868, term868.getClass(), "startPos", 0);
        setIntField(term868, term868.getClass(), "len", 0);
        setField(term868, term868.getClass(), "input", null);
        setField(term868, term868.getClass(), "children", null);
        ArrayList term847 = new ArrayList();
        ((ArrayList) term847).add(term849);
        ((ArrayList) term847).add(term857);
        ((ArrayList) term847).add(term849);
        ((ArrayList) term847).add(term865);
        ((ArrayList) term847).add(term865);
        ((ArrayList) term847).add(term868);
        term820 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term820, term820.getClass(), "label", "cAPeiZHKGJ");
        setField(term820, term820.getClass(), "nodeType", null);
        setIntField(term820, term820.getClass(), "startPos", -2063457669);
        setIntField(term820, term820.getClass(), "len", -1222006000);
        setField(term820, term820.getClass(), "input", "LvJFtLBaxj");
        setField(term820, term820.getClass(), "children", term847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term820, args);
    }

};


