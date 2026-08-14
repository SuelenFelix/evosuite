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
import java.lang.Integer;

public class ASTNode_getChild_11831428417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term736;

    public ASTNode_getChild_11831428417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term719 = new ArrayList();
        ((ArrayList) term719).add((Object)null);
        ((ArrayList) term719).add((Object)null);
        ((ArrayList) term719).add((Object)null);
        ((ArrayList) term719).add((Object)null);
        Object term714 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term714, term714.getClass(), "label", "");
        setField(term714, term714.getClass(), "nodeType", null);
        setIntField(term714, term714.getClass(), "startPos", 1386130016);
        setIntField(term714, term714.getClass(), "len", 1072005683);
        setField(term714, term714.getClass(), "input", "");
        setField(term714, term714.getClass(), "children", term719);
        Object term722 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term722, term722.getClass(), "label", "");
        setField(term722, term722.getClass(), "nodeType", null);
        setIntField(term722, term722.getClass(), "startPos", 0);
        setIntField(term722, term722.getClass(), "len", 0);
        setField(term722, term722.getClass(), "input", null);
        setField(term722, term722.getClass(), "children", null);
        ArrayList term731 = new ArrayList();
        ((ArrayList) term731).add((Object)null);
        ((ArrayList) term731).add((Object)null);
        ((ArrayList) term731).add((Object)null);
        ((ArrayList) term731).add((Object)null);
        ((ArrayList) term731).add((Object)null);
        Object term726 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term726, term726.getClass(), "label", "");
        setField(term726, term726.getClass(), "nodeType", null);
        setIntField(term726, term726.getClass(), "startPos", 568954359);
        setIntField(term726, term726.getClass(), "len", 53410913);
        setField(term726, term726.getClass(), "input", "");
        setField(term726, term726.getClass(), "children", term731);
        ArrayList term712 = new ArrayList();
        ((ArrayList) term712).add(term714);
        ((ArrayList) term712).add(term722);
        ((ArrayList) term712).add(term726);
        term685 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term685, term685.getClass(), "label", "hoicvmsovO");
        setField(term685, term685.getClass(), "nodeType", null);
        setIntField(term685, term685.getClass(), "startPos", 906181092);
        setIntField(term685, term685.getClass(), "len", 1045657203);
        setField(term685, term685.getClass(), "input", "eqJfYWRaEL");
        setField(term685, term685.getClass(), "children", term712);
        term736 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term736;
        callMethod(klass, "getChild", argTypes, term685, args);
    }

};


