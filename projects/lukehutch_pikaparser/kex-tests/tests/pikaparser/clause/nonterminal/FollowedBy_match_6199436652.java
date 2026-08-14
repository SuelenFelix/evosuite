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
import java.util.HashMap;

public class FollowedBy_match_6199436652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6270;
     Object term6391;
     Object term6427;

    public FollowedBy_match_6199436652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6492 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6491 = ((Class) term6492).getDeclaredField((String) "RIGHT");
        ((Field) term6491).setAccessible(true);
        Object enum17 = ((Field) term6491).get((Object) null);
        Object term6339 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6344 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6339, term6339.getClass(), "ruleName", "");
        setIntField(term6339, term6339.getClass(), "precedence", -1963464809);
        setField(term6339, term6339.getClass(), "associativity", enum17);
        setField(term6344, term6344.getClass(), "clause", null);
        setField(term6344, term6344.getClass(), "astNodeLabel", null);
        setField(term6339, term6339.getClass(), "labeledClause", term6344);
        Object term6345 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6348 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6345, term6345.getClass(), "ruleName", "");
        setIntField(term6345, term6345.getClass(), "precedence", 71190297);
        setField(term6345, term6345.getClass(), "associativity", enum17);
        setField(term6348, term6348.getClass(), "clause", null);
        setField(term6348, term6348.getClass(), "astNodeLabel", null);
        setField(term6345, term6345.getClass(), "labeledClause", term6348);
        Class<? extends Object> term6699 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term6698 = ((Class) term6699).getDeclaredField((String) "LEFT");
        ((Field) term6698).setAccessible(true);
        Object enum18 = ((Field) term6698).get((Object) null);
        Object term6349 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6354 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6349, term6349.getClass(), "ruleName", "");
        setIntField(term6349, term6349.getClass(), "precedence", 1202361360);
        setField(term6349, term6349.getClass(), "associativity", enum18);
        setField(term6354, term6354.getClass(), "clause", null);
        setField(term6354, term6354.getClass(), "astNodeLabel", null);
        setField(term6349, term6349.getClass(), "labeledClause", term6354);
        Object term6355 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term6358 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6355, term6355.getClass(), "ruleName", "");
        setIntField(term6355, term6355.getClass(), "precedence", -2015048153);
        setField(term6355, term6355.getClass(), "associativity", enum17);
        setField(term6358, term6358.getClass(), "clause", null);
        setField(term6358, term6358.getClass(), "astNodeLabel", null);
        setField(term6355, term6355.getClass(), "labeledClause", term6358);
        ArrayList term6337 = new ArrayList();
        ((ArrayList) term6337).add(term6339);
        ((ArrayList) term6337).add(term6345);
        ((ArrayList) term6337).add(term6349);
        ((ArrayList) term6337).add(term6355);
        ArrayList term6361 = new ArrayList();
        ((ArrayList) term6361).add((Object)null);
        ((ArrayList) term6361).add((Object)null);
        ((ArrayList) term6361).add((Object)null);
        term6270 = newInstance(Class.forName("pikaparser.clause.nonterminal.FollowedBy"));
        Object[] term6271 = (Object[]) newArray("pikaparser.ast.LabeledClause", 5);
        Object term6272 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6285 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6298 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6311 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term6324 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term6272, term6272.getClass(), "clause", null);
        setField(term6272, term6272.getClass(), "astNodeLabel", "GrqozDKFOk");
        setElement(term6271, 0, term6272);
        setField(term6285, term6285.getClass(), "clause", null);
        setField(term6285, term6285.getClass(), "astNodeLabel", "CFyoseFGLF");
        setElement(term6271, 1, term6285);
        setField(term6298, term6298.getClass(), "clause", null);
        setField(term6298, term6298.getClass(), "astNodeLabel", "SFqCrhEWLm");
        setElement(term6271, 2, term6298);
        setField(term6311, term6311.getClass(), "clause", null);
        setField(term6311, term6311.getClass(), "astNodeLabel", "GZdcJyZntS");
        setElement(term6271, 3, term6311);
        setField(term6324, term6324.getClass(), "clause", null);
        setField(term6324, term6324.getClass(), "astNodeLabel", "OIHoJeysUi");
        setElement(term6271, 4, term6324);
        setField(term6270, term6270.getClass(), "labeledSubClauses", term6271);
        setField(term6270, term6270.getClass(), "rules", term6337);
        setField(term6270, term6270.getClass(), "seedParentClauses", term6361);
        setBooleanField(term6270, term6270.getClass(), "canMatchZeroChars", true);
        setIntField(term6270, term6270.getClass(), "clauseIdx", -2063457669);
        setField(term6270, term6270.getClass(), "toStringCached", "gUvcueTURF");
        setField(term6270, term6270.getClass(), "toStringWithRuleNameCached", "EwQBhZjCIT");
        Object term6395 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term6395, term6395.getClass(), "ruleName", null);
        setIntField(term6395, term6395.getClass(), "precedence", -1388471422);
        setField(term6395, term6395.getClass(), "associativity", enum17);
        setField(term6395, term6395.getClass(), "labeledClause", null);
        ArrayList term6393 = new ArrayList();
        ((ArrayList) term6393).add(term6395);
        HashMap term6399 = new HashMap();
        ArrayList term6407 = new ArrayList();
        ((ArrayList) term6407).add((Object)null);
        ((ArrayList) term6407).add((Object)null);
        term6391 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term6392 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term6423 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term6425 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term6391, term6391.getClass(), "memoTable", null);
        setField(term6392, term6392.getClass(), "allRules", term6393);
        setField(term6392, term6392.getClass(), "ruleNameWithPrecedenceToRule", term6399);
        setField(term6392, term6392.getClass(), "allClauses", term6407);
        setField(term6391, term6391.getClass(), "grammar", term6392);
        setField(term6391, term6391.getClass(), "input", "mfCpTPPQQm");
        setIntField(term6423, term6423.getClass(), "value", 1227103734);
        setField(term6391, term6391.getClass(), "numMatchObjectsCreated", term6423);
        setIntField(term6425, term6425.getClass(), "value", -1339778481);
        setField(term6391, term6391.getClass(), "numMatchObjectsMemoized", term6425);
        term6427 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term6427, term6427.getClass(), "clause", null);
        setIntField(term6427, term6427.getClass(), "startPos", 2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.FollowedBy");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term6391;
        args[1] = term6427;
        args[2] = "OcJCIDNIXA";
        callMethod(klass, "match", argTypes, term6270, args);
    }

};


