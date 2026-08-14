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
import java.util.HashMap;

public class Seq_match_17081704633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;
     Object term1039;
     Object term1075;

    public Seq_match_17081704633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1001 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1001, term1001.getClass(), "ruleName", null);
        setIntField(term1001, term1001.getClass(), "precedence", 0);
        setField(term1001, term1001.getClass(), "associativity", null);
        setField(term1001, term1001.getClass(), "labeledClause", null);
        Object term1003 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1003, term1003.getClass(), "ruleName", null);
        setIntField(term1003, term1003.getClass(), "precedence", 0);
        setField(term1003, term1003.getClass(), "associativity", null);
        setField(term1003, term1003.getClass(), "labeledClause", null);
        Object term1005 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1005, term1005.getClass(), "ruleName", null);
        setIntField(term1005, term1005.getClass(), "precedence", 0);
        setField(term1005, term1005.getClass(), "associativity", null);
        setField(term1005, term1005.getClass(), "labeledClause", null);
        ArrayList term999 = new ArrayList();
        ((ArrayList) term999).add(term1001);
        ((ArrayList) term999).add(term1003);
        ((ArrayList) term999).add(term1005);
        ArrayList term1009 = new ArrayList();
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        ((ArrayList) term1009).add((Object)null);
        term892 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        Object[] term893 = (Object[]) newArray("pikaparser.ast.LabeledClause", 9);
        Object term894 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term907 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term920 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term933 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term946 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term959 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term972 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term985 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term998 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term894, term894.getClass(), "clause", null);
        setField(term894, term894.getClass(), "astNodeLabel", "OWDIEULEFu");
        setElement(term893, 0, term894);
        setField(term907, term907.getClass(), "clause", null);
        setField(term907, term907.getClass(), "astNodeLabel", "dWRymuLBtr");
        setElement(term893, 1, term907);
        setField(term920, term920.getClass(), "clause", null);
        setField(term920, term920.getClass(), "astNodeLabel", "AijpHYOFuy");
        setElement(term893, 2, term920);
        setField(term933, term933.getClass(), "clause", null);
        setField(term933, term933.getClass(), "astNodeLabel", "SbAoxhfrkn");
        setElement(term893, 3, term933);
        setField(term946, term946.getClass(), "clause", null);
        setField(term946, term946.getClass(), "astNodeLabel", "kuTXqwMtDB");
        setElement(term893, 4, term946);
        setField(term959, term959.getClass(), "clause", null);
        setField(term959, term959.getClass(), "astNodeLabel", "Ghbwtircqb");
        setElement(term893, 5, term959);
        setField(term972, term972.getClass(), "clause", null);
        setField(term972, term972.getClass(), "astNodeLabel", "xrwlQZdwCp");
        setElement(term893, 6, term972);
        setField(term985, term985.getClass(), "clause", null);
        setField(term985, term985.getClass(), "astNodeLabel", "IDCWpPLRkE");
        setElement(term893, 7, term985);
        setField(term998, term998.getClass(), "clause", null);
        setField(term998, term998.getClass(), "astNodeLabel", null);
        setElement(term893, 8, term998);
        setField(term892, term892.getClass(), "labeledSubClauses", term893);
        setField(term892, term892.getClass(), "rules", term999);
        setField(term892, term892.getClass(), "seedParentClauses", term1009);
        setBooleanField(term892, term892.getClass(), "canMatchZeroChars", false);
        setIntField(term892, term892.getClass(), "clauseIdx", 1585847225);
        setField(term892, term892.getClass(), "toStringCached", "nyiiPDVjAc");
        setField(term892, term892.getClass(), "toStringWithRuleNameCached", "aKnKipADSo");
        Object term1043 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        setField(term1043, term1043.getClass(), "ruleName", null);
        setIntField(term1043, term1043.getClass(), "precedence", 1048535127);
        setField(term1043, term1043.getClass(), "associativity", null);
        setField(term1043, term1043.getClass(), "labeledClause", null);
        ArrayList term1041 = new ArrayList();
        ((ArrayList) term1041).add(term1043);
        HashMap term1047 = new HashMap();
        ArrayList term1055 = new ArrayList();
        term1039 = newInstance(Class.forName("pikaparser.memotable.MemoTable"));
        Object term1040 = newInstance(Class.forName("pikaparser.grammar.Grammar"));
        Object term1071 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        Object term1073 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setField(term1039, term1039.getClass(), "memoTable", null);
        setField(term1040, term1040.getClass(), "allRules", term1041);
        setField(term1040, term1040.getClass(), "ruleNameWithPrecedenceToRule", term1047);
        setField(term1040, term1040.getClass(), "allClauses", term1055);
        setField(term1039, term1039.getClass(), "grammar", term1040);
        setField(term1039, term1039.getClass(), "input", "GzFkzHGYFt");
        setIntField(term1071, term1071.getClass(), "value", 568599855);
        setField(term1039, term1039.getClass(), "numMatchObjectsCreated", term1071);
        setIntField(term1073, term1073.getClass(), "value", 1162663216);
        setField(term1039, term1039.getClass(), "numMatchObjectsMemoized", term1073);
        term1075 = newInstance(Class.forName("pikaparser.memotable.MemoKey"));
        setField(term1075, term1075.getClass(), "clause", null);
        setIntField(term1075, term1075.getClass(), "startPos", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("pikaparser.memotable.MemoTable");
        argTypes[1] = Class.forName("pikaparser.memotable.MemoKey");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term1039;
        args[1] = term1075;
        args[2] = "tShwQLRGNe";
        callMethod(klass, "match", argTypes, term892, args);
    }

};


