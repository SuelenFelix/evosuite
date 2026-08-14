package pikaparser.clause;

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
import static pikaparser.clause.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Clause_unregisterRule_3461436861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public Clause_unregisterRule_3461436861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term323 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term322 = ((Class) term323).getDeclaredField((String) "LEFT");
        ((Field) term322).setAccessible(true);
        Object enum1 = ((Field) term322).get((Object) null);
        term277 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term299 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term277, term277.getClass(), "ruleName", "MuLcgQHgqz");
        setIntField(term277, term277.getClass(), "precedence", 1162663216);
        setField(term277, term277.getClass(), "associativity", enum1);
        setField(term299, term299.getClass(), "clause", null);
        setField(term299, term299.getClass(), "astNodeLabel", "xxtlPwDYFs");
        setField(term277, term277.getClass(), "labeledClause", term299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.Clause");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.grammar.Rule");
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "unregisterRule", argTypes, null, args);
    }

};


