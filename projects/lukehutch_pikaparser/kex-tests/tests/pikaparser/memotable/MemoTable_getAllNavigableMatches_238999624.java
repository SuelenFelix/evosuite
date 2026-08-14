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

public class MemoTable_getAllNavigableMatches_238999624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;

    public MemoTable_getAllNavigableMatches_238999624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term642 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term642, term642.getClass(), "ruleName", null);
        setIntField(term642, term642.getClass(), "precedence", -2027534003);
        setField(term642, term642.getClass(), "associativity", null);
        setField(term642, term642.getClass(), "labeledClause", null);
        Object term644 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term644, term644.getClass(), "ruleName", null);
        setIntField(term644, term644.getClass(), "precedence", 1063420942);
        setField(term644, term644.getClass(), "associativity", null);
        setField(term644, term644.getClass(), "labeledClause", null);
        Object term646 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term646, term646.getClass(), "ruleName", null);
        setIntField(term646, term646.getClass(), "precedence", 1375330971);
        setField(term646, term646.getClass(), "associativity", null);
        setField(term646, term646.getClass(), "labeledClause", null);
        Object term648 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term648, term648.getClass(), "ruleName", null);
        setIntField(term648, term648.getClass(), "precedence", -478195677);
        setField(term648, term648.getClass(), "associativity", null);
        setField(term648, term648.getClass(), "labeledClause", null);
        Object term650 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term650, term650.getClass(), "ruleName", null);
        setIntField(term650, term650.getClass(), "precedence", 972867650);
        setField(term650, term650.getClass(), "associativity", null);
        setField(term650, term650.getClass(), "labeledClause", null);
        Object term652 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term652, term652.getClass(), "ruleName", null);
        setIntField(term652, term652.getClass(), "precedence", 1655935355);
        setField(term652, term652.getClass(), "associativity", null);
        setField(term652, term652.getClass(), "labeledClause", null);
        Object term654 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term654, term654.getClass(), "ruleName", null);
        setIntField(term654, term654.getClass(), "precedence", -481533957);
        setField(term654, term654.getClass(), "associativity", null);
        setField(term654, term654.getClass(), "labeledClause", null);
        Object term656 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term656, term656.getClass(), "ruleName", null);
        setIntField(term656, term656.getClass(), "precedence", 1240914516);
        setField(term656, term656.getClass(), "associativity", null);
        setField(term656, term656.getClass(), "labeledClause", null);
        Object term658 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term658, term658.getClass(), "ruleName", null);
        setIntField(term658, term658.getClass(), "precedence", -1465035361);
        setField(term658, term658.getClass(), "associativity", null);
        setField(term658, term658.getClass(), "labeledClause", null);
        ArrayList term640 = new ArrayList();
        ((ArrayList) term640).add(term642);
        ((ArrayList) term640).add(term644);
        ((ArrayList) term640).add(term646);
        ((ArrayList) term640).add(term648);
        ((ArrayList) term640).add(term650);
        ((ArrayList) term640).add(term652);
        ((ArrayList) term640).add(term654);
        ((ArrayList) term640).add(term656);
        ((ArrayList) term640).add(term658);
        HashMap term662 = new HashMap();
        ArrayList term670 = new ArrayList();
        ((ArrayList) term670).add((Object)null);
        ((ArrayList) term670).add((Object)null);
        ((ArrayList) term670).add((Object)null);
        ((ArrayList) term670).add((Object)null);
        term638 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term639 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term686 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term688 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term638, term638.getClass(), "memoTable", null);
        setField(term639, term639.getClass(), "allRules", term640);
        setField(term639, term639.getClass(), "ruleNameWithPrecedenceToRule", term662);
        setField(term639, term639.getClass(), "allClauses", term670);
        setField(term638, term638.getClass(), "grammar", term639);
        setField(term638, term638.getClass(), "input", "aKnKipADSo");
        setIntField(term686, term686.getClass(), "value", -1922583790);
        setField(term638, term638.getClass(), "numMatchObjectsCreated", term686);
        setIntField(term688, term688.getClass(), "value", -616727354);
        setField(term638, term638.getClass(), "numMatchObjectsMemoized", term688);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.memotable.MemoTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNavigableMatches", argTypes, term638, args);
    }

};


