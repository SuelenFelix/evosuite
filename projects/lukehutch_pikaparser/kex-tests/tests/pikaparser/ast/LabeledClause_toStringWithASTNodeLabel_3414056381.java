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

public class LabeledClause_toStringWithASTNodeLabel_3414056381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public LabeledClause_toStringWithASTNodeLabel_3414056381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term23, term23.getClass(), "clause", null);
        setField(term23, term23.getClass(), "astNodeLabel", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.ast.LabeledClause");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toStringWithASTNodeLabel", argTypes, term23, args);
    }

};


