package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class ParserInfo_printMatchesAndPartialMatches_2471782108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3671;
     Object term3821;

    public ParserInfo_printMatchesAndPartialMatches_2471782108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3942 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term3941 = ((Class) term3942).getDeclaredField((String) "LEFT");
        ((Field) term3941).setAccessible(true);
        Object enum6 = ((Field) term3941).get((Object) null);
        Object term3779 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3784 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3779, term3779.getClass(), "ruleName", "");
        setIntField(term3779, term3779.getClass(), "precedence", -1490696181);
        setField(term3779, term3779.getClass(), "associativity", enum6);
        setField(term3784, term3784.getClass(), "clause", null);
        setField(term3784, term3784.getClass(), "astNodeLabel", null);
        setField(term3779, term3779.getClass(), "labeledClause", term3784);
        Object term3785 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term3788 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3785, term3785.getClass(), "ruleName", "");
        setIntField(term3785, term3785.getClass(), "precedence", 623717232);
        setField(term3785, term3785.getClass(), "associativity", enum6);
        setField(term3788, term3788.getClass(), "clause", null);
        setField(term3788, term3788.getClass(), "astNodeLabel", null);
        setField(term3785, term3785.getClass(), "labeledClause", term3788);
        ArrayList term3777 = new ArrayList();
        ((ArrayList) term3777).add(term3779);
        ((ArrayList) term3777).add(term3785);
        ArrayList term3791 = new ArrayList();
        ((ArrayList) term3791).add((Object)null);
        term3671 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        Object[] term3672 = (Object[]) newArray("pikaparser.ast.LabeledClause", 8);
        Object term3673 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3686 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3699 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3712 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3725 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3738 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3751 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term3764 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term3673, term3673.getClass(), "clause", null);
        setField(term3673, term3673.getClass(), "astNodeLabel", "kNqaJKIATy");
        setElement(term3672, 0, term3673);
        setField(term3686, term3686.getClass(), "clause", null);
        setField(term3686, term3686.getClass(), "astNodeLabel", "vKQukfbJUd");
        setElement(term3672, 1, term3686);
        setField(term3699, term3699.getClass(), "clause", null);
        setField(term3699, term3699.getClass(), "astNodeLabel", "lFRJFUMVbx");
        setElement(term3672, 2, term3699);
        setField(term3712, term3712.getClass(), "clause", null);
        setField(term3712, term3712.getClass(), "astNodeLabel", "sZdUNdggUW");
        setElement(term3672, 3, term3712);
        setField(term3725, term3725.getClass(), "clause", null);
        setField(term3725, term3725.getClass(), "astNodeLabel", "OqbwYQfvAe");
        setElement(term3672, 4, term3725);
        setField(term3738, term3738.getClass(), "clause", null);
        setField(term3738, term3738.getClass(), "astNodeLabel", "tRxZafjqIx");
        setElement(term3672, 5, term3738);
        setField(term3751, term3751.getClass(), "clause", null);
        setField(term3751, term3751.getClass(), "astNodeLabel", "DhjNLmRMCu");
        setElement(term3672, 6, term3751);
        setField(term3764, term3764.getClass(), "clause", null);
        setField(term3764, term3764.getClass(), "astNodeLabel", "PgPzMSEjjX");
        setElement(term3672, 7, term3764);
        setField(term3671, term3671.getClass(), "labeledSubClauses", term3672);
        setField(term3671, term3671.getClass(), "rules", term3777);
        setField(term3671, term3671.getClass(), "seedParentClauses", term3791);
        setBooleanField(term3671, term3671.getClass(), "canMatchZeroChars", true);
        setIntField(term3671, term3671.getClass(), "clauseIdx", -1413291732);
        setField(term3671, term3671.getClass(), "toStringCached", "XJJNClzHRf");
        setField(term3671, term3671.getClass(), "toStringWithRuleNameCached", "HDaezxQfQR");
        Object term3825 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3825, term3825.getClass(), "ruleName", null);
        setIntField(term3825, term3825.getClass(), "precedence", 1633691536);
        setField(term3825, term3825.getClass(), "associativity", null);
        setField(term3825, term3825.getClass(), "labeledClause", null);
        Object term3827 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3827, term3827.getClass(), "ruleName", null);
        setIntField(term3827, term3827.getClass(), "precedence", 898165245);
        setField(term3827, term3827.getClass(), "associativity", null);
        setField(term3827, term3827.getClass(), "labeledClause", null);
        Object term3829 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term3829, term3829.getClass(), "ruleName", null);
        setIntField(term3829, term3829.getClass(), "precedence", 1810754549);
        setField(term3829, term3829.getClass(), "associativity", enum6);
        setField(term3829, term3829.getClass(), "labeledClause", null);
        ArrayList term3823 = new ArrayList();
        ((ArrayList) term3823).add(term3825);
        ((ArrayList) term3823).add(term3827);
        ((ArrayList) term3823).add(term3829);
        HashMap term3833 = new HashMap();
        ArrayList term3841 = new ArrayList();
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        ((ArrayList) term3841).add((Object)null);
        term3821 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term3822 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term3857 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term3859 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term3821, term3821.getClass(), "memoTable", null);
        setField(term3822, term3822.getClass(), "allRules", term3823);
        setField(term3822, term3822.getClass(), "ruleNameWithPrecedenceToRule", term3833);
        setField(term3822, term3822.getClass(), "allClauses", term3841);
        setField(term3821, term3821.getClass(), "grammar", term3822);
        setField(term3821, term3821.getClass(), "input", "vGiuZVPJNH");
        setIntField(term3857, term3857.getClass(), "value", 1227103734);
        setField(term3821, term3821.getClass(), "numMatchObjectsCreated", term3857);
        setIntField(term3859, term3859.getClass(), "value", -1339778481);
        setField(term3821, term3821.getClass(), "numMatchObjectsMemoized", term3859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.ParserInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("pikaparser.clause.nonterminal.Seq");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoTable");
        Object[] args = new Object[2];
        args[0] = term3671;
        args[1] = term3821;
        callMethod(klass, "printMatchesAndPartialMatches", argTypes, null, args);
    }

};


