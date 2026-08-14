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

public class Seq_determineWhetherCanMatchZeroChars_6743827551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;

    public Seq_determineWhetherCanMatchZeroChars_6743827551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term162 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term161 = ((Class) term162).getDeclaredField((String) "LEFT");
        ((Field) term161).setAccessible(true);
        Object enum0 = ((Field) term161).get((Object) null);
        Object term58 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term63 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term58, term58.getClass(), "ruleName", "");
        setIntField(term58, term58.getClass(), "precedence", 568599855);
        setField(term58, term58.getClass(), "associativity", enum0);
        setField(term63, term63.getClass(), "clause", null);
        setField(term63, term63.getClass(), "astNodeLabel", null);
        setField(term58, term58.getClass(), "labeledClause", term63);
        Object term64 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term67 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term64, term64.getClass(), "ruleName", "");
        setIntField(term64, term64.getClass(), "precedence", 1162663216);
        setField(term64, term64.getClass(), "associativity", enum0);
        setField(term67, term67.getClass(), "clause", null);
        setField(term67, term67.getClass(), "astNodeLabel", null);
        setField(term64, term64.getClass(), "labeledClause", term67);
        Object term68 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term71 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term68, term68.getClass(), "ruleName", "");
        setIntField(term68, term68.getClass(), "precedence", 1484323161);
        setField(term68, term68.getClass(), "associativity", enum0);
        setField(term71, term71.getClass(), "clause", null);
        setField(term71, term71.getClass(), "astNodeLabel", null);
        setField(term68, term68.getClass(), "labeledClause", term71);
        ArrayList term56 = new ArrayList();
        ((ArrayList) term56).add(term58);
        ((ArrayList) term56).add(term64);
        ((ArrayList) term56).add(term68);
        ArrayList term74 = new ArrayList();
        ((ArrayList) term74).add((Object)null);
        ((ArrayList) term74).add((Object)null);
        ((ArrayList) term74).add((Object)null);
        ((ArrayList) term74).add((Object)null);
        term2 = newInstance(Class.forName("pikaparser.clause.nonterminal.Seq"));
        Object[] term3 = (Object[]) newArray("pikaparser.ast.LabeledClause", 4);
        Object term4 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term17 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term30 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        Object term43 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term4, term4.getClass(), "clause", null);
        setField(term4, term4.getClass(), "astNodeLabel", "PAEBtnZtTD");
        setElement(term3, 0, term4);
        setField(term17, term17.getClass(), "clause", null);
        setField(term17, term17.getClass(), "astNodeLabel", "sjlJAEtRrb");
        setElement(term3, 1, term17);
        setField(term30, term30.getClass(), "clause", null);
        setField(term30, term30.getClass(), "astNodeLabel", "MuLcgQHgqz");
        setElement(term3, 2, term30);
        setField(term43, term43.getClass(), "clause", null);
        setField(term43, term43.getClass(), "astNodeLabel", "xxtlPwDYFs");
        setElement(term3, 3, term43);
        setField(term2, term2.getClass(), "labeledSubClauses", term3);
        setField(term2, term2.getClass(), "rules", term56);
        setField(term2, term2.getClass(), "seedParentClauses", term74);
        setBooleanField(term2, term2.getClass(), "canMatchZeroChars", false);
        setIntField(term2, term2.getClass(), "clauseIdx", 391863371);
        setField(term2, term2.getClass(), "toStringCached", "NRdvgJlhkX");
        setField(term2, term2.getClass(), "toStringWithRuleNameCached", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.nonterminal.Seq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term2, args);
    }

};


