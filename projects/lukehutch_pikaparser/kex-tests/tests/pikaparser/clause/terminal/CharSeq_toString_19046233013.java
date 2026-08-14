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

public class CharSeq_toString_19046233013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6314;

    public CharSeq_toString_19046233013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6433 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6432 = ((Class) term6433).getDeclaredField((String) "LEFT");
        ((Field) term6432).setAccessible(true);
        Object enum19 = ((Field) term6432).get((Object) null);
        Object term6344 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6349 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6344, term6344.getClass(), "ruleName", "");
        setIntField(term6344, term6344.getClass(), "precedence", 1830648570);
        setField(term6344, term6344.getClass(), "associativity", enum19);
        setField(term6349, term6349.getClass(), "clause", null);
        setField(term6349, term6349.getClass(), "astNodeLabel", null);
        setField(term6344, term6344.getClass(), "labeledClause", term6349);
        Object term6350 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6353 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6350, term6350.getClass(), "ruleName", "");
        setIntField(term6350, term6350.getClass(), "precedence", -227365013);
        setField(term6350, term6350.getClass(), "associativity", enum19);
        setField(term6353, term6353.getClass(), "clause", null);
        setField(term6353, term6353.getClass(), "astNodeLabel", null);
        setField(term6350, term6350.getClass(), "labeledClause", term6353);
        Class<? extends Object> term6637 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6636 = ((Class) term6637).getDeclaredField((String) "RIGHT");
        ((Field) term6636).setAccessible(true);
        Object enum20 = ((Field) term6636).get((Object) null);
        Object term6354 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6359 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6354, term6354.getClass(), "ruleName", "");
        setIntField(term6354, term6354.getClass(), "precedence", 11724947);
        setField(term6354, term6354.getClass(), "associativity", enum20);
        setField(term6359, term6359.getClass(), "clause", null);
        setField(term6359, term6359.getClass(), "astNodeLabel", null);
        setField(term6354, term6354.getClass(), "labeledClause", term6359);
        Object term6360 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6363 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6360, term6360.getClass(), "ruleName", "");
        setIntField(term6360, term6360.getClass(), "precedence", 1953277050);
        setField(term6360, term6360.getClass(), "associativity", enum20);
        setField(term6363, term6363.getClass(), "clause", null);
        setField(term6363, term6363.getClass(), "astNodeLabel", null);
        setField(term6360, term6360.getClass(), "labeledClause", term6363);
        Object term6364 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6367 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6364, term6364.getClass(), "ruleName", "");
        setIntField(term6364, term6364.getClass(), "precedence", 1283079251);
        setField(term6364, term6364.getClass(), "associativity", enum20);
        setField(term6367, term6367.getClass(), "clause", null);
        setField(term6367, term6367.getClass(), "astNodeLabel", null);
        setField(term6364, term6364.getClass(), "labeledClause", term6367);
        Object term6368 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6371 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6368, term6368.getClass(), "ruleName", "");
        setIntField(term6368, term6368.getClass(), "precedence", -523949691);
        setField(term6368, term6368.getClass(), "associativity", enum20);
        setField(term6371, term6371.getClass(), "clause", null);
        setField(term6371, term6371.getClass(), "astNodeLabel", null);
        setField(term6368, term6368.getClass(), "labeledClause", term6371);
        Object term6372 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6375 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6372, term6372.getClass(), "ruleName", "");
        setIntField(term6372, term6372.getClass(), "precedence", 1398204340);
        setField(term6372, term6372.getClass(), "associativity", enum20);
        setField(term6375, term6375.getClass(), "clause", null);
        setField(term6375, term6375.getClass(), "astNodeLabel", null);
        setField(term6372, term6372.getClass(), "labeledClause", term6375);
        Object term6376 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6379 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6376, term6376.getClass(), "ruleName", "");
        setIntField(term6376, term6376.getClass(), "precedence", 229204365);
        setField(term6376, term6376.getClass(), "associativity", enum20);
        setField(term6379, term6379.getClass(), "clause", null);
        setField(term6379, term6379.getClass(), "astNodeLabel", null);
        setField(term6376, term6376.getClass(), "labeledClause", term6379);
        ArrayList term6342 = new ArrayList();
        ((ArrayList) term6342).add(term6344);
        ((ArrayList) term6342).add(term6350);
        ((ArrayList) term6342).add(term6354);
        ((ArrayList) term6342).add(term6360);
        ((ArrayList) term6342).add(term6364);
        ((ArrayList) term6342).add(term6368);
        ((ArrayList) term6342).add(term6372);
        ((ArrayList) term6342).add(term6376);
        ArrayList term6382 = new ArrayList();
        ((ArrayList) term6382).add((Object)null);
        term6314 = newInstance(Class.forName("pikaparser.clause.terminal.CharSeq"));
        Object[] term6328 = (Object[]) newArray("pikaparser.ast.LabeledClause", 1);
        Object term6329 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6314, term6314.getClass(), "str", "kNqaJKIATy");
        setBooleanField(term6314, term6314.getClass(), "ignoreCase", false);
        setField(term6329, term6329.getClass(), "clause", null);
        setField(term6329, term6329.getClass(), "astNodeLabel", "vKQukfbJUd");
        setElement(term6328, 0, term6329);
        setField(term6314, term6314.getClass(), "labeledSubClauses", term6328);
        setField(term6314, term6314.getClass(), "rules", term6342);
        setField(term6314, term6314.getClass(), "seedParentClauses", term6382);
        setBooleanField(term6314, term6314.getClass(), "canMatchZeroChars", false);
        setIntField(term6314, term6314.getClass(), "clauseIdx", -461771056);
        setField(term6314, term6314.getClass(), "toStringCached", "BjugTaMcxJ");
        setField(term6314, term6314.getClass(), "toStringWithRuleNameCached", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.CharSeq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6314, args);
    }

};


