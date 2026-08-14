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

public class ASTNode_getFirstChild_6726383034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public ASTNode_getFirstChild_6726383034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term522 = new ArrayList();
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        ((ArrayList) term522).add((Object)null);
        Object term517 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term517, term517.getClass(), "label", "");
        setField(term517, term517.getClass(), "nodeType", null);
        setIntField(term517, term517.getClass(), "startPos", 1114000454);
        setIntField(term517, term517.getClass(), "len", -556405712);
        setField(term517, term517.getClass(), "input", "");
        setField(term517, term517.getClass(), "children", term522);
        Object term525 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term525, term525.getClass(), "label", null);
        setField(term525, term525.getClass(), "nodeType", null);
        setIntField(term525, term525.getClass(), "startPos", 0);
        setIntField(term525, term525.getClass(), "len", 0);
        setField(term525, term525.getClass(), "input", null);
        setField(term525, term525.getClass(), "children", null);
        ArrayList term533 = new ArrayList();
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        ((ArrayList) term533).add((Object)null);
        Object term528 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term528, term528.getClass(), "label", "");
        setField(term528, term528.getClass(), "nodeType", null);
        setIntField(term528, term528.getClass(), "startPos", -1034506028);
        setIntField(term528, term528.getClass(), "len", -1263114719);
        setField(term528, term528.getClass(), "input", "");
        setField(term528, term528.getClass(), "children", term533);
        ArrayList term515 = new ArrayList();
        ((ArrayList) term515).add(term517);
        ((ArrayList) term515).add(term525);
        ((ArrayList) term515).add(term528);
        term488 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term488, term488.getClass(), "label", "OWDIEULEFu");
        setField(term488, term488.getClass(), "nodeType", null);
        setIntField(term488, term488.getClass(), "startPos", -1547384488);
        setIntField(term488, term488.getClass(), "len", 1442160736);
        setField(term488, term488.getClass(), "input", "dWRymuLBtr");
        setField(term488, term488.getClass(), "children", term515);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstChild", argTypes, term488, args);
    }

};


