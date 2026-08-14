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

public class Start_determineWhetherCanMatchZeroChars_16932008811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Start_determineWhetherCanMatchZeroChars_16932008811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term78 = ((Class) term79).getDeclaredField((String) "LEFT");
        ((Field) term78).setAccessible(true);
        Object enum0 = ((Field) term78).get((Object) null);
        Object term5 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term10 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term5, term5.getClass(), "ruleName", "");
        setIntField(term5, term5.getClass(), "precedence", 568599855);
        setField(term5, term5.getClass(), "associativity", enum0);
        setField(term10, term10.getClass(), "clause", null);
        setField(term10, term10.getClass(), "astNodeLabel", null);
        setField(term5, term5.getClass(), "labeledClause", term10);
        Object term11 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term14 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term11, term11.getClass(), "ruleName", "");
        setIntField(term11, term11.getClass(), "precedence", 1162663216);
        setField(term11, term11.getClass(), "associativity", enum0);
        setField(term14, term14.getClass(), "clause", null);
        setField(term14, term14.getClass(), "astNodeLabel", null);
        setField(term11, term11.getClass(), "labeledClause", term14);
        Object term15 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term18 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term15, term15.getClass(), "ruleName", "");
        setIntField(term15, term15.getClass(), "precedence", 1484323161);
        setField(term15, term15.getClass(), "associativity", enum0);
        setField(term18, term18.getClass(), "clause", null);
        setField(term18, term18.getClass(), "astNodeLabel", null);
        setField(term15, term15.getClass(), "labeledClause", term18);
        Object term19 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term22 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term19, term19.getClass(), "ruleName", "");
        setIntField(term19, term19.getClass(), "precedence", 391863371);
        setField(term19, term19.getClass(), "associativity", enum0);
        setField(term22, term22.getClass(), "clause", null);
        setField(term22, term22.getClass(), "astNodeLabel", null);
        setField(term19, term19.getClass(), "labeledClause", term22);
        Class<? extends Object> term283 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term282 = ((Class) term283).getDeclaredField((String) "LEFT");
        ((Field) term282).setAccessible(true);
        Object enum1 = ((Field) term282).get((Object) null);
        Object term23 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term28 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term23, term23.getClass(), "ruleName", "");
        setIntField(term23, term23.getClass(), "precedence", -1922583790);
        setField(term23, term23.getClass(), "associativity", enum1);
        setField(term28, term28.getClass(), "clause", null);
        setField(term28, term28.getClass(), "astNodeLabel", null);
        setField(term23, term23.getClass(), "labeledClause", term28);
        ArrayList term3 = new ArrayList();
        ((ArrayList) term3).add(term5);
        ((ArrayList) term3).add(term11);
        ((ArrayList) term3).add(term15);
        ((ArrayList) term3).add(term19);
        ((ArrayList) term3).add(term23);
        ArrayList term31 = new ArrayList();
        term1 = newInstance(Class.forName("pikaparser.clause.terminal.Start"));
        Object[] term2 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term1, term1.getClass(), "labeledSubClauses", term2);
        setField(term1, term1.getClass(), "rules", term3);
        setField(term1, term1.getClass(), "seedParentClauses", term31);
        setBooleanField(term1, term1.getClass(), "canMatchZeroChars", false);
        setIntField(term1, term1.getClass(), "clauseIdx", -616727354);
        setField(term1, term1.getClass(), "toStringCached", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "toStringWithRuleNameCached", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.terminal.Start");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1, args);
    }

};


