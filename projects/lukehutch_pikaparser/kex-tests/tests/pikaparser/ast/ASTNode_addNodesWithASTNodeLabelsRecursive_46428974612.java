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

public class ASTNode_addNodesWithASTNodeLabelsRecursive_46428974612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;

    public ASTNode_addNodesWithASTNodeLabelsRecursive_46428974612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term897 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term897, term897.getClass(), "label", null);
        setField(term897, term897.getClass(), "nodeType", null);
        setIntField(term897, term897.getClass(), "startPos", 0);
        setIntField(term897, term897.getClass(), "len", 0);
        setField(term897, term897.getClass(), "input", null);
        setField(term897, term897.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.ast.ASTNode");
        argTypes[1] = Class.forName("pikaparser.memotable.Match");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addNodesWithASTNodeLabelsRecursive", argTypes, term897, args);
    }

};


