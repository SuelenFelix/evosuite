package pikaparser.clause.aux;

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
import static pikaparser.clause.aux.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class RuleRef_determineWhetherCanMatchZeroChars_11931687521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1355;

    public RuleRef_determineWhetherCanMatchZeroChars_11931687521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1424 = Class.forName((String) "pikaparser.grammar.Rule$Associativity");
        Field term1423 = ((Class) term1424).getDeclaredField((String) "RIGHT");
        ((Field) term1423).setAccessible(true);
        Object enum3 = ((Field) term1423).get((Object) null);
        Object term1371 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1376 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1371, term1371.getClass(), "ruleName", "");
        setIntField(term1371, term1371.getClass(), "precedence", -244121226);
        setField(term1371, term1371.getClass(), "associativity", enum3);
        setField(term1376, term1376.getClass(), "clause", null);
        setField(term1376, term1376.getClass(), "astNodeLabel", null);
        setField(term1371, term1371.getClass(), "labeledClause", term1376);
        Object term1377 = newInstance(Class.forName("pikaparser.grammar.Rule"));
        Object term1380 = newInstance(Class.forName("pikaparser.ast.LabeledClause"));
        setField(term1377, term1377.getClass(), "ruleName", "");
        setIntField(term1377, term1377.getClass(), "precedence", -203030934);
        setField(term1377, term1377.getClass(), "associativity", enum3);
        setField(term1380, term1380.getClass(), "clause", null);
        setField(term1380, term1380.getClass(), "astNodeLabel", null);
        setField(term1377, term1377.getClass(), "labeledClause", term1380);
        ArrayList term1369 = new ArrayList();
        ((ArrayList) term1369).add(term1371);
        ((ArrayList) term1369).add(term1377);
        ArrayList term1383 = new ArrayList();
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        ((ArrayList) term1383).add((Object)null);
        term1355 = newInstance(Class.forName("pikaparser.clause.aux.RuleRef"));
        Object[] term1368 = (Object[]) newArray("pikaparser.ast.LabeledClause", 0);
        setField(term1355, term1355.getClass(), "refdRuleName", "MLqYREekMl");
        setField(term1355, term1355.getClass(), "labeledSubClauses", term1368);
        setField(term1355, term1355.getClass(), "rules", term1369);
        setField(term1355, term1355.getClass(), "seedParentClauses", term1383);
        setBooleanField(term1355, term1355.getClass(), "canMatchZeroChars", true);
        setIntField(term1355, term1355.getClass(), "clauseIdx", -1179120542);
        setField(term1355, term1355.getClass(), "toStringCached", "hoicvmsovO");
        setField(term1355, term1355.getClass(), "toStringWithRuleNameCached", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.clause.aux.RuleRef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "determineWhetherCanMatchZeroChars", argTypes, term1355, args);
    }

};


