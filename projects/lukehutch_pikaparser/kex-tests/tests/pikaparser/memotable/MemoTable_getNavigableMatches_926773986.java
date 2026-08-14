package pikaparser.memotable;

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
import static pikaparser.memotable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class MemoTable_getNavigableMatches_926773986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term748;

    public MemoTable_getNavigableMatches_926773986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term752 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term752, term752.getClass(), "ruleName", null);
        setIntField(term752, term752.getClass(), "precedence", -615654495);
        setField(term752, term752.getClass(), "associativity", null);
        setField(term752, term752.getClass(), "labeledClause", null);
        Object term754 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term754, term754.getClass(), "ruleName", null);
        setIntField(term754, term754.getClass(), "precedence", -1476117762);
        setField(term754, term754.getClass(), "associativity", null);
        setField(term754, term754.getClass(), "labeledClause", null);
        Object term756 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term756, term756.getClass(), "ruleName", null);
        setIntField(term756, term756.getClass(), "precedence", -341962980);
        setField(term756, term756.getClass(), "associativity", null);
        setField(term756, term756.getClass(), "labeledClause", null);
        Object term758 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term758, term758.getClass(), "ruleName", null);
        setIntField(term758, term758.getClass(), "precedence", 1532716628);
        setField(term758, term758.getClass(), "associativity", null);
        setField(term758, term758.getClass(), "labeledClause", null);
        Object term760 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term760, term760.getClass(), "ruleName", null);
        setIntField(term760, term760.getClass(), "precedence", -1801760683);
        setField(term760, term760.getClass(), "associativity", null);
        setField(term760, term760.getClass(), "labeledClause", null);
        Object term762 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term762, term762.getClass(), "ruleName", null);
        setIntField(term762, term762.getClass(), "precedence", 1141317871);
        setField(term762, term762.getClass(), "associativity", null);
        setField(term762, term762.getClass(), "labeledClause", null);
        Object term764 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term764, term764.getClass(), "ruleName", null);
        setIntField(term764, term764.getClass(), "precedence", 890669485);
        setField(term764, term764.getClass(), "associativity", null);
        setField(term764, term764.getClass(), "labeledClause", null);
        Object term766 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term766, term766.getClass(), "ruleName", null);
        setIntField(term766, term766.getClass(), "precedence", 691577392);
        setField(term766, term766.getClass(), "associativity", null);
        setField(term766, term766.getClass(), "labeledClause", null);
        ArrayList term750 = new ArrayList();
        ((ArrayList) term750).add(term752);
        ((ArrayList) term750).add(term754);
        ((ArrayList) term750).add(term756);
        ((ArrayList) term750).add(term758);
        ((ArrayList) term750).add(term760);
        ((ArrayList) term750).add(term762);
        ((ArrayList) term750).add(term764);
        ((ArrayList) term750).add(term766);
        HashMap term770 = new HashMap();
        ArrayList term778 = new ArrayList();
        term748 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term749 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term794 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term796 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term748, term748.getClass(), "memoTable", null);
        setField(term749, term749.getClass(), "allRules", term750);
        setField(term749, term749.getClass(), "ruleNameWithPrecedenceToRule", term770);
        setField(term749, term749.getClass(), "allClauses", term778);
        setField(term748, term748.getClass(), "grammar", term749);
        setField(term748, term748.getClass(), "input", "MLqYREekMl");
        setIntField(term794, term794.getClass(), "value", 1227103734);
        setField(term748, term748.getClass(), "numMatchObjectsCreated", term794);
        setIntField(term796, term796.getClass(), "value", -1339778481);
        setField(term748, term748.getClass(), "numMatchObjectsMemoized", term796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pikaparser.clause.Clause");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNavigableMatches", argTypes, term748, args);
    }

};


