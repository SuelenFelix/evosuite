package pikaparser.clause.terminal;

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
import static pikaparser.clause.terminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class Start_match_2192131972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;
     Object term556;
     Object term604;

    public Start_match_2192131972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term619 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term618 = ((Class) term619).getDeclaredField((String) "RIGHT");
        ((Field) term618).setAccessible(true);
        Object enum2 = ((Field) term618).get((Object) null);
        Object term510 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term515 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term510, term510.getClass(), "ruleName", "");
        setIntField(term510, term510.getClass(), "precedence", -1955890973);
        setField(term510, term510.getClass(), "associativity", enum2);
        setField(term515, term515.getClass(), "clause", null);
        setField(term515, term515.getClass(), "astNodeLabel", null);
        setField(term510, term510.getClass(), "labeledClause", term515);
        Object term516 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term519 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term516, term516.getClass(), "ruleName", "");
        setIntField(term516, term516.getClass(), "precedence", -2038273078);
        setField(term516, term516.getClass(), "associativity", enum2);
        setField(term519, term519.getClass(), "clause", null);
        setField(term519, term519.getClass(), "astNodeLabel", null);
        setField(term516, term516.getClass(), "labeledClause", term519);
        Object term520 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term523 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term520, term520.getClass(), "ruleName", "");
        setIntField(term520, term520.getClass(), "precedence", 1227103734);
        setField(term520, term520.getClass(), "associativity", enum2);
        setField(term523, term523.getClass(), "clause", null);
        setField(term523, term523.getClass(), "astNodeLabel", null);
        setField(term520, term520.getClass(), "labeledClause", term523);
        ArrayList term508 = new ArrayList();
        ((ArrayList) term508).add(term510);
        ((ArrayList) term508).add(term516);
        ((ArrayList) term508).add(term520);
        ArrayList term526 = new ArrayList();
        term506 = newInstance(Class.forName("pikaparser.clause.terminal.Start"));
        Object[] term507 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term506, term506.getClass(), "labeledSubClauses", term507);
        setField(term506, term506.getClass(), "rules", term508);
        setField(term506, term506.getClass(), "seedParentClauses", term526);
        setBooleanField(term506, term506.getClass(), "canMatchZeroChars", false);
        setIntField(term506, term506.getClass(), "clauseIdx", -1339778481);
        setField(term506, term506.getClass(), "toStringCached", "HyxfbSQYBe");
        setField(term506, term506.getClass(), "toStringWithRuleNameCached", "pCTimMblYc");
        Object term560 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term560, term560.getClass(), "ruleName", null);
        setIntField(term560, term560.getClass(), "precedence", -1007160944);
        setField(term560, term560.getClass(), "associativity", null);
        setField(term560, term560.getClass(), "labeledClause", null);
        Object term562 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term562, term562.getClass(), "ruleName", null);
        setIntField(term562, term562.getClass(), "precedence", 1135664017);
        setField(term562, term562.getClass(), "associativity", enum2);
        setField(term562, term562.getClass(), "labeledClause", null);
        Object term564 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term564, term564.getClass(), "ruleName", null);
        setIntField(term564, term564.getClass(), "precedence", 590364439);
        setField(term564, term564.getClass(), "associativity", null);
        setField(term564, term564.getClass(), "labeledClause", null);
        Object term566 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term566, term566.getClass(), "ruleName", null);
        setIntField(term566, term566.getClass(), "precedence", 865208305);
        setField(term566, term566.getClass(), "associativity", enum2);
        setField(term566, term566.getClass(), "labeledClause", null);
        Object term568 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term568, term568.getClass(), "ruleName", null);
        setIntField(term568, term568.getClass(), "precedence", -1275173084);
        setField(term568, term568.getClass(), "associativity", null);
        setField(term568, term568.getClass(), "labeledClause", null);
        Object term570 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term570, term570.getClass(), "ruleName", null);
        setIntField(term570, term570.getClass(), "precedence", -244121226);
        setField(term570, term570.getClass(), "associativity", enum2);
        setField(term570, term570.getClass(), "labeledClause", null);
        Object term572 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term572, term572.getClass(), "ruleName", null);
        setIntField(term572, term572.getClass(), "precedence", -203030934);
        setField(term572, term572.getClass(), "associativity", null);
        setField(term572, term572.getClass(), "labeledClause", null);
        ArrayList term558 = new ArrayList();
        ((ArrayList) term558).add(term560);
        ((ArrayList) term558).add(term562);
        ((ArrayList) term558).add(term564);
        ((ArrayList) term558).add(term566);
        ((ArrayList) term558).add(term568);
        ((ArrayList) term558).add(term570);
        ((ArrayList) term558).add(term572);
        HashMap term576 = new HashMap();
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add((Object)null);
        term556 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term557 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term600 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term602 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term556, term556.getClass(), "memoTable", null);
        setField(term557, term557.getClass(), "allRules", term558);
        setField(term557, term557.getClass(), "ruleNameWithPrecedenceToRule", term576);
        setField(term557, term557.getClass(), "allClauses", term584);
        setField(term556, term556.getClass(), "grammar", term557);
        setField(term556, term556.getClass(), "input", "TEParAifyi");
        setIntField(term600, term600.getClass(), "value", 568599855);
        setField(term556, term556.getClass(), "numMatchObjectsCreated", term600);
        setIntField(term602, term602.getClass(), "value", 1162663216);
        setField(term556, term556.getClass(), "numMatchObjectsMemoized", term602);
        term604 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term604, term604.getClass(), "clause", null);
        setIntField(term604, term604.getClass(), "startPos", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Start");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term556;
        args[1] = term604;
        args[2] = "OWDIEULEFu";
        callMethod(klass, "match", argTypes, term506, args);
    }

};


