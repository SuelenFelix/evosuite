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

public class Clause_registerRule_9298384330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Clause_registerRule_9298384330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term63 = ((Class) term64).getDeclaredField((String) "LEFT");
        ((Field) term63).setAccessible(true);
        Object enum0 = ((Field) term63).get((Object) null);
        term1 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term23 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1, term1.getClass(), "ruleName", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "precedence", 568599855);
        setField(term1, term1.getClass(), "associativity", enum0);
        setField(term23, term23.getClass(), "clause", null);
        setField(term23, term23.getClass(), "astNodeLabel", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "labeledClause", term23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.Clause");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.grammar.Rule");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "registerRule", argTypes, null, args);
    }

};


