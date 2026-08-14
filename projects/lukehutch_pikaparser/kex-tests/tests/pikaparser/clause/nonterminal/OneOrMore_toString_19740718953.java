package pikaparser.clause.nonterminal;

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
import static pikaparser.clause.nonterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class OneOrMore_toString_19740718953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2484;

    public OneOrMore_toString_19740718953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2669 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term2668 = ((Class) term2669).getDeclaredField((String) "RIGHT");
        ((Field) term2668).setAccessible(true);
        Object enum6 = ((Field) term2668).get((Object) null);
        Object term2566 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2571 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2566, term2566.getClass(), "ruleName", "");
        setIntField(term2566, term2566.getClass(), "precedence", -1786399638);
        setField(term2566, term2566.getClass(), "associativity", enum6);
        setField(term2571, term2571.getClass(), "clause", null);
        setField(term2571, term2571.getClass(), "astNodeLabel", null);
        setField(term2566, term2566.getClass(), "labeledClause", term2571);
        Object term2572 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term2575 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2572, term2572.getClass(), "ruleName", "");
        setIntField(term2572, term2572.getClass(), "precedence", 2055867847);
        setField(term2572, term2572.getClass(), "associativity", enum6);
        setField(term2575, term2575.getClass(), "clause", null);
        setField(term2575, term2575.getClass(), "astNodeLabel", null);
        setField(term2572, term2572.getClass(), "labeledClause", term2575);
        ArrayList term2564 = new ArrayList();
        ((ArrayList) term2564).add(term2566);
        ((ArrayList) term2564).add(term2572);
        ArrayList term2578 = new ArrayList();
        ((ArrayList) term2578).add((Object)null);
        ((ArrayList) term2578).add((Object)null);
        ((ArrayList) term2578).add((Object)null);
        ((ArrayList) term2578).add((Object)null);
        ((ArrayList) term2578).add((Object)null);
        term2484 = newInstance(Class.forName("pikaparser.clause.nonterminal.OneOrMore"));
        Object[] term2485 = (Object[]) newArray("pikaparser.ast.LabeledClause", 6);
        Object term2486 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2499 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2512 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2525 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2538 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term2551 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term2486, term2486.getClass(), "clause", null);
        setField(term2486, term2486.getClass(), "astNodeLabel", "GVizqqzXpy");
        setElement(term2485, 0, term2486);
        setField(term2499, term2499.getClass(), "clause", null);
        setField(term2499, term2499.getClass(), "astNodeLabel", "JqXGgAhZPl");
        setElement(term2485, 1, term2499);
        setField(term2512, term2512.getClass(), "clause", null);
        setField(term2512, term2512.getClass(), "astNodeLabel", "jiKYgYHqIS");
        setElement(term2485, 2, term2512);
        setField(term2525, term2525.getClass(), "clause", null);
        setField(term2525, term2525.getClass(), "astNodeLabel", "DfISiziTgG");
        setElement(term2485, 3, term2525);
        setField(term2538, term2538.getClass(), "clause", null);
        setField(term2538, term2538.getClass(), "astNodeLabel", "XqgfKFvPSD");
        setElement(term2485, 4, term2538);
        setField(term2551, term2551.getClass(), "clause", null);
        setField(term2551, term2551.getClass(), "astNodeLabel", "JiVRgTZvKc");
        setElement(term2485, 5, term2551);
        setField(term2484, term2484.getClass(), "labeledSubClauses", term2485);
        setField(term2484, term2484.getClass(), "rules", term2564);
        setField(term2484, term2484.getClass(), "seedParentClauses", term2578);
        setBooleanField(term2484, term2484.getClass(), "canMatchZeroChars", false);
        setIntField(term2484, term2484.getClass(), "clauseIdx", -1048298087);
        setField(term2484, term2484.getClass(), "toStringCached", "sEccwbJKYE");
        setField(term2484, term2484.getClass(), "toStringWithRuleNameCached", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.OneOrMore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2484, args);
    }

};


