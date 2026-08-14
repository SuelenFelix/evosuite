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

public class ASTNode_getThirdChild_974182506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public ASTNode_getThirdChild_974182506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term657 = new ArrayList();
        ((ArrayList) term657).add((Object)null);
        ((ArrayList) term657).add((Object)null);
        ((ArrayList) term657).add((Object)null);
        ((ArrayList) term657).add((Object)null);
        ((ArrayList) term657).add((Object)null);
        ((ArrayList) term657).add((Object)null);
        Object term652 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term652, term652.getClass(), "label", "");
        setField(term652, term652.getClass(), "nodeType", null);
        setIntField(term652, term652.getClass(), "startPos", -341962980);
        setIntField(term652, term652.getClass(), "len", 1532716628);
        setField(term652, term652.getClass(), "input", "");
        setField(term652, term652.getClass(), "children", term657);
        Object term660 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term660, term660.getClass(), "label", null);
        setField(term660, term660.getClass(), "nodeType", null);
        setIntField(term660, term660.getClass(), "startPos", 0);
        setIntField(term660, term660.getClass(), "len", 0);
        setField(term660, term660.getClass(), "input", null);
        setField(term660, term660.getClass(), "children", null);
        ArrayList term650 = new ArrayList();
        ((ArrayList) term650).add(term652);
        ((ArrayList) term650).add(term652);
        ((ArrayList) term650).add(term660);
        term623 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term623, term623.getClass(), "label", "UoYtihxVaS");
        setField(term623, term623.getClass(), "nodeType", null);
        setIntField(term623, term623.getClass(), "startPos", -615654495);
        setIntField(term623, term623.getClass(), "len", -1476117762);
        setField(term623, term623.getClass(), "input", "JDswTTCZHV");
        setField(term623, term623.getClass(), "children", term650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThirdChild", argTypes, term623, args);
    }

};


