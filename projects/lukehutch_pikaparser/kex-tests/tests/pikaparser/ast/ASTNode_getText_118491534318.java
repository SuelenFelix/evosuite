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

public class ASTNode_getText_118491534318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917;

    public ASTNode_getText_118491534318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term917 = newInstance(Class.forName("pikaparser.ast.ASTNode"));
        setField(term917, term917.getClass(), "label", null);
        setField(term917, term917.getClass(), "nodeType", null);
        setIntField(term917, term917.getClass(), "startPos", 0);
        setIntField(term917, term917.getClass(), "len", 0);
        setField(term917, term917.getClass(), "input", null);
        setField(term917, term917.getClass(), "children", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.ASTNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term917, args);
    }

};


