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
import java.lang.Integer;

public class ASTNode_getChild_118314284117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912;
     Object term915;

    public ASTNode_getChild_118314284117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term912 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term912, term912.getClass(), "label", null);
        setField(term912, term912.getClass(), "nodeType", null);
        setIntField(term912, term912.getClass(), "startPos", 0);
        setIntField(term912, term912.getClass(), "len", 0);
        setField(term912, term912.getClass(), "input", null);
        setField(term912, term912.getClass(), "children", null);
        term915 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term915;
        callMethod(klass, "getChild", argTypes, term912, args);
    }

};


