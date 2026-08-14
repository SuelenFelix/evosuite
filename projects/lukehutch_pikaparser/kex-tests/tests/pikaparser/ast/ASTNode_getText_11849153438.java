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

public class ASTNode_getText_11849153438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;

    public ASTNode_getText_11849153438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term792 = new ArrayList();
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        Object term787 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term787, term787.getClass(), "label", "");
        setField(term787, term787.getClass(), "nodeType", null);
        setIntField(term787, term787.getClass(), "startPos", 538259104);
        setIntField(term787, term787.getClass(), "len", 96566506);
        setField(term787, term787.getClass(), "input", "");
        setField(term787, term787.getClass(), "children", term792);
        Object term795 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term795, term795.getClass(), "label", null);
        setField(term795, term795.getClass(), "nodeType", null);
        setIntField(term795, term795.getClass(), "startPos", 0);
        setIntField(term795, term795.getClass(), "len", 0);
        setField(term795, term795.getClass(), "input", null);
        setField(term795, term795.getClass(), "children", null);
        ArrayList term785 = new ArrayList();
        ((ArrayList) term785).add(term787);
        ((ArrayList) term785).add(term795);
        term758 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term758, term758.getClass(), "label", "HqBOwkVqjD");
        setField(term758, term758.getClass(), "nodeType", null);
        setIntField(term758, term758.getClass(), "startPos", -341152642);
        setIntField(term758, term758.getClass(), "len", -2015854073);
        setField(term758, term758.getClass(), "input", "MAcUBcBckh");
        setField(term758, term758.getClass(), "children", term785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term758, args);
    }

};


