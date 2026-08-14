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

public class ASTNode_getFirstChild_67263830314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;

    public ASTNode_getFirstChild_67263830314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term903, term903.getClass(), "label", null);
        setField(term903, term903.getClass(), "nodeType", null);
        setIntField(term903, term903.getClass(), "startPos", 0);
        setIntField(term903, term903.getClass(), "len", 0);
        setField(term903, term903.getClass(), "input", null);
        setField(term903, term903.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstChild", argTypes, term903, args);
    }

};


